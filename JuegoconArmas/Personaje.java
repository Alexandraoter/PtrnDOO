package JuegoconArmas;
import java.util.Random;

abstract class Personaje {

    protected String nombre;
    protected int puntosDeVida;
    protected I_Arma arma; // Usa la interfaz I_Arma (Decorator)
    
    // (Opcional: puedes añadir una lista de I_Ataque aquí si todos los personajes tienen un conjunto fijo)

    // Constructor para inicializar los datos del personaje
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.arma = new ArmaBase(); // Inicializa con un ArmaBase por defecto
    }

    // Metodo para realizar un ataque a otro personaje
    abstract void atacar(Personaje oponente);

    // Metodo para recibir dano
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    // Verifica si el personaje sigue vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
        return this.nombre;
    }

    // Devuelve los puntos de vida actuales
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public I_Arma getArma() {
        return this.arma;
    }
}