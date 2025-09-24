import java.util.ArrayList;
import java.util.List;

public class Directorio implements ComponenteArchivo {
    private String nombre;
    private List<ComponenteArchivo> componentes;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    public void agregar(ComponenteArchivo componente) {
        componentes.add(componente);
    }

    public void eliminar(ComponenteArchivo componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Directorio: " + nombre);
        for (ComponenteArchivo componente : componentes) {
            componente.mostrarNombre(); // 🔄 Llamada recursiva
        }
    }
}