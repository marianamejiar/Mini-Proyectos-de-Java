package reto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.println("Ingresa el nombre del paciente: ");
        p1.nombre = scanner.nextLine();

        System.out.println("Ingresa la edad del paciente: ");
        p1.edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa el numero de expediente del paciente: ");
        p1.numeroExpediente = scanner.nextLine();

        scanner.close();

        p1.mostrarInformacion();
    }
}
