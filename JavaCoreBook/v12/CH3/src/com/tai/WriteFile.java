package com.tai;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter out = new FileWriter("test.txt");

        out.write("This is a test");
        out.flush();
    }
}
