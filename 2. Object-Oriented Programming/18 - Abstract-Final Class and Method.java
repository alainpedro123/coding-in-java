// 1. Abstract Class and Method
// We use Abstract Classes in situaiton where we declare a classs but we don't want to be able to to instantiate it, we don't want to be able to create a new instance of that class but only extends it.
// Final class - when we declare a class as final we cannot extend it anymore. We use in situation where we are 100% sure about the implementation of that class an we want to prevent other classes from extending that class (it rarely used).

public abstract class UIControl {  //  Abstract class
    private boolean isEnabled = true;

    public abstract void render(); // Abstract Method - We got here only the method declaration not the implementation
}

// 2. Final Class and Method

public final class UIControl {  //  Final class
    private boolean isEnabled = true;

    public final void enable(){	// Final method
    	isEnabled = true;
    } 
}