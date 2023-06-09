import java.util.Scanner;

public class JFo_4_TestClass {
    public static void main(String[] args) {

        JFo_4_ComputeMethods cm = new JFo_4_ComputeMethods();

        Scanner scanner = new Scanner(System.in);

      /*  // Trazendo a conversão  da temperatura que o usuário quiser:
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = cm.fToC(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit equivale a " + temperaturaCelsius + " Celsius.");
       */
        // Setando diretamente uma temperatura pra já vê o valor conforme pedido:
       System.out.println("Temp in celsius is " + cm.fToC(100));

    /*     // Trazendo a hipotenusa de acordo com os lados que o usuário quiser:
       System.out.println("===========================================================================");
       System.out.print("Digite o comprimento do primeiro lado: ");
       int lado1 = scanner.nextInt();

       System.out.print("Digite o comprimento do segundo lado: ");
       int lado2 = scanner.nextInt();

       double hipotenusa = cm.hypotenuse(lado1, lado2);
       System.out.printf("O tamanho da hipotenusa é: %.2f " , hipotenusa); */
      
        // Setando diretamente valores dos lados pra já vê o valor da hypotenusa conforme pedido:
        System.out.println("Hypotenuse is " + cm.hypotenuse(5,5));

         // Setando diretamente uma temperatura pra já vê o valor conforme pedido:
         System.out.println("The sum of the dice values is " + cm.roll());

         scanner.close();

    }
}
