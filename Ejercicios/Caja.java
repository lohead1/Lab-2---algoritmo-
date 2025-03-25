public class Caja <E> {
    //Atributos
    private String color;
    private E contenido;

    //Constructor
    public Caja(String color, E contenido){
        this.color = color;
        this.contenido = contenido;
    }

    //Setters y getters
    public String getColor(){return this.color;}
    public void setColor(String color){this.color = color;}

    public E getContenido(){return this.contenido;}
    public void setContenido(E contenido){this.contenido = contenido;}
}
