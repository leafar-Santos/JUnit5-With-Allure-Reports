package allureAnotations;

import io.qameta.allure.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnotationsTest {

    @Test
    @Link(name = "História para automação", url="https://www.google.com.br",type = "Jira")
    public void deveInformarOlinkDaTarefaNoJira(){
       assertThat(1, Matchers.is(1));
       assertThat("João", Matchers.is("João"));

    }

    @Test
    @Owner("Tribo-QA")
    public void deveInormarODonoDaFeature(){
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void deveInormarONiveldeSeveridadeNormal() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }


    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void deveInormarONiveldeSeveridadeBLoquer() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void deveInormarONiveldeSeveridadeCritical() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    public void deveInormarONiveldeSeveridadeMinor() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void deveInormarONiveldeSeveridadeTrivial() {
        assertThat(1, Matchers.is(1));
        assertThat("João", Matchers.is("João"));
    }


}
