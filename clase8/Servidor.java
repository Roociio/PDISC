import com.sun.net.httpserver.HttpsServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Servidor {
    public static void main(String[] args)throws IOException {
        HttpsServer server = HttpsServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/", exchange ->{
            String response= "rocio";
            exchange.sendResponseHeaders(200,response.getBytes().length );
            try(OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        });

        
}}
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Servidor {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/", exchange -> {
            String response = "rocio";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        });

        server.setExecutor(null); // Usa un executor por defecto
        server.start();
        System.out.println("Servidor HTTP iniciado en http://localhost:8000/");
    }
}
