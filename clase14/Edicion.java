public class Edicion implements Estado{
    @Override
    public void escribir(){
        System.out.println("se puede modificar el contenido");
    }
    @Override
    public void guardar(){
        System.out.println("documento guardado");
    }
}
