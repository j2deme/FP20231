import java.util.ArrayList;
import java.util.Scanner;
/**
 * Simulación de lista de compras con arreglos dinámicos (ArrayList).
 * Implementa el uso de las funciones:
 * - size, para el tamaño del arreglo
 * - add, para añadir un elemento al arreglo
 * - remove, para eliminar un elemento del arreglo (si existe)
 * - clear, para vaciar el arreglo
 * - isEmpty, para determinar si el arreglo está vacío
 * - get, para obtener el elemento en la posición dada
 * - contains, para determinar el sí elemento dado, existe en el arreglo
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 1.0, 2023-04-21
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

    // Vacía la lista, reinicia su tamaño a 0
    lista.clear();

    int op = 0;
    String articulo;
    do {
      System.out.println("= Lista de Compras 📃=");
      System.out.println("¿Que quieres hacer?");
      System.out.print("1. Ver artículos\n2. Agregar artículo\n3. Eliminar artículo\n4. Buscar\n0. Salir\n> ");
      op = teclado.nextInt();
      switch (op) {
        case 1 -> {
          // isEmpty devuelve true o false, según haya elementos en la lista
          if (lista.isEmpty()) {
            System.out.println("No hay artículos en la lista");
          } else {
            for (int i = 0; i < lista.size(); i++) {
              System.out.printf("%d: %s\n", i + 1, lista.get(i));
            }
          }
        }
        case 2 -> {
          System.out.print("¿Que quieres agregar?\n> ");
          articulo = teclado.next();
          lista.add(articulo);
          System.out.printf("Se añadió %s a la lista\n", articulo);
        }
        case 3 -> {
          System.out.print("¿Que quieres quitar?\n> ");
          articulo = teclado.next();
          // Se utiliza "contains" como condición de paro, ya que mientras
          // exista el elemento buscado en la lista, el ciclo se repite
          while (lista.contains(articulo)) {
            lista.remove(articulo);
          }
          System.out.printf("Se quitó %s de la lista\n", articulo);
        }
        case 4 -> {
          System.out.print("¿Que quieres buscar?\n> ");
          articulo = teclado.next();
          if (lista.contains(articulo)) {
            System.out.printf("Hay %s en la lista.\n", articulo);
          } else {
            System.out.printf("No hay %s en la lista.\n", articulo);
          }
        }
        default -> op = 0;
      }
    } while (op != 0);
  }
}
