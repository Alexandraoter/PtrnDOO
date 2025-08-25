// ContratoEmpresarialFactory.java
import java.util.Arrays;
import java.util.List;

public class ContratoEmpresarialFactory extends ContratoFactory {
    @Override
    public Plan crearPlan() {
        return new PlanEmpresarial();
    }

    @Override
    public List<Accesorio> crearAccesorios() {
        return Arrays.asList(new AccesorioEmpresarial());
    }
}
