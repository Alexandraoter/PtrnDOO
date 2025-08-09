public class EjecutarBuilder {
    public static void main(String[] args) {
        Converter objC1 = new ASCIIConverter();
        Converter objC2= new PostScriptConverter();
        Converter objC3 = new PDFConverter();

        Reader objReader1 = new Reader("Linea", objC1);
        Reader objReader2= new Reader("Linea", objC3);

        Reader objReader3 = new Reader("Linea", objC2);
        Reader objReader4 = new Reader("Linea", objC3);

        objReader1.parseInput(); //Linea con ASCII
        objReader2.parseInput(); //Lines con PDF
        objReader3.parseInput(); //Linea con postScript
        objReader4.parseInput(); // Linea con PDF
    
     }
}