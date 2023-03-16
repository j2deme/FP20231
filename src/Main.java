import java.util.Scanner;

/**
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.2, 2023-03-16
 */
public class Main {
  // Abrimos un canal de lectura de teclado
  private static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    // Esto es un comentario
    /* Esto es un comentario que puede ser de
    * más de una línea */

    // Declaración de variables
    int edad; // Entero
    double altura; // Decimal
    char inicial; // Caracter
    boolean esDonante; // Booleano
    String esDonanteTexto;
    String nombre; // Cadena

    System.out.print("¿Como te llamas? ");
    nombre = teclado.next();
    System.out.print("¿Cuantos años tienes? ");
    edad = teclado.nextInt();
    System.out.print("¿Cuanto mides (m)? ");
    altura = teclado.nextDouble();
    //System.out.print("¿Cual es la inicial de tu nombre? ");
    //inicial = teclado.next().charAt(0);
    inicial = nombre.charAt(0);
    esDonante = true;


    /* Operador ternario
      Se utiliza para "elegir" entre 2 opciones contrarias

      variable = (condición) ? caso verdadero : caso falso;
     */
    esDonanteTexto = (esDonante) ? "es" : "no es";

    System.out.println(edad);
    System.out.print(altura);
    System.out.println(inicial);
    System.out.println(esDonante);
    System.out.printf("%s tiene %d años, mide %.2f m, la inicial de su nombre es %c y %s donante",
        nombre, edad, altura, inicial, esDonanteTexto);
  }
}
