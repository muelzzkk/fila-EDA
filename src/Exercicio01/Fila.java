package Exercicio01;

public class Fila<T> {

    private Object[] elementos;
    private int tamanho;


    public Object[] getElementos() {
        return elementos;
    }

    public void setElementos(Object[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Fila(int capacidade) {
        this.elementos = (T[])new Object[capacidade];
        this.tamanho = 0;
    }



    public T espia(){
        return (T) this.elementos[0];

    }

    public void enfileira(T elemento){
        this.aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public T desenfileirar(){
        if (estaVazia()){
            System.out.println("Exercicio01.Fila está vazia.");
            return null;
        }

        T temp = (T) this.elementos[0];


        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i+1];
        }

        tamanho--;
        elementos[tamanho] = null;

        return temp;

    }

    public void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] novafila = (T[])  new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novafila[i] = (T) this.elementos[i];
            }
            this.elementos = novafila;
        }
    }

    public void enfileiraComPrioridade(T elemento) {

        this.aumentaCapacidade();

        int i = tamanho - 1;


        while (i >= 0 && ((Comparable<T>) elementos[i]).compareTo(elemento) > 0) {
            elementos[i + 1] = elementos[i];
            i--;
        }

        elementos[i + 1] = elemento;
        tamanho++;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);

            if (i < tamanho - 1){
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
