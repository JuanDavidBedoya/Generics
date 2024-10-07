package Segundo;

import java.util.HashSet;
import java.util.Set;

public class MiGenerico <T>  {

   private Set<T> conjunto;

    public MiGenerico() {
        conjunto = new HashSet<>();
}
    // Método para añadir
    public void anadir (T t){
        conjunto.add(t);
    }

    // Método para remover
    public void remover (T t){
        conjunto.remove(t);
    }

    // Método para saber si existe el valor
    public void existe (T t){
        if (conjunto.contains(t)){
            System.out.println("Existe " + t);
        } else {
            System.out.println("No existe " + t);
        }
    }

    // Método para imprimir
    public void mostrar (){
        System.out.println(conjunto);
    }

}
