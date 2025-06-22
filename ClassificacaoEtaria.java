import java.util.Scanner;

public class ClassificacaoEtaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-- CLASSIFICADOR ETÁRIO --");
        System.out.println("");
        System.out.println("Informe sua idade: ");
        int idade = input.nextInt();

        int i = 0;
        if (idade < i) {
            System.out.println("Idade inválida!");
        } else if (idade <= 2) {
            System.out.println("BEBÊ");
        } else if (idade <= 5) {
            System.out.println("CRIANÇA");
        } else if (idade <= 12)  {
            System.out.println("ADOLESCENTE");
        } else if (idade <= 18) {
            System.out.println("JOVEM ADULTO");
        } else if (idade <= 30)  {
            System.out.println("ADULTO");
        } else {
            System.out.println("IDOSO");
        }

    }
}
