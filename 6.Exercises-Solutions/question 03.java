// SOLUTION 1

public class Main {
    public static void main(String[] args) {
       char[] array = {'a', 'b', 'c', 'd', 'e'};
       for(int i = 0; i < array.length; i++)
           for(int j = 0; j < array.length; j++)
               System.out.println(array[i] + "," + array[j]);
    }
}


// SOLUTION 2

public class Main {

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(printPairs(array));
    }

    public static char printPairs(char[] array){
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array.length; j++)
                System.out.println(array[i] + "," + array[j]);
        return 0;
    }
}