import java.util.Scanner;
/**
 * Simula el ajuste de un reloj análogico
 * a través de condiciones encadenadas y anidadas
 *
 * @author MSC. Jaime Jesús Delgado Meraz
 * @version 0.1, 2023-03-21
 */
public class Reloj_condicional {
  public static final Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    int horas, minutos, op;
    System.out.print("Ingresa la hora [1-12]: ");
    horas = teclado.nextInt();
    System.out.print("Ingresa los minutos [1-59]: ");
    minutos = teclado.nextInt();

    System.out.printf("Hora actual: %02d:%02d\n", horas, minutos);
    if (horas == 11 && minutos == 11){
      System.out.println("Pide un deseo! ✨");
    }

    // Ajuste 1
    System.out.print("[1] +1h [2] -1h [3] +1m [4] -1m > ");
    op = teclado.nextInt();
    if (op == 1){
      horas++;
      if (horas == 13){ // Límite superior 12 -> 1
        horas = 1;
      }
    } else if (op == 2) {
      horas--;
      if (horas == 0){ // Límite inferior 1 -> 12
        horas = 12;
      }
    } else if(op == 3){
      minutos++;
      if(minutos == 60){ // Límite superior 59 -> 0
        horas++;
        minutos = 0;
      }
    } else if (op == 4) {
      minutos--;
      if(minutos == 0){ // Límite inferior 0 -> 59
        horas--;
        minutos = 59;
      }
    }

    System.out.printf("Hora actual: %02d:%02d\n", horas, minutos);
    if (horas == 11 && minutos == 11){
      System.out.println("Pide un deseo! ✨");
    }

    // Ajuste 2
    System.out.print("[1] +1h [2] -1h [3] +1m [4] -1m > ");
    op = teclado.nextInt();
    if (op == 1){
      horas++;
      if (horas == 13){ // Límite superior 12 -> 1
        horas = 1;
      }
    } else if (op == 2) {
      horas--;
      if (horas == 0){ // Límite inferior 1 -> 12
        horas = 12;
      }
    } else if(op == 3){
      minutos++;
      if(minutos == 60){ // Límite superior 59 -> 0
        horas++;
        minutos = 0;
      }
    } else if (op == 4) {
      minutos--;
      if(minutos == 0){ // Límite inferior 0 -> 59
        horas--;
        minutos = 59;
      }
    }

    System.out.printf("Hora actual: %02d:%02d\n", horas, minutos);
    if (horas == 11 && minutos == 11){
      System.out.println("Pide un deseo! ✨");
    }

    // Ajuste 3
    System.out.print("[1] +1h [2] -1h [3] +1m [4] -1m > ");
    op = teclado.nextInt();
    if (op == 1){
      horas++;
      if (horas == 13){ // Límite superior 12 -> 1
        horas = 1;
      }
    } else if (op == 2) {
      horas--;
      if (horas == 0){ // Límite inferior 1 -> 12
        horas = 12;
      }
    } else if(op == 3){
      minutos++;
      if(minutos == 60){ // Límite superior 59 -> 0
        horas++;
        minutos = 0;
      }
    } else if (op == 4) {
      minutos--;
      if(minutos == 0){ // Límite inferior 0 -> 59
        horas--;
        minutos = 59;
      }
    }

    System.out.printf("Hora actual: %02d:%02d\n", horas, minutos);
    if (horas == 11 && minutos == 11){
      System.out.println("Pide un deseo! ✨");
    }
  }
}
