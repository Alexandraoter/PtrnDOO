//decorador abstracto
package JuegoconArmas;
abstract class DecoradorArma implements I_Arma {
    protected I_Arma armaDecorada;

    public DecoradorArma(I_Arma armaDecorada) {
        this.armaDecorada = armaDecorada;
    }

    // Delega la ejecución a la arma envuelta por defecto
    @Override
    public String getNombre() {
        return armaDecorada.getNombre();
    }

    @Override
    public int getAfectacion() {
        return armaDecorada.getAfectacion();
    }
    
    @Override
    public String mostrarDetalles() {
        return armaDecorada.mostrarDetalles();
    }
}