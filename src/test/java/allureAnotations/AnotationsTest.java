package allureAnotations;


import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnotationsTest {

    @Test

    public void deveInformarOlinkDaTarefaNoJira(){
       assertThat(1, Matchers.is(1));
       assertThat("João", Matchers.is("João"));

    }

    @Test
    public void deveInormarODonoDaFeature(){
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }

    @Test

    public void deveInormarONiveldeSeveridadeNormal() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }


    @Test
    public void deveInormarONiveldeSeveridadeBLoquer() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }

    @Test
    public void deveInormarONiveldeSeveridadeCritical() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }

    @Test
    public void deveInormarONiveldeSeveridadeMinor() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }

    @Test
    public void deveInormarONiveldeSeveridadeTrivial() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }

}
