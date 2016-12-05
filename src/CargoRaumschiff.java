/**
 * 
 */

/**
 * @author Dave
 *
 */
public class CargoRaumschiff extends Raumschiff {

	private double laderaumVolumen;

	public static void main(String[] args) {
		CargoRaumschiff cr = new CargoRaumschiff();
		cr.fly(1000);
		cr.fly();
		Ente e = new Ente();
		e.fly();
		Vogel v = e;
		// v.fly(); unzulässig
		CanFly[] flying = new CanFly[2];
		flying[0] = cr;
		flying[1] = e;
		for (CanFly c : flying)
			c.fly();
	}

}
