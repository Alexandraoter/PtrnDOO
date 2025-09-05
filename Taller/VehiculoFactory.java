import java.util.Arrays;
import java.util.List;

public class VehiculoFactory {

    // Factory Method centralizado (una sola clase)
    public Vehiculo crearVehiculo(TipoVehiculo tipo, String placa, double autonomia, String modelo) {
        switch (tipo) {
            case AUTO:   return new Auto(placa, autonomia, modelo);
            case VAN:    return new Van(placa, autonomia, modelo);
            case CAMION: return new Camion(placa, autonomia, modelo);
            default: throw new IllegalArgumentException("Tipo de vehículo no soportado: " + tipo);
        }
    }

    // Métodos de "plan" y "accesorios" (no son clases, solo datos)
    public String crearPlan(TipoVehiculo tipo) {
        switch (tipo) {
            case AUTO:   return "Plan Auto: Cobertura básica, kilometraje limitado.";
            case VAN:    return "Plan Van: Cobertura estándar, kilometraje extendido.";
            case CAMION: return "Plan Camión: Cobertura total, kilometraje ilimitado.";
            default: throw new IllegalArgumentException("Tipo de vehículo no soportado: " + tipo);
        }
    }

    public List<String> crearAccesorios(TipoVehiculo tipo) {
        switch (tipo) {
            case AUTO:   return Arrays.asList("GPS básico", "Cargador portátil");
            case VAN:    return Arrays.asList("GPS avanzado", "Seguro parcial", "Cargador USB");
            case CAMION: return Arrays.asList("Seguro premium", "GPS flota", "Asistencia en carretera");
            default: throw new IllegalArgumentException("Tipo de vehículo no soportado: " + tipo);
        }
    }
}
