package clase7;

public class Moto extends Vehiculo {
    protected int cilindrada;

    public Moto (String patente,int año,String dueño,int cilindrada){
        super(patente,año,dueño);
        this.cilindrada=cilindrada;
    }
    @Override
    public double calcularImpuesto(){
        if (cilindrada > 250 ){
            return 3000;
        }else{
            return 6000;
        }
    }
}
