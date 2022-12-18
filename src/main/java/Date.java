
public class Date {
	int day;
	int month;
	int year;

	public Date() {
		super();
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date: " + day + "/" + month + "/" + year;
	}
	
	public boolean isLeapYear(Date t) {
		// if para comprobar que los valores no sean negativos o 0
		if (t.getDay() <= 0 || t.getMonth() <= 0 || t.getYear() < 0) {
			throw new NumerosValidosException("Numeros negativos o 0 no validos");
		}
		if (t.getYear() % 4 == 0) {
			if (t.getYear() % 100 == 0) {
				if (t.getYear() % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

}
