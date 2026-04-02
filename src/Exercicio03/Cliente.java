package Exercicio03;

public class Cliente {

    private String nome;
    private int quantidade_produtos;


    public Cliente(String nome, int quantidade_produtos) {
        this.nome = nome;
        this.quantidade_produtos = quantidade_produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade_produtos() {
        return quantidade_produtos;
    }

    public void setQuantidade_produtos(int quantidade_produtos) {
        this.quantidade_produtos = quantidade_produtos;
    }


    @Override
    public String toString() {
        return nome;

    }
}
