public class Reader{

    private String element;
    private Converter converter;

    public Reader(String element, Converter converter){
        this.element = element;
        this.converter = converter;
    }

    public void parseInput(){
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
