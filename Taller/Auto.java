public class Auto extends Vehiculo {
    public Auto(String placa, double autonomia, String modelo) {
        super(placa, autonomia, modelo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto - Placa: " + placa + ", Autonomía: " + autonomia + " km, Modelo: " + modelo);
    }
}
