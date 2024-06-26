package model;

public abstract class Funcionario {
    
    private int matricula;
    private String nome;
    protected float valorHora;
    protected float horasTrab;

    public Funcionario(int matricula, String nome, float valorHora, float horasTrab) {
        this.matricula = matricula;
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public float getValorHora() {
        return valorHora;
    }


    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }


    public float getHorasTrab() {
        return horasTrab;
    }


    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }

    @Override
    public String toString() {
        
        return "\nMatrícula: " + matricula +
                "\nNome: " + nome +
                "\nValor da hora: R$ " + valorHora +
                "\nHoras trabalhadas: " + horasTrab + " h";
    }
    
   
}
