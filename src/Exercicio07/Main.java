package Exercicio07;

import Exercicio01.Fila;

public class Main {

    public static void main(String[] args) {

        Fila<Chamada> fila = new Fila<Chamada>(5);

        // 🔹 Enfileirar chamadas
        fila.enfileira(new Chamada("João", "Suporte técnico"));
        fila.enfileira(new Chamada("Maria", "Financeiro"));
        fila.enfileira(new Chamada("Carlos", "Dúvida sobre produto"));
        fila.enfileira(new Chamada("Ana", "Reclamação"));
        fila.enfileira(new Chamada("Pedro", "Cancelamento"));

        // 🔹 Atender chamadas
        System.out.println("=== ATENDIMENTOS ===");

        while (!fila.estaVazia()) {

            // Mostrar chamada atual
            Chamada atual = fila.espia();
            System.out.println("Atendendo: " + atual);

            // Remover da fila (atendimento concluído)
            fila.desenfileirar();

            // Mostrar quantas restam
            System.out.println("Chamadas aguardando: " + fila.getTamanho());
            System.out.println("----------------------");
        }
    }
}