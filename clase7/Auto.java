package clase7;

public class Auto extends Vehiculo{
    protected int cantidadPuertas;

    public Auto (String patente, int año,String dueño,int cantidadPuertas){
        super(patente, año, dueño);
        this.cantidadPuertas=cantidadPuertas;
    }
    @Override
    public double calcularImpuesto(){
        return 5000 + 500 * cantidadPuertas;
    }
}
