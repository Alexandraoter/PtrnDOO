package JuegoconArmas;
import java.util.Random;

abstract class Personaje {

    protected String nombre;
    protected int puntosDeVida;
    protected I_Arma arma; 
    
    

    
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.arma = new ArmaBase(); 
    }

    
    abstract void atacar(Personaje oponente);

    
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

   
    public String getNombre() {
        return this.nombre;
    }

    
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public I_Arma getArma() {
        return this.arma;
    }
}