import java.util.Scanner;

public class RepetirAccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        String respuesta;

        do {
            contador++;
            System.out.println("Kelbin Anibal Perez Ordonez De Fer " + contador + ".");
            
            System.out.print("¿Deseas continuar? (si/no): ");
            respuesta = scanner.nextLine().trim().toLowerCase();
            
        } while (respuesta.equals("si") || respuesta.equals("sí")); // Ahora acepta "si" y "sí"

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
