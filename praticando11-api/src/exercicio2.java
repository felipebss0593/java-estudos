import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class exercicio2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma moeda que deseja comparar: ");
        var busca1 = leitura.nextLine();
        System.out.println("Digite outra moeda para ser comparada com a que você digitou anteriormente: ");
        var busca2 = leitura.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + busca1 + "&vs_currencies=" + busca2;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = cliente
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
