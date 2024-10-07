package Cuarto;

import java.util.List;
import java.util.ArrayList;

public class Caja <T> {

    public List<T> te;

    public Caja() {
        this.te = new ArrayList<>();
    }

    // Métodos de la caja, añadir, remover y mostrar 
    public void anadir (T t){
        te.add(t);
        
    }

    public void remover (T t){
        te.remove(te.get((int) t));
    }

    public void mostrar (){

        for (T tes : te){
            System.out.println(tes);
        }
    }
}