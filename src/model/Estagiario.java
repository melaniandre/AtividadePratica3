package model;

import controller.CalcularSalario;
import controller.Trabalhavel;

public class Estagiario extends Funcionario implements Trabalhavel {

    private String supervisor;

    public Estagiario(int matricula, String nome,
            float valorHora, float horasTrab,
            String supervisor) {
        super(matricula, nome, valorHora, horasTrab);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }


    public String trabalhar() {
        return "Olá, sou o estagiário!";
    }

 
    public String relatarProgresso() {
        return "Aprendi que não posso subir nada direto para produção!";
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nSupervisor: " + supervisor +
                "\nHoras de trabalho: " + getHorasTrab() +
                "\nSalário: " + CalcularSalario.salario(valorHora, horasTrab) +
                "\nTrabalho: " + trabalhar() +
                "\nRelato de Progresso: " + relatarProgresso();
    }

  

}
