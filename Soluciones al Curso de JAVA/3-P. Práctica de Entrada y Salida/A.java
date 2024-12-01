import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        // Leer la base y la altura
        int base = cin.nextInt();
        int altura = cin.nextInt();
        /*
         * Lo ideal para calcular areas es usar double
         * pero, si enviamos el ejercio con double
         * nos dara 0%, por el problema, fue planteado para usar
         * enteros solamente (error del creador del problema).
         */

        // Calcular el área
        int area = (base * altura) / 2;

        // Mostrar el resultado
        System.out.println(area);
    }
}