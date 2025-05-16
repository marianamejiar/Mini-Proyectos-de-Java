public class CajaRegistradora {

    public static void main(String[] args) {
        // Crear un arreglo de métodos de pago
        MetodoPago[] pagos = {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTranferencia(250.0, false)
        };

        // Procesar cada método de pago
        for (MetodoPago pago : pagos) {
            System.out.println("Procesando: " + pago.getClass().getSimpleName());

            if (pago.autenticar()) {
                System.out.println("✅ Autenticación exitosa");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("❌ Autenticación fallida - " + pago.getClass().getSimpleName() + " no válido");
            }

            System.out.println("--------------------------------------------------\n");
        }
    }
}
