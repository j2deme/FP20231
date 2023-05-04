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
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 1.0, 2023-05-02
 *
 * NOTA: Se incluyen etiquetas para indicar funcionalidad faltante,
 * que podría ser implementada a futuro.
 */
public class Matriz3D {
  // Inicializar variables globales (constantes)
  public static final Scanner teclado = new Scanner(System.in);
  public static final int FILAS = 3;
  public static final int COLUMNAS = 4;
  public static final int PISOS = 3;
  public static final int VACIO = 0;
  public static final int MTTO = 99; // Status: Mantenimiento

  public static void main(String[] args) {
    /* Inicializar matriz 3D que representa el hotel
     * x: Filas, y: Columnas, z: Pisos
     */
    int[][][] hotel = new int[FILAS][COLUMNAS][PISOS];

    // Inicializar de manera aleatoria el estado las habitaciones para pruebas
    for (int i = 0; i < 20; i++) {
      int x = (int) (Math.random() * FILAS);
      int y = (int) (Math.random() * COLUMNAS);
      int z = (int) (Math.random() * PISOS);
      // La habitación puede estar ocupada de 1 a 4 personas
      int personas = (int) (Math.random() * 4) + 1;
      hotel[x][y][z] = personas;
      // 20% de probabilidad de que una habitación esté en mantenimiento
      if (Math.random() < 0.2){
        hotel[x][y][z] = MTTO;
      }
    }

    int op;
    do {
      // Menú
      System.out.println("# Bienvenido #");
      System.out.println("1. Reservar habitación");
      System.out.println("2. Liberar habitación");
      System.out.println("3. Revisar disponibilidad de habitación");
      System.out.println("4. Revisar disponibilidad en piso");
      System.out.println("5. Dar mantenimiento");
      System.out.println("0. Salir");
      System.out.print("> ");
      op = teclado.nextInt();

      switch (op){
        // RESERVAR HABITACIÓN
        case 1 -> {
          System.out.printf("¿En que piso quiere su habitación?[1-%d]\n> ", PISOS);
          int piso = teclado.nextInt();
          // TODO: Validar que "piso" no salga del rango
          // Imprimir mapa del piso, con las habitaciones disponibles
          for (int i = 0; i < FILAS; i++) {
            if (i == 0){
              System.out.printf("PISO %d\n", piso);
            }
            for (int j = 0; j < COLUMNAS; j++) {
              if (hotel[i][j][piso-1] == VACIO) {
                // Si la habitación está vacía, entonces se puede reservar
                // Se imprime la coordenada de la habitación
                System.out.printf("[%d%d]", i + 1, j + 1);
              } else if (hotel[i][j][piso-1] == MTTO){
                // Si la habitación está en mantenimiento, entonces no se puede reservar
                System.out.print("[XX]");
              } else {
                // Si la habitación no está vacía, ni en mantenimiento, entonces está ocupada
                System.out.print("[--]");
              }
            }
            System.out.println();
          }
          // TODO: Cambiar de piso
          // Pedir coordenadas de la habitación a reservar
          System.out.print("¿Que habitación desea reservar? (Ejemplo: 11)\n> ");
          String habitacion = teclado.next();
          int fila = Integer.parseInt(habitacion.substring(0,1));
          int columna = Integer.parseInt(habitacion.substring(1,2));
          // TODO: Validar rango de fila y columna
          // TODO: Validar que la habitación no este en mantenimiento ni ocupada
          // Reservar la habitación
          System.out.print("¿Para cuantas personas es la habitación?\n> ");
          int personas = teclado.nextInt();
          // TODO: Validar que la cantidad de personas este en rango permitido
          // Se reserva la habitación, asignando la cantidad de personas
          hotel[fila-1][columna-1][piso-1] = personas;
          System.out.printf("La reserva ha sido exitosa para la habitación %d%d%d.\n", piso, fila, columna);
        }
        // LIBERAR HABITACIÓN
        case 2 -> {
          // Pedir coordenadas de la habitación a liberar, utilizando la
          // secuencia: piso, fila, columna (Ejemplo: 321) (z, x, y)
          System.out.print("¿Que habitación desea liberar? (Ejemplo: 321)\n> ");
          String habitacion = teclado.next();
          // TODO: Validar que se hayan ingresado 3 caracteres

          /* Se obtienen los valores de piso, fila y columna, utilizando el
           * método substring para extraer los caracteres de la cadena,
           * que representan cada valor y se transforman a entero.
           * Ejemplo: 321 -> piso = 3, fila = 2, columna = 1
           */
          int piso = Integer.parseInt(habitacion.substring(0,1));
          int fila = Integer.parseInt(habitacion.substring(1,2));
          int columna = Integer.parseInt(habitacion.substring(2,3));
          // TODO: Validar que los valores de piso, fila y columna estén en rango
          // Una vez que se tienen los valores, se libera la habitación
          hotel[fila-1][columna-1][piso-1] = VACIO;
          System.out.printf("Se ha liberado la habitación %d%d%d.\n", piso, fila, columna);
        }
        // VERIFICAR DISPONIBILIDAD DE HABITACIÓN
        case 3 -> {
          // Pedir coordenadas de la habitación a verificar, utilizando la
          // secuencia: piso, fila, columna (Ejemplo: 321) (z, x, y)
          System.out.print("¿Que habitación desea revisar? (Ejemplo: 321)\n> ");
          String habitacion = teclado.next();
          // Extraer las coordenadas (z, x, y)
          int piso = Integer.parseInt(habitacion.substring(0,1));
          int fila = Integer.parseInt(habitacion.substring(1,2));
          int columna = Integer.parseInt(habitacion.substring(2,3));
          // TODO: Validar rango de las coordenadas
          // Imprimir el estatus de la habitación
          int hab = hotel[fila-1][columna-1][piso-1];
          if (hab == VACIO){
            System.out.println("✅ La habitación esta disponible.");
          } else if(hab == MTTO){
            System.out.println("❗ La habitación esta en mantenimiento.");
          } else {
            System.out.printf("La habitación esta reservada para %d personas.\n", hab);
          }
        }
        // VERIFICAR DISPONIBILIDAD DE UN PISO
        case 4 -> {
          System.out.printf("¿Qué piso quieres mostrar?[1-%d]\n> ", PISOS);
          int piso = teclado.nextInt();
          // TODO: Validar que "piso" no salga del rango
          // Imprimir mapa del piso, con las habitaciones disponibles
          for (int i = 0; i < FILAS; i++) {
            if (i == 0){
              System.out.printf("PISO %d\n", piso);
            }
            for (int j = 0; j < COLUMNAS; j++) {
              if (hotel[i][j][piso-1] == VACIO) {
                System.out.print("[  ]");
              } else if (hotel[i][j][piso-1] == MTTO){
                // La habitación está en mantenimiento
                System.out.print("[🔨]");
              } else {
                // Si la habitación no está vacía, ni en mantenimiento, entonces está ocupada
                System.out.printf("[%2d]", hotel[i][j][piso-1]);
              }
            }
            System.out.println();
          }
        }
        // PONER HABITACIÓN EN MANTENIMIENTO
        case 5 -> {
          // Pedir coordenadas de la habitación a poner en mantenimiento, utilizando la
          // secuencia: piso, fila, columna (Ejemplo: 321) (z, x, y)
          System.out.print("¿Que habitación se va a poner en mantenimiento? (Ejemplo: 321)\n> ");
          String habitacion = teclado.next();
          // Extraer las coordenadas (z, x, y)
          int piso = Integer.parseInt(habitacion.substring(0,1));
          int fila = Integer.parseInt(habitacion.substring(1,2));
          int columna = Integer.parseInt(habitacion.substring(2,3));
          // TODO: Validar rango de las coordenadas
          // Revisar si la habitación está desocupada para ponerla en mantenimiento
          if(hotel[fila-1][columna-1][piso-1] == VACIO){
            hotel[fila-1][columna-1][piso-1] = MTTO;
            System.out.printf("La habitación %d%d%d fue puesta en mantenimiento.\n", piso, fila, columna);
          } else {
            System.out.printf("La habitación %d%d%d está ocupada y no se puede poner en mantenimiento.\n", piso, fila, columna);
          }
        }
      }
    } while (op != 0);
  }
}
