package Exercicio04;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private TipoSenha tipo;

    public Pessoa(String nome, TipoSenha tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public TipoSenha getTipo() {
        return tipo;
    }

    @Override
    public int compareTo(Pessoa outra) {
        return outra.tipo.compareTo(this.tipo); // prioridade primeiro
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + ")";
    }
}
