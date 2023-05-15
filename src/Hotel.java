import java.util.Scanner;
/**
 * Simulador de un hotel, usando matrices 3D para representar pisos,
 * habitaciones y sus estados.
 * Funciones:
 *  - Reservar / Liberar una habitación
 *  - Mostrar la disponibilidad de habitaciones en un piso
 *  - Revisar si una habitación está disponible
 *  - Contabilizar habitaciones ocupadas / disponibles
 *  - Dar mantenimiento a una habitación (Cambiar estado a "Mantenimiento")
 * Se implementa el uso de funciones para simplificar y reutilizar
 *  el código.
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 1.0, 2023-05-09
 *
 */
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
        // 1. Reservar habitación
        case 1 -> {
          System.out.printf("¿En que piso quiere su habitación?[1-%d]\n> ", PISOS);
          int piso = teclado.nextInt();
          imprimirPiso(piso, true);
          System.out.print("¿Que habitación desea reservar? (Ejemplo: 11)\n> ");
          String habitacion = teclado.next();
          System.out.print("¿Para cuantas personas es la habitación?\n> ");
          int personas = teclado.nextInt();
          if(disponibilidadHabitacion(piso+habitacion)){
            cambiarEstatusHabitacion(piso+habitacion, personas);
          }
        }
        // 2. Liberar habitación
        case 2 -> {
          System.out.print("¿Que habitación desea liberar? (Ejemplo: 321)\n> ");
          String habitacion = teclado.next();
          cambiarEstatusHabitacion(habitacion, VACIO);
        }
        // 3. Verificar disponibilidad de habitación
        case 3 -> {
          System.out.print("¿Que habitación desea revisar? (Ejemplo: 321)\n> ");
          String habitacion = teclado.next();
          disponibilidadHabitacion(habitacion);
        }
        // 4. Mostrar disponibilidad de un piso
        case 4 -> {
          System.out.printf("¿Qué piso quieres mostrar?[1-%d]\n> ", PISOS);
          int piso = teclado.nextInt();
          imprimirPiso(piso, false);
        }
        // 5. Poner en mantenimiento
        case 5 -> {
          System.out.print("¿Que habitación se va a poner en mantenimiento? (Ejemplo: 321)\n> ");
          String habitacion = teclado.next();
          cambiarEstatusHabitacion(habitacion, MTTO);
        }
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
  private static void imprimirPiso(int piso, boolean oculto){
    // Válida que el número de piso este en el rango
    if(piso >= 1 && piso <= PISOS){
      for (int i = 0; i < FILAS; i++) {
        if (i == 0) {
          System.out.printf("PISO %d\n", piso);
        }

        for (int j = 0; j < COLUMNAS; j++) {
          // Mostramos el estatus de la habitación según sea el caso
          int hab = hotel[i][j][piso-1];
          if(oculto){
            if(hab == MTTO){
              System.out.print("[XX]");
            } else if(hab >= 1 && hab <= 4) {
              System.out.print("[--]");
            } else {
              System.out.printf("[%d%d]", i+1, j+1);
            }
          } else {
            if(hab == MTTO){
              System.out.print("[🔨]");
            } else if(hab >= 1 && hab <= 4) {
              System.out.printf("[%2d]", hab);
            } else {
              System.out.print("[  ]");
            }
          }

        }
        System.out.println();
      }
    } else {
      System.out.printf("\033[0;31mEl piso %d no existe.\033[0m\n", piso);
    }

  }

  /**
   * Verifica si una habitación esta disponible o no.
   *
   * @param habitacion el número de habitación que se desea verificar (Ejemplo: 321)
   * @return boolean true si la habitación esta disponible, false si no
   */
  private static boolean disponibilidadHabitacion(String habitacion){
    int piso = Integer.parseInt(habitacion.substring(0,1));
    int fila = Integer.parseInt(habitacion.substring(1,2));
    int columna = Integer.parseInt(habitacion.substring(2,3));
    int hab = hotel[fila-1][columna-1][piso-1];
    if (hab == VACIO){
      System.out.println("✅ La habitación esta disponible.");
      return true;
    } else if(hab == MTTO){
      System.out.println("❗ La habitación esta en mantenimiento.");
      return false;
    } else {
      System.out.printf("La habitación ya esta reservada para %d personas.\n", hab);
      return false;
    }
  }

  /**
   * Cambia el estatus de una habitación, entre vacía, mantenimiento y ocupada.
   *
   * @param habitacion el número de habitación que se desea cambiar (Ejemplo: 321)
   * @param estatus el nuevo estatus de la habitación
   */
  private static void cambiarEstatusHabitacion(String habitacion, int estatus){
    int piso = Integer.parseInt(habitacion.substring(0,1));
    int fila = Integer.parseInt(habitacion.substring(1,2));
    int columna = Integer.parseInt(habitacion.substring(2,3));

    hotel[fila-1][columna-1][piso-1] = estatus;
    if(estatus == VACIO){
      System.out.printf("La habitación %s esta libre.\n", habitacion);
    } else if(estatus == MTTO) {
      System.out.printf("La habitación %s esta en mantenimiento.\n", habitacion);
    } else {
      System.out.printf("La habitación %s fue reservada para %d personas.\n", habitacion, estatus);
    }
  }
}
