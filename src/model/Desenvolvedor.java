package model;

import controller.CalcularSalario;
import controller.Trabalhavel;

public class Desenvolvedor extends Funcionario implements Trabalhavel {

    private String tecnologias;

    public Desenvolvedor(int matricula, String nome,
            float valorHora, float horasTrab,
            String tecnologias) {
        super(matricula, nome, valorHora, horasTrab);
        this.tecnologias = tecnologias;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    
    public String trabalhar() {
        return "Olá, sou o desenvolvedor!";
    }

    
    public String relatarProgresso() {
        return "Consegui implementar uma nova API para a aplicação!";
    }


    @Override
    public String toString() {

        return super.toString() +
                "\nTecnolgias utilizadas: " + tecnologias +
                "\nSalário: " + CalcularSalario.salario(valorHora, horasTrab) +
                "\nTrabalho: " + trabalhar() +
                "\nRelato de Progresso: " + relatarProgresso();
    }

}
