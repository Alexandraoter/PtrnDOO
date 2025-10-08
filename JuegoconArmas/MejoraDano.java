//Decorador Concreto 1
package JuegoconArmas;
public class MejoraDano extends DecoradorArma {
    private int aumentoDano;

    public MejoraDano(I_Arma armaDecorada, int aumento) {
        super(armaDecorada);
        this.aumentoDano = aumento;
    }

    @Override
    public int getAfectacion() {
        // Añade el aumento al daño base o previamente decorado
        return super.getAfectacion() + aumentoDano;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + " | Mejora de Daño (+" + aumentoDano + ")";
    }
}