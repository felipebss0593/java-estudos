import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        int opcao = 0;

        String menu = """
                
                **Digite sua opção**
                1- Consultar Cep
                2- Sair
                
                """;
        while(opcao != 2){
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                System.out.println("Digite o CEP que deseja consultar: ");
                var busca = scanner.nextLine();

                String endereco = "https://viacep.com.br/ws/" + busca + "/json/";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                if(response.statusCode() == 400){
                    throw new ErroDeConsultaDeCep("Não consegui encontrar um CEP.");
                }
                String json = response.body();

                EnderecoViaCep meuCep = gson.fromJson(json, EnderecoViaCep.class);

                System.out.println(json);

                FileWriter escrita = new FileWriter("cep.json");
                escrita.write(gson.toJson(meuCep));
                escrita.close();
                System.out.println("Arquivo json criado com sucesso.");


            }
            if(opcao == 2){
                System.out.println("Programa finalizado.");
            }


            }
        }


    }