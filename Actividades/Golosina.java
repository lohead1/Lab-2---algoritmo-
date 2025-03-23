public class Golosina {
    //Atributos
    private String nombre;
    private double peso;

    //Constructor
    public Golosina(String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }

    //Setters y getters
    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public double getPeso(){return this.peso;}
    public void setPeso(double peso){this.peso = peso;}
}