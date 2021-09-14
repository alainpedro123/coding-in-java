// LOOPING

// 1. FOR 
for(int i = 0; i < 5; i++){
	System.out.println("Hellow World " + i);
}

// 2. WHILE

// example 1
int i = 0;

while(i < 5){
	System.out.println("Hellow World " + i);
	i++
}

// example 2
Scanner scanner = new Scanner(System.in);
String input = "";

while(!input.equals("quit")){
	System.out.print("Input: " );
	input = scanner.next().toLowerCase();
	System.out.println(input);
}


// 3. DO - WHILE

Scanner scanner = new Scanner(System.in);
String input = "";

do{
	System.out.print("Input: " );
	input = scanner.next().toLowerCase();
	System.out.println(input);
}while(!input.equals("quit"));


// 4. For-each

String[] fruits = {"apples", "oranges", "avocados"}; 

for(String fruit : fruits)
	System.out.println(fruit);



// 5. BREAK - CONTINUE
//break - terminates the loop
//continue - moves the control to the beginning of the loop

Scanner scanner = new Scanner(System.in);
String input = "";

while(true){
	System.out.print("Input: " );
	input = scanner.next().toLowerCase();

	if(input.equals("pass"))
		continue;

	if(input.equals("quit"))
		break;
	System.out.print(input);
}