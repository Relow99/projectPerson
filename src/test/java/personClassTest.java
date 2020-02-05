import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class personClassTest {

    @Test
    public void hello() {

        personClass obj = new personClass("Tshwarelo",22,"female",
                new String[]{" fashion","sports"});

        String person = obj.hello();

        Assert.assertEquals(person,"hello,my name is Tshwarelo I am female who is 22 years old, I love  fashion and sports");

    }

}