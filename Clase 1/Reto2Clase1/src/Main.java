public class Main {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto", 100.0);
        Entrada entrada2 = new Entrada("Obra de teatro", 50.0);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        // Reto adicional
        Entrada_Record entrada3 = new Entrada_Record("Sinfonia", 150.0);
        entrada3.mostrarInformacion();
    }
}
