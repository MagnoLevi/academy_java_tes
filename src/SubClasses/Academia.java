package SubClasses;

import Classes.Funcionario;

import java.util.ArrayList;

public class Academia {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Aluno> alunos;

    public Academia(){
        this.funcionarios = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void addFuncionarios(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void addAlunos(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void mostraFuncionarios(){
        for (Funcionario funcionario: funcionarios) {
            System.out.println(funcionario);
            System.out.println();
        }
    }

    public void mostraAlunos(){
        for (Aluno aluno: alunos) {
            System.out.println(aluno);
            System.out.println();
        }
    }
}
