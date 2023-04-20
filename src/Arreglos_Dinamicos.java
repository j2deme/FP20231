import java.util.ArrayList;
import java.util.Scanner;
/**
 * Simulación de lista de compras con arreglos dinámicos (ArrayList)
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-04-20
 */
public class Arreglos_Dinamicos {
  public static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    // Arreglo estático de 5 elementos
    //String lista_compras[] = new String[5];

    // Arreglo dinámico usando ArrayList
    ArrayList<String> lista = new ArrayList<>();

    /* Imprime el tamaño del arreglo, a diferencia del String y los
     * arreglos estáticos que utilizan "length", el tamaño de los
     * arreglos con ArrayList se obtiene con "size".
     */
    System.out.println(lista.size()); // 0

    /* Añade 4 elementos al arreglo, no es necesario especificar el índice,
     * por default lo añade en la última posición.
     */
    lista.add("🥛");
    lista.add("🍍");
    lista.add("🌵");
    lista.add("🥚");

    System.out.println(lista.size()); // 4
    /* Para imprimir el contenido del arreglo no es necesario iterarlo,
     * automáticamente se realiza la conversión a String.
     */
    System.out.println(lista); // [🥛,🍍,🌵,🥚]

    // Borrar un elemento del arreglo, sin especificar su índice
    lista.remove("🌵");
    System.out.println(lista); // [🥛,🍍,🥚]
  }
}
