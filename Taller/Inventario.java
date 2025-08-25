import java.util.Arrays;

public class Inventario {
    private Vehiculo[] vehiculos;
    private int contador;

    public Inventario(int capacidad) {
        vehiculos = new Vehiculo[capacidad];
        contador = 0;
    }

    public void agregarVehiculo(Vehiculo v) {
        if (contador < vehiculos.length) {
            vehiculos[contador++] = v;
        } else {
            System.out.println("Inventario lleno, no se puede agregar más vehículos.");
        }
    }

    public Vehiculo buscarPorPlaca(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v != null && v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    public void ordenarPorAutonomia() {
        Arrays.sort(vehiculos, 0, contador, (v1, v2) -> Double.compare(v1.getAutonomia(), v2.getAutonomia()));
    }

    public void mostrarInventario() {
        for (int i = 0; i < contador; i++) {
            vehiculos[i].mostrarInfo();
        }
    }
}
