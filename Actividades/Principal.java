public class Principal{

    //-----------Actividad 5
    public static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y){
        //Longitudes diferentes - Arreglos distintos
        if(x.length != y.length) return false;

        for (int i=0; i<x.length ; i++){
            if(!x[i].equals(y[i])){
                return false;
            }
        }

        return true; //Contenido igual
    }

    //Ejercicios
    //---------------------------------Ejercicio N°1
    public static <E> boolean exist(E[] arr, E element){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals(element)){
                
                //Si se encuentra el elemento retorna true
                return true;
            }
        }

        //Si no se encuentra retorna false
        return false;
    }

    //---------------------------------Ejercicio N°2
    public static <T extends Iterable<?>> void print(T arr){
        for (Object elemento : arr) {
            System.out.println(elemento.toString());
        }
    }


    public static void main(String[] args) {

        //test de uso clase Bolsa - Actividad 4
        Bolsa <Chocolatina> bc = new Bolsa<>(3);

        //Crear Chocolatinas
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");

        //Agregar Chocolatinas
        bc.add(c);
        bc.add(c1);
        bc.add(c2);

        //Mostrar Chocolatinas
        for (Chocolatina chocolatina: bc) {
            System.out.println(chocolatina.getMarca());
        }

        //Prueba metodo static - Actividad 5
        //Arreglos
        Integer nums[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5};
        Integer nums3[] = {1,2,7,4,5};
        Integer nums4[] = {1,2,7,4,5,6};

        if (igualArrays(nums,nums))
            System.out.println("nums es igual a nums");
        
        if (igualArrays(nums,nums2))
            System.out.println("nums es igual a nums2");
        
        if (igualArrays(nums,nums3))
            System.out.println("nums es igual a num3");
    
        if (igualArrays(nums,nums4))
            System.out.println("nums es igual a nums4");
        
        // Crea un array de double - Actividad 6
        //Double dvals[]={1.1,2.2,3.3,4.4,5.5};
        
        /* 
        if(igualArrays(nums,dvals))
            System.out.println("nums es igual a dvals");
        */

        //Bolsa Golosinas - Actividad 7
        //Crear Bolsa de Golosinas
        Bolsa<Golosina> bg = new Bolsa<>(3);

        //Crear Golosinas
        Golosina g1 = new Golosina("Golosina1", 1.20);
        Golosina g2 = new Golosina("Golosina2", 2.20);
        Golosina g3 = new Golosina("Golosina3", 3.20);

        //Agrergar Golosinas a la bolsa
        bg.add(g1);
        bg.add(g2);
        bg.add(g3);

        //Mostrar Golosinas
        for(Golosina golosina : bg){
            System.out.println(golosina.getNombre());
        }

        //Uso  de metodo Generico para imprimir
        print(bg);

        //Prueba ejercicio N°1
        //----------------------------------------------------------------
        String[] arr1 = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] arr2 = {1,14,53};

        System.out.println("Sanchez esta en arr1: " + exist(arr1, "Sanchez")); //True
        System.out.println("34 esta en arr2: " + exist(arr2, 34)); //True
        System.out.println("Salas esta en arr1: " + exist(arr1, "Salas")); //false
    }
}