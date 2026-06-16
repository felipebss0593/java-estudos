public class Principal03 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("iphone 15");
        produto1.setPreco(3000);

        System.out.println("O celular " + produto1.getNome() + " Custa: " + produto1.getPreco() + " Reais.");

        produto1.aplicarDesconto(10);
        System.out.println("Mas com o desconto fica: " + produto1.getPreco());
    }
}
