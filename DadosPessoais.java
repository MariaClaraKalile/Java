import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Serve para criar um objeto que vai ler os dados digitados no teclado do usuário

        // Solicitado o nome p usuário
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine(); // Declarando o tipo e o nome da var e lê tudo o que o usuário digita

        // Solicitando a idade p usuário
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        // Solicitando a altura p  usuário
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.println("--- Dados Pessoais ---"); // Só pra ficar bonitinho
        System.out.println("Nome:  " + nome);
        System.out.println("Idade:  " + idade);
        System.out.println("Altura:  " + altura);
    }
}
