/**
 * 
 */
package de.tuberlin.ise.prog1winf.list;

/**
 * @author Dave
 *
 */
public class QueueWrapper {

	private SinglyLinkedList list = new SinglyLinkedList();

	public void enqueue(String s) {
		list.append(s);
	}

	public String dequeue() {
		Object o = list.getValue(0);
		if (o == null)
			return null;
		list.deleteValue(o);
		return (String) o;
	}

}
