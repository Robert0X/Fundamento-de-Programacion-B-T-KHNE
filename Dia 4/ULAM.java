import java.util.*;

public class ULAM {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> ULAM = new ArrayList<Integer>();

        int n = cin.nextInt();

        while (n != 1) {
            ULAM.add(n);
            if (n % 2 == 0)
                n /= 2; // n = n / 2
            else {
                n *= 3;
                n += 1;
            } // n = n*3; n=n+1

        }
        ULAM.add(1);
        ULAM.sort(null);

        for (int i : ULAM) {
            System.out.print(i + " ");
        }
        cin.close();
    }
}