public class Main {
    public static void main(String[] args) {
        VehiculoFactory factory = new VehiculoFactory();

        // Inventario (array fijo) + creación mediante un único Factory Method
        Inventario inventario = new Inventario(5);

        Vehiculo v1 = factory.crearVehiculo(TipoVehiculo.AUTO, "ABC123", 350, "Toyota Corolla");
        Vehiculo v2 = factory.crearVehiculo(TipoVehiculo.VAN, "XYZ789", 520, "Mercedes Vito");
        Vehiculo v3 = factory.crearVehiculo(TipoVehiculo.CAMION, "JKL456", 700, "Isuzu NKR");

        inventario.agregarVehiculo(v1);
        inventario.agregarVehiculo(v2);
        inventario.agregarVehiculo(v3);

        System.out.println("=== Inventario inicial ===");
        inventario.mostrarInventario();

        inventario.ordenarPorAutonomia();
        System.out.println("\n=== Inventario ordenado por autonomía ===");
        inventario.mostrarInventario();

        // Contratos usando los métodos de plan y accesorios (sin clases extra)
        System.out.println("\n=== Contratos ===");
        Contrato c1 = new Contrato("Juan Pérez", factory, TipoVehiculo.AUTO, "ABC123", 350, "Toyota Corolla");
        c1.mostrarContrato();

        System.out.println("----------------------------");
        Contrato c2 = new Contrato("Empresa XYZ", factory, TipoVehiculo.VAN, "XYZ789", 520, "Mercedes Vito");
        c2.mostrarContrato();
    }
}
