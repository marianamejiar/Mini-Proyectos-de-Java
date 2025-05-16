public class Main {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Mariana Mejia", "M123454");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("TS1989", "Paris", "19:30");

        // Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reservado");
        } else {
            System.out.println("Fallo");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        vuelo.cancelarReserva();
        System.out.println("Reserva cancelada... \n");

        // Mostrar Itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Nueva reservación
        Pasajero pasajero2 = new Pasajero("Antonio Perez", "P12345");
        vuelo.reservarAsiento(pasajero2);
        System.out.println(vuelo.obtenerItinerario());
    }
}

