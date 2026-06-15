public class Principal4 {
    public static void main(String[] args) {
         Carro meuCarro = new Carro();

         meuCarro.modelo = "Saveiro";
         meuCarro.anoDoCarro = 2016;
         meuCarro.cor = "Prata";
         meuCarro.anoAtual = 2026;


         meuCarro.exibirFichaTecnica();
        System.out.println("A idade do meu carro é: " + meuCarro.idade(2016) + " anos de idade");

    }
}
