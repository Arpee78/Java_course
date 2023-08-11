//package introjunit;
//
//import org.junit.Test;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertThat;
//
//public class GentlemanTest {
//
//    @Test
//    public void testSayHello() {
//        //given
//        Gentleman gentleman = new Gentleman();
//
//        //when
//        String hello = gentleman.sayHello("John Doe");
//
//        //then
//        assertThat(hello, equalTo("Hello John Doe"));
//
//    }
//
//    @Test
//    public void testSayHello2(){
//        assertThat(new Gentleman().sayHello("John Doe"),equalTo("Hello John Doe"));
//    }
//
//    @Test
//    public void testSayHelloWithNull() {
//        assertThat(new Gentleman().sayHello(null), equalTo("Hello Anonymous"));
//    }
//
//}
