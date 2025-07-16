
import io.javalin.Javalin;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8000);

        app.get("/saludo/:nombre", ctx -> {
            String nombre = ctx.pathParam("nombre");
            ctx.json(Map.of("mensaje", "Hola, " + nombre));
        });
    }
}