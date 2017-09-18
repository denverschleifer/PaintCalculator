import static org.junit.Assert.*;

import org.hamcrest.Matcher;
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

	private Matcher is(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
