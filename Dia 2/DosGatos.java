import java.util.*;

public class DosGatos {

    static int absuoluto(int a) {
        if (a < 0) {
            return a * (-1);
        } else
            return a;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int GatoA, GatoB, RatonC;
        GatoA = cin.nextInt();
        GatoB = cin.nextInt();
        RatonC = cin.nextInt();

        int Distancia_del_GatoA = absuoluto(RatonC - GatoA);
        int Distancia_del_GatoB = absuoluto(RatonC - GatoB);

        if (Distancia_del_GatoA < Distancia_del_GatoB)
            System.out.println("gato A");

        else if (Distancia_del_GatoB < Distancia_del_GatoA)
            System.out.println("gato B");

        else
            System.out.println("raton C");

        cin.close();
    }
}
