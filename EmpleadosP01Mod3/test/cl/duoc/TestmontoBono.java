package cl.duoc;

import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestmontoBono {
 @Test
    public void TestmontoBono() {
        System.out.println("montoBono");
        String rut = "1-9";
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Buscar(rut).montoBono()==500000);
    }    
}
