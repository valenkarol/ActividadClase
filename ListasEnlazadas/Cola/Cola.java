package co.edu.uniquindio.poo.ListasEnlazadas.Cola;

public class Cola<T extends Comparable<T>> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamano;

    public Cola(int tamano) {
        this.tamano = tamano;
    }
}
