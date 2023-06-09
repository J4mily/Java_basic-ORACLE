import java.util.Scanner;

public class JFo_4_VProcessName {
/*     Você deve implementar o seguinte:
    1. Faça com que o usuário insira um nome.
    2. Extraia o primeiro e o último nomes do nome inserido pelo usuário. 
    3. Use os métodos de classe String para manipular name, conforme especificado:
    4. Exiba o nome do console.
    
    Saída Esperada:
    
    Type your name: Jenny Weaver
    Your name is: Weaver, J. */

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Escreva seu nome + sobrename: ");
    String nomeSobrenome = sc.nextLine();
    
    // Extrai o primeiro e o último nome
    int spaceIndex = nomeSobrenome.indexOf(' ');
    String nome = nomeSobrenome.substring(0, spaceIndex);
    String sobrenome = nomeSobrenome.substring(spaceIndex + 1);
    
    // Manipula o nome conforme especificado
    String nomeFormatado = sobrenome + ", " + nome.charAt(0) + ".";
    
    // Exibe o nome formatado no console
    System.out.println("Seu nome é: " + nomeFormatado);

    sc.close();

    }
     
}
