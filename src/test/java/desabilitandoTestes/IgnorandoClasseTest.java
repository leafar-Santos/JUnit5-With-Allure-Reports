package desabilitandoTestes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled(value = "Quando o @Disabled é colocado na classe,  todos os métodos dela são ignorados")
public class IgnorandoClasseTest {

    @Test
    public void validar1(){
        Assertions.assertEquals("João", "João");
    }

    @Test
    public void validar2(){
        Assertions.assertEquals("João", "João");
    }

    @Test
    public void validar33(){
        Assertions.assertEquals("João", "João");
    }

}
