package view;

import controller.CadastroFuncionarios;
import controller.Trabalhavel;
import model.*;

public class Sistema {

    public static void executar() {

        int op;

        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

    private static void exibirMenu() {

        System.out.println("\nGerenciamento de Funcionarios");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiario");
        System.out.println("4) Listar funcionários");
        System.out.println("5) Buscar funcionário");
        System.out.println("6) Excluir funcionário");
        System.out.println("0) Sair");
        System.out.print("Sua opção: ");

    }

    private static void cadastrarGerente() {

        System.out.println("\nCadastro de Gerente:");

        int matricula;
        while (true) {

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();

            if (CadastroFuncionarios.buscarFuncionario(matricula, "") != null) {
                System.out.println("\nFuncionario " + matricula +
                        " já se encontra cadastrado no sistema!");
            } else {
                break;
            }
        }

        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Valor por hora: ");
        float valorHora = Console.lerFloat();
        System.out.println("Horas trabalhadas: ");
        float horasTrab = Console.lerFloat();
        System.out.println("Equipe: ");
        String equipe = Console.lerString();
        System.out.println("Bonus: ");
        float bonus = Console.lerFloat();

        Gerente gerente = new Gerente(matricula, nome, valorHora, horasTrab, equipe, bonus);

        CadastroFuncionarios.cadastrarFuncionario(gerente);

        System.out.println("\nGerente Cadastrado com sucesso!");

    }

    private static void cadastrarDesenvolvedor() {
        System.out.println("\nCadastro de Desenvolvedor:");

        int matricula;
        while (true) {

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();
            if (CadastroFuncionarios.buscarFuncionario(matricula, "") != null) {
                System.out.println("\nFuncionario " + matricula +
                        " já se encontra cadastrado no sistema!");
            } else {
                break;
            }
        }

        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Valor por hora: ");
        float valorHora = Console.lerFloat();
        System.out.println("Horas trabalhadas: ");
        float horasTrab = Console.lerFloat();
        System.out.println("Tecnologias utilizadas: ");
        String tecnologias = Console.lerString();

        Desenvolvedor desenvolvedor = new Desenvolvedor(matricula, nome, valorHora, horasTrab, tecnologias);

        CadastroFuncionarios.cadastrarFuncionario(desenvolvedor);

        System.out.println("\nDesenvolvedor Cadastrado com sucesso!");

    }

    private static void cadastrarEstagiario() {
        System.out.println("\nCadastro de Estagiario:");

        int matricula;
        while (true) {

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();
            if (CadastroFuncionarios.buscarFuncionario(matricula, "") != null) {
                System.out.println("\nFuncionario " + matricula +
                        " já se encontra cadastrado no sistema!");
            } else {
                break;
            }
        }

        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Valor por hora: ");
        float valorHora = Console.lerFloat();
        System.out.println("Horas trabalhadas: ");
        float horasTrab = Console.lerFloat();
        System.out.println("Supervisor: ");
        String supervisor = Console.lerString();

        Estagiario estagiario = new Estagiario(matricula, nome, valorHora, horasTrab, supervisor);

        CadastroFuncionarios.cadastrarFuncionario(estagiario);

        System.out.println("\nEstagiario Cadastrado com sucesso!");

    }

    private static void listaFuncionarios() {

        System.out.println("\nLista de funcionários cadastrados:");

        if (CadastroFuncionarios.listaFuncionariosVazia()) {
            System.out.println("\nNão há funcionarios cadastrados...");
            return;
        }

        for (Funcionario tempFuncionario : CadastroFuncionarios.getListaFuncionarios()) {
            System.out.println(tempFuncionario);

        }
    }

    private static boolean verificarListaVazia(String msg) {
        if (CadastroFuncionarios.listaFuncionariosVazia()) {
            System.out.println(msg);
            return true;
        }

        return false;
    }

    private static void buscarFuncionario() {

        if (verificarListaVazia("\nNão há alunos cadastrados")) {
            return;
        }
        System.out.println("1) Buscar por Matricula");
        System.out.println("2) Buscar por Nome");
        int op = Console.lerInt();

        if (op == 1) {
            System.out.println("\nInforme a matrícula do funcionario:");
            int matricula = Console.lerInt();
            Funcionario a = CadastroFuncionarios.buscarFuncionario(matricula, "");
            if (a == null) {
                System.out.println("\nFuncionario " + matricula +
                        " não cadastrado");
                return;
            }
            System.out.println("\nFuncionario localizado:");
            System.out.println(a.toString());
        } else if (op == 2) {
            System.out.println("\nInforme o nome do funcionario:");
            String nome = Console.lerString();
            Funcionario a = CadastroFuncionarios.buscarFuncionario(-1, nome);
            if (a == null) {
                System.out.println("\nFuncionario " + nome +
                        " não cadastrado");
                return;
            }
            System.out.println("\nFuncionario localizado:");
            System.out.println(a.toString());
        }

         System.out.println("\nOpcão inválida");

    }

    private static void excluirFuncionario() {

        System.out.println("\nEXCLUIR FUNCIONÁRIO");
        System.out.print("Informe a matricula do funcionario: ");
        int matricula = Console.lerInt();

        if (CadastroFuncionarios.excluir(matricula)) {
            System.out.println("\nFuncionario foi removido com sucesso!");
        } else {
            System.out.println("\nFuncionario " + matricula + " não localizado no cadastro");
        }
    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                cadastrarGerente();
                break;

            case 2:
                cadastrarDesenvolvedor();
                break;

            case 3:
                cadastrarEstagiario();
                break;

            case 4:
                listaFuncionarios();
                break;

            case 5:
                buscarFuncionario();
                break;

            case 6:
                excluirFuncionario();
                break;

            case 0:
                System.out.println("\nO sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente");
                break;
        }
    }

}
