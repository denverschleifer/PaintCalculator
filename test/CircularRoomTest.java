import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
public class CircularRoomTest {
    @Test
    public void testArea() {
        assertThat(new CircularRoom(10.0).getArea(), is(314.159));
    }
}
