import java.util.Scanner;

public class SOLToro {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int t, n;
        t = leer.nextInt();
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            int h = leer.nextInt();
            t -= h;
            if (t <= 0) {
                System.out.println(i + 1);
            }

        }
        if (t > 0) {
            System.out.println("0");
        }
    }
}
