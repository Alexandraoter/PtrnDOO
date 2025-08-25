public class Main {
    public static void main(String[] args) {
        // Inventario usando Factory Method
        VehiculoFactory autoFactory = new AutoFactory();
        VehiculoFactory vanFactory = new VanFactory();
        
        Inventario inventario = new Inventario(5);
        inventario.agregarVehiculo(autoFactory.crearVehiculo("ABC123", 300, "Toyota Yaris"));
        inventario.agregarVehiculo(vanFactory.crearVehiculo("XYZ789", 500, "Mercedes Vito"));
        
        inventario.mostrarInventario();
        inventario.ordenarPorAutonomia();
        System.out.println("\nInventario ordenado por autonomía:");
        inventario.mostrarInventario();

        // Contratos usando Abstract Factory
        ContratoFactory particularFactory = new ContratoParticularFactory();
        Contrato contratoParticular = new Contrato("Juan Pérez", inventario.buscarPorPlaca("ABC123"), particularFactory);
        contratoParticular.mostrarContrato();

        System.out.println("--------------");

        ContratoFactory empresarialFactory = new ContratoEmpresarialFactory();
        Contrato contratoEmpresarial = new Contrato("Empresa XYZ", inventario.buscarPorPlaca("XYZ789"), empresarialFactory);
        contratoEmpresarial.mostrarContrato();
    }
}
