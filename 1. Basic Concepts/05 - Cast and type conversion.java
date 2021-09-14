// CASTING AND TYPE CONVERSION
// Conversion from right to left - byte > short > int > long > float > double

// 1. Implicit Casting
short x = 1;
int y = x + 2;				// implicit casting of variable x from "short" to "int"
System.out.println(y);  	// 3


// 2. Explicit Casting
double x = 1.1;
double y = (int)x + 2;		// explicit casting "(int)x"  from "double" to "int"
System.out.println(y);		//	3


// Implicit casting - automatic casting or conversion. It happens underneath the hood whenever we have a value that can be converted to a data type that is bigger casting or conversion happens implicitly or automaticly. Whenever this type of conversion happens we don't loose data.

// Explicit casting - this conversion we set it manually and can only happens between compatible types


// 3. Converting a String to a Number

String twelve = "12";
Integer.parseInt(twelve);


// 4. Java Type Casting

/*
IMPLICIT CASTING (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

EXPLICIT CASTING (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
*/
