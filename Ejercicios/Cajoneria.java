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
        if(this.listaCajas.size() < this.tope) {
            this.listaCajas.add(caja);
        }else{
            throw new RuntimeException("Limite Alcanzado");
        }
    }

    public Result search(E element){

        int index = 0;

        for (Caja<E> caja : this.listaCajas){
            if(caja.getContenido().equals(element)){
                
                /*Retorna objeto Result si encuentra el
                elemento en alguna de las cajas
                */
                return new Result(caja.getColor(),index);
            }
            index++;
        }

        //Retorna null si no lo encuentra
        return null;
    }

    public E delete(E element){

        //Busca el elemento para verificar si existe o no
        Result res = this.search(element);

        if(res != null){
            //Si es diferente a null el elemento se encuentra en Cajoneria

            //Guarda el objeto de la caja
            E obj = this.listaCajas.get(res.getIndice()).getContenido();

            this.listaCajas.get(res.getIndice()).setContenido(null);

            /*
             * "Elimina" el contenido de la caja estableciendo los valores como 
             * null
             */

            return obj;

        }

        //Retorna null si no se encontro el elemento
        return null;
    }

    //Implementacion toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
    sb.append("Posicion\tColor Caja\tObjeto\n");

    for (int i = 0; i < listaCajas.size(); i++) {
        Caja<E> caja = listaCajas.get(i);
        sb.append((i + 1))
            .append("\t")
            .append(caja.getColor() != null ? caja.getColor() : "Sin color")
            .append("\t")
            .append(caja.getContenido() != null ? caja.getContenido().toString() : "Vacío")
            .append("\n");
    }

    return sb.toString();
    }
}
