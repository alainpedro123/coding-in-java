// MAIN CLASS

public class Main(){
  public static void(string [] args){
  }
}


// 2. Tax Calculator CLASS - we want this class to implement the name of the interface
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


// 1. TaxCalculator INTERFACE - contains only methods declaration that determine what needs to be done
public interface TaxCalculator {
  double calculateTax();  
}