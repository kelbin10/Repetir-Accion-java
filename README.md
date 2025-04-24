# Repetir-Accion-java
# Programa: Repetir Acción 

Este programa en Java imprime un mensaje personalizado y permite al usuario decidir si desea repetir la acción o finalizar el programa.

---

 Descripción

El programa muestra el mensaje:


Y luego pregunta al usuario:


Si el usuario responde **"si"** o **"sí"**, el mensaje se vuelve a imprimir, aumentando el contador. Si responde **"no"**, el programa termina.

---

 Código principal

```java
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
