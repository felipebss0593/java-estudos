import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class exercicio1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        Properties props = new Properties();
        props.load(new FileReader("config.properties"));

        System.out.println("Digite um livro para busca: ");
        var busca = leitura.nextLine();
        String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);


        String chave = props.getProperty("apikey");
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + buscaCodificada + "&key=" + chave;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = cliente
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}