// Contrato.java
import java.util.List;

public class Contrato {
    private String cliente;
    private Vehiculo vehiculo;
    private Plan plan;
    private List<Accesorio> accesorios;

    public Contrato(String cliente, Vehiculo vehiculo, ContratoFactory factory) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.plan = factory.crearPlan();
        this.accesorios = factory.crearAccesorios();
    }

    public void mostrarContrato() {
        System.out.println("Contrato para cliente: " + cliente);
        vehiculo.mostrarInfo();
        System.out.println("Plan: " + plan.getDescripcion());
        System.out.println("Accesorios incluidos:");
        for (Accesorio a : accesorios) {
            System.out.println("- " + a.getNombre());
        }
    }
}
