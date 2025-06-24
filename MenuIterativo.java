
import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("------------------------");
            System.out.println("---  MENU ITERATIVO  ---");
            System.out.println("------------------------");
            System.out.println("Digite o primeiro numero: ");
            double n1 = input.nextDouble();
            System.out.println("Digite o segundo numero: ");
            double n2 = input.nextDouble();
            System.out.println("Selecione a opção desejada:");
            System.out.println("[ 1 ] - Somar");
            System.out.println("[ 2 ] - Subtrair");
            System.out.println("[ 3 ] - Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("A soma dos dois números é: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("A subtração dos dois números é: " + (n1 - n2));
                    break;
                    case 3:
                        System.out.println("Saindo...");
                        break;
            }
        } while (opcao != 3);

        input.close();

    }
}
