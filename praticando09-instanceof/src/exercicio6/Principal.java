package exercicio6;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1,1000);
        ContaBancaria conta2 = new ContaBancaria(2,2000);
        ContaBancaria conta3 = new ContaBancaria(3,3000);
        ContaBancaria conta4 = new ContaBancaria(4,4000);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);

        double maiorConta = 0;
        int numerosDasContas = 0;

        for (ContaBancaria maiorSaldo: listaDeContas) {
            if(maiorSaldo.getSaldo()>maiorConta){
                maiorConta = maiorSaldo.getSaldo();
                numerosDasContas = maiorSaldo.getNumeroDaConta();
            }
        }

        System.out.println("A conta que tem mais saldo é a:" + " conta " + numerosDasContas + " com o saldo de: R$" + maiorConta);
    }
}
