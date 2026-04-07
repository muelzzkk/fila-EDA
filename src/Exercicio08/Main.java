package Exercicio08;

import Exercicio01.Fila;

public class Main {

    public static void main(String[] args) {

        Fila<Processo> fila = new Fila<Processo>(5);

        // 🔹 Adicionar processos
        fila.enfileira(new Processo("P1", 5));
        fila.enfileira(new Processo("P2", 3));
        fila.enfileira(new Processo("P3", 8));
        fila.enfileira(new Processo("P4", 2));

        System.out.println("=== EXECUÇÃO DE PROCESSOS ===");

        // 🔹 Executar processos (FIFO)
        while (!fila.estaVazia()) {

            // Processo atual
            Processo atual = fila.espia();
            System.out.println("Executando: " + atual);

            // Remove após execução
            fila.desenfileirar();

            System.out.println("Processo finalizado.\n");
        }

        System.out.println("Todos os processos foram executados.");
    }
}