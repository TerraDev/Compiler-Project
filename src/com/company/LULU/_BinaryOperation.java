package com.company.LULU;

public class _BinaryOperation {
    public Variable op3;
    public Variable op1;
    public String operation;
    public Variable op2;

    public _BinaryOperation(Variable op3, Variable op1, String operation, Variable op2)
    {
        this.op3 = new Variable(op3);
        this.op1 = new Variable(op1);
        this.op2 = new Variable(op2);
        this.operation = new String(operation);
        this._rusult();
    }
    public _BinaryOperation(Variable op3, Variable op1, String operation)
    {
        this.op3 = new Variable(op3);
        this.op1 = new Variable(op1);
        this.operation = new String(operation);
        this._rusult();
    }
    public Variable _rusult()
    {
        switch (op3.get_type())
        {
            case "string":                       // op3 = string
                switch (operation)
                {
                    case "=" :

                        if(op1.get_type().equals("string"))
                        {
                            op3.set_Value(op1.get_Value());
                            return op3;
                        }
                        else if(op1.get_type().equals("int"))
                        {
                            op3.set_Value(_Convert.intToString(op1.get_Value()));
                            return op3;
                        }
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to string");
                            return null;
                        }
                    case "+":
                        String temp1;
                        String temp2;
                        if (op1.get_type().equals("string"))
                            temp1 = "string";
                        else if (op1.get_type().equals("int"))
                            temp1 = _Convert.intToString(op1.get_Value());
                        else {
                           op3.set_error("can not convert " + op1.get_type() + " to string");
                            return null;
                        }
                        if (op2.get_type().equals("string"))
                            temp2 = "string";
                        else if (op2.get_type().equals("int"))
                            temp2 = _Convert.intToString(op2.get_Value());
                        else {
                           op3.set_error("can not convert " + op2.get_type() + " to string");
                            return null;
                        }
                        op3.set_Value(temp1 + temp2);
                        return op3;

                    default:
                       op3.set_error(operation + " is not implementation for string.");
                        return null;
                }
            case "int":                           //op3 is int
                int temp1;
                int temp2;
                switch (operation)
                {
                    case "=":
                        if (op1.get_type().equals("int"))
                        {
                            op3.set_Value(op1.get_Value());
                            return op3;
                        }
                        else if (op1.get_type().equals("bool"))
                        {
                            op3.set_Value(_Convert.boolToInt(op1.get_Value()));
                            return op3;
                        }
                        //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return null;
                        }

                    case "|":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_Value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return null;
                        }
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_Value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                           op3.set_error("can not convert " + op2.get_type() + " to int");
                            return null;
                        }
                        op3.set_Value(Integer.toString(temp1 | temp2));
                        return op3;

                    case "&":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_Value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return null;
                        }
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_Value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return null;
                        }
                        op3.set_Value(Integer.toString(temp1 & temp2));
                        return op3;

                    case "+":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_Value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                           op3.set_error("can not convert " + op1.get_type() + " to int");
                            return null;
                        }
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_Value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return null;
                        }
                        op3.set_Value(Integer.toString(temp1 + temp2));
                        return op3;

                    case "-":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_Value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                           op3.set_error("can not convert " + op1.get_type() + " to int");
                            return null;
                        }
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_Value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return null;
                        }
                        op3.set_Value(Integer.toString(temp1 - temp2));
                        return op3;

                    case "*":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_Value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                           op3.set_error("can not convert " + op1.get_type() + " to int");
                            return null;
                        }
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_Value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else {
                           op3.set_error("can not convert " + op2.get_type() + " to int");
                            return null;
                        }
                        op3.set_Value(Integer.toString(temp1 * temp2));
                        return op3;

                    case "/":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_Value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else{
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return null;}
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_Value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else{
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return null;}
                        op3.set_Value(Integer.toString(temp1 / temp2));
                        return op3;

                    case "%":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_Value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else{
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return null;}
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_Value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_Value()));
                            //else if()     op1.gettype == user-defined
                        else{
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return null;}
                        op3.set_Value(Integer.toString(temp1 % temp2));
                        return op3;
                    default:
                       op3.set_error(operation + " is not implementation for int.");
                        return null;
                }
            case "bool" :
                //String flag1;
                //String flag2;
                switch (operation)
                {
                    case "!":
                        if(op1.get_type().equals("bool"))
                        {
                            op3.set_Value(String.valueOf(!Boolean.parseBoolean(op1.get_Value())));
                            return op3;
                        }
                        else if(op1.get_type().equals("int"))
                        {
                            op3.set_Value(String.valueOf(Boolean.parseBoolean(_Convert.intToBool(op1.get_Value()))));
                            return op3;
                        }
                        else {
                           op3.set_error(operation+"is not implementation for "+op1.get_type());
                            return null;
                        }
                    case "||":
                        if (op1.get_type().equals("bool") && op2.get_type().equals("bool"))
                        {
                            op3.set_Value(String.valueOf(Boolean.parseBoolean(op1.get_Value())
                                    || Boolean.parseBoolean(op2.get_Value())));
                            return op3;
                        }
                        else if(op1.get_type().equals("int")&&op2.get_type().equals("int"))
                        {
                            op3.set_Value(String.valueOf(Boolean.parseBoolean(_Convert.intToBool(op1.get_Value()))
                                    || Boolean.parseBoolean(_Convert.intToBool(op2.get_Value()))));
                            return op3;
                        }
                        else if (op1.get_type().equals("bool")&&op2.get_type().equals("int"))
                        {
                            op3.set_Value(String.valueOf(Boolean.parseBoolean(op1.get_Value())
                                    ||Boolean.parseBoolean(_Convert.intToBool(op2.get_Value()))));
                            return op3;
                        }
                        else if (op2.get_type().equals("bool")&&op1.get_type().equals("int"))
                        {
                            op3.set_Value(String.valueOf(Boolean.parseBoolean(op2.get_Value())
                                    ||Boolean.parseBoolean(_Convert.intToBool(op1.get_Value()))));
                            return op3;
                        }
                        else
                        {
                           op3.set_error(operation+"is not implementation for "+op1.get_type()+" and "+op2.get_type());
                            return null;
                        }
                    case "&&":
                        if (op1.get_type().equals("bool") && op2.get_type().equals("bool"))
                        {
                            op3.set_Value(String.valueOf(Boolean.parseBoolean(op1.get_Value())
                                    && Boolean.parseBoolean(op2.get_Value())));
                            return op3;
                        }
                        else if(op1.get_type().equals("int")&&op2.get_type().equals("int"))
                        {
                            op3.set_Value(String.valueOf(Boolean.parseBoolean(_Convert.intToBool(op1.get_Value()))
                                    && Boolean.parseBoolean(_Convert.intToBool(op2.get_Value()))));
                            return op3;
                        }
                        else if (op1.get_type().equals("bool")&&op2.get_type().equals("int"))
                        {
                            op3.set_Value(String.valueOf(Boolean.parseBoolean(op1.get_Value())
                                    && Boolean.parseBoolean(_Convert.intToBool(op2.get_Value()))));
                            return  op3;
                        }
                        else if (op2.get_type().equals("bool")&&op1.get_type().equals("int"))
                        {
                            op3.set_Value(String.valueOf(Boolean.parseBoolean(op2.get_Value())
                                    && Boolean.parseBoolean(_Convert.intToBool(op1.get_Value()))));
                            return op3;
                        }
                        else
                        {
                           op3.set_error(operation+"is not implementation for "+op1.get_type()+" and "+op2.get_type());
                            return null;
                        }
                    case "==":
                        if (op1.get_type().equals(op2.get_type()))
                        {
                            if (op1.get_Value().equals(op2.get_Value())) {
                                op3.set_Value("true");
                                return op3;
                            } else {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            if (op1.get_type().equals("int") && op2.get_type().equals("bool"))
                            {
                                op3.set_Value(String.valueOf(op1.get_Value().equals(_Convert.boolToInt(op2.get_Value()))));
                                return op3;
                            }
                            else if (op2.get_type().equals("int") && op1.get_type().equals("bool"))
                            {
                                op3.set_Value(String.valueOf(op2.get_Value().equals(_Convert.boolToInt(op1.get_Value()))));
                                return op3;
                            }
                            else if (op1.get_type().equals("int") && op2.get_type().equals("string"))
                            {
                                op3.set_Value(String.valueOf(_Convert.intToString(op1.get_Value()).equals(op2.get_Value())));
                                return op3;
                            }
                            else if (op2.get_type().equals("int") && op1.get_type().equals("string"))
                            {
                                op3.set_Value(String.valueOf(_Convert.intToString(op2.get_Value()).equals(op1.get_Value())));
                                return op3;
                            }
                            else if(op1.get_type().equals("int") && op2.get_type().equals("float"))
                            {
                                op3.set_Value(String.valueOf(_Convert.intToFloat(op1.get_Value()).equals(op2.get_Value())));
                                return op3;
                            }
                            else if(op2.get_type().equals("int") && op1.get_type().equals("float"))
                            {
                                op3.set_Value(String.valueOf(_Convert.intToFloat(op2.get_Value()).equals(op1.get_Value())));
                                return op3;
                            }
                            else{
                              op3.set_error(operation + " is not implementation for " + op1.get_type() + " and " + op2.get_type()+ ".");
                                return null;
                            }
                        }

                    case "!=":
                        if (op1.get_type().equals(op2.get_type())) {
                            if (!op1.get_Value().equals(op2.get_Value())) {
                                op3.set_Value("true");
                                return op3;
                            } else {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            if (op1.get_type().equals("int") && op2.get_type().equals("bool"))
                            {
                                op3.set_Value(String.valueOf(!op1.get_Value().equals(_Convert.boolToInt(op2.get_Value()))));
                                return op3;
                            }
                            else if (op2.get_type().equals("int") && op1.get_type().equals("bool"))
                            {
                                op3.set_Value(String.valueOf(!op2.get_Value().equals(_Convert.boolToInt(op1.get_Value()))));
                                return op3;
                            }
                            else if (op1.get_type().equals("int") && op2.get_type().equals("string"))
                            {
                                op3.set_Value(String.valueOf(!_Convert.intToString(op1.get_Value()).equals(op2.get_Value())));
                                return op3;
                            }
                            else if (op2.get_type().equals("int") && op1.get_type().equals("string"))
                            {
                                op3.set_Value(String.valueOf(!_Convert.intToString(op2.get_Value()).equals(op1.get_Value())));
                                return op3;
                            }
                            else if(op1.get_type().equals("int") && op2.get_type().equals("float"))
                            {
                                op3.set_Value(String.valueOf(!_Convert.intToFloat(op1.get_Value()).equals(op2.get_Value())));
                                return op3;
                            }
                            else if(op2.get_type().equals("int") && op1.get_type().equals("float"))
                            {
                                op3.set_Value(String.valueOf(!_Convert.intToFloat(op2.get_Value()).equals(op1.get_Value())));
                                return op3;
                            }
                            else{
                              op3.set_error(operation + " is not implementation for " + op1.get_type() + " and " + op2.get_type()+ ".");
                                return null;
                            }
                        }

                    case ">":
                        if (op1.get_type().equals("int") && op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_Value()) > Integer.parseInt(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_Value()) > Float.parseFloat(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(_Convert.intToFloat(op1.get_Value())) > Float.parseFloat(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_Value()) > Float.parseFloat(_Convert.intToFloat(op2.get_Value())))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else
                        {
                           op3.set_error(operation + " is not implemented for "+op1.get_type()+" " + op2.get_type());
                            return null;
                        }

                    case ">=":
                        if (op1.get_type().equals("int") && op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_Value()) >= Integer.parseInt(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_Value()) >= Float.parseFloat(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(_Convert.intToFloat(op1.get_Value())) >= Float.parseFloat(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_Value()) >= Float.parseFloat(_Convert.intToFloat(op2.get_Value())))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else
                        {
                          op3.set_error(operation + " is not implemented for "+op1.get_type()+" " + op2.get_type());
                            return null;
                        }
                    case "<":
                        if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_Value()) < Integer.parseInt(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_Value()) < Float.parseFloat(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(_Convert.intToFloat(op1.get_Value())) < Float.parseFloat(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_Value()) < Float.parseFloat(_Convert.intToFloat(op2.get_Value())))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            op3.set_error(operation + " is not implemented for "+op1.get_type()+" " + op2.get_type());
                            return null;
                        }
                    case "<=":
                        if (op1.get_type().equals("int")&& op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_Value()) <= Integer.parseInt(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float")&& op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_Value()) <= Float.parseFloat(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(_Convert.intToFloat(op1.get_Value())) <= Float.parseFloat(op2.get_Value()))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_Value()) <= Float.parseFloat(_Convert.intToFloat(op2.get_Value())))
                            {
                                op3.set_Value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_Value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            op3.set_error(operation + " is not implemented for "+op1.get_type()+" " + op2.get_type());
                            return null;
                        }
                    default:
                       op3.set_error(operation + " is not valid");
                        return null ;
                }
            case "float":
                float tmp1;
                float tmp2;
                switch (operation)
                {
                    case "=":
                        if(op1.get_type().equals("float"))
                        {
                            op3.set_Value(op1.get_Value());
                            return op3;
                        }
                        else if(op1.get_type().equals("int"))
                        {
                            op3.set_Value(_Convert.intToFloat(op1.get_Value()));
                        }
                        else{
                          op3.set_error("can not convert "+op1.get_type()+" to float");
                            return null ;}
                    case "+":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_Value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_Value()));
                        else{
                            op3.set_error("can not convert " + op1.get_type() +" to float");
                            return null;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_Value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_Value()));
                        else{
                            op3.set_error("can not convet " + op1.get_type() +" to float");
                            return null;}
                        op3.set_Value(Float.toString(tmp1 + tmp2));
                        return op3;
                    case "-":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_Value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_Value()));
                        else{
                           op3.set_error("can not convet " + op1.get_type() +" to float");
                            return null;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_Value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_Value()));
                        else{
                           op3.set_error("can not convet " + op1.get_type() +" to float");
                            return null;}
                        op3.set_Value(Float.toString(tmp1 - tmp2));
                        return op3;
                    case "*":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_Value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_Value()));
                        else{
                            op3.set_error("can not convet " + op1.get_type() +" to float");
                            return null;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_Value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_Value()));
                        else{
                           op3.set_error("can not convet " + op1.get_type() +" to float");
                            return null;}
                        op3.set_Value(Float.toString(tmp1 * tmp2));
                        return op3;
                    case "/":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_Value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_Value()));
                        else{
                          op3.set_error("can not convet " + op1.get_type() +" to float");
                            return null;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_Value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_Value()));
                        else{
                           op3.set_error("can not convert " + op1.get_type() +" to float");
                            return null;
                        }
                        op3.set_Value(Float.toString(tmp1 / tmp2));
                        return op3;
                    case "%":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_Value());
                        else if(op1.get_type().equals("int") )
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_Value()));
                        else{
                            op3.set_error("can not convert " + op1.get_type() +" to float");
                            return null;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_Value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_Value()));
                        else{
                           op3.set_error("can not convert " + op1.get_type() +" to float");
                            return null;}
                        op3.set_Value(Float.toString(tmp1 % tmp2));
                        return op3;
                    default:
                        op3.set_error(operation +" is invalid");
                        return null;
                }
            default:
                op3.set_error("this " + operation+ " is not valid.");
                return null;
        }
    }
}
