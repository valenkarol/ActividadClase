package co.edu.uniquindio.poo.ListasEnlazadas.Cola;

public class NodoBicola<T>{
    private T dato;
    private Nodo<T> proximo;
    private Nodo<T> anterior;

    public NodoBicola() {
        this.dato = dato;
        this.proximo = null;
        this.anterior = null;
    }

    // Getters y setters
    public T getDato() {
        return dato;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }

    public Nodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }
}


