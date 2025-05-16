public class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Método con parámetro y valor de retorno
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    // Método sobrecargado: reserva usando solo el nombre
    public boolean reservarAsiento(String nombre) {
        String pasaporteGenerico = "GENERICO123"; // Valor de ejemplo
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporteGenerico);
        return reservarAsiento(nuevoPasajero);
    }

    // Método sin retorno
    public void cancelarReserva() {
        asientoReservado = null;
    }

    // Método que retorna un String
    public String obtenerItinerario() {
        String info = "Itinerario del vuelo: \n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Hora de salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}

