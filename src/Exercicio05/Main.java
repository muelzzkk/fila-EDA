package Exercicio05;

import Exercicio01.Fila;

public class Main {

    public static void main(String[] args) {

        Fila<Paciente> fila = new Fila<Paciente>(5);


        fila.enfileiraComPrioridade(new Paciente("João", Prioridade.BAIXA));
        fila.enfileiraComPrioridade(new Paciente("Maria", Prioridade.URGENTE));
        fila.enfileiraComPrioridade(new Paciente("Carlos", Prioridade.MEDIA));
        fila.enfileiraComPrioridade(new Paciente("Ana", Prioridade.URGENTE));
        fila.enfileiraComPrioridade(new Paciente("Pedro", Prioridade.BAIXA));
        fila.enfileiraComPrioridade(new Paciente("Lucas", Prioridade.MEDIA));


        System.out.println("Fila organizada:");
        System.out.println(fila);


        System.out.println("\nAtendimentos:");

        while (!fila.estaVazia()) {
            System.out.println("Atendido: " + fila.desenfileirar());
        }
    }
}