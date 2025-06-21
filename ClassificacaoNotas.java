import java.util.Scanner;

public class ClassificacaoNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua nota para receber sua classificação: ");
        double nota = input.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Valor inválido! Informe um valor de 0 a 10.");
        } else if (nota >= 9) {
            System.out.println("Sua classificação é 'A'.");
        } else if (nota >= 7) {
            System.out.println("Sua classificação é 'B'.");
        } else if (nota >= 5) {
            System.out.println("Sua classificação é 'C'.");
        } else if (nota >= 3) {
            System.out.println("Sua classificação é 'D'.");
        } else {
            System.out.println("Sua classificação é 'E'.");
        }
    }
}

        // Estrutura de decisão encadeada