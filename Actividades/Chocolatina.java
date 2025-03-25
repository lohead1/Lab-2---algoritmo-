public class Chocolatina {
    //Atributo
    private String marca;
    
    //Constructor
    public Chocolatina(String marca){
        this.marca = marca;
    }

    //Setters y Getters
    public String getMarca(){return this.marca;}
    public void setMarca(String marca){this.marca = marca;}

    //Sobreescritura
    public String toString(){
        return "Chocolatina{" +
            "marca='" + this.marca + "'}";

    }

    //SobreEscritura
    @Override
    public boolean equals(Object obj) {
        
        if(this == obj) return true;

        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
            
        Chocolatina cho = (Chocolatina) obj;

        return this.marca.equals(cho.getMarca());
    }

    //Override -> HashCode -> Usar ED basadas en hash

}