import java.util.Scanner;

public class SistemaDeAprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- SISTEMA DE APROVAÇÃO ---");
        System.out.println("");
        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;
        double recuperarMedia = (7.0 - media);

        if(media >= 7.0){
            System.out.println("Você está APROVADO");
        } else if (media <= 5.0) {
            System.out.println("Você está de RECUPERAÇÃO e precisa de " + recuperarMedia + " para atingir a média.");
        } else{
            System.out.println("Você está REPROVADO");
        }


    }
}
