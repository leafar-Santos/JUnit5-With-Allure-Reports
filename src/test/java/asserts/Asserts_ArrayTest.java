package asserts;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Asserts_ArrayTest {

    String[]cars = {"Volvo","BMW","Ford","Mazda"};
    String[]cars1 = {"Volvo","BMW","Ford","Mazda"};

    @Test
    public void validarArray(){
        Assertions.assertEquals(Arrays.stream(cars).toList(), Arrays.stream(cars1).toList());
    }

}
