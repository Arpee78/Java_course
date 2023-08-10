package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void testSayHello(){
        Gentleman gentleman = new Gentleman();
        String hello = gentleman.sayHello("John Doe");
        assertEquals("Hello John Doe", hello);
    }

    @Test
    void testSayHelloNull(){
        Gentleman gentleman = new Gentleman();
        String hello = gentleman.sayHello(null);
        assertEquals("Hello Anonymous", hello);
    }
}
