public class Lectura implements Estado{
    @Override
    public void escribir(){
        System.out.println("no se puede modifica el contenido");
    }
    @Override
    public void guardar(){
        System.out.println("no hay cambios para guardar");
    }
}
