import Prog1Tools.IOTools;

/**
 * 
 */

/**
 * @author Dave
 *
 */
public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int variable = 5;
		int var2;
		var2 = 6;
		variable = var2;
		System.out.println();
		System.out.print(variable);
		System.out.println(variable);
		String str = "abc\n\tde\\abc";
		System.out.println(str);
		String firstname = "Klaus";
		String lastname = "Meier";
		System.out.println(firstname + " " + lastname + var2);
		int var3 = (5 + 6 - variable) * var2;
		System.out.println(var3);
		var3 = var2 / 4;
		System.out.println(var3);
		System.out.println(var2 % 4);
		double dvar = 6.0 / 4e13;
		System.out.println(dvar);
		System.out.println(6.0 / 4);
		dvar = 5;
		dvar = 5.3;
		var2 = (int) dvar;
		int i = 3;
		System.out.println(++i);
		System.out.println(i);
		int ersteVariable = 5;
		int zweiteVariable = 6;
		ersteVariable = ersteVariable + zweiteVariable;
		ersteVariable += zweiteVariable;
		int zahl = IOTools.readInt("Bitte eine Zahl:");
		System.out.println(zahl);
		if (zahl < 0) {
			System.out.println("negativ");
		} else if (zahl == 0) {
			System.out.println("ist Null");
		} else {
			System.out.println("positiv");
		}
		// boolean b = 1+2+3+4+6*35 > var2*dvar*5/4;
		if (zahl < 0 || (zahl > 10 && zahl != 11)) {
			System.out.println("Zahl ist negativ oder größer"
					+ " als 10 aber nicht 11.");
		}

		switch (zahl) {
		case 2:
			System.out.println(2);
			System.out.println("toll!");
			break;
		case 5:
			System.out.println(5);
			break;
		case 33:
		case 34:
			System.out.println(34);
			break;
		default:
			System.out.println("Was Anderes!");
		}

		String s = "hello";
		switch (s) {
		case "Hello":
			System.out.println("Hello!");
			break;
		case "hello":
			System.out.println("klein");
			break;
		default:
			System.out.println("nicht hello");
		}

	}

}
