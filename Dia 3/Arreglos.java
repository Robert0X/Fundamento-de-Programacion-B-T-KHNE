import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edades[] = { 2, 1, 2, 1, 2 };
        int n = 3;
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
            System.out.println(num[i]);
        }

    }
}