package com.company.LULU;

public class Amir_BinaryOperation {
    public Amir_operand op3;
    public Amir_operand op1;
    public String operation;
    public Amir_operand op2;

    public Amir_BinaryOperation(Amir_operand op3, Amir_operand op1, String operation, Amir_operand op2)
    {
        this.op3 = new Amir_operand(op3);
        this.op1 = new Amir_operand(op1);
        this.op2 = new Amir_operand(op2);
        this.operation = new String(operation);
        this._rusult();
    }
    public Amir_BinaryOperation(Amir_operand op3, Amir_operand op1, String operation)
    {
        this.op3 = new Amir_operand(op3);
        this.op1 = new Amir_operand(op1);
        this.operation = new String(operation);
        this._rusult();
    }
    public Amir_operand _rusult()
    {
        switch (op3.get_type())
        {
            case "string":                       // op3 = string
                switch (operation)
                {
                    case "=" :
                        if(op1.get_type().equals("string"))
                        {
                            op3.set_value(op1.get_value());
                            return op3;
                        }
                        else if(op1.get_type().equals("int"))
                        {
                            op3.set_value(Amir_Convert.intToString(op1.get_value()));
                            return op3;
                        }
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to string");
                            return op3;
                        }
                    case "+":
                        String temp1;
                        String temp2;
                        if (op1.get_type().equals("string"))
                            temp1 = "string";
                        else if (op1.get_type().equals("int"))
                            temp1 = Amir_Convert.intToString(op1.get_value());
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to string");
                            return op3;
                        }
                        if (op2.get_type().equals("string"))
                            temp2 = "string";
                        else if (op2.get_type().equals("int"))
                            temp2 = Amir_Convert.intToString(op2.get_value());
                        else {
                            op3.set_error("can not convert " + op2.get_type() + " to string");
                            return op3;
                        }
                        op3.set_value(temp1 + temp2);
                        return op3;

                    default:
                        op3.set_error(operation + " is not implementation for string.");
                        return op3;
                }
            case "int":                           //op3 is int
                int temp1;
                int temp2;
                switch (operation)
                {
                    case "=":
                        if (op1.get_type().equals("int"))
                        {
                            op3.set_value(op1.get_value());
                            return op3;
                        }
                        else if (op1.get_type().equals("bool"))
                        {
                            op3.set_value(Amir_Convert.boolToInt(op1.get_value()));
                            return op3;
                        }
                        //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return op3;
                        }
                    case "+":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(Amir_Convert.boolToInt(op1.get_value()));
                        //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return op3;
                        }
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(Amir_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return op3;
                        }
                        op3.set_value(Integer.toString(temp1 + temp2));
                        return op3;

                    case "-":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(Amir_Convert.boolToInt(op1.get_value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return op3;
                        }
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(Amir_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return op3;
                        }
                        op3.set_value(Integer.toString(temp1 - temp2));
                        return op3;

                    case "*":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(Amir_Convert.boolToInt(op1.get_value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return op3;
                        }
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(Amir_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else {
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return op3;
                        }
                        op3.set_value(Integer.toString(temp1 * temp2));
                        return op3;

                    case "/":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(Amir_Convert.boolToInt(op1.get_value()));
                            //else if()     op1.gettype == user-defined
                        else{
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return op3;}
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(Amir_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else{
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return op3;}
                        op3.set_value(Integer.toString(temp1 / temp2));
                        return op3;

                    case "%":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(Amir_Convert.boolToInt(op1.get_value()));
                            //else if()     op1.gettype == user-defined
                        else{
                            op3.set_error("can not convert " + op1.get_type() + " to int");
                            return op3;}
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(Amir_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else{
                            op3.set_error("can not convert " + op2.get_type() + " to int");
                            return op3;}
                        op3.set_value(Integer.toString(temp1 % temp2));
                        return op3;
                    default:
                        op3.set_error(operation + " is not implementation for int.");
                        return op3;
                }
            case "bool" :
                //String flag1;
                //String flag2;
                switch (operation)
                {
                    case "!":
                        if(op1.get_type().equals("bool"))
                        {
                            op3.set_value(String.valueOf(!Boolean.parseBoolean(op1.get_value())));
                            return op3;
                        }
                        else if(op1.get_type().equals("int"))
                        {
                            op3.set_value(String.valueOf(Boolean.parseBoolean(Amir_Convert.intToBool(op1.get_value()))));
                            return op3;
                        }
                        else {
                            op3.set_error(operation+"is not implementation for "+op1.get_type());
                            return op3;
                        }
                    case "||":
                        if (op1.get_type().equals("bool") && op2.get_type().equals("bool"))
                        {
                            op3.set_value(String.valueOf(Boolean.parseBoolean(op1.get_value())
                                    || Boolean.parseBoolean(op2.get_value())));
                            return op3;
                        }
                        else if(op1.get_type().equals("int")&&op2.get_type().equals("int"))
                        {
                            op3.set_value(String.valueOf(Boolean.parseBoolean(Amir_Convert.intToBool(op1.get_value()))
                                    || Boolean.parseBoolean(Amir_Convert.intToBool(op2.get_value()))));
                            return op3;
                        }
                        else if (op1.get_type().equals("bool")&&op2.get_type().equals("int"))
                        {
                            op3.set_value(String.valueOf(Boolean.parseBoolean(op1.get_value())
                                    ||Boolean.parseBoolean(Amir_Convert.intToBool(op2.get_value()))));
                        }
                        else if (op2.get_type().equals("bool")&&op1.get_type().equals("int"))
                        {
                            op3.set_value(String.valueOf(Boolean.parseBoolean(op2.get_value())
                                    ||Boolean.parseBoolean(Amir_Convert.intToBool(op1.get_value()))));
                        }
                        else
                        {
                            op3.set_error(operation+"is not implementation for "+op1.get_type()+" and "+op2.get_type());
                        }
                    case "&&":
                        if (op1.get_type().equals("bool") && op2.get_type().equals("bool"))
                        {
                            op3.set_value(String.valueOf(Boolean.parseBoolean(op1.get_value())
                                    && Boolean.parseBoolean(op2.get_value())));
                            return op3;
                        }
                        else if(op1.get_type().equals("int")&&op2.get_type().equals("int"))
                        {
                            op3.set_value(String.valueOf(Boolean.parseBoolean(Amir_Convert.intToBool(op1.get_value()))
                                    && Boolean.parseBoolean(Amir_Convert.intToBool(op2.get_value()))));
                            return op3;
                        }
                        else if (op1.get_type().equals("bool")&&op2.get_type().equals("int"))
                        {
                            op3.set_value(String.valueOf(Boolean.parseBoolean(op1.get_value())
                                    && Boolean.parseBoolean(Amir_Convert.intToBool(op2.get_value()))));
                        }
                        else if (op2.get_type().equals("bool")&&op1.get_type().equals("int"))
                        {
                            op3.set_value(String.valueOf(Boolean.parseBoolean(op2.get_value())
                                    && Boolean.parseBoolean(Amir_Convert.intToBool(op1.get_value()))));
                        }
                        else
                        {
                            op3.set_error(operation+"is not implementation for "+op1.get_type()+" and "+op2.get_type());
                        }
                    case "==":
                        if (op1.get_type().equals(op2.get_type()))
                        {
                            if (op1.get_value().equals(op2.get_value())) {
                                op3.set_value("true");
                                return op3;
                            } else {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            if (op1.get_type().equals("int") && op2.get_type().equals("bool"))
                            {
                                op3.set_value(String.valueOf(op1.get_value().equals(Amir_Convert.boolToInt(op2.get_value()))));
                                return op3;
                            }
                            else if (op2.get_type().equals("int") && op1.get_type().equals("bool"))
                            {
                                op3.set_value(String.valueOf(op2.get_value().equals(Amir_Convert.boolToInt(op1.get_value()))));
                                return op3;
                            }
                            else if (op1.get_type().equals("int") && op2.get_type().equals("string"))
                            {
                                op3.set_value(String.valueOf(Amir_Convert.intToString(op1.get_value()).equals(op2.get_value())));
                                return op3;
                            }
                            else if (op2.get_type().equals("int") && op1.get_type().equals("string"))
                            {
                                op3.set_value(String.valueOf(Amir_Convert.intToString(op2.get_value()).equals(op1.get_value())));
                                return op3;
                            }
                            else if(op1.get_type().equals("int") && op2.get_type().equals("float"))
                            {
                                op3.set_value(String.valueOf(Amir_Convert.intToFloat(op1.get_value()).equals(op2.get_value())));
                                return op3;
                            }
                            else if(op2.get_type().equals("int") && op1.get_type().equals("float"))
                            {
                                op3.set_value(String.valueOf(Amir_Convert.intToFloat(op2.get_value()).equals(op1.get_value())));
                                return op3;
                            }
                            else{op3.set_error(operation + " is not implementation for " + op1.get_type() + " and " + op2.get_type()+ "."); return op3;}
                        }

                    case "!=":
                        if (op1.get_type().equals(op2.get_type())) {
                            if (!op1.get_value().equals(op2.get_value())) {
                                op3.set_value("true");
                                return op3;
                            } else {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            if (op1.get_type().equals("int") && op2.get_type().equals("bool"))
                            {
                                op3.set_value(String.valueOf(!op1.get_value().equals(Amir_Convert.boolToInt(op2.get_value()))));
                                return op3;
                            }
                            else if (op2.get_type().equals("int") && op1.get_type().equals("bool"))
                            {
                                op3.set_value(String.valueOf(!op2.get_value().equals(Amir_Convert.boolToInt(op1.get_value()))));
                                return op3;
                            }
                            else if (op1.get_type().equals("int") && op2.get_type().equals("string"))
                            {
                                op3.set_value(String.valueOf(!Amir_Convert.intToString(op1.get_value()).equals(op2.get_value())));
                                return op3;
                            }
                            else if (op2.get_type().equals("int") && op1.get_type().equals("string"))
                            {
                                op3.set_value(String.valueOf(!Amir_Convert.intToString(op2.get_value()).equals(op1.get_value())));
                                return op3;
                            }
                            else if(op1.get_type().equals("int") && op2.get_type().equals("float"))
                            {
                                op3.set_value(String.valueOf(!Amir_Convert.intToFloat(op1.get_value()).equals(op2.get_value())));
                                return op3;
                            }
                            else if(op2.get_type().equals("int") && op1.get_type().equals("float"))
                            {
                                op3.set_value(String.valueOf(!Amir_Convert.intToFloat(op2.get_value()).equals(op1.get_value())));
                                return op3;
                            }
                            else{op3.set_error(operation + " is not implementation for " + op1.get_type() + " and " + op2.get_type()+ "."); return op3;}
                        }

                    case ">":
                        if (op1.get_type().equals("int") && op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_value()) > Integer.parseInt(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_value()) > Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(Amir_Convert.intToFloat(op1.get_value())) > Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_value()) > Float.parseFloat(Amir_Convert.intToFloat(op2.get_value())))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            op3.set_error(operation + " is not implemented for "+op1.get_type()+" " + op2.get_type());
                            return op3;
                        }

                    case ">=":
                        if (op1.get_type().equals("int") && op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_value()) >= Integer.parseInt(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_value()) >= Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(Amir_Convert.intToFloat(op1.get_value())) >= Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_value()) >= Float.parseFloat(Amir_Convert.intToFloat(op2.get_value())))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            op3.set_error(operation + " is not implemented for "+op1.get_type()+" " + op2.get_type());
                            return op3;
                        }
                    case "<":
                        if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_value()) < Integer.parseInt(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_value()) < Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(Amir_Convert.intToFloat(op1.get_value())) < Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_value()) < Float.parseFloat(Amir_Convert.intToFloat(op2.get_value())))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            op3.set_error(operation + " is not implemented for "+op1.get_type()+" " + op2.get_type());
                            return op3;
                        }
                    case "<=":
                        if (op1.get_type().equals("int")&& op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_value()) <= Integer.parseInt(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float")&& op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_value()) <= Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(Amir_Convert.intToFloat(op1.get_value())) <= Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_value()) <= Float.parseFloat(Amir_Convert.intToFloat(op2.get_value())))
                            {
                                op3.set_value("true");
                                return op3;
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3;
                            }
                        }
                        else
                        {
                            op3.set_error(operation + " is not implemented for "+op1.get_type()+" " + op2.get_type());
                            return op3;
                        }
                    default:
                        op3.set_error(operation + " is not valid");
                        return op3 ;
            }
            case "float":
                float tmp1;
                float tmp2;
                switch (operation)
                {
                    case "=":
                        if(op1.get_type().equals("float"))
                        {
                            op3.set_value(op1.get_value());
                            return op3;
                        }
                        else if(op1.get_type().equals("int"))
                        {
                            op3.set_value(Amir_Convert.intToFloat(op1.get_value()));
                        }
                        else{
                            op3.set_error("can not convert "+op1.get_type()+" to float");
                            return op3 ;}
                    case "+":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(Amir_Convert.intToFloat(op1.get_value()));
                        else{
                            op3.set_error("can not convert " + op1.get_type() +" to float");
                            return op3;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(Amir_Convert.intToFloat(op2.get_value()));
                        else{
                            op3.set_error("can not convet " + op1.get_type() +" to float");
                            return op3;}
                        op3.set_value(Float.toString(tmp1 + tmp2));
                        return op3;
                    case "-":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(Amir_Convert.intToFloat(op1.get_value()));
                        else{
                            op3.set_error("can not convet " + op1.get_type() +" to float");
                            return op3;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(Amir_Convert.intToFloat(op2.get_value()));
                        else{
                            op3.set_error("can not convet " + op1.get_type() +" to float");
                            return op3;}
                        op3.set_value(Float.toString(tmp1 - tmp2));
                        return op3;
                    case "*":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(Amir_Convert.intToFloat(op1.get_value()));
                        else{
                            op3.set_error("can not convet " + op1.get_type() +" to float");
                            return op3;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(Amir_Convert.intToFloat(op2.get_value()));
                        else{
                            op3.set_error("can not convet " + op1.get_type() +" to float");
                            return op3;}
                        op3.set_value(Float.toString(tmp1 * tmp2));
                        return op3;
                    case "/":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(Amir_Convert.intToFloat(op1.get_value()));
                        else{
                            op3.set_error("can not convet " + op1.get_type() +" to float");
                            return op3;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(Amir_Convert.intToFloat(op2.get_value()));
                        else{
                            op3.set_error("can not convert " + op1.get_type() +" to float");
                            return op3;}
                        op3.set_value(Float.toString(tmp1 / tmp2));
                        return op3;
                    case "%":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int") )
                            tmp1 = Float.parseFloat(Amir_Convert.intToFloat(op1.get_value()));
                        else{
                            op3.set_error("can not convert " + op1.get_type() +" to float");
                            return op3;}
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(Amir_Convert.intToFloat(op2.get_value()));
                        else{
                            op3.set_error("can not convert " + op1.get_type() +" to float");
                            return op3;}
                        op3.set_value(Float.toString(tmp1 % tmp2));
                        return op3;
                    default:
                        op3.set_error(operation +" is invalid");
                        return op3;
                }
            default:
                op3.set_error("this " + operation+ " is not valid.");
                return op3;
        }
    }
}

