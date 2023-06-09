public class JFo_7_Jogo {
    private int creditosNecessarios;
    
    public JFo_7_Jogo(int creditosNecessarios) {
        this.creditosNecessarios = creditosNecessarios;
    }
    
    public void jogar(JFo_7_Cartao cartao) {
        if (cartao.getSaldoCredito() >= creditosNecessarios) {
            int ticketsGanhos = (int) (Math.random() * 10);
            cartao.reduzirCredito(creditosNecessarios);
            cartao.adicionarTicket(ticketsGanhos);
            System.out.println("Número do cartão: " + cartao.getNumero());
            System.out.println("Tíquetes ganhos: " + ticketsGanhos);
            System.out.println("Novo saldo de crédito: " + cartao.getSaldoCredito());
            System.out.println("Novo saldo de tíquetes: " + cartao.getSaldoTicket());
        } else {
            System.out.println("Créditos insuficientes para jogar o jogo");
        }
    }
}