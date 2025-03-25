import java.util.ArrayList;

public class Cajoneria <E> {
    //Atributos
    private ArrayList <Caja<E>> listaCajas = new ArrayList<>();
    private int tope; //Reresenta la cantidad maxima de elementos

    //Constructor
    public Cajoneria(int tope){
        this.tope = tope;
    }

    //---------------------------------------------------------
    //Metodo Encargado de añadir
    public void add(Caja<E> caja) {
        if(this.listaCajas.size() <= this.tope) {
            this.listaCajas.add(caja);
        }else{
            throw new RuntimeException("Limite Alcanzado");
        }
    }

    @Override
    public String toString(){
        return "";
    }
}
