package java_poo.exercicios;

public class TesteClassesAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao", 5, 4);
        a1.calcMedia();
        a1.statusAluno();

        AlunoTecnico a2 = new AlunoTecnico("Laura", 1, 1, 6);
        a2.calcMedia();
        a2.statusAluno();

        AlunoSuperior a3 = new AlunoSuperior("Pedro", 10, 5, 7, 6);
        a3.calcMedia();
        a3.statusAluno();
    }
}
