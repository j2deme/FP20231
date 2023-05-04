import java.util.Scanner;

public class Hotel {
  public static final Scanner teclado = new Scanner(System.in);
  public static int FILAS = 3;
  public static int COLUMNAS = 4;
  public static int PISOS = 3;
  public static int VACIO = 0;
  public static int MTTO = 99;
  public static int[][][] hotel = new int[FILAS][COLUMNAS][PISOS];

  public static void main(String[] args) {
    int op;
    do {
      // Imprimir el menú y leer la opción elegida
      op = menu();
      // Ejecutar la opción elegida
      switch (op){
        // Reservar habitación
        // Liberar habitación
        // Verificar disponibilidad de habitación
        // Mostrar disponibilidad de un piso
        // Poner en mantenimiento
      }
    } while (op != 0);
  }

  /**
   * Imprime el menú de opciones para el usuario y
   * devuelve la opción elegida.
   *
   * @return int la opción elegida por el usuario
   */
  private static int menu() {
    System.out.println("\033[0;32m= Bienvenido =\033[0m");
    System.out.println("1. Reservar habitación");
    System.out.println("2. Liberar habitación");
    System.out.println("3. Revisar disponibilidad de habitación");
    System.out.println("4. Revisar disponibilidad en piso");
    System.out.println("5. Dar mantenimiento");
    System.out.println("0. Salir");
    System.out.print("> ");
    return teclado.nextInt();
  }

  /**
   * Imprime la disponibilidad de habitaciones en un piso
   * específico del hotel.
   *
   * @param piso el número del piso que se desea imprimir
   */
  private static void imprimirPiso(int piso){
    for (int i = 0; i < FILAS; i++) {
      if (i == 0) {
        System.out.printf("PISO %d\n", piso);
      }

      for (int j = 0; j < COLUMNAS; j++) {
        System.out.printf("[%2d]", hotel[i][j][piso-1]);
      }
      System.out.println();
    }
  }
}
