package stringbasic.university;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCreate(){
        Person person = new Person("Nagy József", "jozsef@gmail.com","123456","123-456-789","36456789");
        assertEquals("Nagy József", person.getName());
        assertEquals("jozsef@gmail.com", person.getEmail());
        assertEquals("123456", person.getSsn());
        assertEquals("123-456-789", person.getAccountNumber());
        assertEquals("36456789", person.getPhoneNumber());
    }

}