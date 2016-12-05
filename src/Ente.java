/**
 * 
 */

/**
 * @author Dave
 *
 */
public class Ente extends Vogel implements CanFly {

	/*
	 * (non-Javadoc)
	 * 
	 * @see CanFly#fly()
	 */
	@Override
	public void fly() {
		System.out.println("Duck is flying!");
	}

}
