import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int segundosTotales = scanner.nextInt();

        // Definimos las constantes para las duraciones en el planeta extraño
        final int SEGUNDOS_MINUTO = 50;
        /*
         * Los final int son constantes enteras, osea que una vez hecho
         * final TIPO_DE_VARIBLE, estos son inmutables, y no se va a
         * poder cambiar su valor una vez definido
         */
        final int MINUTOS_HORA = 70;
        final int HORAS_DIA = 12;

        // Calculamos los días, horas, minutos y segundos restantes
        int dias = segundosTotales / (SEGUNDOS_MINUTO * MINUTOS_HORA * HORAS_DIA);
        segundosTotales %= (SEGUNDOS_MINUTO * MINUTOS_HORA * HORAS_DIA);

        int horas = segundosTotales / (SEGUNDOS_MINUTO * MINUTOS_HORA);
        segundosTotales %= (SEGUNDOS_MINUTO * MINUTOS_HORA);

        int minutos = segundosTotales / SEGUNDOS_MINUTO;
        int segundos = segundosTotales % SEGUNDOS_MINUTO;

        // Imprimimos el resultado
        System.out.println(dias + " " + horas + " " + minutos + " " + segundos);
    }
}