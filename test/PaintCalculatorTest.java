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
	public void testCaclulateCeilingOfSquareRoom() {
		PaintCalculator pc = new PaintCalculator(10.0, 10.0);
		assertThat(pc.getGallonsOfPaintForCeiling(), is(1));
	}

}
