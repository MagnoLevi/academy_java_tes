package Classes;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;


    public Pessoa(String nome, String cpf, int idade) {
        if (cpf == ""){
            System.out.println("cpf inválido");
        } else {
            this.nome = nome;
            this.cpf = cpf;
            this.idade = idade;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == ""){
            System.out.println("cpf inválido");
        } else {
            this.cpf = cpf;
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
