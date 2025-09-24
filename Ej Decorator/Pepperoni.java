public class Pollo extends DecoradorPi {
    public Pepperoni(Pizza pizza) {
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