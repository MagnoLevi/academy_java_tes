package SubClasses;

import Classes.Pessoa;

public class Aluno extends Pessoa {
    private String rg;
    private String endereco;
    private Double peso;
    private Double altura;
    private Double imc; //peso/altura*^2
    private Treino treino;

    public Aluno(String nome, String cpf, int idade, String rg, String endereco, Double peso, Double altura, Treino treino) {
        super(nome, cpf, idade);
        this.rg = rg;
        this.endereco = endereco;
        this.peso = peso;
        this.altura = altura;

        this.treino = treino;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double altura, double peso) {
        this.imc = peso/(altura * altura);
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "rg='" + rg + '\'' +
                ", endereco='" + endereco + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", imc=" + imc +
                ", treino=" + treino +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
