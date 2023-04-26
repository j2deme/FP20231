import java.util.Scanner;
/**
 * Simulación de una sala de cine con taquilla a través del uso de un arreglo
 * estático de 2 dimensiones (matriz).
 * Implementa:
 * - Declaración / Inicialización
 * - Impresión
 * - Validación de coordenadas en la matriz de datos
 * - Modificación de coordenadas en la matriz de datos
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 1.0, 2023-04-25
 */
public class Matriz {
  public static final Scanner teclado = new Scanner(System.in);
  /* Se definen como constantes las filas y columnas, ya que no cambian para el
   * ejemplo, sin embargo, puede implementarse la lectura desde el teclado y se
   * establecerían como variables, dentro del "main".
   */
  public static final int FILAS = 5;
  public static final int ASIENTOS_FILA = 7;
  /* Se definen como constantes los símbolos a utilizar para los estatus del asiento,
   * considerando que se utilizan emojis almacenados en un String.
   */
  public static final String ASIENTO_VACIO = "💺";
  public static final String ASIENTO_OCUPADO = "😀";

  public static void main(String[] args) {
    // Declaración de matriz estática de 2 dimensiones
    String[][] sala = new String[FILAS][ASIENTOS_FILA];

    // Inicializar la matriz de asientos (💺)
    for (int i = 0; i < sala.length; i++) {
      // Se toma el length de la primera fila, que será igual para el resto
      for (int j = 0; j < sala[0].length; j++) {
        sala[i][j] = ASIENTO_VACIO;
      }
    }

    // Imprimir matriz de asientos
    for (int i = 0; i < FILAS; i++) {
      for (int j = 0; j < ASIENTOS_FILA; j++) {
        System.out.printf("%s\t", sala[i][j]);
      }
      System.out.print("\n");
    }

    // Simulación de compra de boletos
    int op;
    do {
      int fila, asiento;
      System.out.printf("¿Qué fila quieres? [1-%d]> ", FILAS);
      fila = teclado.nextInt();
      System.out.printf("¿Qué asiento quieres? [1-%d]> ", ASIENTOS_FILA);
      asiento = teclado.nextInt();

      System.out.printf("Fila: %d\tAsiento: %d\n", fila, asiento);

      // Validación de coordenadas ingresadas
      if (fila < 1 || fila > FILAS){
        System.out.println("Fila no válida");
      } else if (asiento < 1 || asiento > ASIENTOS_FILA){
        System.out.println("Asiento no válido");
      } else if (sala[fila-1][asiento-1].equals(ASIENTO_OCUPADO)) {
        // Se revisa que el asiento seleccionado no esté ocupado
        System.out.println("Asiento ya ocupado");
      } else {
        // Si las coordenadas son válidas, cambiamos el emoji
        sala[fila-1][asiento-1] = ASIENTO_OCUPADO;
      }
      System.out.print("¿Quieres otro asiento? [1=Si, 0=No]> ");
      op = teclado.nextInt();
    } while(op != 0);

    // Imprimimos la sala modificada con los asientos comprados
    for (int i = 0; i < FILAS; i++) {
      for (int j = 0; j < ASIENTOS_FILA; j++) {
        System.out.printf("%s\t", sala[i][j]);
      }
      System.out.print("\n");
    }

  }
}
