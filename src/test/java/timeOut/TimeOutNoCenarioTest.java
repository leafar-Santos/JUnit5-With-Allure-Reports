package timeOut;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeOutNoCenarioTest {

    //Regra de TimeOut para todos os métodos da calsse


    @Test
    public void validarThat1(){

        assertThat("João", Matchers.is("João"));
        assertTimeout(Duration.ofMillis(2000), () -> Thread.sleep(1000));
    }

    @Test
    public void validarThat2(){

        assertThat(100, Matchers.isA(Integer.class));
    }

    @Test
    public void validarThat3(){

        assertThat(50, Matchers.is(Matchers.notNullValue()));
        assertTimeout(Duration.ofMillis(2000), () -> Thread.sleep(1000));
    }



}
