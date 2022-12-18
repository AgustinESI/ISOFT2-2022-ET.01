
import java.util.*;

public class Principal {
	public static final Scanner TECLADO = new Scanner(System.in, "UTF8");
	private static DateController dateController = new DateController();

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		String[] entrada = { "Day", "Month", "Year" };
		for (int i = 0; i < entrada.length; i++) {

			System.out.println(entrada[i]);
			list.add(leerEnteros());
		}
		Date d = new Date();
		d.setDay(list.get(0));
		d.setMonth(list.get(1));
		d.setYear(list.get(2));

		// True = bisiesto
		// False = no bisiesto
		System.out.println(dateController.isLeapYear(d));
	}

	private static int leerEnteros() {
		Integer value = null;
		try {
			value = TECLADO.nextInt();
		} catch (Exception e) {
			System.out.println("No se puede introducir caracteres.");

		}
		return value;
	}

}
