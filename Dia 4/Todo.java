import java.util.*;

public class Todo {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        int pares[] = { 2, 6, 7, 8, 10, 11, 18 };

        for (int i : pares) {
            System.out.println(i);
        }

        for (int i : pares) {
            if (i % 2 != 0)
                System.out.println("Este no es par: " + i);
        }

        ArrayList<Integer> pares2 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            pares2.add(i);
        }

        for (int i : pares2) {
            if (i % 2 != 0) {
                System.out.println("Este no es par: " + i);
            }
        }

    }
}