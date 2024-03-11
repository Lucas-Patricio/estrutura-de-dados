package vetores;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public int getTotalDeAlunos() {
        return totalDeAlunos;
    }

    public void setTotalDeAlunos(int totalDeAlunos) {
        this.totalDeAlunos = totalDeAlunos;
    }

    public void adiciona(Aluno aluno) {
        for (int i=0; i< alunos.length; i++){
            if(this.alunos[i] == null){
                this.alunos[i] = aluno;

                this.alunos[this.totalDeAlunos] = aluno;
                this.totalDeAlunos++;
                break;
            }
        }
    }
    public void adiciona(int posicao, Aluno aluno) {
        for (int i = this.totalDeAlunos - 1; i >= posicao; i-=1) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;
    }
    public void remove(int posicao) {
        for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalDeAlunos--;
    }
    public Aluno pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno == this.alunos[i]) {
                return true;
            }
        }
        return false;
    }
    public int tamanho() {
        return this.totalDeAlunos;
    }

    public boolean posicaoOcupada (int posicao){
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }
    public boolean posicaoValida (int posicao){
        return posicao >= 0 && posicao <= this.totalDeAlunos;
    }

    @Override
    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalDeAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalDeAlunos - 1]);
        builder.append("]");
        return builder.toString();
    }

}