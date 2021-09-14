// Inheritance - consists in defining all the single behaviours in a single class and then having other classes inherit these behaviors (to reuse code)

// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var control = new UIControl();
        control.disable();
        System.out.println(control.isEnabled());
    }
}

// UICOTNTROL CLASS

package com.alainafonso;

public class UIControl {
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


// TEXTBOX CLASS

package com.alainafonso;

public class TextBox extends UIControl{  // Inheriting all features from UIControl Class
    private String text = "";

    public void setText(String text){
        this.text = text;
    }

    public  void  clear(){
        text = "";
    }
}