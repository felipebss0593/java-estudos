package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2=1;

        try {
            System.out.println("Digite um número: ");
            numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextInt();

            if(numero2 == 0){
                throw new ErroDeDivisaoComZero("O número zero não pode ser o divisor");
            }

            double resultado = numero1 / numero2;
            System.out.println("O resultado da divisão do primeiro número com o segundo é: " + resultado);
        } catch (ErroDeDivisaoComZero e) {
            System.out.println(e.getMessage());
        }
    }
}