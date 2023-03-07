package SubClasses;

import Classes.Funcionario;
import Classes.Pessoa;

public class Estagiario extends Funcionario {


    public Estagiario(String nome, String cpf, int idade, String matricula, Double salario) {
        super(nome, cpf, idade, matricula, salario);
    }

    @Override
    public void setSalario(Double salario){
        if (salario > 400 && salario < 100){
            this.salario = salario;
        } else {
            System.out.println("valor de bolsa inválido");
        }

    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "matricula='" + matricula + '\'' +
                ", bolsa=" + salario +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
