package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestCrear {

    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado empleado = new Empleado("1-9", "Pepito", 27, 6);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido = instance.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
