package org.example;

import java.util.Optional;

public interface Stackable {

    boolean isFull();
    boolean isEmpty();
    boolean addElement(int el);
    int getElement();
    int lookTop();

    Optional <Integer> lookTopOptional();

}
