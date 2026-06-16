public class Principal01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroDaConta(123);
        conta.setSaldo(2000);
        conta.titular = "Felipe";

        System.out.println("Nome do titular: " + conta.titular);
        System.out.println("Número da conta: " + conta.getNumeroDaConta());
        System.out.println("Saldo da conta: " + conta.getSaldo());

        conta.setSaldo(1500);
        System.out.println("Novo saldo: " + conta.getSaldo());
    }
}