package clase13;

public class Semaforo {
    private Estado estado;

    public Semaforo(){
        this.estado = new Rojo();
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    public void cambiarEstado(){
        estado.cambiarEstado(this);
    }
    
}
