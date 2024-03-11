package vetores;

public class Programa {
    public static void main(String[] args) {


        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Fernando");
        Aluno a3 = new Aluno("Marta");
        Aluno a4 = new Aluno("Lucas");
        Aluno a5 = new Aluno("Pedro");


        System.out.println(a1.getNome());
        System.out.println(a2.getNome());


        Vetor lista = new Vetor();
        lista.adiciona(a5);
        lista.adiciona(0,a1);
        lista.adiciona(1,a2);
        lista.adiciona(2,a3);
        lista.adiciona(3, a4);
        System.out.println(lista);
        System.out.println(lista.contem(a5));

    }
}
