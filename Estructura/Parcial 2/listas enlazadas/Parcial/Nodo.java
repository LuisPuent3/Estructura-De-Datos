
public class Nodo {

    Object valor;
    Nodo siguiente;

  public Nodo(Object valor)
    {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object getValor() {
        return valor;
    }

    //enlazar al siguiente nodo+
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

}



