import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner = new Scanner(System.in);

    int altura = SC.nextInt();
    int massa = Sc.nextDouble();
    int imc = massa / (altura * altura);

    System.out.printf("O seu IMC é de %.2f kg/m² %n" , imc);

    if( 25 < imc && imc < 29.9 ) {System.out.println("Você está acima do peso.");
    }
    if( 30 < imc ) {System.out.println("Você apresenta obesidade de Grau I");
    }
    Sc.close();
  }
}