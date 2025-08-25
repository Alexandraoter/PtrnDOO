public class AutoFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo(String placa, double autonomia, String modelo) {
        return new Auto(placa, autonomia, modelo);
    }
}