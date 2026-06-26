public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        for(int i = 1; i <11; i++) {
            int resultado = numero*i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
