import java.util.Scanner;
public class Aula01 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);  //Programa manual
        System.out.println("-- Primeiro Triângulo--");
        System.out.println("Informe o Lado A: ");
        double ladoA = sc.nextDouble();
        System.out.println("Informe o Lado B: ");
        double ladoB = sc.nextDouble();
        System.out.println("Informe o Lado C: ");
        double ladoC = sc.nextDouble();

        double p =  (ladoA+ladoB+ladoC)/2;
        double area1 = Math.sqrt(p*(p-ladoA)*(p-ladoB));
        System.out.println("A Área do primeiro triângulo: "+area1);

        // Segundo triângulo

        System.out.println("-- Segundo Triângulo--");
        System.out.println("Informe o Lado A: ");
        double ladoA2 = sc.nextDouble();
        System.out.println("Informe o Lado B: ");
        double ladoB2 = sc.nextDouble();
        System.out.println("Informe o Lado C: ");
        double ladoC2 = sc.nextDouble();

        double p2 =  (ladoA2+ladoB2+ladoC2)/2;
        double area2 = Math.sqrt(p*(p-ladoA2)*(p-ladoB2));
        System.out.println("A Área do segundo triângulo é: "+area2);

        if (area2<area1){
            System.out.println("A Área do PRIMEIRO TRIÂNGULO é maior");
        } else {
            System.out.println("A Área do SEGUNDO TRIÂNGULO é maior");
        }
    }
}
