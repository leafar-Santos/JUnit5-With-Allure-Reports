package tags;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

@Tag("Class-Tag")
public class TagsClasseTest {

    String[]cars = {"Volvo","BMW","Ford","Mazda"};
    String[]cars1 = {"Volvo","BMW","Ford","Mazda"};

    @Test
    public void validarArray(){
        Assertions.assertEquals(Arrays.stream(cars).toList(), Arrays.stream(cars1).toList());
    }

    @Test
    public void assertAllTestes(){
        assertAll(
                () -> assertEquals("Teste", "Teste"),
                () -> assertFalse(10 >15),
                () -> assertTrue(5 > 2)
        );
    }

    @Test
    public void umTeste(){

    }

    @Test
    public void outroTeste(){

    }

}
