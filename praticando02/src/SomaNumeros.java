import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int soma =0;

        for(int i = 1; i <6; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
