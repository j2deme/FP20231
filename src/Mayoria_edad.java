import java.util.Calendar;
import java.util.Scanner;

/**
 * Indica el listado de paises donde se cumple la mayoría de edad, según sea
 * el caso, utilizando la estructura "Según" incluyendo la implementación
 * de un caso default.
 *
 * Adicionalmente, incluye el uso de la clase "Calendar" para obtener el año
 * actual de manera dinámica.
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-03-30
 */
public class Mayoria_edad {
  public static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    Calendar calendario = Calendar.getInstance();
    int anio_actual = calendario.get(Calendar.YEAR);
    int anio_nacimiento, edad;

    System.out.println("¿En que año naciste?");
    anio_nacimiento = teclado.nextInt();
    edad = anio_actual - anio_nacimiento;
    System.out.println(edad);

    if (edad < 16){
      System.out.println("No eres mayor de edad en ningún país 👶");
    } else {
      System.out.println("Eres mayor de edad en...");
      switch (edad){
        case 16:
          System.out.println("- Cuba");
          break;
        case 17:
          System.out.println("- Cuba");
          System.out.println("- Corea del Norte");
          break;
        case 18:
          System.out.println("- Cuba");
          System.out.println("- Corea del Norte");
          System.out.println("- México");
          break;
        case 19:
          System.out.println("- Cuba");
          System.out.println("- Corea del Norte");
          System.out.println("- México");
          System.out.println("- Canadá");
          break;
        case 20:
          System.out.println("- Cuba");
          System.out.println("- Corea del Norte");
          System.out.println("- México");
          System.out.println("- Canadá");
          System.out.println("- Japón");
          break;
        case 21:
          System.out.println("- Cuba");
          System.out.println("- Corea del Norte");
          System.out.println("- México");
          System.out.println("- Canadá");
          System.out.println("- Japón");
          System.out.println("- USA");
          break;
        default:
          System.out.println("- En todo el mundo");
      }
    }
  }
}
