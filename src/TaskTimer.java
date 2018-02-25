/**
 * Tasktimer computes and print the elapsed time for any task.
 * 
 * @author Visurt Anuttivong
 */
public class TaskTimer {

	/**
	 * Print description of the task before run the task and measure the elapsed
	 * time. After that, print the elapsed time.
	 * 
	 * @param task is a runnable task to take measurement
	 */
	public void measureAndPrint(Runnable task) {
		System.out.println(task.toString());
		Stopwatch sw = new Stopwatch();
		sw.start();
		task.run();
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n", task.getSize(), sw.getElapsed());
	}

}
