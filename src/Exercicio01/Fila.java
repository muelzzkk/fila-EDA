package Exercicio01;

public class Fila<Documento> {

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
        this.elementos = (Documento[])new Object[capacidade];
        this.tamanho = tamanho;
    }



    public Documento espia(){
        return (Documento) this.elementos[0];

    }

    public void enfileira(Documento elemento){
        this.aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public Documento desenfileirar(){
        if (estaVazia()){
            System.out.println("Exercicio01.Fila está vazia.");
            return null;
        }

        Documento temp = (Documento) this.elementos[0];


        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i+1];
        }

        tamanho--;
        elementos[tamanho] = null;

        return temp;

    }

    public void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            Documento[] novafila = (Documento[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novafila[i] = (Documento) this.elementos[i];
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
