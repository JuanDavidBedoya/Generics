package Cuarto;

public class Cuarto {

    public static void main(String[] args) {
        
        Caja<Integer> numeros = new Caja <>();

        numeros.anadir(1);
        numeros.anadir(2);
        numeros.anadir(3);
        numeros.anadir(4);

        numeros.remover(0);

        numeros.mostrar();
    }
}

