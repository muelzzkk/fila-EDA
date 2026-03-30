//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila(5);

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);

        System.out.println(fila);

        fila.desenfileira();

        System.out.println(fila);


        }
    }
