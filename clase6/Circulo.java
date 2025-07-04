package clase6;

public class Circulo extends Figura{
    private double radio;

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double area (){
    return radio*radio;
}

}
