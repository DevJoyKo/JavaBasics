package com.javabasic.de.java.clip12_quiz2;

import java.io.File;

public class FileValidator {
    public static boolean validate(String path){
        if(path.startsWith("/Users/*")){
            File file = new File(path);
            return file.exists();
        }else{
            throw new IllegalPathAccessError(path);
        }
    }
}
