package model;

import controller.CalcularSalario;
import controller.Trabalhavel;

public class Gerente extends Funcionario implements Trabalhavel {

    private String equipe;
    private float bonus;

    public Gerente(int matricula, String nome,
            float valorHora, float horasTrab,
            String equipe, float bonus) {
        super(matricula, nome, valorHora, horasTrab);
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }


    public String trabalhar() {
        return "Olá, sou o gerente!";
    }

    public String relatarProgresso() {
        return "A equipe está trabalhando muito bem, vamos conseguir entregar dentro do prazo!";
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nEquipe que coordena: " + equipe +
                "\nBonus anual: R$ " + bonus +
                "\nSalário: " + CalcularSalario.salario(valorHora, horasTrab, bonus) +
                "\nTrabalho: " + trabalhar() +
                "\nRelato de Progresso: " + relatarProgresso();

    }

}
