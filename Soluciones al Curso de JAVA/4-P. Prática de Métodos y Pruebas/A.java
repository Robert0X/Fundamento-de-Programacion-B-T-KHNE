import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los valores de los catetos
        int catetoA = scanner.nextInt();
        int catetoB = scanner.nextInt();

        // Calcular la hipotenusa usando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        // Formatear el resultado con 3 decimales
        System.out.printf("%.3f", hipotenusa);
    }
}