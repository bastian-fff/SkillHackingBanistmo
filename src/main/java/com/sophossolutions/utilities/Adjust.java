package com.sophossolutions.utilities;

public class Adjust {

    public static String adjustFileName(String name){
        name = name.substring(0, name.length()-10).replace("+", " ");
        return name.substring(1, name.length()-1);
    }

}
