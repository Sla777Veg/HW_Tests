import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void createObjectTest() {
        User user = new User("log1", "pass1");
        String testLog = user.getLogin();
        String testPass = user.getPassword();
        Assertions.assertEquals(testLog, "log1");
        Assertions.assertEquals(testPass, "pass1");
    }

    @Test
    public void createObjectTransmitNullTest() {
        User user = new User(null, null);
        String testLog = user.getLogin();
        String testPass = user.getPassword();
        Assertions.assertNull(testLog);
        Assertions.assertNull(testPass);
    }

    @Test
    public void incorrectDataTest() {
        User user = new User("log2@mail.ru", "pass2");
        String testLog = user.getLogin();
        //testLog.contains("@");
        //testLog.contains(".");
        Assertions.assertTrue(testLog.contains("@"));
        Assertions.assertTrue(testLog.contains("."));
    }

    @Test
    public void equalsLogAndEMail() {
        User user = new User("log3", "pass3");
        String testLog = user.getLogin();
        String testPass = user.getPassword();
        Assertions.assertNotEquals(testLog, testPass);
    }
}
