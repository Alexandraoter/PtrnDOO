public class VanFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo(String placa, double autonomia, String modelo) {
        return new Van(placa, autonomia, modelo);
    }
}