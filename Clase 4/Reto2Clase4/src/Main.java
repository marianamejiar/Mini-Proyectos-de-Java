public class Main {
    public static void main(String[] args) {

        // Creamos una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("MEMFM12M45", 800.0);

        // Creamos una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("MEMFM12M45", 900.0);

        // Mostrar la información
        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // Validamos si el RFC de la declaración es válido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido?: " + rfcValido);

        // Mensaje adicional
        if (rfcValido) {
            System.out.println("El RFC coincide con la cuenta fiscal.");
        } else {
            System.out.println("El RFC no coincide con la cuenta fiscal.");
        }
    }
}


