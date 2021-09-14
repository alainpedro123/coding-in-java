// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.setText("Hello World");
        System.out.println(textBox.toString());
    }
}


// UIControl Class

package com.alainafonso;

public class UIControl {  // This extends from the Object class:
// public class UIControl extends Object  - The Object Class
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled){       // CONSTRUCTOR
        System.out.println("UIControl");
    }

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



// TEXT CLASS

package com.alainafonso;

public class TextBox extends UIControl{  // Inheriting all features from UIControl Class
    private String text = "";

    public TextBox(){           // CONSTRUCTOR
        super(true);    // Calling the constructor of the Base Class
        System.out.println("Text Box");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public  void  clear(){
        text = "";
    }
}