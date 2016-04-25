package newRepo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcReviewTest {

	@Test
	public void testAdd() {
		CalcReview r = new CalcReview();
		r.add(10, 20);
		assertEquals(30,r.getResult());
	}

}
