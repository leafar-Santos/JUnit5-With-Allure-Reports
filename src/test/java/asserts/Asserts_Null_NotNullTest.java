package asserts;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Asserts_Null_NotNullTest {

    @Test
    public void validarNull(){

    String valor = null;
    Assertions.assertNull(valor);

    }

    @Test
    public void validarNotNull(){

        String valor = "rafael";
        Assertions.assertNotNull(valor);

    }
}
