//decorador concreto 2
package JuegoconArmas;
public class EfectoCritico extends DecoradorArma {
    
    public EfectoCritico(I_Arma armaDecorada) {
        super(armaDecorada);
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + " | ¡Añade Chance de CRÍTICO! ⭐";
    }
    
    
}