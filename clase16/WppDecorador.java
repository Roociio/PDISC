package clase16;
public class WppDecorador extends Decorador {
    public WppDecorador( Enviador env){
        super(env);
    }
    @Override
    public void enviar(String mensaje){
        super.enviar(mensaje);
        System.out.println("Enviando wpp" + mensaje);
    }
}