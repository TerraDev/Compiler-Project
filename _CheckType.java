package com.company;

import java.util.*;

public class _CheckType {
    public static String getResultType(String op1_type,String operation,  String op2_type)
    {
        if (operation.equals("==")||operation.equals("!=")||operation.equals(">")||operation.equals(">=")||
                operation.equals("<")||operation.equals("<="))
            return "bool";
        if(op1_type.equals(op2_type))
        {
            return op1_type;
        }
        else if((op1_type.equals("int")&&op2_type.equals("float")) || (op2_type.equals("int")&&op1_type.equals("float")))
        {
            return "float";
        }
        else if((op1_type.equals("int")&&op2_type.equals("bool"))|| (op2_type.equals("int")&&op1_type.equals("bool")))
        {
            return "int";
        }
        else if((op1_type.equals("int")&&op2_type.equals("string")) || (op2_type.equals("string")&&op1_type.equals("int")))
        {
            return "string";
        }
        return null;
    }
}
