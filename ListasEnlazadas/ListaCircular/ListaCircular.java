package co.edu.uniquindio.poo.ListasEnlazadas.ListaCircular;

import co.edu.uniquindio.poo.ListasEnlazadas.Nodo;

public class ListaCircular<T extends Comparable<T>> {
    private Nodo<T> primero;
    private int tamaño;

    public ListaCircular() {
        primero=null;
        tamaño=0;
    }

    public void agragarPrimero(Nodo<T> newNodo){
        if (primero == null) {
            primero = newNodo;
            newNodo.setProximo(primero);
        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != primero) {
                actual = actual.getProximo();
            }
            actual.setProximo(newNodo);    // último apunta al nuevo
            newNodo.setProximo(primero);   // nuevo apunta al viejo primero
            primero = newNodo;             // actualizamos primero
        }
        tamaño++;
    }

    public void agregarUltimo(Nodo<T> newNodo){
        if (primero == null) {
            primero = newNodo;
            newNodo.setProximo(primero);
        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != primero) {
                actual = actual.getProximo();
            }
            actual.setProximo(newNodo);
            newNodo.setProximo(primero);
        }
        tamaño++;
    }
}
