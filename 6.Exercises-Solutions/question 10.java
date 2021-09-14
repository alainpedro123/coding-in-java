public class Main {

    public static void main(String[] args) {
        int[] array1 = {0,3,4,31};
        int[] array2 = {4,6,30};
        System.out.println(mergeArrays(array1, array2));
    }

    static ArrayList<Integer> mergeArrays(int[] array1, int[] array2){
        var mergedArray = new ArrayList<Integer>();

        for(int i = 0; i < array1.length; i++)
            mergedArray.add(array1[i]);

        for(int i = 0 ; i< array2.length; i++)
            mergedArray.add(array2[i]);

        Collections.sort(mergedArray);
        return mergedArray;
    }

}
