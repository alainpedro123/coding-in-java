import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Exception{
	public static void show(){
		try {
			var reader = new FileReader("file.txt");
			var value = reader.read(); // it reads one character and returns its numeric value
			new SimpleDateFormat().parse("")
		} 
		catch(FileNotFoundException ex){
			System.out.println("File does not exist.");
		}
		catch(IOException ex){
			System.out.println("Could not read data.");
		}
		catch(ParseException ex){
			e.printStackTrace();
		}
	}
}