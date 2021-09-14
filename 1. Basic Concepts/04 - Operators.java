// OPERATOR

// 1. ARITHMETIC

int x = 10;
int y = 2;

System.out.println(x + y);
System.out.println(x - y);
System.out.println(x * y);
System.out.println(x / y);
System.out.println(x % y);


// Increment - Decrement

int x = 1;
System.out.println(++x); 	// prefix  - Output: 2
System.out.println(x++);	// postfix - Output: 2

// postfix
int y = x++; 
System.out.println(x);  // 2
System.out.println(y);  // 1

// prefix
int y = ++x; 
System.out.println(x);  // 2
System.out.println(y);  // 2

// Compound assignment operators - Augmented assignment operators
x -= 2;
x += 2;
x /= 2;
x *= 2;

// 2. COMPARISON
byte x = 1;

// Relational
System.out.println(x > 0);   // true
System.out.println(x >= 1);  // true
System.out.println(x < 1);   // false
System.out.println(x <= 1);  // true

// Equality
System.out.println(x == 1)  // true
System.out.println(x != 1)  // false

// 4. LOGICAL
int x = 1;
int y = 2;

// AND
System.out.println((x == x) && ( y > x))  	// true
System.out.println((x == x) && ( y == x))  	// false

// OR
System.out.println((x == y) || ( x > x))  	// false
System.out.println((x == x) || ( y == x))  	// true

// NOT
System.out.println((x != y))  	// true
System.out.println((x != x))  	// false