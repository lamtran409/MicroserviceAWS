import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldExampleTest {
    @Test
    public void testHelloConcat(){
        Assert.assertEquals("Hello Lam", HelloWorldExample.helloConcat("Lam"));
    }
}