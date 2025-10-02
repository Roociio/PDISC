package clase13;

public class Verde implements Estado{
    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("Cambiando de Verde a Amarillo");
        semaforo.setEstado(new Amarillo());
    }
}
