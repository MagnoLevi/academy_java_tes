package SubClasses;

import Classes.Funcionario;
import Classes.Pessoa;


import java.util.ArrayList;

public class Professor extends Funcionario {

    private int cargaHoraria;

    private ArrayList<Aluno> alunos;

    public Professor(String nome, String cpf, int idade, String matricula, Double salario, int cargaHoraria) {
        super(nome, cpf, idade, matricula, salario);
        if (cargaHoraria >= 10 && cargaHoraria <= 20){
            this.cargaHoraria = cargaHoraria;
            this.alunos = new ArrayList<>();
        } else {
            System.out.println("Carga horária inválida");
        }
    }

    public int procuraAluno(String nome){
        for (Aluno aluno: alunos){
            if (aluno.getNome() == nome){
                return alunos.indexOf(aluno);
            }
        }
        return -1;
    }

    public void addAluno(Aluno aluno){
        int size = alunos.size();
        if (size >= 10){
            System.out.println("Há 10 alunos");
        } else {
            this.alunos.add(aluno);
        }
    }

    public void removeAluno(String nome){
        int indice = procuraAluno(nome);
        if (indice == -1){
            System.out.println("Este contato não existe");
        }else{ //se ele existe
            alunos.remove(alunos.get(indice));
        }
    }

    public void exibeCpfAluno(String cpf){
        for (Aluno aluno: alunos){
            if (aluno.getCpf() == cpf){
                System.out.println("Há um aluno com este cpf associado a este professor");
            }
        }
    }

    @Override
    public String getNome(){
        return  "Prof."+super.getNome();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        if (cargaHoraria >= 10 && cargaHoraria <= 20){
            this.cargaHoraria = cargaHoraria;
        } else {
            System.out.println("Carga horária inválida");
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cargaHoraria=" + cargaHoraria +
                ", alunos=" + alunos +
                ", matricula='" + matricula + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
