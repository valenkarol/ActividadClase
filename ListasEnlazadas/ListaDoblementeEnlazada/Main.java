package co.edu.uniquindio.poo.ListasEnlazadas.ListaDoblementeEnlazada;

public class Main {
    public static void main(String[] args) {
        // 🔸 Lista con números
        ListaDobleEnlazada<Integer> listaEnteros = new ListaDobleEnlazada<>();
        listaEnteros.agregarFinal(8);
        listaEnteros.agregarFinal(3);
        listaEnteros.agregarFinal(10);
        listaEnteros.agregarFinal(1);
        listaEnteros.agregarFinal(6);

        System.out.println("Lista de enteros antes de ordenar:");
        listaEnteros.mostrar();

        listaEnteros.sort();

        System.out.println("Lista de enteros después de ordenar:");
        listaEnteros.mostrar();


        // 🔸 Lista con Strings
        ListaDobleEnlazada<String> listaStrings = new ListaDobleEnlazada<>();
        listaStrings.agregarFinal("perro");
        listaStrings.agregarFinal("gato");
        listaStrings.agregarFinal("elefante");
        listaStrings.agregarFinal("jirafa");
        listaStrings.agregarFinal("abeja");

        System.out.println("\nLista de strings antes de ordenar:");
        listaStrings.mostrar();

        listaStrings.sort();

        System.out.println("Lista de strings después de ordenar:");
        listaStrings.mostrar();
    }
}
