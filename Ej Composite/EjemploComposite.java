public class EjemploComposite {
    public static void main(String[] args) {
        //directorio principal
        Directorio directorioRaiz = new Directorio("Carpeta Principal");

        //archivos
        Archivo archivo1 = new Archivo("documento.txt");
        Archivo archivo2 = new Archivo("imagen.jpg");

        // Agregar archivos al directorio principal
        directorioRaiz.agregar(archivo1);
        directorioRaiz.agregar(archivo2);

        // Crear un subdirectorio
        Directorio subDirectorio = new Directorio("Sub Carpeta");

        // Crear un archivo para el subdirectorio
        Archivo archivo3 = new Archivo("presentacion.pptx");
        subDirectorio.agregar(archivo3);

        // Agregar el subdirectorio al directorio principal
        directorioRaiz.agregar(subDirectorio);

        // Mostrar toda la estructura
        directorioRaiz.mostrarNombre();
    }
}