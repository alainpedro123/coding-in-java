// Every Class we declare directly or indireclty inherits from the Object Class 

// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var obj = new Object();     // new object from The Object class
    }
}

// SECONDARY CLASS

package com.alainafonso;

public class UIControl {  // This Class extends from the Object class -> public class UIControl extends Object{ ... }
    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}