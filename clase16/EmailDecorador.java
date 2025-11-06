package clase16;
public class EmailDecorador extends Decorador{
    public EmailDecorador(Enviador env){
        super(env);
    }
    @Override
    public void enviar(String mensaje){
        super.enviar(mensaje);
        System.out.println("enviar email"+ mensaje);
    }
}