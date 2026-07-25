import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String json = """
                {Nome: "Felipe",
                "Cidade": "São Paulo"}
                """;
        String jsonPessoa = "{nome:\"Rodrigo\",cidade:\"Brasília\"}";
        Gson gson = new GsonBuilder()
                .create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(pessoa);
    }
}