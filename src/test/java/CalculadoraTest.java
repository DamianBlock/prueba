import dominio.Calculadora;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void probarSumaEnteros() {
        // resultado esperado

        // configuracion
        double resultado = 10.0; // 5 + 5

        // ejecucion
        Calculadora calc = new Calculadora();

        // comprobacion
        Assert.assertEquals(10.0, calc.sumar(5,5),0.001);

    }

    @Test
    public void probarSumaNegativos() {
        // configuracion

        // ejecucion
        Calculadora calc = new Calculadora();
        // comprobacion

        Assert.assertEquals(-10.0, calc.sumar(5,-15),0.001);
    }

    @Test
    public void ProbarSumaDecimales() {
        // configuracion

        // ejecucion
        Calculadora calc = new Calculadora();
        // comprobacion

        Assert.assertEquals(-10.5, calc.sumar(5,-15.5),0.001);

    }
    @Test
    public void probrarResta() {

        Calculadora calc = new Calculadora();
        Assert.assertEquals(5.0, calc.restar(10,5),0.0001);

    }


}