package SubClasses;

import java.util.ArrayList;

public class Exercicio {
    private int numero;
    private String nome;
    private int qtdDeRepeticoes;
    private ArrayList<String> musculos;


    public Exercicio(int numero, String nome, int qtdDeRepeticoes) {
        if (qtdDeRepeticoes < 6) {
            System.out.println("Quantidade de repeticoes inferior a 6");
        } else {
            this.numero = numero;
            this.nome = nome;
            this.qtdDeRepeticoes = qtdDeRepeticoes;
            musculos = new ArrayList<>();
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdDeRepeticoes() {
        return qtdDeRepeticoes;
    }

    public void setQtdDeRepeticoes(int qtdDeRepeticoes) {
        this.qtdDeRepeticoes = qtdDeRepeticoes;
    }

    public ArrayList<String> getMusculos() {
        return musculos;
    }

    public void setMusculos(ArrayList<String> musculos) {
        this.musculos = musculos;
    }

    @Override
    public String toString() {
        return "Exercicio{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", qtdDeRepeticoes=" + qtdDeRepeticoes +
                ", musculos=" + musculos +
                '}';
    }
}
