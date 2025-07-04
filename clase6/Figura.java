package clase6;

public abstract class  Figura {
    protected String nombre;

    public Figura(String nombre){
        this.nombre = nombre;
    }

    
    public abstract double area();
        
    
    public static void main(String[] args) {
        Figura figuras[]= new Figura[3];
        figuras[0]=new Circulo("Circulo",5);
        figuras[1]=new Cuadrado("Cuadrado",5);
        figuras[2]=new Triangulo("Triangulo",5,5);
        for(Figura figura:figuras){
            System.out.println(figura.nombre+ "el area es "+ figura.area());
        }
}}
