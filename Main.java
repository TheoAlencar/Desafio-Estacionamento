package DesafioIncode.DesafioEstacionamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaEstacionamento maquina = new MaquinaEstacionamento();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n--- Sistema de Estacionamento ---");
            System.out.println("1. Emitir Ticket (R$10.00)");
            System.out.println("2. Pagar Ticket");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Verificar Status do Ticket");
            System.out.println("5. Sair");

            int opcao = -1;

            // Garantir que o usuário insira um número válido (entre 1 e 5)
            while (opcao < 1 || opcao > 5) {
                try {
                    System.out.print("Escolha uma opção (1-5): ");
                    opcao = scanner.nextInt();

                    if (opcao < 1 || opcao > 5) {
                        System.out.println("Erro: Opção inválida. Por favor, escolha um número entre 1 e 5.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um número entre 1 e 5.");
                    scanner.next(); // Limpa a entrada inválida
                }
            }

            switch (opcao) {
                case 1:  // Emitir ticket
                    Ticket ticket = maquina.emitirTicket();
                    System.out.println("Ticket emitido! Número: " + ticket.getNumero());
                    break;

                case 2:  // Pagar ticket
                    int numero = -1;
                    while (numero == -1) {
                        try {
                            System.out.print("Informe o número do ticket: ");
                            numero = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Por favor, insira um número válido.");
                            scanner.next();  // Limpa a entrada inválida
                        }
                    }

                    if (maquina.pagarTicket(numero)) {
                        System.out.println("Ticket pago com sucesso!");
                    } else {
                        System.out.println("Falha no pagamento. Verifique se o ticket existe ou já foi pago.");
                    }
                    break;

                case 3:  // Consultar saldo
                    System.out.println("Saldo total: R$" + maquina.consultarSaldo());
                    break;

                case 4:  // Verificar status do ticket
                    numero = -1;
                    while (numero == -1) {
                        try {
                            System.out.print("Informe o número do ticket: ");
                            numero = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Por favor, insira um número válido.");
                            scanner.next();  // Limpa a entrada inválida
                        }
                    }

                    System.out.println(maquina.verificarStatusTicket(numero));
                    break;

                case 5:  // Sair
                    System.out.println("Encerrando o sistema...");
                    rodando = false;
                    break;
            }
        }

        scanner.close();
    }
}