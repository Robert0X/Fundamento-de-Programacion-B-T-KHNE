import java.util.Scanner;

public class ElToro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t, n;
        t = scanner.nextInt();// 11
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int H = scanner.nextInt();
            t -= H;

            if (t <= 0)
                System.out.println(i + 1);

        }

        if (t > 0)
            System.out.print("0");
    }
}