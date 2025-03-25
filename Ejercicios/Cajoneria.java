import java.util.ArrayList;
import java.util.Iterator;

public class Cajoneria <E> implements Iterable <E> {
    //Atributos
    private ArrayList <E> lista = new ArrayList <E>();
    private int tope; //Reresenta la cantidad maxima de elementos

    //Constructor
    public Cajoneria(int tope){
        this.tope = tope;
    }

    //Metodo Encargado de añadir
    public void add(E objeto) {
        if(this.lista.size() <= this.tope) {
            this.lista.add(objeto);
        }else{
            throw new RuntimeException("Limite Alcanzado");
        }
    }

    //Metodo que permite recorrer "Cajoneria"
    public Iterator <E> iterator() {
        return this.lista.iterator();
    }
}
