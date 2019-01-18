import com.example.Counter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * @author Igor Rybak
 * @since 18-Jan-2019
 */
@RunWith(JUnit4.class)
public class CounterTest {

    @Test
    public void test() {
        int sum = new Counter().sum(10);
        assertEquals(45, sum);
    }
}