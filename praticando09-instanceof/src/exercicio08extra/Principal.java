package exercicio08extra;

public class Principal {
    public static void main(String[] args) {
        Eletrodomestico eletrodomestico = new Geladeira();

        eletrodomestico.ligar();

        Eletrodomestico eletrodomestico1 = new Geladeira();

        if(eletrodomestico1 instanceof Geladeira){
            Geladeira geladeira1 = (Geladeira) eletrodomestico1;
            geladeira1.resfriar();
        }

        Eletrodomestico eletrodomestico2 = new Eletrodomestico();
         if(eletrodomestico2 instanceof Geladeira){
             Geladeira geladeira2 = (Geladeira) eletrodomestico2;
             geladeira2.resfriar();
         }
    }
}
