import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numerotentado = leitor.nextInt();
        if (numerotentado>0) {
            System.out.println("Este número é positivo.");
        }else {
            System.out.println("Este número é negativo.");
        }
    }
}