public class CentralEmergencia {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia 15", "Jose");
        Patrulla patrulla = new Patrulla("Patrulla 13", "Mariana");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad Bomberos 06", "Antonio");

        System.out.println("===== INICIO DE OPERACIONES DE EMERGENCIA =====\n");

        System.out.println(">>> OPERACIÓN DE AMBULANCIA <<<");
        ambulancia.iniciarOperacion();
        System.out.println("\n---------------------------------------------\n");

        System.out.println(">>> OPERACIÓN DE PATRULLA <<<");
        patrulla.iniciarOperacion();
        System.out.println("\n---------------------------------------------\n");

        System.out.println(">>> OPERACIÓN DE BOMBEROS <<<");
        bomberos.iniciarOperador();  // asumo que es iniciarOperacion(), pero si tu método se llama así, todo bien
        System.out.println("\n=============================================\n");

        System.out.println("===== FIN DE OPERACIONES =====");
    }
}

