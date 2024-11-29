import java.util.*;

public class todo {
    private static Scanner cin = new Scanner(System.in);

    static void Tablas_De_Multiplicar(int a) {
        for (int i = 1; i <= a; i++) { // i=1
            System.out.println("Tabla del: " + i);

            for (int j = 1; j <= 10; j++) {// j=1
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("\n");
        }
    }

    static int sumas(int a, int b) {
        return a + b;
    }

    /*
     * Para Funciones:
     * Void
     * 
     * 
     * Numericos
     * 
     * short
     * byte
     * int
     * long
     * 
     * 
     * Caracteres
     * 
     * char
     * String
     * 
     * Boleanos
     * 
     * Boolean
     * 
     */

    public static void main(String[] args) {

        /*
         * 
         * int Dia;
         * Dia = cin.nextInt();
         * 
         * switch (Dia) {
         * case 1:
         * System.out.println("Lunes");
         * break;
         * case 2:
         * System.out.println("Martes");
         * break;
         * case 3:
         * System.out.println("Miercoles");
         * break;
         * 
         * default:
         * System.out.println("Otro dia");
         * 
         * }
         */

        int n;
        // n = cin.nextInt();

        /*
         * n=7
         * i=4
         * (4 <= 10) -> True
         * 7 x 3 = 21
         * 
         */

        /*
         * 
         * for (int i = 1; i <= 10; i++) {
         * System.out.println(n + " x " + i + " = " + (n * i));
         * }
         */

        /*
         * 
         * int i = 1;
         * while (i <= 10) {
         * System.out.println(n + " x " + i + " = " + (n * i));
         * i++;
         * }
         */

        /*
         * 
         * int i = 1;
         * do {
         * System.out.println(n + " x " + i + " = " + (n * i));
         * i++;
         * } while (i <= 10);
         * 
         */

        // Ciclos ANIDADOS

        /*
         * n = 10
         */

        /*
         * 
         * for (int i = 1; i <= n; i++) { // i=1
         * System.out.println("Tabla del: " + i);
         * 
         * for (int j = 1; j <= 10; j++) {// j=1
         * System.out.println(i + " x " + j + " = " + (i * j));
         * }
         * System.out.println("\n");
         */

        // Funciones

        // Tablas_De_Multiplicar(n);

        /*
         * 
         * int a, b;
         * a = cin.nextInt();
         * b = cin.nextInt();
         * 
         * System.out.println(sumas(a, b));
         */

        int Numero_Pares = cin.nextInt();
        // int pares[] = { 2, 4, 6, 8, 10 };
        // 0 1 2 3 4

        int pares[] = new int[Numero_Pares];

        for (int i = 0; i < Numero_Pares; i++) {
            pares[i] = cin.nextInt();
            // System.out.println(pares[i]);
        }

        for (int i = Numero_Pares - 1; i >= 0; i--) {
            System.out.print(pares[i] + " ");
        }

        for (int imp : pares) {
            System.out.println(imp);
        }

        cin.close();
    }
}