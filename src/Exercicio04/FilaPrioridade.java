package Exercicio04;


public class FilaPrioridade {

    private Fila<Pessoa> filaNormal = new Fila<>();
    private Fila<Pessoa> filaPrioritaria = new Fila<>();

    private int contadorPrioridade = 0;

    public void enfileirar(Pessoa p) {
        if (p.getTipo() == TipoSenha.PRIORITARIA) {
            filaPrioritaria.enfileirar(p);
        } else {
            filaNormal.enfileirar(p);
        }
    }

    public Pessoa atender() {

        if (filaNormal.estaVazia() && filaPrioritaria.estaVazia()) {
            return null;
        }

        if (!filaPrioritaria.estaVazia() && contadorPrioridade < 3) {
            contadorPrioridade++;
            return filaPrioritaria.desenfileirar();
        }

        if (!filaNormal.estaVazia()) {
            contadorPrioridade = 0;
            return filaNormal.desenfileirar();
        }

        return filaPrioritaria.desenfileirar();
    }

    public boolean estaVazia() {
        return filaNormal.estaVazia() && filaPrioritaria.estaVazia();
    }
}