package co.edu.uniquindio.poo.ListasEnlazadas.Pila;

public class Pila<T> {
    private NodoPila<T> cima;
    private int tamano;

    public void apilar(T elemento) {
        NodoPila<T> nuevo = new NodoPila<>(elemento);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        tamano++;
    }

    public T desapilar() {
        if (cima == null) return null;
        T dato = cima.getDato();
        cima = cima.getSiguiente();
        tamano--;
        return dato;
    }
}
