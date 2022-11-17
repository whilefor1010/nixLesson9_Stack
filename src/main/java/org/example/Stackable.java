package org.example;

public interface Stackable {

    boolean isFull();
    boolean isEmpty();
    boolean addElement(int el);
    int getElement();
    int lookTop();

}
