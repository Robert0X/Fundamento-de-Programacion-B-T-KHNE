import java.util.Scanner;

public class switchl {

    public static void intercam(int a, int b) {// 1 2
        int aux = b; // aux =2
        b = a; // b = 1
        a = aux; // 2

        System.out.println("El valor de a: " + a + "el valor de b: " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        intercam(a, b);

    }
}