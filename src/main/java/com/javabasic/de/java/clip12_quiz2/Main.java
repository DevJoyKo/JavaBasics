package com.javabasic.de.java.clip12_quiz2;

import org.omg.CORBA.SystemException;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalPathAccessError {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        System.out.println("Here is the path: "+ path);

        try {
            if (FileValidator.validate(path)) {
                System.out.println("File " + path + " exists.");
            } else {
                System.out.println("File " + path + " doesn't exist.");
            }
        } catch (IllegalPathAccessError illegalPathAccessError){
            System.out.println(illegalPathAccessError.getMessage() + "\n");
            illegalPathAccessError.printStackTrace();
            System.out.println("Program is forced to quit.");
            System.exit(1);

        }


    }
}
