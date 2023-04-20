import java.util.Scanner;
/**
 * Ejemplo de arreglos con la captura de calificaciones de
 * un estudiante y la simulación de evaluación complementaria
 * para las calificaciones reprobatorias.
 * Utiliza arreglos estáticos.
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-04-20
 */
public class Arreglos {
  public static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    /* Declaración de arreglos
     * C/C++: int variable[]
     * Java: int[] variable
     */
    int[] cals = new int[5];
    for (int i = 0; i < cals.length; i++) {
      System.out.printf("Dame la calificación %d: ", i+1);
      cals[i] = teclado.nextInt();
    }
    // Inicialización con elementos
    //int[] cals = {100,65,89,62,87};

    System.out.printf("[%d|%d|%d|%d|%d]\n", cals[0], cals[1], cals[2], cals[3], cals[4]);

    int aprob = 0, reprob = 0;
    int[] reprobadas = new int[cals.length];
    for (int i = 0; i < cals.length; i++) {
      if (cals[i] < 70){
        // Es importante utilizar la variable "reprob" como
        // índice, antes de incrementarla
        reprobadas[reprob] = i; // Guarda la posición de la reprobada
        reprob++; // Incrementa el contador de reprobadas
      } else {
        // En el caso de las calificaciones aprobadas, no se
        // necesita guardar la posición.
        aprob++;
      }
    }

    System.out.printf("Aprobadas: %d\tReprobadas: %d\n", aprob, reprob);

    // Solo sí hay materias reprobadas, ingresa a la "2a Oportunidad"
    if(reprob != 0){
      System.out.printf("Tienes %d materias reprobadas.\n", reprob);

      // Se solicitan las "nuevas calificaciones" para las materias reprobadas
      for (int i = 0; i < reprob; i++) {
        int pos_reprobada = reprobadas[i]; // Posición de la reprobada
        int calif = cals[pos_reprobada]; // Calificación anterior
        System.out.printf("¿Que calificación sacaste en 2a oportunidad? (%d)\n", calif);
        int nueva_calif = teclado.nextInt();
        cals[pos_reprobada] = nueva_calif; // Reemplaza con la nueva calificación
      }

      // Se imprime nuevamente el arreglo para visualizar los cambios
      System.out.printf("[%d|%d|%d|%d|%d]\n", cals[0], cals[1], cals[2], cals[3], cals[4]);
    }
  }
}
