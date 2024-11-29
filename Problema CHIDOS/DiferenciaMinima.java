///https://omegaup.com/course/curso_de_introduccion_a_java/assignment/java_7p/#problems/Diferencia-Minima

import java.util.*;

public class DiferenciaMinima {
    public static int[] divideArray(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];

        for (int i = 0; i < (1 << n); i++) {
            int part1 = 0, part2 = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    part1 += arr[j];
                } else {
                    part2 += arr[j];
                }
            }
            int diff = Math.abs(part1 - part2);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = part1;
                result[1] = part2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        /*
         * 
         * int[] arr1 = { 2, 3, 4, 3 };
         * int[] result1 = divideArray(arr1);
         * System.out.println("Entrada: " + Arrays.toString(arr1));
         * System.out.println("Salida: " + result1[0] + ", " + result1[1]);
         * System.out.println("Salida Esperada: " + Math.abs(result1[0] - result1[1]));
         */

        /*
         * int[] arr2 = { 1, 1, 1, 7, 1, 1 };
         * int[] result2 = divideArray(arr2);
         * System.out.println("Entrada: " + Arrays.toString(arr2));
         * System.out.println("Salida: " + result2[0] + ", " + result2[1]);
         * System.out.println("Salida Esperada: " + Math.abs(result2[0] - result2[1]));
         */

        int n;
        n = cin.nextInt();

        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = cin.nextInt();
        }

        int res[] = divideArray(num);
        System.out.println(Math.abs(res[0] - res[1]));

    }
}