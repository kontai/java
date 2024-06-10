package com.tai.interfaceWithDefault;

public interface Collection {
   void show();
    default void stream(){show();}
}
