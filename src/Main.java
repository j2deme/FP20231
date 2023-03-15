/**
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-03-14
 */
public class Main {
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

    edad = 35;
    altura = 1.67;
    inicial = 'J';
    esDonante = true;
    nombre = "Jaime";

    /* Operador ternario
      Se utiliza para "elegir" entre 2 opciones contrarias
      Estructura:
      variable = (condición) ? caso verdadero : caso falso;
     */
    esDonanteTexto = (esDonante) ? "es" : "no es";

    System.out.println(edad);
    System.out.print(altura);
    System.out.println(inicial);
    System.out.println(esDonante);
    System.out.printf("%s tiene %d años y %s donante",
        nombre, edad, esDonanteTexto);
  }
}
