import java.util.Scanner;

public class Tablas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;// 3
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int tabla;// 7
            tabla = scanner.nextInt();

            for (int j = 1; j <= 10; j++) {
                System.out.println(tabla + "x" + j + "=" + (tabla * j));
            }
            System.out.print("\n");

        }

    }
}