package com.tai.ExceptionChain;

public class ExceptionChainTest {
    public static void main(String[] args) {
        try {
            func();
        } catch (Exception caughtException) {
            Throwable original = caughtException.getCause();
            System.out.println(original.getMessage());
        }
    }

    private static void func() throws Exception {
        try {
            var a = 1 / 0;
        } catch (Exception original) {
            throw new Exception("div by zero", original);
        }
    }
}
