package exercicio3;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um nome para buscar um usuário no github");
            var busca = scanner.nextLine();

            String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

            String enderecoBase = "https://api.github.com/users/";
            String endereco = enderecoBase + buscaCodificada;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Não consegui encontrar um usuário.");
            }
            System.out.println(response.body());

        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
