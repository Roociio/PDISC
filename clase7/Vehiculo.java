package clase7;

public  abstract class Vehiculo {
    protected String patente;
    protected int año;
    protected String dueño;

    public Vehiculo (String patente, int año,String dueño){
        this.patente=patente;
        this.año=año;
        this.dueño=dueño;
    }
    public  void mostrarDatos(){

    }
    public abstract double calcularImpuesto(); 

    public static void main (String[] args) {
        Vehiculo vehiculos[]= new Vehiculo[3];
        vehiculos[0]=new Auto("aa123bb",2025,"Carlos ",4);
        vehiculos[1]=new Camion("456 cde",2020,"Maria ",10);
        vehiculos[2]=new Moto("fg 789 hi",2017,"Laura ",250);
        for (Vehiculo v : vehiculos) {
            if (v != null) {
        v.mostrarDatos();
        System.out.println("Patente: " + v.patente);
        System.out.println("Año: " + v.año);
        System.out.println("Dueño: " + v.dueño);
        System.out.println("Impuesto: $" + v.calcularImpuesto());
    }

}
    }

}
