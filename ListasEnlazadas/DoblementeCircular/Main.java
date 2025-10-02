package co.edu.uniquindio.poo.ListasEnlazadas.DoblementeCircular;

public class Main {
    public static void main(String[] args) {
        ListaDobleCircular<Integer> lista = new ListaDobleCircular<>();

        lista.insertarFinal(5);
        lista.insertarFinal(2);
        lista.insertarFinal(9);
        lista.insertarFinal(1);
        lista.insertarFinal(7);

        System.out.println("Antes de ordenar:");
        lista.mostrar();

        lista.sort();

        System.out.println("Después de ordenar:");
        lista.mostrar();


        // También con Strings
        ListaDobleCircular<String> listaStr = new ListaDobleCircular<>();
        listaStr.insertarFinal("perro");
        listaStr.insertarFinal("gato");
        listaStr.insertarFinal("elefante");
        listaStr.insertarFinal("zorro");

        System.out.println("\nStrings antes:");
        listaStr.mostrar();

        listaStr.sort();

        System.out.println("Strings después:");
        listaStr.mostrar();
    }
}
