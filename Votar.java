import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18 && idade <= 65){
            System.out.println("Seu voto é OBRIGATÓRIO!");
        } else if ((idade >= 16 && idade < 18) ||(idade > 65 && idade <= 70)) {
            System.out.println("Seu voto é FACULTATIVO!");
        } else {
            System.out.println("VOCÊ NÃO PODE VOTAR!");
        }
    }
}
