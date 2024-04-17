package asserts;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class Asserts_ThatTest {

    @Test
    public void validarThat(){

        assertThat("João", Matchers.is("João"));
        assertThat(100, Matchers.is(Matchers.isA(Number.class)));
        assertThat(50, Matchers.is(Matchers.notNullValue()));
        assertThat(50, Matchers.greaterThan(40));
        assertThat(50, Matchers.lessThan(100));

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        assertThat(numeros, Matchers.hasItem(1));
        assertThat(numeros, Matchers.hasItems(1,5));
        assertThat(numeros, Matchers.hasSize(5));

        assertThat("João",Matchers.is(Matchers.not("Maria")));
        assertThat("João", Matchers.is("João"));
        assertThat("João", Matchers.is("João"));

        //Verifica se é um dos dois valores
        assertThat("João", Matchers.anyOf(Matchers.is("João"), Matchers.is("Marcos")));

    }

    @Test
    @Ignore
    public void verificaSeUmIgualUm(){
        assertThat(1,Matchers.is(2));
    }

}
