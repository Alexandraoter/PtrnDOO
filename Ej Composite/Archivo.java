public class Archivo implements ComponenteArchivo {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Archivo: " + nombre);
    }
}