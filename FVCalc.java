// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	String currentValue = args[0];
	String rate = args[1];
	String n = args[2];
    double double_current_value=Double.parseDouble(currentValue);
	double double_rate =Double.parseDouble(rate)*0.01;
	double double_n=Double.parseDouble(n);
	double futureValue = double_current_value*(Math.pow(1+double_rate,double_n));
	System.out.println("After " + n + " years, $" + double_current_value + " saved at " + rate +"% will yield $" +"" + (int)futureValue);
	} 
}