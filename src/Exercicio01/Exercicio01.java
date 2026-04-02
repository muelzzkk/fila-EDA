package Exercicio01;



public class Exercicio01 {
    public static void main(String[] args) {

        Fila<Documento> fila = new Fila<Documento>(5);

        fila.enfileira(new Documento("Doc1", 10));
        fila.enfileira(new Documento("Doc2", 5));
        fila.enfileira(new Documento("Doc3", 8));
        fila.enfileira(new Documento("Doc4", 20));
        fila.enfileira(new Documento("Doc5", 3));

        System.out.println(fila);

        while(!fila.estaVazia()){
            System.out.println("Imprimindo o documento: " + fila.espia());
            fila.desenfileirar();
            }

        System.out.println("\nTodos os documentos foram impressos!");

        }



    }
