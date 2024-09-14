package Assi5;
/*2.	Design and implement a class named Logger to manage logging messages for an application. The class should be implemented as a singleton to ensure that only one instance of the Logger exists throughout the application.

The class should include the following methods:
•	getInstance(): Returns the unique instance of the Logger class.
•	log(String message): Adds a log message to the logger.
•	getLog(): Returns the current log messages as a String.
•	clearLog(): Clears all log messages.
*/

class Logger{
	private static Logger instance;
	private String logMessages;
	
	public Logger() {
		logMessages = "";
	}
	
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public void log(String message) {
		logMessages += message + "\n";
	}
	public String getLog() {
		return logMessages;
	}
	public void clearLog() {
		logMessages = "";
	}
	
}

public class Assi5Program2 {

	public static void main(String[] args) {
		Logger logger = new Logger();
		logger.log("Application started");
        logger.log("User logged in");
        logger.log("User performed an action");

        // Display the log
        System.out.println("Current Log Messages:");
        System.out.println(logger.getLog());

        // Clear the log
        logger.clearLog();
        System.out.println("Log after clearing:");
        System.out.println(logger.getLog());

	}

}
