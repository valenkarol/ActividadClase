package co.edu.uniquindio.poo.ListasEnlazadas.ListaDoblementeEnlazada;

public class ListaDobleEnlazada<T> {
    private NodoDoble2<T> primero;   // primer nodo
    private NodoDoble2<T> ultimo;     // último nodo
    private int tamaño;             // cantidad de nodos

    public ListaDobleEnlazada() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }
    public boolean estaVacia() {
        return primero == null;
    }
    //metodo agregar al final
    public void agregarFinal(T elemento) {
        NodoDoble2<T> nuevo = new NodoDoble2<>(elemento);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setProximo(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
        tamaño++;
    }
    //metodo agregar al inicio
    public void agregarInicio(T elemento) {
        NodoDoble2<T> nuevo = new NodoDoble2<>(elemento);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
        tamaño++;
    }
    //agregar en posicion especifica
    public void agregarEnPosicion(int indice, T elemento) {
        if (indice <= 0) {
            agregarInicio(elemento);
            return;
        }
        if (indice >= tamaño) {
            agregarFinal(elemento);
            return;
        }
        NodoDoble2<T> actual = primero;
        for (int i = 0; i < indice; i++) {
            actual = actual.getProximo();
        }
        NodoDoble2<T> nuevo = new NodoDoble2<>(elemento);
        NodoDoble2<T> anterior = actual.getAnterior();
        anterior.setProximo(nuevo);
        nuevo.setAnterior(anterior);
        nuevo.setProximo(actual);
        actual.setAnterior(nuevo);
        tamaño++;
    }
}
