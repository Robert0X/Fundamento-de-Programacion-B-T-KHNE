import java.util.*;
import java.io.*;

public class e {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        double x = cin.nextDouble();

        double y = ((x + 5) / (2 * (x + 1)));
        double z = (((y * y) + x * (x - 2 * y)) / (x * y));

        // System.out.println(z);
        System.out.format("%.6f", z);

    }
}