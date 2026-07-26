package exerciciosExtra;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class main2 {
    public static void main(String[] args) {
        String json = """
                {
                  "Numero Da Conta": "0593",
                  "Saldo": 2000,
                  "Banco": {
                    "Nome": "itau",
                    "Codigo Do Banco": "1222"
                    }
                }    
                """;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES)
                .create();
        Conta conta = gson.fromJson(json,Conta.class);
        System.out.println(conta);
    }
}
