import java.util.Scanner;

public class JFo_5_ColorRange {

/* Você deve implementar o seguinte usando uma instrução de decisão if adequada:
1. Solicite que o usuário insira o comprimento de onda; ele deve ser do tipo double.
2. Para cada intervalo (por exemplo, 380 - 450) o número à esquerda é incluído no intervalo
, mas o número à direita não é.
3. Se o valor da entrada não for encontrado no espectro visível
, informe que o comprimento de onda não está dentro do espectro visível.  */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma cor: ");
    double corDigitada = sc.nextDouble();
    sc.close();

    String color;

    if (corDigitada >= 380 && corDigitada < 450) {
        color = "Violeta";
    } else if (corDigitada >= 450 && corDigitada < 495) {
        color = "Azul";
    } else if (corDigitada >= 495 && corDigitada < 570) {
        color = "Verde";
    } else if (corDigitada >= 570 && corDigitada < 590) {
        color = "Amarelo";
    } else if (corDigitada >= 590 && corDigitada < 620) {
        color = "Laranja";
    } else if (corDigitada >= 620 && corDigitada < 750) {
        color = "Vermelho";
    } else {
        color = "A cor digitada não faz parte do expectro visível.";
    }

    System.out.println("A cor é " + color);
}

}
