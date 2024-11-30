import java.util.Scanner;

public class SolGabriela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0;

        while (n <= 0 || m <= 0) {
            n = scanner.nextInt();
            m = scanner.nextInt();
        }
        int mat[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("MATRIZ ORIGINAL: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("MATRIZ TRANSPUESTA: ");

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}