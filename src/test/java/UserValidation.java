import org.junit.Test;

import static org.junit.Assert.*;

public class UserValidation {
    @Test
    public void HappyTestCase(){
        assertTrue(Registration.FirstName("Dhanu"));
        assertTrue(Registration.LastName("Pri"));
        assertTrue(Registration.Email("dhanupri@gmail.com"));
        assertTrue(Registration.Mobile_number("91 6292039687"));
        assertTrue(Registration.Password("Qwertyu1@ojgf"));

    }

    @Test
    public void SadTestCase(){
        assertFalse(Registration.FirstName("deepak"));
        assertFalse(Registration.LastName("kumar"));
        assertFalse(Registration.Email("deepak()*@gmail.aa.au-"));
        assertFalse(Registration.Mobile_number("012-345-6789"));
        assertFalse(Registration.Password("deepakkumari"));

    }
}
