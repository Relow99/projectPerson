
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class personTest {

    @Test
   public void hello() {

        personClass obj = new personClass("tshwarelo",22,"female",
                new String[]{" fashion","sports"});

        String person = obj.hello();

        assertEquals(person,"hello,my name is tshwarelo I am female who is 22 years old, I love  fashion and sports");

    }
}