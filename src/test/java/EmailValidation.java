
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailValidation{

    private String email_address;
    private boolean expectedResult;

    public EmailValidation(String email,boolean expectedResult){
        this.email_address=email;
        this.expectedResult=expectedResult;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{

                {"abc@yahoo.com",true},
                {"abc –",false},
                {"abc-100@yahoo.com",true},
                {"abc@.com.my – tld",false},
                {"abc+100@gmail.com",true}



        });


    }


    @Test
    public void testEmailValidation() {
        assertEquals(expectedResult, Registration.Email(email_address));
    }




}
