package tags;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TagsMetodosTest {

    String[]cars = {"Volvo","BMW","Ford","Mazda"};
    String[]cars1 = {"Volvo","BMW","Ford","Mazda"};

    @Test
    @Tag("Dev")
    public void validarArray(){
        Assertions.assertEquals(Arrays.stream(cars).toList(), Arrays.stream(cars1).toList());
    }

    @Test
    @Tag("Prod")
    public void assertAllTestes(){
        assertAll(
                () -> assertEquals("Teste", "Teste"),
                () -> assertFalse(10 >15),
                () -> assertTrue(5 > 2)
        );
    }

    @Test
    @Tag("Stg")
    public void umTeste(){

    }

    @Test
    @Tag("Pre-prod")
    public void outroTeste(){

    }

}
