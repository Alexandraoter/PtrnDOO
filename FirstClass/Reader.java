public class Reader{

   
    private Converter converter;

    public Reader(String element, Converter converter){
        this.converter = converter;
    }

    public void parseInput(String element ){
        switch (element){
            case "LINEA":
                converter.makeLine();
                break;

            case "PARRAFO":
                converter.makeParagraph();
                break;

            case "TABLA":
                converter.makeTable();
                break;
            default:
                break;

        }
}
}
