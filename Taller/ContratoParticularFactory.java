import java.util.Arrays;
import java.util.List;

public class ContratoParticularFactory extends ContratoFactory {
    @Override
    public Plan crearPlan() {
        return new PlanParticular();
    }

    @Override
    public List<Accesorio> crearAccesorios() {
        return Arrays.asList(new AccesorioParticular());
    }
}

