/* 
import io.javalin.Javalin;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8000);

        app.get("/suma/:a/:b", ctx -> {  
            int a = Integer.parseInt(ctx.pathParam("a"));
            int b =Integer.parseInt(ctx.pathParam("b")); 
            ctx.json(Map.of("resultado",a+b));
        });
    }

    app.get("/resta/:a/:b", ctx ->{
    int a = Integer.parseInt(ctx.pathParam("a"));
    int b =Integer.parseInt(ctx.pathParam("b")); 
     ctx.json(Map.of("resultado",a-b));
    });
xte
    app.get("/multiplicacion/:a/:b", ctx ->{
    int a = Integer.parseInt(ctx.pathParam("a"));
    int b =Integer.parseInt(ctx.pathParam("b")); ; 
    ctx.json(Map.of("resultado",a*b));
    })
} */