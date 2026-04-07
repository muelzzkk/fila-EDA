package Exercicio06;


import Exercicio01.Fila;

public class Main {

    public static void main(String[] args) {

        Fila<Documento> fila = new Fila<Documento>(5);

        // 🔹 Enfileirando documentos
        fila.enfileiraComPrioridade(new Documento("Doc1", 10, Prioridade.BAIXA));
        fila.enfileiraComPrioridade(new Documento("Doc2", 5, Prioridade.ALTA));
        fila.enfileiraComPrioridade(new Documento("Doc3", 8, Prioridade.MEDIA));
        fila.enfileiraComPrioridade(new Documento("Doc4", 20, Prioridade.ALTA));
        fila.enfileiraComPrioridade(new Documento("Doc5", 3, Prioridade.BAIXA));
        fila.enfileiraComPrioridade(new Documento("Doc6", 12, Prioridade.MEDIA));

        // 🔹 Mostrar fila organizada
        System.out.println("Fila de impressão:");
        System.out.println(fila);

        // 🔹 Simular impressão
        System.out.println("\nImpressão:");

        while (!fila.estaVazia()) {
            System.out.println("Imprimindo: " + fila.desenfileirar());
        }
    }
}