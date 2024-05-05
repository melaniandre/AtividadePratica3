package controller;

import java.util.ArrayList;

import model.Funcionario;

public class CadastroFuncionarios {

    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static boolean listaFuncionariosVazia() {
        return listaFuncionarios.isEmpty();
    }

    public static Funcionario buscarFuncionario(int matricula, String nome) {

        if(matricula != -1) {
            for (Funcionario tempFuncionario : listaFuncionarios) {

                if (tempFuncionario.getMatricula() == matricula) {
                    return tempFuncionario;
                }
            }
        } else {
            for (Funcionario tempFuncionario : listaFuncionarios) {

                if (tempFuncionario.getNome().equals(nome)) {
                    return tempFuncionario;
                }
            }
        }

        return null;

    }

    public static boolean excluir(int matricula) {

        for (Funcionario tempFuncionario : listaFuncionarios) {
            if (tempFuncionario.getMatricula() == matricula) {
                listaFuncionarios.remove(tempFuncionario);
                return true;
            }
        }

        return false;

    }

}
