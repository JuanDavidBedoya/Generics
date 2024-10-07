package Tercero;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tercero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario el texo
        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();

        // Guarda en un arreglo las palabras y las convierte a minúsculas
        String[] palabras = texto.toLowerCase().split(" ");

        // Crea un HashMap para almacenar las palabras y sus frecuencias
        HashMap<String, Integer> map = new HashMap<>();

        // Cuenta la frecuencia de cada palabra
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                map.put(palabra, map.getOrDefault(palabra, 0) + 1);
            }
        }

        // Imprime las palabras y sus frecuencias
        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
