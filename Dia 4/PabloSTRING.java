public class PabloSTRING {
    public static void main(String[] args) {
        // Cadena inicial
        String text = "  Hola, Mundo!  "; // Cadena con espacios al inicio y al final
        String anotherText = "hola, mundo!"; // Otra cadena para comparar

        // Consulta y manipulación básica
        System.out.println("Texto original: '" + text + "'"); // Texto original: ' Hola, Mundo! '
        System.out.println("Longitud: " + text.length()); // Longitud: 16
        System.out.println("Caracter en posición 7: " + text.charAt(7)); // Caracter en posición 7: M
        System.out.println("Primera aparición de 'o': " + text.indexOf('o')); // Primera aparición de 'o': 3
        System.out.println("Última aparición de 'o': " + text.lastIndexOf('o')); // Última aparición de 'o': 9
        System.out.println("Texto contiene 'Mundo': " + text.contains("Mundo")); // Texto contiene 'Mundo': true

        // Subcadenas y manipulación avanzada
        String trimmedText = text.trim(); // Elimina los espacios en blanco al inicio y final
        System.out.println("Texto sin espacios: '" + trimmedText + "'"); // Texto sin espacios: 'Hola, Mundo!'
        System.out.println("Subcadena (7,12): " + text.substring(7, 12)); // Subcadena (7,12): Mundo
        System.out.println("Reemplazo de 'Mundo' por 'Java': " + text.replace("Mundo", "Java")); // Reemplazo de 'Mundo'
                                                                                                 // por 'Java': ' Hola,
                                                                                                 // Java! '
        System.out.println("Texto en mayúsculas: " + text.toUpperCase()); // Texto en mayúsculas: ' HOLA, MUNDO! '
        System.out.println("Texto en minúsculas: " + text.toLowerCase()); // Texto en minúsculas: ' hola, mundo! '

        // Comparación de cadenas
        System.out.println("¿Es igual a anotherText?: " + text.equals(anotherText)); // ¿Es igual a anotherText?: false
        System.out.println("¿Es igual ignorando mayúsculas?: " + text.equalsIgnoreCase(anotherText)); // ¿Es igual
                                                                                                      // ignorando
                                                                                                      // mayúsculas?:
                                                                                                      // true

        ///----------------------------------/

        // Unión y división
        String[] words = trimmedText.split(", "); // Divide el texto en palabras, usando ", " como delimitador
        System.out.println("Palabras separadas: ");
        for (String word : words) { // Itera sobre las palabras y las imprime
            System.out.println("- " + word);
            // Palabras separadas:
            // - Hola
            // - Mundo!
        }

        String joinedText = String.join(" | ", words); // Une las palabras con " | " como delimitador
        System.out.println("Texto unido con '|': " + joinedText); // Texto unido con '|': Hola | Mundo!

        // Otros métodos útiles
        System.out.println("Cadena invertida manualmente: " + new StringBuilder(text).reverse().toString()); // Cadena
                                                                                                             // invertida
                                                                                                             // manualmente:
                                                                                                             // ' !odnuM
                                                                                                             // ,aloH '
        System.out.println("Texto repetido 3 veces: " + text.repeat(3)); // Texto repetido 3 veces: ' Hola, Mundo! Hola,
                                                                         // Mundo! Hola, Mundo! '
    }
}