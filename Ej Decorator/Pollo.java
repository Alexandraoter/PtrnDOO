public class Pollo extends Decorator {
    public Pollo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + ", Pepperoni";
    }

    @Override
    public double obtenerCosto() {
        return super.obtenerCosto() + 2.00;
    }
}