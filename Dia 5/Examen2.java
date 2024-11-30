import java.util.Random;

public class Examen2 {

    public static void main(String[] args) {
        Random random = new Random();

        // Generar un valor aleatorio para N entre 3 y 9
        int N = random.nextInt(7) + 3; // 7 = 9 - 3 + 1

        // Crear la matriz cuadrada NxN
        int[][] matriz = new int[N][N];

        // Llenar la matriz con valores aleatorios entre 0 y 12
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                matriz[i][j] = random.nextInt(13); // 13 = 12 + 1
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz generada:");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Sumar los elementos de la diagonal
        int sumaDiagonal = 0;
        String diagonalElements = "";

        for (int i = 0; i < N; i++) {
            sumaDiagonal += matriz[i][i];
            diagonalElements += matriz[i][i] + " ";
        }

        // Sumar los elementos arriba de la diagonal que son múltiplos de 3
        int sumaArribaDiagonalMultiplosDe3 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                if (matriz[i][j] % 3 == 0) {
                    sumaArribaDiagonalMultiplosDe3 += matriz[i][j];
                }
                
            }
        }

        // Mostrar los resultados
        System.out.println("\nElementos de la diagonal: " + diagonalElements.trim());
        System.out.println("Suma de los elementos de la diagonal: " + sumaDiagonal);
        System.out.println("Suma de los elementos arriba de la diagonal que son múltiplos de 3: "
                + sumaArribaDiagonalMultiplosDe3);
    }
}