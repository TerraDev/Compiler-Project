package com.company.LULU;

import java.util.*;

public class Amir_Convert {

    public static String boolToInt(String str)
    {
        if(str.equals("true"))
            return "1";
        else
            return "0";
    }
    public static String intToString(String str)
    {
        if(str.equals("0"))
            return "\\X00";
        else
            return "\\X01";
    }
    public static String intToBool(String str)
    {
        if(str.equals("0"))
            return "false";
        else
            return "true";
    }
    public static String intToFloat(String str)
    {
        return Float.toString((float)Integer.parseInt(str));
    }
   /* public static String userDifinedToInt(String str)
    {

    }*/

}
