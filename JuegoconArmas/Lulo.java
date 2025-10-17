package JuegoconArmas;
import java.util.Random;

public class Lulo extends Personaje {

    private I_Ataque comboEspecial; //Cmposite

    public Lulo(String nombre) {
        super(nombre);
        this.puntosDeVida = 120;
        
        
        
        I_Arma armaBase = new ArmaBase("Pistola", 10);
        I_Arma armaMejorada = new MejoraDano(armaBase, 15); // Daño final: 25

        this.arma = new EfectoCritico(armaMejorada);

    
        comboEspecial = new ComboAtaques("Rayo de Trueno");
        ((ComboAtaques)comboEspecial).addAtaque(new AtaqueSimple("Puño Eléctrico", 50));
        ((ComboAtaques)comboEspecial).addAtaque(new AtaqueSimple("Patada de Trueno", 20));
    }

    
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int op = rand.nextInt(5); // Opciones 0 a 4
        
        int dano = 0;
        String ataqueNombre = "";

        switch(op){
            case 0: // Combo (Composite)
                comboEspecial.ejecutar(this, oponente);
                return; 
            case 1: dano = 50; ataqueNombre = "Puño"; break;
            case 2: dano = 20; ataqueNombre = "Patada"; break;
            case 3: dano = 10; ataqueNombre = "Cabeza"; break;
            case 4: // Arma Decorada (Decorator)
                dano = arma.getAfectacion();
                ataqueNombre = arma.mostrarDetalles();
                break;
            default: dano = 5; ataqueNombre = "Error"; break;
        }
        
        // Solo ejecuta si no fue el Combo
        if (op != 0) {
            oponente.recibirDano(dano);
            System.out.println(this.nombre + " ataca a " + oponente.getNombre() + 
                               " causando " + dano + " puntos de daño con " + ataqueNombre);
        }
    }
}
