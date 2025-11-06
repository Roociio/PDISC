package clase16;

public class Cliente {
    public static void main(String[] args) {
        Enviador envio =null;

        enviador = new SmsDecorador(enviador);
        enviador = new WppDecorador(enviador);
        enviador = new EmailDecorador(enviador);

        enviador.enviar("hola");
    }
}
