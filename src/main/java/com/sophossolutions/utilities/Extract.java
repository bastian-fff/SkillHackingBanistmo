package com.sophossolutions.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {

    public static String extractDataFromUrl(String url){
        Pattern patron = Pattern.compile("[+].+[?]");
        Matcher matcher = patron.matcher(url);
        if(matcher.find()) {
            return matcher.group(0);
        }
        return "No se han encontrado coincidencias";
    }

}
