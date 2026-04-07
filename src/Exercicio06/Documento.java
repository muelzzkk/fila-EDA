package Exercicio06;

public class Documento implements Comparable<Documento> {

    private String nome;
    private int paginas;
    private Prioridade prioridade;


    public Documento(String nome, int paginas, Prioridade prioridade) {
        this.nome = nome;
        this.paginas = paginas;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Documento outro) {
        return this.prioridade.getValor() - outro.prioridade.getValor();
    }


    @Override
    public String toString() {
        return nome + " (" + paginas + " pág, " + prioridade + ")";
    }
}
