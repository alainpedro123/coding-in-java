// READING INPUT

Scanner scanner = new Scanner(System.in);

// Reading age
System.out.print("Enter your age: ");
byte age = scanner.nextByte();
System.out.println("You are " + age + " years old");

// Reading name
System.out.print("Enter your name: ");
String name = scanner.nextLine().trim();
System.out.print("Your name is: " + name);