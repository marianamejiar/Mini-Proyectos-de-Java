package reto1;

public class Paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    public void mostrarInformacion() {
        System.out.println("Información del paciente: ");
        System.out.println("Nombre del Paciente: " + nombre);
        System.out.println("Edad del Paciente: " + edad);
        System.out.println("Numero Expediente del Paciente: " + numeroExpediente);
    }
}
