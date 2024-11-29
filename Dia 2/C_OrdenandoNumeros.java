import java.util.Scanner;

public class C_OrdenandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer cuatro enteros
        int a = scanner.nextInt(); // a = 4
        int b = scanner.nextInt(); // b = 3
        int c = scanner.nextInt(); // c = 2
        int d = scanner.nextInt(); // d = 1

        // Mostrar estado inicial
        System.out.println("Estado inicial: " + a + " " + b + " " + c + " " + d);

        // Ordenar los números utilizando condiciones

        // Primera pasada: comparar a y b
        if (a > b) { // 4 > 3 (verdadero)
            int temp = a; // temp = 4
            a = b; // a = 3
            b = temp; // b = 4
            System.out.println("Primera pasada: " + a + " " + b + " " + c + " " + d);
        }

        // Segunda pasada: comparar b y c
        if (b > c) { // 4 > 2 (verdadero)
            int temp = b; // temp = 4
            b = c; // b = 2
            c = temp; // c = 4
            System.out.println("Segunda pasada: " + a + " " + b + " " + c + " " + d);
        }

        // Tercera pasada: comparar c y d
        if (c > d) { // 4 > 1 (verdadero)
            int temp = c; // temp = 4
            c = d; // c = 1
            d = temp; // d = 4
            System.out.println("Tercera pasada: " + a + " " + b + " " + c + " " + d);
        }

        // Cuarta pasada: comparar a y b
        if (a > b) { // 3 > 2 (verdadero)
            int temp = a; // temp = 3
            a = b; // a = 2
            b = temp; // b = 3
            System.out.println("Cuarta pasada: " + a + " " + b + " " + c + " " + d);
        }

        // Quinta pasada: comparar b y c
        if (b > c) { // 3 > 1 (verdadero)
            int temp = b; // temp = 3
            b = c; // b = 1
            c = temp; // c = 3
            System.out.println("Quinta pasada: " + a + " " + b + " " + c + " " + d);
        }

        // Sexta pasada: comparar a y b
        if (a > b) { // 2 > 1 (verdadero)
            int temp = a; // temp = 2
            a = b; // a = 1
            b = temp; // b = 2
            System.out.println("Sexta pasada: " + a + " " + b + " " + c + " " + d);
        }

        // Imprimir los números ordenados
        System.out.println("Números ordenados: " + a + " " + b + " " + c + " " + d); // 1 2 3 4
    }
}