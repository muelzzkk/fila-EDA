package Exercicio09;

import Exercicio01.Fila;

public class Main {

    public static void main(String[] args) {

        Fila<Tarefa> fila = new Fila<Tarefa>(5);

        // 🔹 Enfileirar tarefas
        fila.enfileiraComPrioridade(new Tarefa("Backup", Prioridade.BAIXA));
        fila.enfileiraComPrioridade(new Tarefa("Atualização do sistema", Prioridade.ALTA));
        fila.enfileiraComPrioridade(new Tarefa("Verificação de vírus", Prioridade.MEDIA));
        fila.enfileiraComPrioridade(new Tarefa("Monitoramento", Prioridade.ALTA));
        fila.enfileiraComPrioridade(new Tarefa("Limpeza de disco", Prioridade.BAIXA));

        System.out.println("=== EXECUÇÃO DE TAREFAS ===\n");

        while (!fila.estaVazia()) {

            // 🔹 Mostrar fila antes
            System.out.println("Fila atual: " + fila);

            // 🔹 Executar tarefa mais prioritária
            Tarefa atual = fila.espia();
            System.out.println("Executando: " + atual);

            fila.desenfileirar();

            // 🔹 Mostrar fila depois
            System.out.println("Fila após execução: " + fila);
            System.out.println("-----------------------------");
        }
    }
}