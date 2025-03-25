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
        
        //Compara referencia
        if(this == obj) return true;

        //Verifica que no se nulo y sean de la misma clase
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
            
        //cast a Chocolatina (Object -> Chocolatina)
        Chocolatina cho = (Chocolatina) obj;

        //Compara atributos
        return this.marca.equals(cho.getMarca());
    }

    //Override -> HashCode -> Usar ED basadas en hash
}