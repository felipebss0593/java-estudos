package exercicio2;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        Titulo titulo = new Titulo("Gato de botas 2 ", 2023, true, 180);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulo));
        escrita.close();
        System.out.println("O programa finalizou perfeitamente!");

    }
}
