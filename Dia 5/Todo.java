import java.util.*;

public class Todo {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaración de una matriz vacía
        int[][] matriz = new int[3][4]; // Matriz de 3 filas y 4 columnas

        // Inicialización con valores
        int[][] matrizInicializada = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int elemento = matrizInicializada[1][2]; // Accede al elemento en fila 1, columna 2 (5)

        // Modificar un elemento
        matrizInicializada[0][0] = 10; // Cambia el 1 al 10

        for (int i = 0; i < matrizInicializada.length; i++) { // Filas
            for (int j = 0; j < matrizInicializada[i].length; j++) { // Columnas
                System.out.print(matrizInicializada[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        for (int[] fila : matrizInicializada) {
            for (int element : fila) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int[][] matrizA = { { 1, 2 }, { 3, 4 } };
        int[][] matrizB = { { 5, 6 }, { 7, 8 } };
        int[][] suma = new int[2][2];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        cin.close();
    }
}