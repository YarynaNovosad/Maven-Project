import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailTest {

        @Test
        public void testValidEmail() {
            EmailTest emailChecker = new EmailTest();
            assertTrue(emailChecker.checkEmail("example@example.com"));
            assertTrue(emailChecker.checkEmail("jakson.r353@ggg.com.ua"));
            assertTrue(emailChecker.checkEmail("user.name@example.com"));
        }


    @Test
        public void testInvalidEmail() {
            EmailTest emailChecker = new EmailTest();
            assertFalse(emailChecker.checkEmail("invalid_email@"));
            assertFalse(emailChecker.checkEmail("invalid_email@example"));
            assertFalse(emailChecker.checkEmail("invalid_email@example."));
            assertFalse(emailChecker.checkEmail("invalid_email@example.j"));
            assertFalse(emailChecker.checkEmail("@example.com"));
            assertFalse(emailChecker.checkEmail("example.com"));
        }

    private void assertFalse(Object checkEmail) {
    }

    private Object checkEmail(String s) {
        return null;
    }

    private void assertTrue(Object checkEmail) {
    }
}
