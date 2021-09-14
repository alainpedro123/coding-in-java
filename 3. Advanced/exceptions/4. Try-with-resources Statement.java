import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Exception{
	public static void show(){
		FileReader reader = null;
		
		// try with resource statement
		try(
			var reader = new FileReader("file.txt");
			var writer = new FileWriter("...");
		) { 
			var value = reader.read();
		} 
		catch(IOException ex){
			System.out.println("Could not read data.");
		}
	}
}