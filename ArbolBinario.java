
package proyecto3_floricelaarguedas;


public class ArbolBinario {
    
    Nodo raizArbol;
    Interfaz_P3 interfaz;
    
    
    //Constructor

    public ArbolBinario(Interfaz_P3 interfaz) {
        this.raizArbol = null;
        this.interfaz = interfaz;
    }
    
    
 //Verificar si ya existe numero
   
    public boolean HayRepetido(int numAgregar) {
        Nodo temporal = raizArbol;
        if (!Vacio()) {
            while (temporal.num != numAgregar) {
                if (numAgregar < temporal.num) {
                    temporal = temporal.HijoIzq;
                } else {
                    temporal = temporal.HijoDer;
                }
                if (temporal == null) {
                    return false;
                }
            }
            return true;//Si encontro el numero.
        }
        return false;
    }
    
    
    //Funcion para insertar nodo.
    
    public void insertNewNodo(int numAgregar) {
   
        Nodo nuevoNodo = new Nodo(numAgregar);
        //Si esta en nulo, agrego el numero como raiz.
        if (raizArbol == null) {
            raizArbol = nuevoNodo;
        } else { //De lo contrario guardo la raiz en un auxiliar para compararla mas adelante.
            Nodo aux = raizArbol;
            Nodo Nodopadre;
            while (true) {
                Nodopadre = aux;
                //Valido si el numero es menor o mayor, para posicionarlo a la izq o dere.
                if (numAgregar < aux.num) {
                    aux = aux.HijoIzq;
                    if (aux == null) {
                        Nodopadre.HijoIzq = nuevoNodo;//Guardo el nodo a la izq. 
                        return;
                    }
                } else {
                    aux = aux.HijoDer;
                    if (aux == null) {
                        Nodopadre.HijoDer = nuevoNodo;//Guardo el nodo a la der.
                        return;
                    }
                }
            }
        }
    }
        

    //Revisar que no esté vacío el arbol
    
    public boolean Vacio() {

        if (raizArbol == null) {
            return true;
        }
        return false;
    }
    
    // Funcion para eliminar un Nodo
    
    public boolean EliminarNodo (int numEliminar){
        Nodo aux = raizArbol;
        Nodo padre = raizArbol;
        boolean HijoIz = true;
        while (aux.num != numEliminar) {
            padre = aux;
            //Busco el numero por la parte izquierda
            if (numEliminar < aux.num) {
                HijoIz = true;
                aux = aux.HijoIzq;
            } else { //Sino busco por la derecha
                HijoIz = false;
                aux = aux.HijoDer;
            }
            if (aux == null) {
                return false; //No encontro el numero
            }
        }
        //Si lo encontro valido
        if (aux.HijoIzq == null && aux.HijoDer == null) {
            if (aux == raizArbol) {
                //Si es la raiz, la elimino
                raizArbol = null;
            } else if (HijoIz == true) {
                //Si es el izquierdo lo elimino
                padre.HijoIzq = null;
            } else {
                //De lo contrario es el derecho y lo elimino
                padre.HijoDer = null;
            }
        } //Si no tiene hijo derecho, apunto a la izquierda.
        else if (aux.HijoDer == null) {
            if (aux == raizArbol) {
                raizArbol = aux.HijoIzq;
            } else if (HijoIz == true) {
                padre.HijoIzq = aux.HijoIzq;
            } else {
                padre.HijoDer = aux.HijoIzq;
            }
        } //Si no tiene hijo izquierdo, apunto a la derecha.
        else if (aux.HijoIzq == null) {
            if (aux == raizArbol) {
                raizArbol = aux.HijoDer;
            } else if (HijoIz == true) {
                padre.HijoIzq = aux.HijoDer;
            } else {
                padre.HijoDer = aux.HijoDer;
            }
        } else {
            //Llamo a la funcion para encontrar el sustituto del nodo eliminado.
            Nodo sustituto = EncontrarSustituto(aux);
            if (aux == raizArbol) {
                raizArbol = sustituto;
            } else if (HijoIz == true) {
                padre.HijoIzq = sustituto;
            } else {
                padre.HijoDer = sustituto;
            }
            sustituto.HijoIzq=aux.HijoIzq;
        }
        return true; // Si encontro el nodo a eliminar.
    }
    
    //Funcion para encontrar el nodo que va a sustituir el eliminado
    public Nodo EncontrarSustituto (Nodo sustituir){
        Nodo SustituirPadre = sustituir;
        Nodo Sustituto = sustituir;
        Nodo aux = sustituir.HijoDer;
        //Encontrar el nodo para usarlo de reemplazo
        while (aux != null) {
            SustituirPadre = Sustituto;
            Sustituto = aux;
            aux = aux.HijoIzq;
        }
        if (Sustituto != sustituir.HijoDer) {
            SustituirPadre.HijoIzq = Sustituto.HijoDer;
            Sustituto.HijoDer = sustituir.HijoDer;
        }
        return Sustituto;
    }
        
    
    //RECORRIDOS
   
    //RECORRER IN ORDEN IZQ,RAIZ, DER
    
   public void INOrden (Nodo raizArbol){
       if (raizArbol != null){
           
           //Utilizo recursividad
           INOrden(raizArbol.HijoIzq); //Recorro primero la izquierda
           this.interfaz.RESULTADOS.append(String.valueOf(raizArbol.num)+ " "); 
           INOrden(raizArbol.HijoDer); //Recorro la derecha
       }
   
   
   }
   
   //RECORRER PRE ORDEN RAIZ, IZQ , DER
   public void PREOrden(Nodo raizArbol) {
        if (raizArbol != null) {
            //Utilizo recursividad
            this.interfaz.RESULTADOS.append(String.valueOf(raizArbol.num) + " ");
            PREOrden(raizArbol.HijoIzq); //Recorro primero la izquierda
            PREOrden(raizArbol.HijoDer); //Recorro la derecha
        }
    }
   
   
   //RECORRER POST ORDEN IZQ,DER, RAIZ
   
    public void POSTOrden(Nodo raizArbol) {
        if (raizArbol != null) {
            //Utilizo recursividad
            POSTOrden(raizArbol.HijoIzq); //Recorro primero la izquierda
            POSTOrden(raizArbol.HijoDer); //Recorro la derecha
            this.interfaz.RESULTADOS.append(String.valueOf(raizArbol.num) + " ");
        }
    }
   
//Funcion para encontrar la Altura del Arbol
    
    public int AlturaArbol (Nodo raizArbol ){
        int AlturaTotal = 0;
        int AlturaRaiz;
        int AlturaIzq;
        int AlturaDer;
        if (raizArbol != null) {
            AlturaRaiz = 1;
            //Aplico recursividad para contar las alturas de los hijos
            AlturaIzq = AlturaArbol(raizArbol.HijoIzq);
            AlturaDer = AlturaArbol(raizArbol.HijoDer);
            if (AlturaIzq > AlturaDer) {
                AlturaTotal = AlturaIzq + AlturaRaiz;
            } else {
                AlturaTotal = AlturaDer + AlturaRaiz;
            }
        }else {
            return AlturaTotal=0;
        }
        return AlturaTotal;
    }
    
//Funcion para mostrar las hojas
    
    public void Hojas (Nodo raizArbol){
        if (raizArbol != null) {
            if (raizArbol.HijoIzq == null && raizArbol.HijoDer == null) {
                int hoja = raizArbol.num;
                interfaz.RESULTADOS.append(String.valueOf(hoja)+" ");
            } else {
                //Aplico recursividad para que revise los hijos.
                Hojas(raizArbol.HijoIzq);
                Hojas(raizArbol.HijoDer);
            }
        }
    }

    






}



