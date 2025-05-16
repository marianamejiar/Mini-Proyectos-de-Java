import java.util.Optional;

public class Factura {
    // Atributos privados para encapsular los datos
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    // Constructor: Convierte el RFC en Optional, puede ser null
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    // Método público que devuelve un resumen de la factura
    public String getResumen() {
        String resumen = "Factura Generada:\n";
        resumen += "Monto: $" + monto + "\n";
        resumen += "Descripcion: " + descripcion + "\n";

        // Si el RFC está presente, se muestra. Si no, se muestra otro mensaje
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";
        return resumen;
    }
}


