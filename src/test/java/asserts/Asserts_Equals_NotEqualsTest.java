package asserts;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Asserts_Equals_NotEqualsTest {

    @Test
    public void validarIgualdade(){
        Assertions.assertEquals("azul","azul");
    }

    @Test
    public void validarNotIgualdade(){
        Assertions.assertNotEquals("azul","branco");
    }

}
