/**
 * Stopwatch computes elapsed time between a start and stop time.
 * 
 * @author Visurt Anuttivong
 */
public class Stopwatch {

	/* NANO per 1 second */
	private static final double NANOSECOND = 1.0E-9;
	/* the start time */
	private long start;
	/* the stop time */
	private long stop;
	/* status checker */
	private boolean isRunning;

	/**
	 * Initializes a stopwatch
	 */
	public Stopwatch() {
		isRunning = false;
	}

	/**
	 * Reset the stopwatch and start if stopwatch is not running. If the stopwatch
	 * is already running then start does nothing.
	 */
	public void start() {
		if (isRunning)
			return;
		start = System.nanoTime();
		isRunning = true;
	}

	/**
	 * Stop the stopwatch. If the stopwatch is already stopped, then stop does
	 * nothing.
	 */
	public void stop() {
		if (!isRunning)
			return;
		stop = System.nanoTime();
		isRunning = false;
	}

	/**
	 * Checks a stopwatch is already running or not
	 * 
	 * @return true if running. Otherwise, false
	 */
	public boolean isRunning() {
		return isRunning;
	}

	/**
	 * The elapsed time in seconds, as accurately as possible.
	 * 
	 * @return the time since start() until the currenct time if the stopwatch is
	 *         running. Otherwise, if stopwatch is already stopped, return the time
	 *         between the start and stop times.
	 */
	public double getElapsed() {
		if (isRunning)
			return (System.nanoTime() - start) * NANOSECOND;
		return (stop - start) * NANOSECOND;
	}
}
