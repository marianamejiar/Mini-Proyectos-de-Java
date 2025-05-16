import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Crear objeto Scanner
        double saldo = 1000.0; // Saldo inicial
        int opcion; // Variable para almacenar la opción del menú

        // Repetir el menú mientras la opción no sea salir
        do {
            System.out.println("\n---BIENVENIDO AL CAJERO AUTOMÁTICO---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt(); // Leer la opción

            switch (opcion) {
                case 1: {
                    System.out.println("Tu saldo actual es: " + saldo);
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el monto a depositar: ");
                    double deposito = entrada.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor que 0");
                        break;
                    }
                    saldo += deposito;
                    System.out.println("Depósito exitoso. El saldo actualizado es: " + saldo);
                    break;
                }
                case 3: {
                    System.out.println("Ingrese el monto a retirar: ");
                    double retirar = entrada.nextDouble();
                    if (retirar <= 0) {
                        System.out.println("El monto debe ser mayor que 0");
                        break;
                    }
                    if (retirar > saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo es: " + saldo);
                    } else {
                        saldo -= retirar;
                        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Gracias por usar el cajero");
                    break;
                }
                default: {
                    System.out.println("Opción no válida");
                    break;
                }
            }
        } while (opcion != 4); // Salir cuando el usuario elija la opción 4

        entrada.close(); // Cerramos el Scanner
    }
}
