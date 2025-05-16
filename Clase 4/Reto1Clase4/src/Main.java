public class Main {
    public static void main(String[] args) {

        // Creamos dos facturas con el mismo folio
        Factura f1 = new Factura("1234", "Mariana Mejia", 100.0);
        Factura f2 = new Factura("1234", "Antonio Perez", 100.0);

        // Mostramos ambas facturas con toString()
        System.out.println(f1);
        System.out.println(f2);

        // Comparamos si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
