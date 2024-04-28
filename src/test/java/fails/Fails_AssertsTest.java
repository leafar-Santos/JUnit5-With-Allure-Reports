package fails;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;


public class Fails_AssertsTest {


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

    @Test
    public void deveFalhar06(){
        assertThat(1,Matchers.is(7));
    }

    @Test
    public void deveFalhar07(){
        assertThat(1,Matchers.is(2));
    }

    @Test
    public void deveFalhar8(){
        assertThat(1,Matchers.is(5));
    }

    @Test
    public void deveFalhar9(){
        assertThat(1,Matchers.is(4));
    }

    @Test
    public void deveFalhar10(){
        assertThat(1,Matchers.is(4));
    }

    @Test
    public void deveFalhar11(){
        assertThat(1,Matchers.is(6));
    }

    @Test
    public void deveFalhar12(){
        assertThat(1,Matchers.is(7));
    }

    





}
