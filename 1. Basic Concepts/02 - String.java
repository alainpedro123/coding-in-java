// STRING

String message = new String(original:"Hello World");
String message = "Hello World!";
String name = "Alain" + "Pedro";
name.replace(target: "Pedro", replacement: "Afonso");

// ESCAPE SEQUENCES
String fullName = "Alain \"Pedro\""; 			// double quote
String path = "c:\\Windows\\users...";			// backslash
String path = "c:\nWindows\\users...";			// backslash N
String path = "c:\tWindows\\users...";			// tab

// In Java, String are immutable. But if we want to create a mutuable string object we can use the StringBuilder or StringBuffer Class.
var reserved = new StringBuilder();
var reserved = new StringBuffer();

// In Java we cannot iterate over a String. We have to convert it into a Character Array and then iterate over this array.