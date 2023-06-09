
    public class JFo_7_VTesteFliperama {
        public static void main(String[] args) {
            JFo_7_Cartao cartao1 = new JFo_7_Cartao(1);
            JFo_7_Cartao cartao2 = new JFo_7_Cartao(2);
            JFo_7_Jogo jogo = new JFo_7_Jogo(5);
            JFo_7_VTerminal terminal = new JFo_7_VTerminal();
            
            terminal.converterDinheiroEmCredito(cartao1, 10);
            terminal.converterDinheiroEmCredito(cartao2, 20);
            
            jogo.jogar(cartao1);
            jogo.jogar(cartao2);
            
            terminal.transferirCreditos(cartao1, cartao2, 5);
            
            terminal.verificarSaldos(cartao1);
            terminal.verificarSaldos(cartao2);
            
            terminal.trocarTicketsPorPremio(cartao2, 15);
            
            jogo.jogar(cartao1);
            terminal.trocarTicketsPorPremio(cartao1, 15);
        }
}
