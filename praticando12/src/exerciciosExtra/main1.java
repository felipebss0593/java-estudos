package exerciciosExtra;

import com.google.gson.Gson;

public class main1 {
    public static void main(String[] args) {
        String json = """
                {
                  "nome": "felipe",
                  "cpf": "52286871818",
                  "endereco": {
                     "estado": "são paulo",
                     "cidade": "ferraz de vasconcelos",
                     "rua": "paranapanema"
                  }
                }       
                """;
        Gson gson = new Gson();
        Cliente cliente = gson.fromJson(json,Cliente.class);
        System.out.println(cliente);
    }
}
