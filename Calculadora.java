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

        // Estrutura de repetição Switch-Case
         switch(operador) {
             case '+':
                 System.out.println("O resultado é: " + (n1 + n2));
                 break;

                 case '-':
                     System.out.println("O resultado é: " + (n1 - n2));
                     break;

                     case '*':
                         System.out.println("O resultado é: " + (n1 * n2));
                         break;

                         case '/':

                             System.out.println("O resultado é: " + (n1 / n2));
                             break;
         }

    }
}
