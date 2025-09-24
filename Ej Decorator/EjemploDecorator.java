public class EjemploDecorator {
    public static void main(String[] args) {
        // 1. Crear la pizza base
        Pizza miPizza = new PizzaBase();
        System.out.println("Descripción: " + miPizza.obtenerDescripcion());
        System.out.println("Costo: $" + miPizza.obtenerCosto());
        

        // 2. Añadir queso extra a la pizza base
        miPizza = new QuesoExtra(miPizza);
        System.out.println("Descripción: " + miPizza.obtenerDescripcion());
        System.out.println("Costo: $" + miPizza.obtenerCosto());
        

        // 3. Añadir pollo a la pizza con queso extra
        miPizza = new Pollo(miPizza);
        System.out.println("Descripción: " + miPizza.obtenerDescripcion());
        System.out.println("Costo: $" + miPizza.obtenerCosto());
        

        // 4. Crear otra pizza diferente con solo pollo
        Pizza otraPizza = new PizzaBase();
        otraPizza = new Pollo(otraPizza);
        System.out.println("Descripción: " + otraPizza.obtenerDescripcion());
        System.out.println("Costo: $" + otraPizza.obtenerCosto());
    }
}