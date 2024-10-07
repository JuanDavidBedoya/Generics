package Primero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Primero {

    private static final int NUM_ELEMENTS = 100000;

    public static void main(String[] args) {
        // Crea los ArrayList y LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Mide el tiempo de inserción en ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Tiempo de inserción en ArrayList: " + (endTime - startTime) / 1e6 + " ms");

        // Mide el tiempo de inserción en LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de inserción en LinkedList: " + (endTime - startTime) / 1e6 + " ms");

        // Mide el tiempo de eliminación en ArrayList
        startTime = System.nanoTime();
        for (int i = NUM_ELEMENTS - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de eliminación en ArrayList: " + (endTime - startTime) / 1e6 + " ms");

        // Mide el tiempo de eliminación en LinkedList
        startTime = System.nanoTime();
        for (int i = NUM_ELEMENTS - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de eliminación en LinkedList: " + (endTime - startTime) / 1e6 + " ms");

        // Mide el tiempo de acceso por índice en ArrayList
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            arrayList.add(i); 
        }
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de acceso por índice en ArrayList: " + (endTime - startTime) / 1e6 + " ms");

        // Mide el tiempo de acceso por índice en LinkedList
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            linkedList.add(i); // volver a llenar la lista para la prueba de acceso
        }
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de acceso por índice en LinkedList: " + (endTime - startTime) / 1e6 + " ms");
    }
}
