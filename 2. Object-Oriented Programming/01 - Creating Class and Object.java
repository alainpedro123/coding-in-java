// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox();  // object 1
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();  // object 2
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }
}


// TEXTBOX CLASS - New class

package com.alainafonso;

public class TextBox {
    public String text = "";  // Atribute / Field

    public void setText(String text){ // method 1
        this.text = text;
    }

    public  void  clear(){  // method 2
        text = "";
    }
}