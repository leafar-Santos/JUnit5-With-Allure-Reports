package RepetirTeste;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class RepeticaoTest {

        @RepeatedTest(value = 3, name = "Repetindo Teste: {currentRepetition}/{totalRepetitions}")
        public void validar1() {
            Assertions.assertEquals("João", "João");
        }


        @RepeatedTest(value = 5,  name = "Repetindo Teste: {currentRepetition}/{totalRepetitions}")
        public void validar2() {
            assertThat("João", Matchers.is("João"));
        }


        @RepeatedTest(value = 5,  name = "Repetindo Teste: {currentRepetition}/{totalRepetitions}")
        public void validar3() {
            assertThat(true, Matchers.is(true));
        }
}
