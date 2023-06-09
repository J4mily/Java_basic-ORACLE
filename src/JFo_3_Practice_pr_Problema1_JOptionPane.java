import javax.swing.JOptionPane;

public class JFo_3_Practice_pr_Problema1_JOptionPane {
    public static void main(String[] args) {
        // Solicitar entradas do usuário
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros:"));
        String cidade = JOptionPane.showInputDialog("Digite o nome da sua cidade:");
        String animal = JOptionPane.showInputDialog("Digite o nome de um animal:");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso em kg:"));
        String hobby = JOptionPane.showInputDialog("Digite o seu hobby favorito:");
        String comida = JOptionPane.showInputDialog("Digite o nome de uma comida:");
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de anos:"));

        // Calcular a idade em dias
        int idadeEmDias = idade * 365;

        // Calcular o peso em gramas
        double pesoEmGramas = peso * 1000;

        // Construir a história com base nas entradas do usuário
        String historia = "Era uma vez uma pessoa chamada " + nome + ".\n";
        historia += "Essa pessoa tinha " + idade + " anos de idade e vivia na cidade de " + cidade + ".\n";
        historia += "A altura dela era de " + altura + " metros e o peso dela era de " + pesoEmGramas + " gramas.\n";
        historia += "O animal favorito dessa pessoa era um(a) " + animal + " e ela adorava " + hobby + ".\n";
        historia += "Um dia, " + nome + " estava caminhando quando encontrou " + numero + " " + animal + "s.\n";
        historia += "Ficou tão surpresa(o) que decidiu contar essa história por " + anos + " anos.\n";
        historia += "Durante todos esses anos, " + nome + " sempre lembrava de seu prato favorito: " + comida + ".\n";
        historia += "Agora, " + nome + " tem " + idadeEmDias + " dias de idade e continua aproveitando a vida em " + cidade + ".";

        // Exibir a história resultante
        JOptionPane.showMessageDialog(null, historia, "História Interativa", JOptionPane.PLAIN_MESSAGE);
    }
}
