package assertAll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertAllTest {

    @Test
    public void assertAllTestes(){
        assertAll(
                () -> assertEquals("Teste", "Teste"),
                () -> assertFalse(10 >15),
                () -> assertTrue(5 > 2)
        );
    }
}
