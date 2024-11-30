//https://omegaup.com/arena/problem/Matriz-Transpuesta-N-x-M/#problems

import java.util.*;

public class MatrizTranspuesta {

    static void imprimir(int mat[][]) {

        for (int[] is : mat) {
            for (int x : is) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 0, m = 0;
        while (n <= 0 || m <= 0) {
            n = cin.nextInt();
            m = cin.nextInt();
        }

        int mat[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = cin.nextInt();
            }
        }

        System.out.print("MATRIZ ORIGINAL:\n");
        imprimir(mat);
        System.out.println();

        System.out.print("MATRIZ TRANSPUESTA:\n");

        int MatT[][] = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                MatT[j][i] = mat[i][j];
            }
        }

        imprimir(MatT);

        cin.close();
    }
}