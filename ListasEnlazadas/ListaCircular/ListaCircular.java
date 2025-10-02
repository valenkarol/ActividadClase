package co.edu.uniquindio.poo.ListasEnlazadas.ListaCircular;

import co.edu.uniquindio.poo.ListasEnlazadas.Nodo;

public class ListaCircular<T extends Comparable<T>> {
    private Nodo<T> primero;
    private int tamaño;

    public ListaCircular() {
        primero=null;
        tamaño=0;
    }

    public void agregarPrimero(Nodo<T> newNodo){
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
    // nsertar ordenado
    public void agregarOrdenado(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null || dato.compareTo(primero.getDato()) <= 0) {
            agregarPrimero(nuevo);
        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != primero &&
                    dato.compareTo(actual.getProximo().getDato()) > 0) {
                actual = actual.getProximo();
            }
            nuevo.setProximo(actual.getProximo());
            actual.setProximo(nuevo);
            tamaño++;
        }
    }
}
