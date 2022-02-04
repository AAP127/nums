import static org.junit.Assert.*;
import org.junit.*;

public class NumTest {
    
    @Test
    public void testNum(){
        assertEquals(2, Num.number()+Num.number());
    }
    
}
