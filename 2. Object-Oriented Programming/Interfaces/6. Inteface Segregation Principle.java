package com.codewithmosh;

public class Dragger {
  public void drag(UIWidget draggable) {
    draggable.drag();
    System.out.println("Dragging done!");
  }
}

public interface UIWidget extends Draggable, Resizable {
  void render();
}

public interface Draggable {
  void drag();
}


public interface Resizable {
  void resize(int size);
  void resize(int x, int y);
  void resizeTo(UIWidget widget);
}



// Class cannot have multiple parents but Interface can have multiple parents.