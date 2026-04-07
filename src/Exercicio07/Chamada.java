package Exercicio07;

public class Chamada {

    private String nome;
    private String assunto;

    public Chamada(String nome, String assunto) {
        this.nome = nome;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return nome + " - " + assunto;
    }
}