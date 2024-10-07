package DesafioIncode.DesafioEstacionamento;

public class Ticket {
    // Atributos privados da classe Ticket
    private int numero;      // Número identificador do ticket
    private double valor;     // Valor monetário do ticket
    private boolean pago;     // Status do ticket: se foi pago ou não

    // Construtor da classe Ticket que inicializa os atributos 'numero' e 'valor'
    // O status 'pago' é inicializado como 'false' (não pago)
    public Ticket(int numero, double valor) {
        this.numero = numero;  // Atribui o número do ticket passado como argumento
        this.valor = valor;    // Atribui o valor do ticket passado como argumento
        this.pago = false;     // Inicializa o ticket como não pago
    }

    // Metodo getter para obter o número do ticket
    public int getNumero() {
        return numero;
    }

    // Metodo getter para obter o valor do ticket
    public double getValor() {
        return valor;
    }

    // Metodo getter para verificar se o ticket foi pago
    public boolean isPago() {
        return pago;
    }

    // Metodo para definir o ticket como pago
    public void pagar() {
        this.pago = true;  // Define o atributo 'pago' como 'true', indicando que o ticket foi pago
    }

    // Metodo sobrescrito 'toString' para exibir as informações do ticket como uma string
    // Inclui o número do ticket, valor e se foi pago ou não
    public String toString() {
        return "Ticket{" +
                "numero=" + numero +           // Exibe o número do ticket
                ", valor=" + valor +           // Exibe o valor do ticket
                ", pago=" + (pago ? "Sim" : "Não") + // Verifica o status de pagamento e exibe "Sim" se pago e "Não" se não pago
                '}';                           // Fecha a string de retorno
    }
}