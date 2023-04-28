import java.util.ArrayList;
import java.util.Scanner;
/**
 * Simulación de los espacios de un refrigerador mediante el uso de un arreglo
 * dinámico de 2 dimensiones (matriz), mediante el uso de ArrayList
 * Implementa:
 * - Declaración / Inicialización
 * - Búsqueda en arreglo bidimensional
 * - Eliminación de elementos
 * - Impresión avanzada del arreglo
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 1.0, 2023-04-27
 */
public class Matriz_Dinamica {
  public static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    // Matriz dinámica - Refrigerador
    ArrayList<ArrayList<String>> refri = new ArrayList<>();
    String[] cajones = {"Verduras","Lácteos","Estante 1", "Estante 2", "Congelador"};

    /* Se construye la matriz 2D al crear arreglos de String.
     * El arreglo principal (refri) tendrá 5 filas y cada una de ellas
     * será a su vez un arreglo de cadenas de texto que representen
     * los artículos en cada uno de ellos.
     * Se definen como arreglos dinámicos, ya que pueden tener
     * cantidades distintas de elementos.
     */

    ArrayList<String> verduras = new ArrayList<>();
    ArrayList<String> lacteos = new ArrayList<>();
    ArrayList<String> estante1 = new ArrayList<>();
    ArrayList<String> estante2 = new ArrayList<>();
    ArrayList<String> congelador = new ArrayList<>();

    // Se añaden los "cajones" al refrigerador
    refri.add(verduras); // Posición 0
    refri.add(lacteos); // Posición 1
    refri.add(estante1); // Posición 2
    refri.add(estante2); // Posición 3
    refri.add(congelador); // Posición 4

    // Se "imprime" el refrigerador
    //System.out.println(refri); // [[], [], [], [], []]

    /* Se añaden artículos al refrigerador obteniendo (get)
     * el cajón correspondiente y añadiendo el artículo (add), sin
     * importar el índice (posición) que ocupará.
     */
    // Estante 2 (Posición 3)
    refri.get(3).add("🥩");
    refri.get(3).add("🍗");
    // Congelador (Posición 4)
    refri.get(4).add("🍦");
    refri.get(4).add("🧊");
    // Cajón de lácteos (Posición 1)
    refri.get(1).add("🥛");
    // Estante 1 (Posición 2)
    refri.get(2).add("🍕");
    refri.get(2).add("🎂");
    refri.get(2).add("🧃");
    // Cajón de verduras (Posición 0)
    refri.get(0).add("🥝");
    refri.get(0).add("🍅");
    refri.get(0).add("🥕");
    refri.get(0).add("🍏");

    // Buscador de artículos en el refri
    int idx_cajon = 0;
    String articulo = "🥛";
    for(ArrayList<String> cajon : refri){
      if (cajon.contains(articulo)){
        System.out.printf("Encontre %s en el cajón %d.\n", articulo, idx_cajon);
        break;
      }
      idx_cajon++;
    }

    if (idx_cajon > refri.size()-1){
      System.out.printf("No hay %s.\n", articulo);
    } else {
      int pos_articulo = refri.get(idx_cajon).indexOf(articulo);
      System.out.printf("El %s esta en la posición %d, %d.\n", articulo, idx_cajon, pos_articulo);
      // Consumimos el artículo
      refri.get(idx_cajon).remove(pos_articulo);
    }


    for (int i = 0; i < refri.size(); i++) {
      if (refri.get(i).isEmpty()){
        System.out.printf("El cajón \"%s\" esta vacío.\n",cajones[i]);
      } else {
        System.out.printf("= %S =\n", cajones[i]);
        for (int j = 0; j < refri.get(i).size(); j++) {
          System.out.printf("\t- %s\n", refri.get(i).get(j));
        }
      }
    }

  }
}
