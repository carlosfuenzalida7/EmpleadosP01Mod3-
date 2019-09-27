package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestBuscar {

    @Test
    public void TestBuscar() {
        System.out.println("Buscar");
        String rut = "1-9";
        BussEmpleado instance = new BussEmpleado();
        String rut2 = instance.Buscar(rut).getRut();
        Assert.assertEquals(rut, rut2);
    }
}
