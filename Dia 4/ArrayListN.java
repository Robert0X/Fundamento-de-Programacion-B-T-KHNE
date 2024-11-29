
import java.util.*;

public class ArrayListN {

    static void imprimir(ArrayList<String> a) {

        if (a.size() == 0) {
            System.out.println("Esta Vacio :( ");
        }

        for (String i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

    }

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Pablo");
        names.add("Roberto");
        names.add("Bryan");

        System.out.println("Lista inicial: ");
        imprimir(names);

        names.add(0, "L"); // Añade en n-esima posicion

        System.out.println("Despues de añadir al inicio ");
        imprimir(names);

        names.set(0, "A"); // Remplaza

        System.out.println("Despues de remplazar al inicio");
        imprimir(names);

        System.out.println("Elimina el del inicio");
        names.remove(0); // Elimina

        imprimir(names);

        System.out.println("El tamaño es: " + names.size());

        names.clear();
        imprimir(names);

    }
}