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
		int var3 = (5+6-variable)*var2;
		System.out.println(var3);
		var3 = var2/4;
		System.out.println(var3);
		System.out.println(var2%4);
		double dvar = 6.0/4e13;
		System.out.println(dvar);
		System.out.println(6.0/4);
		dvar = 5;
		dvar = 5.3;
		var2 = (int)dvar;
		int i = 3;
		System.out.println(++i);
		System.out.println(i);
		int ersteVariable = 5;
		int zweiteVariable = 6;
		ersteVariable = ersteVariable + zweiteVariable;
		ersteVariable += zweiteVariable;
		int zahl = IOTools.readInt("Bitte eine Zahl:");
		System.out.println(zahl);
	}

}
