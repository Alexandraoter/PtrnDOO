public class QuesoExtra extends Decorator {
    public QuesoExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String obtenerDescripcion() {
        return super.obtenerDescripcion() + ", Queso Extra";
    }

    @Override
    public double obtenerCosto() {
        return super.obtenerCosto() + 1.50;
    }
}