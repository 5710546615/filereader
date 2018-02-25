import java.io.FileReader;
import java.io.IOException;

/**
 * AppendStringBuilderTask is a task to take measurement of the reading file
 * using FileReader and append to StringBuilder.
 * 
 * @author Visurt Anuttivong
 */
public class AppendStringBuilderTask implements Runnable {

	/* a size of String */
	private int size;
	/* a task we want to measure */
	private String task;

	/**
	 * Initializes a new AppendStringBuilderTask.
	 * 
	 * @param task is a string contains source file directory
	 */
	public AppendStringBuilderTask(String task) {
		this.task = task;
	}

	/**
	 * Read a text file one character at a time. Append all the characters to a
	 * StringBuilder.
	 * 
	 * @param filename is a source file directory
	 * @return a string that already appended
	 */
	public static String readFileToStringBuilder(String filename) {
		String result = "";
		try {
			FileReader reader = new FileReader(filename);
			StringBuilder builder = new StringBuilder();
			int c;
			while ((c = reader.read()) >= 0) {
				builder = builder.append((char) c);
			}
			result = builder.toString();
			if (reader != null)
				reader.close();
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
		String read = readFileToStringBuilder(task);
		size = read.length();
	}

	/**
	 * Returns a string description of the task contents.
	 * 
	 * @return describe of the task
	 */
	public String toString() {
		return "Reading " + task + " using FileReader, append to StringBuilder.";
	}
}
