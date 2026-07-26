package exerciciosExtra;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;
public class main3 {
    public static void main(String[] args) {
        String json = """
                {
                  "Valor": 500,
                  "Data": "26/07/2026",
                  "Beneficiario": {
                    "Nome": "Felipe",
                    "Chave Pix": "52286871818"
                    }
                }    
                """;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES)
                .create();
        Transacao transacao = gson.fromJson(json, Transacao.class);
        System.out.println(transacao);
    }
}
