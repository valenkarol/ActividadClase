package co.edu.uniquindio.poo.ListasEnlazadas.Cola;

public class Cola<T extends Comparable<T>> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamano;

    public Cola() {
        primero = null;
        ultimo = null;
        tamano = 0;

    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    public Nodo<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void encolar(Nodo<T> newNodo){
        Nodo<T> nuevo = newNodo;
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else {
            ultimo.setProximo(nuevo);
            ultimo = nuevo;
        }
    }
    //desencolar
    public T desencolar() {
        if (primero == null) {
            return null;
        }
        T dato = primero.getDato();
        primero = primero.getProximo();
        if (primero == null) {
            ultimo = null;
        }
        tamano--;
        return dato;
    }
}
