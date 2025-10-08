package JuegoconArmas;
public class AtaqueSimple implements I_Ataque {
    private String nombre;
    private int dano;

    public AtaqueSimple(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    @Override
    public int getDano() {
        return dano;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void ejecutar(Personaje atacante, Personaje defensor) {
        defensor.recibirDano(dano);
        System.out.println(atacante.getNombre() + " ejecuta " + getNombre() + 
                           " causando " + getDano() + " puntos de daño.");
    }
}