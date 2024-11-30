import java.util.*;

public class Matrices {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        int mat[][] = {
                // 0 1 2 3 4
                { 1, 3, 4, 6 },
                { 1, 4, 5, 6 },
                { 1, 2, 4, 5 }
        };

        for (int i[] : mat) {
            for (int x : i) {
                System.out.print(x + " ");
            }
            System.err.println();
        }

        /*
         * 
         * int n,m;
         * n = cin.nextInt();
         * int mat[][] = new int[n][m];
         * 
         * for (int i = 0; i < 3; i++) {
         * for (int j = 0; j < 2; j++) {
         * mat[i][j] = cin.nextInt();
         * System.out.print(mat[i][j] + " ");
         * }
         * 
         * }
         */

        cin.close();
    }
}