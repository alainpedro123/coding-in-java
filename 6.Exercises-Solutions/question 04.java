public class Main {
    public static void main(String[] args) {
        String[] everyone = {"dory", "bruce", "marlin", "neemo", "gill", "boat", "nigel", "squirt", "darla", "hank"};
        System.out.println(checkForExistance(everyone));
    }

    public static boolean checkForExistance(String[] array){
        for(String person : array)
            if(person == "nemo")
                return true;
        return false;
    }
}