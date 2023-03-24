import java.util.Scanner;
/**
 * 🦆 🦆 🦢
 * Simula el juego "Pato - Pato - Ganso", imprimiendo 🦆 hasta que recibe la
 * letra G, utiliza una estructura "while" para la repetición
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-03-24
 */
public class Pato_Ganso {
  public static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("🦆 - 🦆 - 🦢");
    String op = "p";

    /* Mientras la variable "op" sea diferente
     * a la letra "g" se repite el ciclo
     * para comparar números y caracteres !=
     * para comparar cadenas de caracteres !equals()
     */
    while (!op.equalsIgnoreCase("g")){
      System.out.println("🦆");
      // No se imprime menú, solo se lee la variable "op"
      System.out.print("> ");
      op = teclado.next();
    }
    System.out.println("🦢");
  }
}
