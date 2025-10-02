package co.edu.uniquindio.poo.ListasEnlazadas.DoblementeCircular;

public class ListaDobleCircular<T extends Comparable<T>> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamano;

    public ListaDobleCircular() {
        primero = null;
        ultimo = null;
        tamano = 0;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public int getTamano() {
        return tamano;
    }

    // Insertar al final
    public void insertarFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
            primero.setSiguiente(primero);
            primero.setAnterior(primero);
        } else {
            nuevo.setAnterior(ultimo);
            nuevo.setSiguiente(primero);
            ultimo.setSiguiente(nuevo);
            primero.setAnterior(nuevo);
            ultimo = nuevo;
        }
        tamano++;
    }

    // Insertar al inicio
    public void insertarInicio(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
            primero.setSiguiente(primero);
            primero.setAnterior(primero);
        } else {
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            primero.setAnterior(nuevo);
            ultimo.setSiguiente(nuevo);
            primero = nuevo;
        }
        tamano++;
    }
    // Insertar en forma ordenadsa
    public void insertarOrdenado(T dato) {
        if (estaVacia() || dato.compareTo(primero.getDato()) <= 0) {
            insertarInicio(dato);
        } else if (dato.compareTo(ultimo.getDato()) >= 0) {
            insertarFinal(dato);
        } else {
            Nodo<T> actual = primero;
            while (dato.compareTo(actual.getDato()) > 0) {
                actual = actual.getSiguiente();
            }
            Nodo<T> nuevo = new Nodo<>(dato);
            Nodo<T> anterior = actual.getAnterior();
            anterior.setSiguiente(nuevo);
            nuevo.setAnterior(anterior);
            nuevo.setSiguiente(actual);
            actual.setAnterior(nuevo);
            tamano++;
        }
    }
}
