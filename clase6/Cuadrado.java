package clase6;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String nombre, double lado){
        super(nombre);
        this.lado = lado;

    }

@Override
public   double area(){
    return lado * lado;

}

}
