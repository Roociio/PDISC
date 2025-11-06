package clase16;
public class SmsDecorador extends Decorador {
    public SmsDecorador(Enviador env){
        super(env);
    }
    @Override
    public void enviar(String mensaje){
        super.enviar(mensaje);
        System.out.println("Enviando sms" + mensaje);
    }
}