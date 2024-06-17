package com.tai.Lambda;

//可迾註解，編譯器會檢查是否為函數接口
@FunctionalInterface
public interface IntConsumer {
    void accept(int value);
}
