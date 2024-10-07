package Quinto;

public class Quinto {
    
    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<>();

        // Implementación de los métodos
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println("El elemento en la cima es: " + pila.peek());
        pila.print();

        pila.pop();
        System.out.println("El elemento en la cima es: " + pila.peek());
        pila.print();

    }

}
