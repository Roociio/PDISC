package clase12;

public class Sistpagar{
    public static void main(String[] args) {
    App app = new App();
    Modo modo = new Modo(); 
    Mercado mercado = new Mercado();
    Otrometodo otrometodo = new Otrometodo(app);
    otrometodo.pagar(100,1);
    modo.pagar(100,1);
    mercado.pagar(100,1);

    }
}