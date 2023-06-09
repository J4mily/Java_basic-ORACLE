import java.util.Random;

public class JFo_4_ComputeMethods {
 Random random = new Random();


    public double fToC(double temperaturaFahrenheit){
        double temperaturaCelsius = (5.0 / 9.0) * (temperaturaFahrenheit - 32);
        return temperaturaCelsius;
    }
     
    public double hypotenuse(int a, int b){
        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hipotenusa;
    }

    public int roll(){
     int rd1 = random.nextInt(6) + 1;
     int rd2 = random.nextInt(6) + 1;
     int soma = rd1 + rd2;
     return soma;
    }


    
}
