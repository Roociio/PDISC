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

//tarea //
// public class Pelicula{
//     private String titulo;
//     private String director;
//     private int duracion;

//     public Pelicula(String titulo,String director,int duracion){
//         this.titulo = titulo;
//         this.director = director;
//         this.duracion = duracion;
//     }
//     public String gettitulo(){
//         return titulo;
//     }
//     public void settitulo(String titulo){
//         this.titulo = titulo;
//     }
//     public String getdirector(){
//         return director;
//     }    
//     public void setdirector(String director){
//         this.director = director;
//     }
//     public int getduracion(){
//         return duracion;
//     }
//     public void setduracion(int duracion){
//         this.duracion = duracion;
//     }
//     public void mostrarInfo(){
//         System.out.println("la pelicula" +titulo+ "del" + director+ "dura"+duracion);
//     }
//     public static void main(String[] args) {
//         Pelicula pelicula = new Pelicula("the holdovers ","Alexander Payne ",133);
//     }
// }

