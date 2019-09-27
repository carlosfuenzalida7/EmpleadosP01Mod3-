package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut = "1-9";
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(rut);
        Assert.assertEquals(esperado, obtenido);
    }
}
