import java.util.Scanner;

public class JFo_6_VDisplayMultiples {
    public static void main(String[] args) {
        // Solicite que o usuário insira um número
        System.out.print("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        sc.close();

        // Use um loop for para exibir os múltiplos desse número de 1 a 12
        for (int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.println(number + "x" + i + " = " + result);
        }
    }
}
