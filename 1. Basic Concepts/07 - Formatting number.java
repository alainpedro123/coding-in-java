// FORMATTING NUMBER

// 1) from 1234567 to $1,234,567

NumberFormat currency = NumberFormat.getCurrencyInstance();
String result = currency.format(1234567.891);		// 1234567
System.out.println(result); 						// $1,234,567	


// 2) from 0.1 to 10%
// long way
NumberFormat percent = NumberFormat.getCurrencyInstance();
String result = percent.format(0.1);	// 0.1
System.out.println(result); 			// 10%

// short way
String result = NumberFormat.getCurrencyInstance().format(0.1);		// 0.1
System.out.println(result); 										// 10%