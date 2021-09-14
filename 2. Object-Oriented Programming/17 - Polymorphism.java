// 4. Polymorphism – Poly means "many" and morph "form". Polymorphism means many forms, it's a technique that allows an object to take difent forms. This is extremelly powerfull

// MAIN CLASS
package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        // An array of control objects
        UIControl [] controls = { new TextBox(), new CheckBox() }; // Rendering a form with multiple control objects: text boxes, check box, radio button and so on.

        // 1) Rendering different control objects - Procedural way - we could do as below:
        /*
        for(var control: controls){
            // if control is TextBox -> render TextBox
            // else if it is a CheckBox -> render CheckBox
        }
         */

        //  1.1) Rendering different control objects - by means of POLYMORPHISM
        for(var control: controls){
            control.render();
        }
    }
}


// UICONTROL CLASS

package com.alainafonso;

public class UIControl {  
    private boolean isEnabled = true;

    /*public UIControl(boolean isEnabled){       // CONSTRUCTOR
        System.out.println("UIControl");
    }*/

    // 2. Rendering different control objects - Polymorphism -> Method for rendering control object
    public void render(){
        // empty
        // we can by now go to each subclass and override this method
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


// TEXTBOX CLASS

package com.alainafonso;

public class TextBox extends UIControl{  // Inheriting all features from UIControl Class
    private String text = "";

    //3. Polymorphism in action - overriding the render method
    @Override
    public void render(){
        System.out.println("Render TextBox");
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


// CHECKBOX CLASS

package com.alainafonso;

public class CheckBox extends UIControl{
    //4. Polymorphism in action - overriding the render method
    @Override
    public void render(){
        System.out.println("Render CheckBox");
    }
}