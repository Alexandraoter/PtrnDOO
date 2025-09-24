public class PizzaBase implements Pizza {
    @Override
    public String obtenerDescripcion() {
        return "Pizza base";
    }

    @Override
    public double obtenerCosto() {
        return 5.0; // Costo base de la pizza
    }
    
}
