import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a operação que deseja realizar: (+ , - , * , /) ") ;
        char operador = input.next().charAt(0);

        System.out.println("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.println("Digite o primeiro número: ");
        double n2 = input.nextDouble();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

         switch(operador) {
             case '+':
                 soma = n1 + n2;
                 System.out.println("O resultado é: " + soma);
                 break;

                 case '-':
                     subtracao = n1 - n2;
                     System.out.println("O resultado é: " + subtracao);
                     break;

                     case '*':
                         multiplicacao = n1 * n2;
                         System.out.println("O resultado é: " + multiplicacao);
                         break;

                         case '/':
                             divisao = n1 / n2;
                             System.out.println("O resultado é: " + divisao);
                             break;
                             default:

         }

    }
}
