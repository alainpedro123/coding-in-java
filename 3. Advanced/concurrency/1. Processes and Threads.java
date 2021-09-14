public class Main {
    public static void main(String[] arg){
        System.out.println(Thread.activeCount());	// The number of active threads
        System.out.println(Runtime.getRuntime().availableProcessors());		// the total number of available threads
    }
}