import com.google.gson.Gson;

public class Main2 {
    public static void main(String[] args) {
        String json = """
                {
                  "titulo": "Dom Casmurro",
                  "autor": "Machado de Assis",
                  "editora": {
                    "nome": "Companhia das Letras",
                    "cidade": "São Paulo"
                  }
                }
                """;
        Gson gson = new Gson();
        Livro book = gson.fromJson(json, Livro.class);
        System.out.println(book);
    }
}
