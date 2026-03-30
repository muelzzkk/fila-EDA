import java.util.Arrays;

public class Fila<T> {

    private Object[] elementos;
    private int tamanho;


    public Fila(int capacidade) {
        this.elementos = (T[])new Object[capacidade];
        this.tamanho = tamanho;
    }


    public void enfileira(T elemento){
        this.aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public T desenfileira(){
        if (estaVazia()){
            System.out.println("Fila está vazia.");
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
            T[] novafila = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novafila[i] = (T) this.elementos[i];
            }
            this.elementos = novafila;
        }
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
