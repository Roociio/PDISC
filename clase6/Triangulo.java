package clase6;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area (){
    return (base*altura)/2;
}

}
