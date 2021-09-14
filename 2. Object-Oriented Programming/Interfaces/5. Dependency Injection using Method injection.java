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
    report.show(calculator);
    report.show(new TaxCalculator2019());
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


// 3. TAXREPORT CLASS
public class TaxReport {
  public TaxReport(TaxCalculator calculator){
    this.calculator = calculator; 
  }

  public void show(TaxCalculator calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }

  // constructor and setter are no needed
  
}