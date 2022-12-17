
public class DateController {

	public DateController() {
		super();
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
