import static org.junit.Assert.*;
import static org.hamcrest.coreMatchers.is;
import org.junit.Test;


/**
 * 
 */

/**
 * @author Denver
 *
 */
public class PaintCalculatorTest {
    @Test
    public void testCalculateCeilingOfSquareRoom(){
        PaintCalculator pc = new PaintCalculator(new SquareRoom(10,10));
        assertThat(pc.getGallonsOfPaintForCeiling(), is(1));
    }

}
