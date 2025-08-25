public class CamionFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo(String placa, double autonomia, String modelo) {
        return new Camion(placa, autonomia, modelo);
    }
}