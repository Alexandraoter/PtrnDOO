public class EjecutarBuilder {
    public static void main(String[] args) {
        Converter objC1 = new ASCIIConverter();
        Converter objC2= new PostScriptConverter();
        Converter objC3 = new PDFConverter();

        Reader objReader1 = new Reader(objC1);
        Reader objReader2 = new Reader(objC3);

        Reader objReader3 = new Reader(objC2);
        Reader objReader4 = new Reader(objC3);

        objReader1.parseInput("LINEA"); //Linea con ASCII
        objReader2.parseInput("LINEA"); //Lines con PDF
        objReader3.parseInput("PARRAFO"); //Linea con postScript
        objReader4.parseInput("TABLA"); // Linea con PDF
    
     }
}