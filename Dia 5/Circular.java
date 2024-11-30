import java.util.Scanner;

public class Circular {

    static void Imprimir(int matriz[][]) {

        for (int[] filaActual : matriz) {
            for (int elemento : filaActual) {
                System.out.print(elemento);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = 3;

        int[] numeros = new int[n * n];
        int[][] matriz = new int[n][n];
        int fila = 0, col = 0, dir = 0;

        int[] dFila = { 0, 1, 0, -1 }; // Direcciones: derecha, abajo, izquierda, arriba
        int[] dCol = { 1, 0, -1, 0 };

        // Leer los números para rellenar la matriz
        for (int i = 0; i < n * n; i++) {
            numeros[i] = cin.nextInt();
        }

        // Llenar la matriz en espiral
        int indice = 0;

        while (indice < n * n) {
            matriz[fila][col] = numeros[indice++];
            int nuevaFila = fila + dFila[dir];
            int nuevaCol = col + dCol[dir];

            if (nuevaFila < 0 || nuevaFila >= n || nuevaCol < 0 || nuevaCol >= n || matriz[nuevaFila][nuevaCol] != 0) {
                dir = (dir + 1) % 4; // Cambiar dirección
            }

            fila += dFila[dir];
            col += dCol[dir];
        }

        // Imprimir la matriz
        System.out.println("Matriz en orden circular:");
        Imprimir(matriz);

        cin.close();
    }
}
