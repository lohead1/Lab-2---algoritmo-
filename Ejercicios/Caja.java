public class Caja <T> {
    //Atributos
    private String color;
    private T contenido;

    //Constructor
    public Caja(String color, T contenido){
        this.color = color;
        this.contenido = contenido;
    }

    //Constructor por defecto
    public Caja(){
        this.color = "Blanco";
        this.contenido = null;
    }

    //Setters y getters
    public String getColor(){return this.color;}
    public void setColor(String color){this.color = color;}

    public T getContenido(){return this.contenido;}
    public void setContenido(T contenido){this.contenido = contenido;}
}
