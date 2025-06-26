package clase5;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public void settitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public Libro  (){
       
    }
   
    public void mostrarInfo(){
        System.out.println(titulo+ "de" + autor);
    }
    
    public static void main(String[] args) {
    Libro libro = new Libro("crimen y cartigo","fyodor dostoevsky");
    libro.mostrarInfo();
    }
}

