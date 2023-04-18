import java.util.Scanner;
/**
 * Ejemplifica el uso de la estructura "Según" a través de indicar según
 * el número de día ingresado, su correspondiente nombre.
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-03-30
 */
public class Segun_dia {
  public static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    int dia;
    System.out.println("¿Que día es hoy? [1-7]");
    dia = teclado.nextInt();

    // Filtramos enteros: 1 < dia < 7
    if (dia < 1 || dia > 7){
      System.out.println("Número no válido");
    } else {
      switch (dia){
        case 1:
          System.out.println("Lunes");
          break;
        case 2:
          System.out.println("Martes");
          System.out.println("Clase de FP");
          break;
        case 3:
          System.out.println("Miércoles");
          break;
        case 4:
          System.out.println("Jueves");
          System.out.println("Clase de FP");
          break;
        case 5:
          System.out.println("Viernes");
          System.out.println("Clase de FP");
          break;
        case 6:
        case 7:
          System.out.println("Fin de semana 🎉");
          break;
      }
    }
  }
}
