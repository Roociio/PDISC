package clase13;

public class Amarillo implements Estado{
    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("Cambiando de Amarillo a Rojo");
        semaforo.setEstado(new Rojo());
    }
}
