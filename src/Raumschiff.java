/**
 * 
 */

/**
 * @author Dave
 *
 */
public class Raumschiff implements CanFly{
	
	private double length;

	public void fly(double speed) {
		System.out.println("Flying with speed " + speed);
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return this.length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/* (non-Javadoc)
	 * @see CanFly#fly()
	 */
	@Override
	public void fly() {
		System.out.println("Flying with default speed.");
		
	}
	

}
