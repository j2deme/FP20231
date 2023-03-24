import java.util.Scanner;
/**
 * Recibe "n" valores de una medida "x" de un grupo de alumnos y calcula el
 * promedio de dicha medida a través del uso de una variable acumulador y una
 * estructura "for" para la repetición
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-03-23
 */
public class Promedio_ciclos {
  public static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    int alumnos;
    double total = 0.0, valor;
    String medida;

    System.out.print("¿Cuántos alumnos hay en la clase hoy? ");
    alumnos = teclado.nextInt();
    System.out.print("¿Qué vamos a medir hoy? ");
    medida = teclado.next();

    // Se utiliza \" para poner comillas dentro de comillas:
    // "Hola \"Mundo\"." => Hola "Mundo".
    System.out.printf("Hoy vamos a medir \"%S\" de %d estudiantes\n", medida, alumnos);

    for (int i = 0; i < alumnos; i++) {
      System.out.printf("%S del estudiante %d\n", medida, i+1);
      valor = teclado.nextDouble();
      total = total + valor; // Acumulador
    }
    // Calcular e imprimir el promedio
    System.out.printf("El promedio de \"%S\" es igual a: %.2f\n", medida, (total / alumnos));
  }
}
