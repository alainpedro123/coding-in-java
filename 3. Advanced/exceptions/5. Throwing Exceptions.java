// Throwing an exception - is called defensive programming

// MAIN CLASS
public class Exception {
	public static void show(){
		var account = new Account();
		account.deposit(1);
	}
}


// CLASS ACCOUNT
public class Account {
  // Throwing unchecked exception
  public void deposit(float value)  {
    if (value <= 0)
      throw new IllegalArgumentException();		
  }
}


//######################################################################################

// MAIN CLASS

public class Exception {
	public static void show(){
		try{
			var account = new Account();
			account.deposit(1);
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}


// CLASS ACCOUNT
public class Account {
  // Throwing checked exception
  public void deposit(float value) throws IOException{
    if (value <= 0)
      throw new IOException();		
  }
}