public class Pessoa2 implements Verificador{
    @Override
    public void recebaIdade(int idade) {
        if(idade>=18) {
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
    }
}
