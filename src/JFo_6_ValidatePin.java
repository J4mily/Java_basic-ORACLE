import java.util.Scanner;

public class JFo_6_ValidatePin {
    public static void main(String[] args) {
        // Declare o PIN válido
        int pin = 1234;

        // Solicite que o usuário insira o PIN
        System.out.print("Insira o PIN: ");
        Scanner sc = new Scanner(System.in);
        int userPin = sc.nextInt();

        // Verifique se o PIN inserido pelo usuário é válido
        while (userPin != pin) {
            System.out.println("PIN incorreto. Tente novamente.");
            System.out.print("Insira o PIN: ");
            userPin = sc.nextInt();
        }

        sc.close();
        // Se o PIN for correto, imprima a mensagem de acesso à conta
        System.out.println("PIN correto. Acesso à conta concedido.");
    }
}
