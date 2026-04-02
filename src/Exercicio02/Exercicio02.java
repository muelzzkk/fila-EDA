package Exercicio02;

import Exercicio01.Fila;

public class Exercicio02 {
    public static void main(String[] args) {

        Fila<Cliente> fila = new Fila<Cliente>(6);

        fila.enfileira(new Cliente("Samuel", 1));
        fila.enfileira(new Cliente("Icaro", 2));
        fila.enfileira(new Cliente("Keren", 3));
        fila.enfileira(new Cliente("Marco", 4));
        fila.enfileira(new Cliente("Pedro", 5));
        fila.enfileira(new Cliente("Julia", 6));

        System.out.println(fila);

        while(!fila.estaVazia()){
            Cliente c = fila.desenfileirar();
            System.out.println("Chamando: " + c);
        }

        System.out.println("\nFila vazia.");

    }
}
