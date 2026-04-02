package Exercicio03;

import Exercicio01.Fila;

public class Atendimento {
    public static void main(String[] args) {

        Fila<Cliente> fila = new Fila<Cliente>(5);

        fila.enfileira(new Cliente("Samuel", 10));
        fila.enfileira(new Cliente("Joao", 5));
        fila.enfileira(new Cliente("Marco", 12));
        fila.enfileira(new Cliente("Icaro", 4));
        fila.enfileira(new Cliente("Rute", 3));

        while(!fila.estaVazia()){
            Cliente atendido = fila.desenfileirar();
            System.out.println("Cliente atendido: " + atendido.getNome());
            System.out.println("Clientes restantes: " + fila.getTamanho());
            System.out.println("-----------------------------");

        }






    }
}
