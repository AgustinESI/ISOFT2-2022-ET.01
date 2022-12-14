package segundoIso;


import java.util.*;

public class Prinncipañ {
	static Scanner TECLADO = new Scanner (System.in);
	public static void main (String [] args) {
		List<Integer> list = new ArrayList<Integer>();
		String [] entrada = {"Day" , "Month", "Year"};
		for (int i=0; i< entrada.length; i++) {
			
			System.out.println(entrada[i]);
			list.add(leerEnteros());
		}
		Date d = new Date(0,0,0);
		d.setDay(list.get(0));
		d.setMonth(list.get(1));
		d.setYear(list.get(2));
		
		//True = bisiesto
		//False = no bisiesto
		System.out.println(isLeapYear(d));
	}
	
	private static int leerEnteros() {
		Integer value = null;
		try {
			value = TECLADO.nextInt();
		}catch (Exception e) {
			System.out.println("No se puede introducir caracteres.");
			
		}
		return value;
	}
	
	public static boolean isLeapYear(Date t) {
		//if para comprobar que los valores no sean negativos o 0
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
