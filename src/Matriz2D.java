import java.util.ArrayList;
import java.util.Scanner;
/**
 * Crea y muestra una matriz 2D de tamaño 5x5 que contiene números
 * enteros aleatorios del 1 al 10 y los imprime como emojis de colores.
 *
 *  @author MSC. Jaime Jesús Delgado Meraz
 *  @version 1.0, 2023-04-28
 */
public class Matriz2D {
  public static final Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {
    /* Utiliza un ArrayList de ArrayLists de enteros para crear
     * una matriz de 5x5 y se inicializan todas las coordenadas
     * con ceros.
     */
    ArrayList<ArrayList<Integer>> matriz = new ArrayList<>(); // []
    int tamanio = 5; // Define el tamaño de la matriz cuadrada

    // Inicializar la matriz 2D de 5x5
    for (int i = 0; i < tamanio; i++) {
      ArrayList<Integer> fila = new ArrayList<>();
      for (int j = 0; j < tamanio; j++){
        fila.add(0);
      }
      matriz.add(fila); // [0,0,0,0,0]
    }

    /*
    * Math.random() genera números de 0.0 a 1.0
    * * 10 hace que los números estén en el rango de 0.0 a 9.9
    * +1 hace que incremente el rango de 1.0 a 10.9
    * (int) transforma el resultado a un entero entre 1 y 10
    */
    int aleatorio;
    for (int i = 0; i < tamanio; i++) {
      for (int j = 0; j < tamanio; j++) {
        aleatorio = (int) (Math.random() * 10) + 1;
        matriz.get(i).set(j, aleatorio);
      }
    }
    //System.out.println(matriz);
    /* Imprime la matriz 2D a modo de malla y se cambia
     * cada número del 1 al 10 por un emoji de color
     */
    String emoji;
    for (int i = 0; i < tamanio; i++) {
      for (int j = 0; j < tamanio; j++) {
        switch (matriz.get(i).get(j)){
          case 1 -> emoji = "🔴";
          case 2 -> emoji = "🟠";
          case 3 -> emoji = "🟡";
          case 4 -> emoji = "🟢";
          case 5 -> emoji = "🔵";
          case 6 -> emoji = "🟣";
          case 7 -> emoji = "🟤";
          case 8 -> emoji = "⚫";
          case 9 -> emoji = "⚪";
          case 10 -> emoji = "😀";
          default -> emoji = "😆";
        }
        System.out.printf("%s ", emoji);
      }
      System.out.print("\n");
    }
  }
}
