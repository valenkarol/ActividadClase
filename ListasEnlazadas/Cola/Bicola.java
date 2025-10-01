package co.edu.uniquindio.poo.ListasEnlazadas.Cola;

public class Bicola<T> extends Cola<T> {
    public Bicola() {
        super();
    }

    public void agregarInicio(Nodo<T> newNodo) {
        Nodo<T> nuevo = newNodo;
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero = nuevo;
        }
        tamano++;
    }


    public void agregarFinal(Nodo<T> newNodo) {
        Nodo<T> nuevo = newNodo;
        encolar(nuevo); // ya está en Cola
    }


    public T eliminarInicio() {
        return desencolar(); // ya está implementado en Cola
    }

    // Eliminar al final
    public T eliminarFinal() {
        if (ultimo == null) {
            return null;
        } else if (primero == ultimo) {
            primero = null;
            ultimo = null;
        } else {
            // Recorremos hasta el penúltimo
            Nodo<T> actual = primero;
            while (actual.getProximo() != ultimo) {
                actual = actual.getProximo();
            }
            actual.setProximo(null);
            ultimo = actual;
        }
        tamano--;

    }

}
