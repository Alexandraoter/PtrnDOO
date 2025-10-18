package JuegoconArmas;
public class ArmaBase implements I_Arma {
    
    private String nombre;
    private int afectacion;
    
    public ArmaBase(String nombre, int afectacion) {
        this.nombre = nombre;
        this.afectacion = afectacion;
    }

    public ArmaBase(){
        this.nombre = "Mano Desnuda";
        this.afectacion = 1;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getAfectacion() {
        return afectacion;
    }
    
    @Override
    public String mostrarDetalles() {
        return getNombre() + " (Daño Base: " + getAfectacion() + ")";
    }
}