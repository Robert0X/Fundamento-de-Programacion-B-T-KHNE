import java.util.Scanner;

public class ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("FOR: ");
        for (int i = 0; i <= 10; i++) {
            // i=0
            System.out.println(i);
        }

        System.out.println("\n");

        System.out.println("WHILE: ");

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;// i = i +1;
            // i = 10
        }

        System.out.println("\n");

        i = 0;

        System.out.println("DO WHILE: ");
        do {
            System.out.println(i);
              i++;
        } while (1 == 0);

    }
}