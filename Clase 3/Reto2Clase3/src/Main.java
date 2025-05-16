public class Main {
    public static void main(String[] args) {
        Factura facturaConRFC = new Factura(2500.0, "Servicio de consultoria", "MERMF1P9K9");
        Factura facturaSinRFC = new Factura(1800.0, "Reparacion de equipo", null);

        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}

