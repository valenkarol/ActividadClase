package co.edu.uniquindio.poo.ListasEnlazadas.ListaCircular;

public class Main {
    public static void main(String[] args) {

        // Crear una lista circular de enteros
        ListaCircular<Integer> lista = new ListaCircular<>();

        // Insertar elementos desordenados usando agregarUltimo
        System.out.println("Insertando al final:");
        lista.agregarUltimo(new Nodo<>(20));
        lista.agregarUltimo(new Nodo<>(5));
        lista.agregarUltimo(new Nodo<>(15));
        lista.agregarUltimo(new Nodo<>(30));
        lista.mostrar();

        // Insertar al inicio
        System.out.println("\nInsertando al inicio (0):");
        lista.agregarPrimero(new Nodo<>(0));
        lista.mostrar();

        // Insertar ordenado
        System.out.println("\nInsertando de manera ordenada (10):");
        lista.agregarOrdenado(10);
        lista.mostrar();

        // Ordenar toda la lista con sort
        System.out.println("\nOrdenando lista con sort:");
        lista.sort();
        lista.mostrar();
    }
}
