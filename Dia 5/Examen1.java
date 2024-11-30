import java.util.*;

public class Examen1 {

    static void ImprimirMatriz(char a[][]) {

        System.out.println("\n");

        for (char[] i : a) {
            for (char j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

    }

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        int columnas;

        do {
            System.out.println("Dame un numero mayor o igual a 3: ");
            columnas = cin.nextInt();
        } while (columnas < 3);

        int renglones = (columnas * 2) - 1;

        char mat[][] = new char[renglones][columnas];

        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {

                if (j >= Math.abs(columnas - i - 1)) {
                    mat[i][j] = '*';
                } else {
                    mat[i][j] = ' ';
                }
                
            }
        }

        ImprimirMatriz(mat);

        cin.close();
    }
}