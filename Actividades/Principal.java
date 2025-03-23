public class Principal{
    public static void main(String[] args) {
        Bolsa <Chocolatina> bc = new Bolsa<Chocolatina>(3);

        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");

        bc.add(c);
        bc.add(c1);
        bc.add(c2);

        for (Chocolatina chocolatina: bc) {
            System.out.println(chocolatina.getMarca());
        }
    }
}