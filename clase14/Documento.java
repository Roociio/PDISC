public class Documento {
    private Estado estado;
    public Documento(Estado estadoinicial){
        this.estado= estadoinicial;
    }
    public void setEstado (Estado nuevoestado){
        this.estado=nuevoestado;
    }
    public void escribir(){
        estado.escribir();
    }
    public void guardar(){
        estado.guardar();
    }
}
