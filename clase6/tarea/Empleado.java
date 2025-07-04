package clase6.tarea;

public  abstract class Empleado{
    protected String nombre;
    protected String rol;

    public Empleado(String nombre,String rol){
        this.nombre = nombre;
        this.rol=rol;
    }
    public abstract void trabajar();
    public abstract void mostrarDatos();

    public static void main(String[] args) {
        Empleado empleados[]= new Empleado[3];
        empleados[0]=new Diseñador("diseñador","Carlos ");
        empleados[1]=new Programador("programador","Maria ");
        empleados[2]=new Gerente("gerente","Laura ");
        for(Empleado empleado:empleados){
            System.out.println(empleado.rol + empleado.nombre);
        }
    }
}
