public class Main {
    public static void main(String[] args){
        Documento documento = new Documento(new Lectura());
        documento.escribir();
        documento.guardar();

        documento.setEstado(new Edicion());
        documento.escribir();
        documento.guardar();
    }
}
