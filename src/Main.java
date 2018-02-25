/**
 * A main class to create tasks and gives them to TaskTimer to run.
 * 
 * @author Visurt Anuttivong
 */
public class Main {

	/**
	 * Configure and start the measurement.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();
		String filename = "Alice-in-Wonderland.txt";

		Runnable task1 = new AppendStringTask(filename);
		timer.measureAndPrint(task1);

		Runnable task2 = new AppendStringBuilderTask(filename);
		timer.measureAndPrint(task2);

		Runnable task3 = new AppendLineToStringTask(filename);
		timer.measureAndPrint(task3);
	}
}
