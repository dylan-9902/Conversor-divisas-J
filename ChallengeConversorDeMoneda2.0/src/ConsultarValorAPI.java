import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarValorAPI {
    public InfoMonedas buscarMoneda (String monedaLocal, String monedaObjetivo){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/582d069cc930332b8dce8258/pair/"+monedaLocal+"/"+
                monedaObjetivo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), InfoMonedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No he encontrado la moneda");
        }
    }
}
