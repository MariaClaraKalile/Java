import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--Calcule seu Índice de Massa Corporal (IMC)--");

        System.out.println("Digite seu peso (Kg) : ");
        double peso = input.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        double imc = (peso/(altura*altura));

        if (imc<18.5){
            System.out.println("Abaixo do peso");
        } else if (imc>=18.5 && imc<25){
            System.out.println("Peso normal");
        } else if (imc>=25 && imc<30){
            System.out.println("Sobrepeso");
        } else if (imc>=30){
            System.out.println("Obesidade");
        }

    }
}
