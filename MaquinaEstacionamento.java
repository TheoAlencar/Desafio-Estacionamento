package DesafioIncode.DesafioEstacionamento;

import java.util.ArrayList;
import java.util.List;

public class MaquinaEstacionamento {
    // Atributos privados da classe MaquinaEstacionamento
    private List<Ticket> tickets; // Lista que armazena os tickets emitidos
    private double saldo;         // Saldo total das operações (soma dos pagamentos recebidos)
    private int proximoNumero;    // Número do próximo ticket a ser emitido
    private final double VALOR_FIXO = 10.0;  // Valor fixo para cada ticket emitido

    // Construtor que inicializa os atributos
    public MaquinaEstacionamento() {
        this.tickets = new ArrayList<>();  // Inicializa a lista de tickets como vazia
        this.saldo = 0;                    // Inicializa o saldo como zero
        this.proximoNumero = 1;            // Inicializa o número do próximo ticket como 1
    }

    // Metodo para emitir um novo ticket com um valor fixo (R$10.00)
    public Ticket emitirTicket() {
        // Cria um novo ticket com o próximo número e o valor fixo
        Ticket novoTicket = new Ticket(proximoNumero++, VALOR_FIXO);
        // Adiciona o ticket à lista de tickets emitidos
        tickets.add(novoTicket);
        return novoTicket;  // Retorna o ticket emitido
    }

    // Metodo para pagar um ticket pelo seu número
    public boolean pagarTicket(int numeroTicket) {
        // Percorre a lista de tickets em busca do ticket correspondente ao número informado
        for (Ticket ticket : tickets) {
            // Se o ticket encontrado não foi pago, realiza o pagamento
            if (ticket.getNumero() == numeroTicket && !ticket.isPago()) {
                ticket.pagar();             // Marca o ticket como pago
                saldo += ticket.getValor(); // Adiciona o valor do ticket ao saldo total
                return true;                // Retorna true indicando que o pagamento foi bem-sucedido
            }
        }
        return false; // Retorna false se o ticket não foi encontrado ou já estava pago
    }

    // Metodo para consultar o saldo acumulado das operações
    public double consultarSaldo() {
        return saldo;  // Retorna o saldo total da máquina de estacionamento
    }

    // Metodo para verificar o status de um ticket (se foi pago ou não)
    public String verificarStatusTicket(int numeroTicket) {
        // Percorre a lista de tickets em busca do ticket correspondente ao número informado
        for (Ticket ticket : tickets) {
            // Retorna se o ticket foi pago ou não
            if (ticket.getNumero() == numeroTicket) {
                return ticket.isPago() ? "Ticket pago" : "Ticket não pago";
            }
        }
        return "Ticket não encontrado";  // Retorna essa mensagem se o ticket não foi encontrado
    }

    // Sobrescreve o metodo toString para exibir as informações da máquina de estacionamento

    public String toString() {
        return "MaquinaEstacionamento{" +
                "tickets=" + tickets +    // Exibe a lista de tickets emitidos
                ", saldo=" + saldo +      // Exibe o saldo total
                '}';
    }
}