
import java.util.*;

public class Main {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> pares = new ArrayList<>();
        pares.add(5);
        pares.add(1);
        pares.add(9);

        for (int i : pares) {
            System.out.print(i + " ");
        }

        System.out.println();

        pares.sort(null);
        // 5 1 9
        // 1 5 9

        for (int i : pares) {
            System.out.print(i + " ");
        }

        pares.add(10);

    }
}