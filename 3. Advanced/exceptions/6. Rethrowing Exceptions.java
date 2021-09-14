// Simulation of Logging by printing a message in the terminal
// In Real World Application when exceptions are caught there are logged somewhere: such as in file, database for future usage purpose
  
// MAIN CLASS
public class Main {
  public static void main(String[] args) {
    try {
      Exception.show();
    }
    catch (Throwable ex) { // This Throwable Class will make sure that no matter what kind of error or exception we get, our program displays a generic error message to the user
      System.out.println("An unexpected error occurred.");
    }
  }
}



// EXCEPTION CLASS  
public class Exception {
  public static void show() throws IOException{
    try {
      var account = new Account();
      account.deposit(-1);
    }
    catch (IOException ex) {
      System.out.println("Logging");
      throw ex;
    }
  }
}


// CLASS ACCOUNT
public class Account {
  private float balance;

  // Throwing checked exception
  public void deposit(float value) throws IOException{
    if (value <= 0)
      throw new IOException();    
  }
}