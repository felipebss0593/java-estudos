public class Contagem implements Contador{

    @Override
    public void recebeNumero(int numero) {
        for(int i = 1; i <= numero; i++){
            System.out.println(i);
        }
    }
}
