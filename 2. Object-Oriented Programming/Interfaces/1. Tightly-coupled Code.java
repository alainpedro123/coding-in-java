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
  // method for showing the tax report
  private TaxCalculator calculator;  // this is an example of tightly coupled code, because we're using the TaxCalculator class inside of TaxReport class, so we're depending on this class. If our calculator changes our Report class might be affected 

  public TaxReport(TaxCalculator calculator) {
    calculator = new TaxCalculator(100_000);
  }

  public void show(TaxCalculator calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }

//  public void setCalculator(TaxCalculator calculator) {
//    this.calculator = calculator;
//  }
}


// The problem of tightly coupled
// If we modify something in the main class, it means that this class and all of its dependencies have to be recompiled and redeployed.