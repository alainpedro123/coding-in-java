// 1. PRIMITIVE TYPES

byte age = 30;
long viewCount = 3_123_456_789L;
float price = 10.99F;
char letter = 'A';
boolean isEligible = false;

// 2. REFERENCE TYPES

Date now = new Date();  // Object - we should always allocate memory (new) when initializing this kind of data type. Java will release it automatically.
now.getTime()

// 3. PRIMITIVE VS REFERENCE - MEMORY MANAGEMENT

// Primitive Types - x and y are at different memory locations, they are completely independent of each other. The value that we assign to x and y will be stored in that memory location.
byte x = 1;
byte y = 1;


// Reference Types - They don't store the actual value, they store a reference to the object somewhere in the memory (they store the address of the point object, e.g. address: 100).
Point point1 = new Point(x:1, y:1);
Point point2 = new point1;

// The variable "point1" is going to hold the address of that point object in memory, not actually the point object.
// point1 and point2 are referencing the exact same point memory, they're referencing to the same object. 
// If we update one object the change will be visible to the other object.


// VARIABLES AND CONSTANT

int year = 2008;
final float pi = 3.14F;

var textBox = new TextBox();    // When using "var" we're letting the java compiler detect the type of this variable.



// INSTANCE OF
