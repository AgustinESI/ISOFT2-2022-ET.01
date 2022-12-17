import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {
	@Test(expected = NumerosValidosException.class)
	public void CdP1() {
		Date d = new Date(0, 0, 0);
		Principal.isLeapYear(d);
	}

	@Test(expected = NumerosValidosException.class)
	public void CdP2() {
		Date d = new Date(20, 0, 0);
		Principal.isLeapYear(d);
	}

	@Test(expected = NumerosValidosException.class)
	public void CdP3() {
		Date d = new Date(0, 6, 0);
		Principal.isLeapYear(d);
	}

	@Test(expected = NumerosValidosException.class)
	public void CdP4() {
		Date d = new Date(0, 0, 2022);
		assertFalse(Principal.isLeapYear(d));
	}

	@Test
	public void CdP5() {
		Date d = new Date(20, 6, 2015);
		assertFalse(Principal.isLeapYear(d));
	}

	@Test
	public void CdP6() {
		Date d = new Date(20, 6, 1999);
		assertFalse(Principal.isLeapYear(d));
	}

	@Test
	public void CdP7() {
		Date d = new Date(20, 6, 2009);
		assertFalse(Principal.isLeapYear(d));
	}

	@Test
	public void CdP8() {
		Date d = new Date(20, 6, 1405);
		assertFalse(Principal.isLeapYear(d));
	}

	@Test
	public void CdP9() {
		Date d = new Date(20, 6, 2400);
		assertTrue(Principal.isLeapYear(d));
	}

	@Test
	public void CdP10() {
		Date d = new Date(20, 6, 1400);
		assertFalse(Principal.isLeapYear(d));
	}

	@Test
	public void CdP11() {
		Date d = new Date(20, 6, 2009);
		assertFalse(Principal.isLeapYear(d));
	}

	@Test
	public void CdP12() {
		Date d = new Date(20, 6, 2008);
		assertTrue(Principal.isLeapYear(d));
	}

}
