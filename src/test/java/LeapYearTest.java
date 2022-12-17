import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LeapYearTest {

	DateController dateController;

	@Before
	public void initTests() {
		dateController = new DateController();
	}

	@Test(expected = NumerosValidosException.class)
	public void CdP1() {
		Date d = new Date();
		d.setDay(0);
		d.setMonth(0);
		d.setYear(0);
		dateController.isLeapYear(d);
	}

	@Test(expected = NumerosValidosException.class)
	public void CdP2() {
		Date d = new Date();
		d.setDay(20);
		d.setMonth(0);
		d.setYear(0);
		dateController.isLeapYear(d);
	}

	@Test(expected = NumerosValidosException.class)
	public void CdP3() {
		Date d = new Date();
		d.setDay(0);
		d.setMonth(6);
		d.setYear(0);
		dateController.isLeapYear(d);
	}

	@Test(expected = NumerosValidosException.class)
	public void CdP4() {
		Date d = new Date();
		d.setDay(0);
		d.setMonth(0);
		d.setYear(2022);
		assertFalse(dateController.isLeapYear(d));
	}

	@Test
	public void CdP5() {
		Date d = new Date();
		d.setDay(20);
		d.setMonth(6);
		d.setYear(2015);
		assertFalse(dateController.isLeapYear(d));
	}

	@Test
	public void CdP6() {
		Date d = new Date();
		d.setDay(20);
		d.setMonth(6);
		d.setYear(1999);
		assertFalse(dateController.isLeapYear(d));
	}

	@Test
	public void CdP7() {
		Date d = new Date();
		d.setDay(20);
		d.setMonth(6);
		d.setYear(2009);
		assertFalse(dateController.isLeapYear(d));
	}

	@Test
	public void CdP8() {
		Date d = new Date();
		d.setDay(20);
		d.setMonth(6);
		d.setYear(1405);
		assertFalse(dateController.isLeapYear(d));
	}

	@Test
	public void CdP9() {
		Date d = new Date();
		d.setDay(20);
		d.setMonth(6);
		d.setYear(2400);
		assertTrue(dateController.isLeapYear(d));
	}

	@Test
	public void CdP10() {
		Date d = new Date();
		d.setDay(20);
		d.setMonth(6);
		d.setYear(1400);
		assertFalse(dateController.isLeapYear(d));
	}

	@Test
	public void CdP11() {
		Date d = new Date();
		d.setDay(20);
		d.setMonth(6);
		d.setYear(2009);
		assertFalse(dateController.isLeapYear(d));
	}

	@Test
	public void CdP12() {
		Date d = new Date();
		d.setDay(20);
		d.setMonth(6);
		d.setYear(2008);
		assertTrue(dateController.isLeapYear(d));
	}

}
