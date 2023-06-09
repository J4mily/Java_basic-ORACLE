public class JFo_7_VCategoriaPremio {
        private String nome;
        private int ticketsObrigatorios;
        private int quantidadeDisponivel;
        
        public JFo_7_VCategoriaPremio(String nome, int ticketsObrigatorios, int quantidadeDisponivel) {
            this.nome = nome;
            this.ticketsObrigatorios = ticketsObrigatorios;
            this.quantidadeDisponivel = quantidadeDisponivel;
        }
        
        public String getNome() {
            return nome;
        }
        
        public int getTicketsObrigatorios() {
            return ticketsObrigatorios;
        }
        
        public int getQuantidadeDisponivel() {
            return quantidadeDisponivel;
        }
        
        public void reduzirQuantidadeDisponivel() {
            quantidadeDisponivel--;
        }
    
}
