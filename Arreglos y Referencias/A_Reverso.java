import java.util.*;

public class A_Reverso {
  private static Scanner cin = new Scanner(System.in);

  public static void main(String[] args) {

    int n = cin.nextInt();

    int num[] = new int[n];
    for (int i = 0; i < n; i++) {
      num[i] = cin.nextInt();
    }

    while (n != 0) {
      System.out.print(num[n - 1] + " ");
      n--;
    }

    cin.close();
  }
}