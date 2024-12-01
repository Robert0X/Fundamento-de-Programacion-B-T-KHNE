import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        // Leer el área del círculo
        double area = cin.nextDouble();

        // Calcular el radio
        /*
         * Di la libreria Math
         * Math.PI devuelve el valor de pi ->"3.14159 etc"
         * de forma que hace mas preciso los calculos que usar
         * 3.1416
         * 
         * Math.sqrt(OPERACION) -> devuelve la Raiz cuadrada
         * de la operacion entre paréntesis
         */
        double radio = Math.sqrt(area / Math.PI);

        // Calcular el diámetro
        double diametro = 2 * radio;

        // Calcular el perímetro
        double perimetro = 2 * Math.PI * radio;

        // Formatear y mostrar los resultados con 2 decimales
        System.out.printf("%.2f %.2f %.2f", diametro, radio, perimetro);
        // Ya automaticamente al usar format deja un espacio entre los dijitos
        // al poner -> %.2f y un espacion entre estos %.2f %.2f, deja el espacio
        // si lo hicieramos "%.2f%.2f%.2f" no dejaria espacios al imprimir
    }
}