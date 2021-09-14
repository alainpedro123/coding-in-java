// Chaining Exceptions - is a technique that wraps an exception inside a more genreal exception

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
  public static void show() {
    var account = new Account();
    try {
      account.deposit(10);
    }
    catch (AccountException ex) {
      var cause = e.getCause();
      System.out.println(cause.getMessage());
      //e.printStacktrace();
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

  // Thrwoing accountException that was caused by fundsException  
  public void withdraw(float value) throws AccountException{
  	if(value > balance)
      throw AccountException;(new InsufficientFundsException());  // accountException was caused by fundsException   
  }


// CLASS INSUFFICIENT FUNDS EXCEPTION - CUSTOM EXCEPTION

public class InsufficientFundsException extends Exception {
  public InsufficientFundsException() {
    super("Insufficient funds in your account.");
  }

  public InsufficientFundsException(String message) {
    super(message);
  }
}


// CLASS ACCOUNT EXCEPTION

public class AccountException extends Exception {
  public AccountException(Exception cause) {
    super(cause);
  }
}