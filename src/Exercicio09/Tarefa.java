package Exercicio09;

public class Tarefa implements Comparable<Tarefa> {

    private String nome;
    private Prioridade prioridade;

    public Tarefa(String nome, Prioridade prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Tarefa outra) {
        return this.prioridade.getValor() - outra.prioridade.getValor();
    }

    @Override
    public String toString() {
        return nome + " (" + prioridade + ")";
    }
}