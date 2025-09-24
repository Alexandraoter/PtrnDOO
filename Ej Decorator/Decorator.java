public abstract class Decorator implements Pizza {
    protected Pizza pizzaDecorada;

    public Decorator(Pizza pizzaDecorada) {
        this.pizzaDecorada = pizzaDecorada;
    }

    @Override
    public String obtenerDescripcion() {
        return pizzaDecorada.obtenerDescripcion();
    }

    @Override
    public double obtenerCosto() {
        return pizzaDecorada.obtenerCosto();
    }
    
}
