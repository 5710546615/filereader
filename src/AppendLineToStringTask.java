import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * AppendLineToStringTask is a task to take measurement of the reading file
 * using BufferedReader and append lines to String.
 * 
 * @author Visurt Anuttivong
 */
public class AppendLineToStringTask implements Runnable {

	/* a size of String */
	private int size;
	/* a task we want to measure */
	private String task;

	/**
	 * Initializes a new AppendLineToStringTask.
	 * 
	 * @param task is a string contains source file directory
	 */
	public AppendLineToStringTask(String task) {
		this.task = task;
	}

	/**
	 * Read the file as text one line at a time using BufferedReader, and append the
	 * result to a String
	 * 
	 * @param filename is a source file directory
	 * @return a string that already appended
	 */
	public String readFileLineToString(String filename) {
		String result = "";
		try {
			FileReader reader = new FileReader(filename);
			BufferedReader br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine()) != null) {
				result = result + line + '\n';
			}
			if (br != null)
				br.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

	/**
	 * Gets a size of appended string.
	 * 
	 * @return its size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Running the task.
	 */
	public void run() {
		String read = readFileLineToString(task);
		size = read.length();
	}

	/**
	 * Returns a string description of the task contents.
	 * 
	 * @return describe of the task
	 */
	public String toString() {
		return "Reading " + task + " using BufferedReader, append lines to String.";
	}
}
