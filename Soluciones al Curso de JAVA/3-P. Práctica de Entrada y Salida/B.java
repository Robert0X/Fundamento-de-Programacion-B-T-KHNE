import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int c = cin.nextInt();
        int p = cin.nextInt();
        int h = cin.nextInt();

        /*
         * La logica de la ecuacion:
         * h + 1 -> Ya que el problema nos indica que la
         * madre es aparte de los hijos, entonces sumamos a la madre
         * c - p -> Los cachoros totales, menos los que seguro se queda P
         * 
         * (c - p) % (h + 1) -> al hacer eso nos dara el residuo de su division
         * que son la cantidad de perritos que no se pudieron repartir por igual
         * 
         * Entonces eso se lo sumamos a los perritos que si hiba a quedar P.
         */

        System.out.println(p + ((c - p) % (h + 1)));
    }
}