package App;

import SubClasses.*;

public class Main {
    public static void main(String[] args) {

//        exercicio
        Exercicio e1 = new Exercicio(1, "Biceps", 5);
        Exercicio e2 = new Exercicio(1, "Biceps", 10);
        Exercicio e3 = new Exercicio(3, "triceps", 12);


//        Treino
        Treino t1 = new Treino("tipo1", 5);
        t1.addExercicios(e2);
        Treino t2 = new Treino("tipo2", 9);
        t2.addExercicios(e2);
        t2.addExercicios(e3);


//        Aluno
        Aluno a1 = new Aluno("Vinicius", "12312312355", 18, "rg1", "Rua exemplo", 70.0, 1.8, t1);
        a1.setImc(a1.getAltura(), a1.getPeso());
        Aluno a2 = new Aluno("Alessandra", "1119958341221", 20, "rg2", "Rua exemplo 2", 65.0, 1.6, t2);
        a2.setImc(a2.getAltura(), a2.getPeso());

//        Professor
        Professor p1 = new Professor("Rodrigo", "33344455561", 43, "123", 1500.0, 12);
        p1.addAluno(a1);
        Professor p2 = new Professor("Leandro", "55533300098", 28, "321", 3000.0, 16);
        p2.addAluno(a1);
        p2.addAluno(a2);
        System.out.println(p1);


//        Estagiario
        Estagiario est1 = new Estagiario("Estagiario1", "11122211199", 23, "555", 600.0);
        Estagiario est2 = new Estagiario("Estagiario2", "99988899901", 19, "129", 450.0);

//        Academia
        Academia aca1 = new Academia();
        aca1.addFuncionarios(p1);
        aca1.addFuncionarios(p2);
        aca1.addFuncionarios(est1);
        aca1.addFuncionarios(est2);
        aca1.addAlunos(a1);
        aca1.addAlunos(a2);
//        aca1.mostraFuncionarios();
//        aca1.mostraAlunos();
    }
}