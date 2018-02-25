/**
 * An interface for objects able to take measurement.
 * 
 * @author Visurt Anuttivong
 */
public interface Runnable {
	
	/**
	 * Running the task.
	 */
	public void run();

	/**
	 * Gets the size of the output data.
	 * 
	 * @return its size
	 */
	public int getSize();
}
