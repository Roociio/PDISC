package clase12;


public class Otrometodo implements Pago{
    private App app;
    public Otrometodo(App app){
        this.app = app;
    }
    @Override
    public void pagar(int monto, int idUsuario){
        app.pagar(monto,idUsuario);
    }
}
