package Classes;

public abstract class Funcionario extends Pessoa{
    protected String matricula;
    protected Double salario;

    public Funcionario(String nome, String cpf, int idade, String matricula, Double salario) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
