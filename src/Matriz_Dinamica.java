import java.util.ArrayList;
import java.util.Scanner;
/**
 * Simulación de los espacios de un refrigerador mediante el uso de un arreglo
 * dinámico de 2 dimensiones (matriz), mediante el uso de ArrayList
 * Implementa:
 * - Declaración / Inicialización
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-04-25
 */
public class Matriz_Dinamica {
  public static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    // Matriz dinámica - Refrigerador
    ArrayList<ArrayList<String>> refri = new ArrayList<>();

    ArrayList<String> verduras = new ArrayList<>();
    ArrayList<String> lacteos = new ArrayList<>();
    ArrayList<String> estante1 = new ArrayList<>();
    ArrayList<String> estante2 = new ArrayList<>();
    ArrayList<String> congelador = new ArrayList<>();

    refri.add(verduras); // Posición 0
    refri.add(lacteos); // Posición 1
    refri.add(estante1); // Posición 2
    refri.add(estante2); // Posición 3
    refri.add(congelador); // Posición 4

    // Se "imprime" el refrigerador
    System.out.println(refri); // [[], [], [], [], []]

  }
}
