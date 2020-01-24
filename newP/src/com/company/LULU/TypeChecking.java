package com.company.LULU;
import java.util.*;

public class TypeChecking {

    public static class Funny_Constant
    {
        String value;
        String type;
        public Funny_Constant(String val,String type2)
        {
            value = val;
            type=type2;
        }

    }

    public  Funny_Constant Add(Funny_Constant x , Funny_Constant y)
    {
        if(x.type=="int" && y.type=="int")
            return new Funny_Constant(Integer.toString(Integer.parseInt(x.value) + Integer.parseInt(y.value)), "int");
        //else... different types...
        return null;
    }

    public static Funny_Constant Do_Operation(Funny_Constant a1 , String op , Funny_Constant a2)
    {
        if (!CanConvert(a1,a2)) return null; //can we convert it?
        if(op=="+")
         {/*if...continue*/}; //what should it be converted to?
        //else if(op=="-")
        // return Minus(a1)
        //else if(op==1)
        //... if nothing works
        return null;//this will never happen because the operators are identified
    }

     private static boolean CanConvert(Funny_Constant a1, Funny_Constant a2)
     {
         //""HAMASH IF-ELSE"" PIADE SAAZIE NEMUDARE DOC
         return true;
     }

//    static Stack<Funny_Constant> stk = new Stack<Funny_Constant>();


//use tmpstack or whateva
}
