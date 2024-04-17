package fails;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class Fails_Asserts {

    @Test
    public void deveFalhar01(){
        assertThat(1,Matchers.is(2));
    }

    @Test
    public void deveFalhar02(){
        assertThat(1,Matchers.is(5));
    }

    @Test
    public void deveFalhar03(){
        assertThat(1,Matchers.is(4));
    }

    @Test
    public void deveFalhar04(){
        assertThat(1,Matchers.is(4));
    }

    @Test
    public void deveFalhar05(){
        assertThat(1,Matchers.is(6));
    }
}
