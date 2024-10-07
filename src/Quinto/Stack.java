package Quinto;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack <T> {

    public ArrayList<T> pila;

    public Stack() {
        this.pila = new ArrayList<>();
    }

    // Método para añadir a la pila
    public void push(T t){
        pila.add(t);
    }

    // Método para remover el elemento en la cima de la pila
    public void pop(){
        if(vacia()){
            throw new EmptyStackException();
        }else{
            pila.remove(pila.size()-1);
        }
    }

    // Método para mostrar el elemento en la cima de la pila 
    public T peek (){
        if(vacia()){
            throw new EmptyStackException();

        }
        return pila.get(pila.size()-1);
    }

    // Método para saber si la pila esta vacia 
    public boolean vacia(){
        return pila.isEmpty();
    }

    // Método para saber el tamaño de la pila 
    public int tamano(){
        return pila.size();
    }

    // Método para imprimir el contenido de la pila 
    public void print(){
        for (T pilas: pila){
            System.out.println(pilas);
        }
    }
}