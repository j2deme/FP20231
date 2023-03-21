import java.util.Scanner;
/**
 * Indica si una combinación de día / mes es festiva
 * basado en condiciones combinadas y encadenadas
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-03-21
 */
public class Condiciones {
  public final static Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    int dia, mes;
    System.out.print("Ingresa un día [1-31]: ");
    dia = teclado.nextInt();
    System.out.print("Ingresa un mes [1-12]: ");
    mes = teclado.nextInt();
    // Imprime la fecha en formato DD/MM
    System.out.printf("%02d/%02d\n", dia, mes);

    /*
     * Para combinar condiciones se utilizan los
     * operadores: AND && , OR ||
     */
    if(dia == 6 && mes == 1) {
      System.out.println("Día de Reyes");
    } else if (dia == 10 && mes == 5) {
      System.out.println("Día de las Madres");
    } else if (dia == 24 && mes == 12) {
      System.out.println("Feliz Navidad! 🎄");
    } else if (dia == 31 && mes == 12) {
      System.out.println("Fin de año 🥳");
    } else {
      System.out.println("Es un día normal");
    }
  }
}
