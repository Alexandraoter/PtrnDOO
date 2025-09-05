public abstract class Vehiculo {
    protected String placa;
    protected double autonomia;
    protected String modelo;

    public Vehiculo(String placa, double autonomia, String modelo) {
        this.placa = placa;
        this.autonomia = autonomia;
        this.modelo = modelo;
    }

    public String getPlaca() { return placa; }
    public double getAutonomia() { return autonomia; }
    public String getModelo() { return modelo; }

    public abstract void mostrarInfo();
}
