import java.util.List;

public class Contrato {
    private String cliente;
    private Vehiculo vehiculo;
    private String plan;
    private List<String> accesorios;

    public Contrato(String cliente,
                    VehiculoFactory factory,
                    TipoVehiculo tipo,
                    String placa,
                    double autonomia,
                    String modelo) {

        this.cliente = cliente;
        this.vehiculo = factory.crearVehiculo(tipo, placa, autonomia, modelo);
        this.plan = factory.crearPlan(tipo);
        this.accesorios = factory.crearAccesorios(tipo);
    }

    public void mostrarContrato() {
        System.out.println("Contrato para cliente: " + cliente);
        vehiculo.mostrarInfo();
        System.out.println("Plan: " + plan);
        System.out.println("Accesorios:");
        for (String a : accesorios) System.out.println("- " + a);
    }
}

