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

  }
}
