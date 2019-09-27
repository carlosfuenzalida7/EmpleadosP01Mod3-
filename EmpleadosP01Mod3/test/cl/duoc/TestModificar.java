package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        Empleado empleado=new Empleado();
        empleado = new Empleado("1-9", "Pepito", 40, 10);
        boolean obtenido = instance.Modificar(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
