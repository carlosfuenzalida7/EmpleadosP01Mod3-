package cl.duoc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            TestCrear.class,
            TestModificar.class,
            TestBuscar.class,
            TestmontoBono.class,
            TestEliminar.class
        }
)
public class TestAll {
    
}
