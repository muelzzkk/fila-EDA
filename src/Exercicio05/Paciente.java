package Exercicio05;

public class Paciente implements Comparable<Paciente> {

    private String nome;
    private Prioridade prioridade;

    public Paciente(String nome, Prioridade prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return nome + " (" + prioridade + ")";
    }

    @Override
    public int compareTo(Paciente outro) {
        return this.prioridade.getValor() - outro.prioridade.getValor();

    }
}
