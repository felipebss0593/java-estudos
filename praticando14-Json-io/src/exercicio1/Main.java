package exercicio1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter escrita = new FileWriter("arquivo.txt");
            escrita.write("Conteúdo a ser gravado no arquivo");
            escrita.close();
            System.out.println("O programa foi realizado com sucesso");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}