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

  public void show(TaxCalculator calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }
}




// b) by means of Dependency Injection Using constructor we will make the Class TaxReport dependent on a Interface

public class Main{
	public static void main(String[] args){
		var calculator = new TaxCalculator2018(100_000);	// concrete implemenation
		var report = new TaxReport(calculator); // here we're passing or inject the calculator object
	}
}


// 1. TaxCalculator INTERFACE - contains only methods declaration that determine what needs to be done
public interface TaxCalculator {
  double calculateTax();  
}

// 2. TaxCalculator2018 Class
public class TaxCalculator2018 implements TaxCalculator{
  private double taxableIncome;

  public double TaxcalculateTax(double taxableIncome) {
    this.taxableIncome = taxableIncome;
  }

  @Override
  public double calculateTax(){
  	return taxableIncome * 0.3;
  }
}

// 3. TAXREPORT CLASS - it doesn't know anything about the concrete implementation, it's only working with an interface - this is called programming against interface
public class TaxReport {
  private TaxCalculator calculator; 

  public TaxReport(TaxCalculator calculator) { // b) we're injecting a dependency "TaxCalculator" using a constructor
    this.calculator = calculator;		// a) this is called Constructor Injection
  }

  public void show(TaxCalculator calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }
}



// In this solution above (in the Main Class) we're creating and injecting dependencies by hand, in a larger application we might have hundreds of classes and these classes might have several dependencies, there's when we use dependency injection Framework.
// Spring is one of the popularies one