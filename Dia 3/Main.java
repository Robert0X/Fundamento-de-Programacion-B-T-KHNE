import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g = 1;
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        int h[] = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
            t = t - h[i];

            if (t >= 0) {
                g++;
            }
        }
        if (t <= 0) {
            System.out.println(g);
        } else {
            System.out.println("0");
        }
    }
}