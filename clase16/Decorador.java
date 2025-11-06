package clase16;

public abstract class Decorador extends Enviador {
    protected Enviador env;
    public Decorador(Enviador env){
        this.env = env;
    }

    @Override
    public void enviar(String mensaje){
        env.enviar(mensaje);
    }
}
