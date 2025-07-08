package clase7;
public  class RegistroMunicipal{
    private Vehiculo[] vehiculos;

    public RegistroMunicipal(Vehiculo[] vehiculos){
        this.vehiculos=vehiculos;
    }
    public void buscarAño(int año){
        for (Vehiculo v:vehiculos){
            if (v.año==año){
                System.out.println(v.dueño);
            }
        }
    }
    public void buscarDueño(String dueño){
        for(Vehiculo v:vehiculos){
            if (v.dueño.equals(dueño)){
                System.out.println(v.dueño);
            }
    }
}

public static void main(String[] args) {
    Vehiculo[] vehiculos=new Vehiculo[3];
    vehiculos[0]=new Auto("aa123bb",2025,"Carlos ",4);
    vehiculos[1]=new Camion("456 cde",2020,"Maria ",10);
    vehiculos[2]=new Moto("fg 789 hi",2017,"Laura ",250);

    RegistroMunicipal registro=new RegistroMunicipal(vehiculos);
    registro.buscarAño(2020);
    registro.buscarDueño("Carlos");
}
}