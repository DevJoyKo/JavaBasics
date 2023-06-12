package com.javabasic.de.java.clip12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourceStatement {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("test.txt");
        try{
            out.write("Hello world!".getBytes(StandardCharsets.UTF_8)); // 메모리에 써짐
            out.flush(); // 파일에 써짐
        } catch (IOException e){
            e.printStackTrace();
        }
        out.close();
    }
}
