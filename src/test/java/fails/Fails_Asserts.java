package fails;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class Fails_Asserts {

    @Test
    public void validarThatFaill(){
        assertThat("João", Matchers.is("Rafael"));
        assertThat(100, Matchers.is(Matchers.isA(String.class)));
        assertThat(50, Matchers.is(Matchers.nullValue()));
        assertThat(50, Matchers.greaterThan(400));
        assertThat(50, Matchers.lessThan(40));

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,7);
        assertThat(numeros, Matchers.hasItem(10));
        assertThat(numeros, Matchers.hasItems(1,50));
        assertThat(numeros, Matchers.hasSize(9));

        assertThat("João",Matchers.is(Matchers.not("João")));
        assertThat("João", Matchers.is("Rafael"));
        assertThat("João", Matchers.is("Rafael"));

        //Verifica se é um dos dois valores
        assertThat("João", Matchers.anyOf(Matchers.is("Rafael"), Matchers.is("Marcos")));

    }

    @Test
    public void validarThatFaill2(){
        assertThat("João", Matchers.is("Rafael"));
        assertThat(100, Matchers.is(Matchers.isA(String.class)));
        assertThat(50, Matchers.is(Matchers.nullValue()));
        assertThat(50, Matchers.greaterThan(400));
        assertThat(50, Matchers.lessThan(40));

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,7);
        assertThat(numeros, Matchers.hasItem(10));
        assertThat(numeros, Matchers.hasItems(1,50));
        assertThat(numeros, Matchers.hasSize(9));

        assertThat("João",Matchers.is(Matchers.not("João")));
        assertThat("João", Matchers.is("Rafael"));
        assertThat("João", Matchers.is("Rafael"));

        //Verifica se é um dos dois valores
        assertThat("João", Matchers.anyOf(Matchers.is("Rafael"), Matchers.is("Marcos")));

    }

}
