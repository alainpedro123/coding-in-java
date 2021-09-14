import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Exception{
	public static void show(){
		FileReader reader = null;
		
		try {
			reader = new FileReader("file.txt"); // it reads one character and returns its numeric value
			var value = reader.read();
		} 
		catch(IOException ex){
			System.out.println("Could not read data.");
		}
		finally { // in this block we can release external resources: file hhandles, database connections, network connections and so on
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}

// the finally block will always be executed whether we have an exception or not.