package com.javabasic.de.java.clip12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourceStatement {
    public static void main(String[] args) throws IOException {
        try(FileOutputStream out = new FileOutputStream("test.txt")){
            // try 괄호문에 들어갈 수 있는 조건: AutoClosable
//        try{
            out.write("Hello world!".getBytes(StandardCharsets.UTF_8)); // 메모리에 써짐
            out.flush(); // 파일에 써짐
        } catch (IOException e){
            e.printStackTrace();
        }
//        out.close();
//        이미 fileoutputstream 클래스에는 AutoClosable 인터페이스를 가지고 있음.
    }
}
