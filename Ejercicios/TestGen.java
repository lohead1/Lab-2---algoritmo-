public class TestGen {
    public static void main(String[] args){
        
        //Ejecicio N°5
        //Crear la Cajoneria con capacidad para 5 cajas
        Cajoneria<Golosina> cajoneria = new Cajoneria<>(5);

        //Agregar 5 Golosinas a la cajoneria
        cajoneria.add(new Caja<>("Rojo", new Golosina("Chocolate", 100)));
        cajoneria.add(new Caja<>("Azul", new Golosina("Caramelo", 50)));
        cajoneria.add(new Caja<>("Verde", new Golosina("Gomita", 30)));
        cajoneria.add(new Caja<>("Amarillo", new Golosina("Chicle", 25)));
        cajoneria.add(new Caja<>("Blanco", new Golosina("Turrón", 80)));

        //Mostrar la Cajoneria
        System.out.println("Estado inicial de la Cajoneria:");
        System.out.println(cajoneria);

        //Buscar algunas golosinas por nombre y peso
        Golosina buscar1 = new Golosina("Chocolate", 100);
        Golosina buscar2 = new Golosina("Caramelo", 60);

        System.out.println("Buscando Golosinas:");
        System.out.println("¿Chocolate 100g está en la Cajoneria? " + (cajoneria.search(buscar1) != null));
        System.out.println("¿Caramelo 60g está en la Cajoneria? " + (cajoneria.search(buscar2) != null));

        // Eliminar una Golosina
        System.out.println("\nEliminando 'Gomita 30g'");
        Golosina eli = cajoneria.delete(new Golosina("Gomita", 30));
        System.out.println("Eliminado: " + eli);

        // Mostrar la Cajoneria después de eliminar
        System.out.println("\nEstado final de la Cajoneria:");
        System.out.println(cajoneria);

        //---------------------------
        //Ejercicio N°6
        //Cajoneria Chocolatina
        Cajoneria<Chocolatina> cajCho = new Cajoneria<>(5);

        // Agregar chocolatinas
        cajCho.add(new Caja<>("Rojo", new Chocolatina("Milka")));
        cajCho.add(new Caja<>("Azul", new Chocolatina("Nestlé")));
        cajCho.add(new Caja<>("Verde", new Chocolatina("Ferrero")));
        cajCho.add(new Caja<>("Amarillo", new Chocolatina("Lindt")));
        cajCho.add(new Caja<>("Blanco", new Chocolatina("Toblerone")));

        // Ver la cajoneria
        System.out.println("\nEstado inicial de la cajoneria:");
        System.out.println(cajCho);

        // Buscar una chocolatina
        Chocolatina search = new Chocolatina("Nestlé");
        System.out.println("\nResultado de la búsqueda: " + cajCho.search(search));

        // Eliminar una chocolatina
        Chocolatina elimin = cajCho.delete(new Chocolatina("Ferrero"));
        System.out.println("Eliminada: " + elimin);

        // Ver la cajoneria después de eliminar
        System.out.println("\nEstado de la cajoneria después de eliminar:");
        System.out.println(cajCho);

    }
}
