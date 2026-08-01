package exercicio3;

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
        Veiculo veiculo = new Veiculo("t-Cross", 2026,8500,"Felipe Fernando Baie dos Santos");
        FileWriter escrita = new FileWriter("Veiculos.json");
        escrita.write(gson.toJson(veiculo));
        escrita.close();
        System.out.println("Veiculo cadastrado com sucesso!");
    }
}
