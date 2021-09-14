// Althought Java provides a lot of general exception classes that we can use in our applications. But sometimes we need to create Custom exceptions that are specific to our Application Domain.
// This is particularly usefull when builing a framework or a library for other to use

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
    catch (InsufficientFundsException ex) {
      System.out.println(ex.getMessage());
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

  public void withdraw(float value){
  	if(value > balance)
  }
}


// CLASS INSUFFICIENT FUNDS EXCEPTION - CUSTOM EXCEPTION

// if "Checked" -> Exception
// if "Unchecked" (runtime) -> RuntimeException

public class InsufficientFundsException extends Exception {
  public InsufficientFundsException() {
    super("Insufficient funds in your account.");
  }

  public InsufficientFundsException(String message) {
    super(message);
  }
}
