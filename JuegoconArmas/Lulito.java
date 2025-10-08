package JuegoconArmas;
import java.util.Random;

public class Lulito extends Personaje {

    public Lulito(String nombre) {
        super(nombre);
        this.puntosDeVida = 80;
        
        // **IMPLEMENTACIÓN DECORATOR:**
        // 1. Arma base: Cuchillo
        I_Arma cuchilloBase = new ArmaBase("Cuchillo", 5);
        // 2. Decoramos con MejoraDano (+5)
        I_Arma cuchilloMejorado = new MejoraDano(cuchilloBase, 5); // Daño final: 10
        // No se usa Composite en Lulito por simplicidad, solo ataques simples.
        this.arma = cuchilloMejorado;
    }

    // Metodo para realizar un ataque a otro personaje
    public void atacar(Personaje oponente) {
        String ataqueNombre = "";
        int dano = 0;
        Random rand = new Random();
        int op = rand.nextInt(4); // Opciones 0 a 3
        
        switch(op){
            case 0: dano = 10; ataqueNombre = "Puño"; break;
            case 1: dano = 20; ataqueNombre = "Patada"; break;
            case 2: dano = 50; ataqueNombre = "Cabeza"; break;
            case 3: // Arma Decorada (Decorator)
                dano = arma.getAfectacion();
                ataqueNombre = arma.mostrarDetalles();
                break;
            default: dano = 5; ataqueNombre = "Error"; break;
        }

        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + 
                           " causando " + dano + " puntos de daño con " + ataqueNombre);
    }
}