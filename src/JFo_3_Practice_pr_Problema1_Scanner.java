import java.util.Scanner;

public class JFo_3_Practice_pr_Problema1_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entradas do usuário
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o nome de uma cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite um adjetivo: ");
        String adjetivo = scanner.nextLine();

        System.out.print("Digite um verbo no infinitivo: ");
        String verbo = scanner.nextLine();

        System.out.print("Digite um substantivo: ");
        String substantivo = scanner.nextLine();

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite um número decimal: ");
        double decimal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite uma cor: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o nome de um animal: ");
        String animal = scanner.nextLine();

        System.out.print("Digite um objeto: ");
        String objeto = scanner.nextLine();

        // Calcular o quadrado do número
        int quadradoNumero = numero * numero;

        // Calcular o dobro do número decimal
        double dobroDecimal = decimal * 2;

        // Construir a história com base nas entradas do usuário
        System.out.println("\n\nHistória Interativa:\n");
        System.out.println("Era uma vez, em uma cidade chamada " + cidade + ", vivia uma pessoa chamada " + nome + ".");
        System.out.println("Essa pessoa era muito " + adjetivo + " e sempre gostava de " + verbo + ".");
        System.out.println("Um dia, encontrou um(a) " + substantivo + " " + animal + " de cor " + cor + ".");
        System.out.println("Ficou tão impressionada(o) que decidiu adotar o(a) " + animal + " como seu animal de estimação.");
        System.out.println("Eles se tornaram melhores amigos e sempre brincavam juntos com um(a) " + objeto + ".");
        System.out.println("Ao contar essa história, " + nome + " percebeu que o número " + numero + " tinha um significado especial.");
        System.out.println("Seu quadrado era " + quadradoNumero + " e o dobro do número decimal " + decimal + " era " + dobroDecimal + ".");
        System.out.println("Desde então, " + nome + " e o(a) " + animal + " continuam a viver aventuras emocionantes na cidade de " + cidade + ".");

        scanner.close();
    }  
}
