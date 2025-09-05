public class Camion extends Vehiculo {
    public Camion(String placa, double autonomia, String modelo) {
        super(placa, autonomia, modelo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Camión - Placa: " + placa + ", Autonomía: " + autonomia + " km, Modelo: " + modelo);
    }
}
