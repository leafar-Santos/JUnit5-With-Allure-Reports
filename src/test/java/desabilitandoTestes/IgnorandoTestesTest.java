package desabilitandoTestes;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class IgnorandoTestesTest {
    @Test
    @Disabled
    public void validar1(){
        Assertions.assertEquals("João", "João");
    }

    @Test
    public void validar2(){
        assertThat("João", Matchers.is("João"));
    }

    @Test
    @Disabled
    public void validar3(){
        assertThat(true, Matchers.is(true));
    }

}
