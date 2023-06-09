import java.util.Scanner;

public class JFo_5_TrafficLightSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um código de cor: ");
        int corEscolhida = sc.nextInt();
        sc.close();

        String pxCor;

        switch (corEscolhida) {
            case 1:
            pxCor = "VERDE";
                break;
            case 2:
            pxCor = "AMARELO";
                break;
            case 3:
            pxCor = "VERMELHO";
                break;
            default:
            pxCor = "COR INVÁLIDA";
                break;
        }   

        System.out.println("O próximo sinal de trânsito é " + pxCor);
    }

}