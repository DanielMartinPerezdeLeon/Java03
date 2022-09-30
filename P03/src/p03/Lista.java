
package p03;

/**
 *
 * @author damar
 */
public class Lista <T>{     //Una arraylist doble linked
    private Nodo inicio;    //basicamente puntero a el primer nodo
    private Nodo actual;    //Nodo auxiliar para coger datos sin tocar directamente los nodos
    
    public Lista(){ //Crea la lista
        this.inicio=null;
        this.actual=null;
    }
    
    public void insertar(T n){      //Introduce un nodo a la lista
        Nodo nuevo = new Nodo(n);   
        
        if(inicio==null){       //Si la lista está vacía, inicio será ese nodo
            inicio=nuevo;
            
        }else{  //si no
            
            this.actual=inicio; //se mete en inicio
            
            while(actual.getSiguiente()!=null){ //Avanza hasta llegar al ultimo
                actual=actual.getSiguiente();
            }
            
            nuevo.setAnterior(actual);  //la introduce
            actual.setSiguiente(nuevo); //Indica que el anterior era el último
        }
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getActual() {
        return actual;
    }

    public void setActual(Nodo actual) {
        this.actual = actual;
    }
    
    
}

class Nodo <T>{ //Cada nodo de la lista
    private T datos;    //En este caso serán cuentas
    private Nodo anterior; 
    private Nodo siguiente;
    
    public Nodo(T dat){
        this.anterior=null;
        this.siguiente=null;
        this.datos=dat;
    }


    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }
    
    
    
}
