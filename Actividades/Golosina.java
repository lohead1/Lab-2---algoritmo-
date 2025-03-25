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

    //Sobreescritura - ToString
    public String toString(){
        return "Golosina{" +
            "nombre='" + nombre + '\'' +
            ", peso=" + peso +
            '}';
    }



    //SobreEscritura
    @Override
    public boolean equals(Object obj) {
        
        if(this == obj) return true;

        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
            
        Golosina gol = (Golosina) obj;

        return this.nombre.equals(gol.getNombre()) && this.peso == gol.getPeso();
    }

    //Override -> HashCode -> Usar ED basadas en hash

}