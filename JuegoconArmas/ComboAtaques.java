package JuegoconArmas;
import java.util.ArrayList;
import java.util.List;


public class ComboAtaques implements I_Ataque {
    private String nombre;
    private List<I_Ataque> ataques = new ArrayList<>();

    public ComboAtaques(String nombre) {
        this.nombre = nombre;
    }

    public void addAtaque(I_Ataque ataque) {
        ataques.add(ataque);
    }

    @Override
    public int getDano() {
        // Suma el daño de todos los ataques en el combo
        return ataques.stream().mapToInt(I_Ataque::getDano).sum();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void ejecutar(Personaje atacante, Personaje defensor) {
        System.out.println("--- ¡" + atacante.getNombre() + " ejecuta el COMBO: " + getNombre() + "! ---");
        for (I_Ataque ataque : ataques) {
            ataque.ejecutar(atacante, defensor); // Ejecuta cada ataque de la lista
        }
        System.out.println("Combo finalizado, daño total potencial: " + getDano());
    }
}