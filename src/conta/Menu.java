package conta;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;

public class Menu {
    public static void main(String[] args) {

        //Testes da Classe Conta Corrente
        ContaCorrente conta1 = new ContaCorrente(151, 10, 1, "Lucas", 15000.0f, 1000.0f);
        conta1.visualizar();
        conta1.sacar(12000.0f);
        conta1.visualizar();
        conta1.depositar(5000.0f);
        conta1.visualizar();

        //Testes da Classe Conta Poupança
        ContaPoupanca conta2 = new ContaPoupanca(3, 131, 2, "Vinicius", 100000.0f, 15);
        conta2.visualizar();
        conta2.sacar(1000.0f);
        conta2.visualizar();
        conta2.depositar(5000.0f);
        conta2.visualizar();

        Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) {

            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND
                    + "*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                BANCO DO BRAZIL COM Z                ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Criar Conta                          ");
            System.out.println("            2 - Listar todas as Contas               ");
            System.out.println("            3 - Buscar Conta por Numero              ");
            System.out.println("            4 - Atualizar Dados da Conta             ");
            System.out.println("            5 - Apagar Conta                         ");
            System.out.println("            6 - Sacar                                ");
            System.out.println("            7 - Depositar                            ");
            System.out.println("            8 - Transferir valores entre Contas      ");
            System.out.println("            9 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     " + Cores.TEXT_RESET);

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }

            if (opcao == 9) {
                System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

                    keyPress();
                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

                    keyPress();
                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

                    keyPress();
                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

                    keyPress();
                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

                    keyPress();
                    break;
                case 6:
                    System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

                    keyPress();
                    break;
                case 7:
                    System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

                    keyPress();
                    break;
                case 8:
                    System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

                    keyPress();
                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);

                    keyPress();
                    break;
            }
        }
    }

    public static void keyPress() {
        try {
            System.out.println(Cores.TEXT_RESET + "\n\n Pressione Enter para continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por : Lucas Oliveira");
        System.out.println("Lucas Oliveira - lucasvmo42@gmail.com");
        System.out.println("github.com/Lucassai");
        System.out.println("*********************************************************");
    }

}