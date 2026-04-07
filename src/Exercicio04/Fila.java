package Exercicio04;

public class Fila<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public Fila() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void enfileirar(T valor) {
        No<T> novo = new No<>(valor);

        if (estaVazia()) {
            inicio = novo;
        } else {
            fim.proximo = novo;
        }

        fim = novo;
        tamanho++;
    }

    public T desenfileirar() {
        if (estaVazia()) return null;

        T valor = inicio.valor;
        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }

        tamanho--;
        return valor;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int tamanho() {
        return tamanho;
    }
}