package SubClasses;

import java.util.ArrayList;

public class Treino {
    private String tipo;
    private int duracao;

    private ArrayList<Exercicio> exercicios;

    public Treino(String tipo, int duracao) {
        if (duracao < 40 && duracao > 60) {
            System.out.println("Duracao invalida");
        } else {
            this.tipo = tipo;
            this.duracao = duracao;
            exercicios = new ArrayList<>();
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void addExercicios(Exercicio exercicios) {

        this.exercicios.add(exercicios);
    }

    @Override
    public String toString() {
        return "Treino{" +
                "tipo='" + tipo + '\'' +
                ", duracao=" + duracao +
                ", exercicios=" + exercicios +
                '}';
    }
}