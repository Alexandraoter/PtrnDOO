public class Van extends Vehiculo {
    public Van(String placa, double autonomia, String modelo) {
        super(placa, autonomia, modelo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Van  - Placa: " + placa + ", Autonomía: " + autonomia + " km, Modelo: " + modelo);
    }
}
