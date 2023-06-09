import java.util.Scanner;

class JFo_5_TrafficLightChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um código de cor: ");
        int currentColor = sc.nextInt();

        sc.close();

        String pxCor;

        if (currentColor == 1) {
            pxCor = "VERDE";
        } else if (currentColor == 2) {
            pxCor = "AMARELO";
        } else if (currentColor == 3) {
            pxCor = "VERMELHO";
        } else {
            pxCor = "COR INVÁLIDA";
        }

        System.out.println("A próxima cor do semafóro é: " + pxCor);
    }
}