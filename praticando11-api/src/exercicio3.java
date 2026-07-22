import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class exercicio3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um nome de uma receita: ");
        var busca = leitura.nextLine();
        String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + buscaCodificada;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = cliente
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
