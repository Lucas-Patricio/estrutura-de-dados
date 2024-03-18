package Vetores;

import ArmazenamentoSequencial.Aluno;

import java.sql.SQLOutput;

public class ME01Teste {
    public static void main(String[] args) {
        Vetor lista15 = new Vetor();
        Aluno a1 = new Aluno("Lucas");
        Aluno a2 = new Aluno("Joao");
        Aluno a3 = new Aluno("Paulo");
        Aluno a4 = new Aluno("Pedro");
        Aluno a5 = new Aluno("Paulo");
        Aluno a6 = new Aluno("Fernando");
        Aluno a7 = new Aluno("Henrique");
        Aluno a8 = new Aluno("Flavio");
        Aluno a9 = new Aluno("Luan");
        Aluno a10 = new Aluno("Alice");
        Aluno a11 = new Aluno("Leticia");
        Aluno a12 = new Aluno("Dolores");
        Aluno a13 = new Aluno("Leandro");
        Aluno a14 = new Aluno("Elias");
        Aluno a15 = new Aluno("Van");
        Aluno a16 = new Aluno("Glevson");
        Aluno a17 = new Aluno("Souza");


        lista15.adiciona(a1);
        lista15.adiciona(a2);
        lista15.adiciona(a3);
        lista15.adiciona(a4);
        lista15.adiciona(a5);
        lista15.adiciona(a6);
        lista15.adiciona(a7);
        lista15.adiciona(a8);
        lista15.adiciona(a9);
        lista15.adiciona(a10);
        lista15.adiciona(a11);
        lista15.adiciona(a12);
        lista15.adiciona(a13);
        lista15.adiciona(a14);
        lista15.adiciona(a15);

        System.out.println(lista15);

        lista15.remove(2);
        lista15.remove(0);


        System.out.println("Total de Alunos após remoção: " +  lista15.getTotalDeAlunos());
        System.out.println(lista15);


        lista15.adiciona(2,a16);
        lista15.adiciona(0,a17);
        System.out.println(lista15);

        System.out.println("Total de alunos: " + lista15.getTotalDeAlunos());

        lista15.remove(8);
        lista15.remove(13);
        System.out.println(lista15);


    }
}
