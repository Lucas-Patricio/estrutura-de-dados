package ListaAluno;

public class Main {
    public static void main(String[] args) {
        AlunoLista a1 = new AlunoLista();
        AlunoLista a2 = new AlunoLista();
        a1.setNome("Glevson");
        a1.setIdade(31);
        a2.setNome("Lucas");
        a2.setIdade(20);

        System.out.println("Lista Ligadas \n");
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
        System.out.println(a1);

    }
}
