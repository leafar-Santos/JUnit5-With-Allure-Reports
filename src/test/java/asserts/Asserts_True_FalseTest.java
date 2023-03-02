package asserts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Asserts_True_FalseTest {

    @Test
    public void validarTrue(){

        boolean status = true;
        assertTrue(status);
        String texto = "valor";
        assertTrue(texto.contains("valor"));
        assertTrue(texto.endsWith("or"));
        assertTrue(texto.equals("valor"));
        assertTrue(texto.equalsIgnoreCase("Valor"));
        assertTrue(5 > 3);
    }

    @Test
    public void validarFalse(){

        boolean status = false;
        assertFalse(status);

        String texto = "Avião";
        assertFalse(texto.contains("Carro"));
        assertFalse(texto.endsWith("or"));
        assertFalse(texto.equals("moto"));
        assertFalse(texto.equalsIgnoreCase("Moto"));
        assertFalse(5 < 3);
    }

}
