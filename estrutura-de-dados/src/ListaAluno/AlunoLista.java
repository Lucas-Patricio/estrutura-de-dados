package ListaAluno;

import java.util.Objects;

public class AlunoLista {
    private String nome;
    private int idade;

    private AlunoLista proximo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public AlunoLista getProximo() {
        return proximo;
    }

    public void setProximo(AlunoLista proximo) {
        this.proximo = proximo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlunoLista that = (AlunoLista) o;
        return Objects.equals(proximo, that.proximo);
    }

    @Override
    public String toString() {
        return "AlunoLista{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", proximo=" + proximo +
                '}';
    }
}
