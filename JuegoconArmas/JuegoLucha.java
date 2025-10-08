package JuegoconArmas;
public class JuegoLucha {

    private Personaje jugador1;
    private Personaje jugador2;

    // Constructor para inicializar los personajes
    public JuegoLucha(String nombre1, String nombre2) {
        this.jugador1 = new Lulo(nombre1);
        this.jugador2 = new Lulito(nombre2);
    }

    // Metodo para iniciar la pelea
    public void iniciarPelea() {
        System.out.println("--- INICIO DE LA PELEA ---");
        System.out.println(jugador1.getNombre() + " (Vida: " + jugador1.getPuntosDeVida() + ") vs " + 
                           jugador2.getNombre() + " (Vida: " + jugador2.getPuntosDeVida() + ")");
        System.out.println(jugador1.getNombre() + " usa el arma: " + jugador1.getArma().mostrarDetalles());
        System.out.println(jugador2.getNombre() + " usa el arma: " + jugador2.getArma().mostrarDetalles());
        System.out.println("--------------------------");
        
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        // Mostrar el resultado de la pelea
        if (jugador1.estaVivo()) {
            System.out.println("--------------------------");
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println("--------------------------");
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    // Metodo que representa un turno de ataque
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("\n*** Turno de " + atacante.getNombre() + ". Vida de " + defensor.getNombre() + ": "
                + defensor.getPuntosDeVida() + " ***");
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }
    
    // Método principal para probar
    public static void main(String[] args) {
        JuegoLucha juego = new JuegoLucha("Goku", "Vegeta");
        juego.iniciarPelea();
    }
}