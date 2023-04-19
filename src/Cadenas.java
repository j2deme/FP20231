import java.util.Scanner;
/**
 * Manejo de String para conversión a arreglo de caracteres para manipulación
 * de elementos individuales.
 *
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-04-18
 */
public class Cadenas {
  public static final Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {
    // Arreglos de caracteres -> Cadenas
    String nombre;
    System.out.println("¿Cómo te llamas?");
    nombre = teclado.next();

    System.out.printf("La cadena mide %d caracteres\n", nombre.length());
    /* Imprimimos cada índice con su respectivo caracter,recordar que el índice
     * más grande de un arreglo es el tamaño menos uno, es decir, "n - 1"
     */
    /*for (int i = 0; i < nombre.length(); i++) {
      System.out.printf("%d: %c\n",i, nombre.charAt(i));
    }*/

    /* Se crea un arreglo de caracteres para "contener" la cadena de caracteres
     * String -> char[]
     */
    char nombre2[] = new char[nombre.length()]; // 1. Declaración e inicialización de arreglo
    System.out.printf("El arreglo de caracteres mide %d\n", nombre2.length);
    nombre2 = nombre.toCharArray(); // 2. Asignación de valores del arreglo

    for (int i = 0; i < nombre2.length; i++) {
      //System.out.printf("%d: %c\n",i, nombre2[i]);
      if (nombre2[i] == 'a' || nombre2[i] == 'A'){ // 3. Acceso a un elemento del arreglo
        nombre2[i] = '_'; // 4. Modificación de un elemento del arreglo
      }
      if (nombre2[i] == 'e' || nombre2[i] == 'E'){
        nombre2[i] = '.';
      }
      if (nombre2[i] == 'i' || nombre2[i] == 'I'){
        nombre2[i] = '*';
      }
    }

    System.out.println(nombre2); // Conversión implícita de char[] -> String

    /* Se pueden utilizar las funciones específicas de los String para realizar
     * las mismas operaciones, sin embargo, para motivos del ejercicio se realiza
     * de manera manual para ejemplificar el manejo de arreglos.
     */
    System.out.println(
        nombre.replace('a','4')
            .replace('e','3')
            .replace('i','1')
    );
  }
}
