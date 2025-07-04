package clase6.tarea;

public  class Gerente extends Empleado{
    public Gerente (String nombre,String rol){
        super(nombre,rol);
    }
    @Override
    public void trabajar(){
        System.out.println("trabajando");
    }
    @Override
    public void mostrarDatos(){
        System.out.println(nombre + "su rol es "+rol);
    }
}
