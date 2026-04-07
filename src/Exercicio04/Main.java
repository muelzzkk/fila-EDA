package Exercicio04;

public class Main {

    public static void main(String[] args) {

        FilaPrioridade fila = new FilaPrioridade();

        fila.enfileirar(new Pessoa("Ana", TipoSenha.PRIORITARIA));
        fila.enfileirar(new Pessoa("Carlos", TipoSenha.PRIORITARIA));
        fila.enfileirar(new Pessoa("Maria", TipoSenha.PRIORITARIA));
        fila.enfileirar(new Pessoa("João", TipoSenha.PRIORITARIA));

        fila.enfileirar(new Pessoa("Pedro", TipoSenha.NORMAL));
        fila.enfileirar(new Pessoa("Lucas", TipoSenha.NORMAL));
        fila.enfileirar(new Pessoa("Julia", TipoSenha.NORMAL));

        System.out.println("Ordem de atendimento:");

        while (!fila.estaVazia()) {
            System.out.println(fila.atender());
        }
    }
}
