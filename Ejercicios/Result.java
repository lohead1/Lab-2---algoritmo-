public class Result {
    //Atributo
    private final String color;
    private final int indice;

    //Constructor
    public Result(String color, int indice){
        this.color = color;
        this.indice = indice;
    }

    //Getters
    public String getColor(){return this.color;}
    public int getIndice(){return this.indice;}

    //Mostrar por Cadena de Caracteres
    @Override
    public String toString(){
        return "[" + this.color + ", " + this.indice + "]";
    }
}
