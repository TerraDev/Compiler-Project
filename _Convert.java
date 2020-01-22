package com.company;

import java.util.*;

public class _Convert {

    public static String boolToInt(String str)
    {
        if(str =="true")
            return "1";
        else
            return "0";
    }
    public static String intToString(String str)
    {
        if(str=="0")
            return "\\X00";
        else
            return "\\X01";
    }
    public static String intToBool(String str)
    {
        if(str == "0")
            return "false";
        else
            return "true";
    }
    public static String intToFloat(String str)
    {
        return String.valueOf(Float.parseFloat(str));
    }
   /* public static String userDifinedToInt(String str)
    {

    }*/

}
