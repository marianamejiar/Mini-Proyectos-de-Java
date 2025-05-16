//Importamos el paquete java.util
//Class Scanner: Nos oermite leer datos ingresados por el usuario

import java.util.Scanner;

public class Farmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitamos datos al usuario
        System.out.println("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.println("Precio Unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Cantidad de piezas: ");
        int piezas = scanner.nextInt();

        //Calculamos el total
        double totalSinDescuento = precioUnitario * piezas;

        //Evaluamos si aplica descuento
        var aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        //Total a pagar
        double totalConDescuento = totalSinDescuento - descuento;

        //Mostrar resumen
        System.out.println("\nRESUMEN DE COMPRA");
        System.out.println("Nombre del medicamento: " + medicamento);
        System.out.println("Precio Unitario: " + precioUnitario);
        System.out.println("Cantidad de piezas: " + piezas);
        System.out.println("Total Sin Descuento: " + totalSinDescuento);
        System.out.println("¿Aplica Descuento? " + aplicaDescuento);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalConDescuento);

        scanner.close();
    }
}