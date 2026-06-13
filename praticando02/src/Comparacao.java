import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();

        if (numero1 == numero2) {
            System.out.println("Eles são iguais.");
        } else if(numero1 != numero2) {
            System.out.println("Eles são diferentes.");
            if(numero1>numero2) {
                System.out.println("E o numero 1 é maior que o numero dois.");
            } else if(numero1<numero2) {
                System.out.println("E o número 1 é menor que o número 2.");
            }
        }
    }
}
