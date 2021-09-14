// 1. MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
       UIControl[] controls = { new TextBox(), new CheckBox() };
       for (var control : controls)
           control.render();
    }
}

// 2. UIControl CLASS - PARENT CLASS - Framework for building graphical interfaces. 
// Here we define all current behaviours in this single class, and then have other classes inherit these behaviours from this Class

public abstract class UIControl {
  private boolean isEnabled = true;

//  public UIControl(boolean isEnabled) {   // Constructor with a parameter
//    this.isEnabled = isEnabled;
//  }

  public abstract void render();

  public final void enable() {
    isEnabled = true;
  }

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() {
    return isEnabled;
  }
}


// 3. TEXTBOX CLASS - SUB CLASS

public class TextBox extends UIControl {
  // 1) fields / Atributes
  private String text = "";             

   // 2) Constructor
//  public TextBox() {
//    super(true);    // we user "super" when a constructor of our Parent class has a parameter
//  }

  // 3) Methods
  @Override
  public void render() {
    System.out.println("Render TextBox");
  }

  @Override
  public String toString() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}


// CHECKBOX - SUBCLASS 
public final class CheckBox extends UIControl { 
  @Override
  public void render() {
    System.out.println("Render CheckBox");
  }
}
