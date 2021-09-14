// a) TaxReport Class is here dependent on TaxCalculator
// TAX CALCULATOR CLASS

public class TaxCalculator{
  private double taxableIncome;

  public double TaxcalculateTax(double taxableIncome) {
    this.taxableIncome = taxableIncome;
  }

  public double calculateTax(){
  	return taxableIncome * 0.3;
  }
}


// TAX REPORT CLASS
public class TaxReport {
  private TaxCalculator calculator; 

  public TaxReport(TaxCalculator calculator) {
    calculator = new TaxCalculator(100_000);
  }

  public void show() {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }
}




// b) by means of Dependency Injection Using constructor we will make the Class TaxReport dependent on a Interface

public class Main{
	public static void main(String[] args){
		var calculator = new TaxCalculator2018(100_000);	// concrete implemenation
		var report = new TaxReport(calculator); // here we're passing or inject the calculator object
    report.show();

    // here we're changing the dependencies of class throughout the lifetime of our application
    report.setCalculator(new TaxCalculator2019)
    report.show();
	}
}


// 1. TaxCalculator INTERFACE - contains only methods declaration that determine what needs to be done
public interface TaxCalculator {
  double calculateTax();  
}


// 2. TaxCalculator2019 Class
public class TaxCalculator2019 implements TaxCalculator {
  @Override
  public double calculateTax() {
    return 0;
  }
}


// 3. TAXREPORT CLASS - it doesn't know anything about the concrete implementation, it's only working with an interface - this is called programming against interface
public class TaxReport {

  private TaxCalculator calculator; 

  public TaxReport(TaxCalculator calculator) { // b) we're injecting a dependency  using a constructor
    this.calculator = calculator;		
  }

  public void show(TaxCalculator calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }

  public void setCalculator(TaxCalculator calculator){  // a) to addition of this Constructor "TaxCalculator" above, we can use this setter to inject a dependency in this class. 
    this.calculator = calculator;                       // As benefit of doing this, we can change these dependencies throughout the lifetime of our program
  }
}