package Segundo;

public class Segundo {

    public static void main(String[] args) {

        // Implementación de los métodos 
        MiGenerico<Integer> conjunto = new MiGenerico<>();

        conjunto.anadir(1);
        conjunto.anadir(2);
        conjunto.anadir(3);
        conjunto.mostrar();

        conjunto.remover(2);
        conjunto.mostrar();

        conjunto.existe(7);
        
    }
            
}