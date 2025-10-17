package co.edu.uniquindio.poo.ListasEnlazadas.Cola;

public class Cola<T> {
    protected Nodo<T> primero;
    protected Nodo<T> ultimo;
    protected int tamano;

    public Cola() {
        primero = null;
        ultimo = null;
        tamano = 0;

    }
    public void encolar(Nodo<T> newNodo){
        Nodo<T> nuevo = newNodo;
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
            tamano++;
        }else {
            ultimo.setProximo(nuevo);
            ultimo = nuevo;
            tamano++;
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
