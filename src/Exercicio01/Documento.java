package Exercicio01;

public class Documento {

    private String nome;
    private int num_paginas;


    public Documento(String nome, int num_paginas) {
        this.nome = nome;
        this.num_paginas = num_paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome);

        return sb.toString();
    }
}
