import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
public class SquareRoomTest {
    @Test
    public void testArea() {
        assertThat(new SquareRoom(10,10).getArea(), is(100.0));
    }
}
