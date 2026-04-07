package Exercicio08;

public class Processo {

    private String id;
    private int tempoExecucao;

    public Processo(String id, int tempoExecucao) {
        this.id = id;
        this.tempoExecucao = tempoExecucao;
    }

    @Override
    public String toString() {
        return "Processo " + id + " (" + tempoExecucao + "s)";
    }
}