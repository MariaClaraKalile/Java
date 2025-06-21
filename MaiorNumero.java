import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = input.nextDouble();

        if (n1 == n2) {
            System.out.println("Os dois números possuem o mesmo valor");
        } else if (n1 > n2) {
            System.out.println("O primeiro número é maior.");
        }
        else{
            System.out.println("O segundo número é maior.");
        }
    }
}

        // Decisão composta, onde temos três decisões a serem tomadas