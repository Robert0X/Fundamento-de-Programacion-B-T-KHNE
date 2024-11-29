import java.util.*;

public class IkiaSOL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<>();

        int N = scanner.nextInt();
        num.add(N);

        // N=4
        // i
        for (int i = N; N != 1; i++) {

            // n=1
            if (N % 2 == 0) {
                N = N / 2;
                num.add(i);

            } else {
                // 1 = 1(1*3) +1 = 4
                N = (N * 3) + 1;
                num.add(N);

            }

        }
        num.add(1);
        num.sort(null);
        
        for (int i : num) {
            System.out.print(i + " ");
        }

    }

}