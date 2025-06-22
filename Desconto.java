import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-- CONDIÇÕES DE DESCONTO --");
        System.out.print("");
        System.out.print("Digite o valor do produto: R$");
        double valorproduto = input.nextDouble();
        System.out.println("");
        System.out.println("-- Opções de pagamento disponíveis: --");
        System.out.println("");
        System.out.println("[ 1 ] Dinheiro");
        System.out.println("[ 2 ] Débito");
        System.out.println("[ 3 ] Crédito em 2x");
        System.out.println("[ 4 ] Crédito em 3x ou mais");
        System.out.println("");
        System.out.println("Digite o número respectivo da opção de pagamento desejada: ");

        char opcao = input.next().charAt(0);
        double descontodinheiro = 15;
        double descontocartao = 10;
        double desconto2x = 5;
        double descontodinheiroatt = valorproduto * descontodinheiro / 100;
        double descontodebitoatt = valorproduto * descontocartao / 100;
        double desconto2xatt = valorproduto * desconto2x / 100;


        switch(opcao) {
            case '1':
                System.out.print("O valor do produto com desconto à vista é: R$ " + (valorproduto - descontodinheiroatt)) ;
                break;

                case '2':
                    System.out.println("O valor do produto com desconto no débito é: R$ " + (valorproduto - descontodebitoatt));
                    break;

                    case '3':
                        System.out.println("O valor do produto com desconto no crédito em 2x ou mais é: R$ " + (valorproduto - desconto2xatt));
                        break;

                        case '4':
                            System.out.println("Não há desconto para essa forma de pagamento.");
                            break;
        }
    }
}
