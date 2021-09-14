// ARRAYS
int [] numbers = new int[5];	  // when knowing only the size of the Array but not the items, we use new to allocate memory
int [] numbers = {2, 3, 5, 1, 4}  // when knowing the items ahead of time
numbers[0] = 10;
Sytem.out.println(Arrays.toString(numbers));	// convert the array into string and display

// Arrays have a fixed length!!


// Twodimensional-Array

int [][] numbers = new int[2][3];
numbers [0][0] = 1;
Sytem.out.println(Arrays.deepToString(numbers));

int [][] numbers = { {1,2,3}, {4,5,6} };


// Threedimensional-Array
int [][][] numbers = new int[2][3][5];
int [][][] numbers = { {1,2,3}, {4,5,6}, {7,8,9} };


// ArrayList

ArrayList<Integer> array = new ArrayList<>();
array.add(10);
array.add(20);
array.add(30);
array.add(40);
array.remove(2);
array.contains(10);
System.out.println(array);
System.out.println(array.contains(10));



// List
List<String> urls = new ArrayList<>();


// ARRAY
// Array is a fixed length data structure whereas. 
// We cannot change length of array once created in Java
// Array can contain both primitives and objects in Java.

// ARRAYLIST
// ArrayList is a variable length Collection class.
// ArrayList can be changed. We cannot store primitives in ArrayList, it can only store objects. 