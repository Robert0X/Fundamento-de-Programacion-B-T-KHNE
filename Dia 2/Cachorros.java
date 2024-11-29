import java.util.Scanner;

public class Cachorros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int P, H, C;
        C = leer.nextInt();
        P = leer.nextInt() + 1;
        H = leer.nextInt();

        int restantes = C - P;
        System.out.println(restantes);
        int noRepartidos = 0;

        noRepartidos = restantes % H;
        System.out.println(noRepartidos);

        int totalConPancho = P + noRepartidos;
        System.out.println(totalConPancho);
    }
}