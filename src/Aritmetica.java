import java.util.Scanner;

/**
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-03-16
 */
public class Aritmetica {
  private static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    int a, b;

    System.out.println("Dame un número entero: ");
    a = teclado.nextInt();
    System.out.println("Dame otro número entero: ");
    b = teclado.nextInt();

    System.out.println(a+b);
    System.out.printf("La suma de los números es %d.\n", (a+b));

    System.out.printf("La diferencia de los números es %d.\n", (a-b));

    /* PATAS Y PEZUÑAS
      Un granjero quiere saber cuantas patas 🐾 hay en su granja
      considerando que tiene gallinas 🐔, vacas 🐄 y cerdos 🐖.
     */
    int gallinas, vacas, cerdos, total;

    System.out.print("Cuantas 🐔 hay? ");
    gallinas = teclado.nextInt();
    System.out.print("Cuantas 🐄 hay? ");
    vacas = teclado.nextInt();
    System.out.print("Cuantos 🐖 hay? ");
    cerdos = teclado.nextInt();

    total = (2 * gallinas) + (4 * vacas) + (4 * cerdos);
    System.out.printf("En total hay %d patas 🐾", total);
  }
}
