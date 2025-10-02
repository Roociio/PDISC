package clase13;

public class Rojo implements Estado {
    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("Cambiando de Rojo a Verde");
        semaforo.setEstado(new Verde());
    }
}