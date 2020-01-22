package com.company;
import java.util.*;

public class BinaryOperation {
    private _operand op3;
    private _operand op1;
    private String operation;
    private _operand op2;

    public BinaryOperation(_operand op3,_operand op1, String operation,_operand op2)
    {
        this.op3 = new _operand(op3);
        this.op1 = new _operand(op1);
        this.op2 = new _operand(op2);
        this.operation = new String(operation);
    }
    public BinaryOperation(_operand op3,_operand op1, String operation)
    {
        this.op3 = new _operand(op3);
        this.op1 = new _operand(op1);
        this.operation = new String(operation);
    }
    public String _rusult()
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
                            return op3.get_value();
                        }
                        else if(op1.get_type().equals("int"))
                        {
                            op3.set_value(_Convert.intToString(op1.get_value()));
                            return op3.get_value();
                        }
                        else
                            return "can not convert " + op1.get_type() + " to string";
                    case "+":
                        String temp1;
                        String temp2;
                        if (op1.get_type().equals("string"))
                            temp1 = "string";
                        else if (op1.get_type().equals("int"))
                            temp1 = _Convert.intToString(op1.get_value());
                        else
                            return "can not convert " + op1.get_type() + " to string";
                        if (op2.get_type().equals("string"))
                            temp2 = "string";
                        else if (op2.get_type().equals("int"))
                            temp2 = _Convert.intToString(op2.get_value());
                        else
                            return "can not convert " + op2.get_type() + " to string";
                        op3.set_value(temp1 + temp2);
                        return op3.get_value();

                    default:
                        return operation + " is not implementation for string.";
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
                            return op3.get_value();
                        }
                        else if (op1.get_type().equals("bool"))
                        {
                            op3.set_value(_Convert.boolToInt(op1.get_value()));
                            return op3.get_value();
                        }
                        //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op1.get_type() + " to int";
                    case "+":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_value()));
                        //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op1.get_type() + " to int";
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op2.get_type() + " to int";
                        op3.set_value(Integer.toString(temp1 + temp2));
                        return op3.get_value();

                    case "-":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_value()));
                            //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op1.get_type() + " to int";
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op2.get_type() + " to int";
                        op3.set_value(Integer.toString(temp1 - temp2));
                        return op3.get_value();

                    case "*":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_value()));
                            //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op1.get_type() + " to int";
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op2.get_type() + " to int";
                        op3.set_value(Integer.toString(temp1 * temp2));
                        return op3.get_value();

                    case "/":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_value()));
                            //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op1.get_type() + " to int";
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op2.get_type() + " to int";
                        op3.set_value(Integer.toString(temp1 / temp2));
                        return op3.get_value();

                    case "%":
                        //initial temp1
                        if(op1.get_type().equals("int"))
                            temp1 = Integer.parseInt(op1.get_value());
                        else if (op1.get_type().equals("bool"))
                            temp1 = Integer.parseInt(_Convert.boolToInt(op1.get_value()));
                            //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op1.get_type() + " to int";
                        //initial temp2
                        if(op2.get_type().equals("int"))
                            temp2 = Integer.parseInt(op2.get_value());
                        else if (op2.get_type().equals("bool"))
                            temp2 = Integer.parseInt(_Convert.boolToInt(op2.get_value()));
                            //else if()     op1.gettype == user-defined
                        else
                            return "can not convert " + op2.get_type() + " to int";
                        op3.set_value(Integer.toString(temp1 % temp2));
                        return op3.get_value();
                    default:
                        return operation + " is not implementation for int.";
                }
            case "bool" :
                //String flag1;
                //String flag2;
                switch (operation)
                {
                    case "==":
                        if (op1.get_type().equals(op2.get_type()))
                        {
                            if (op1.get_value().equals(op2.get_value())) {
                                op3.set_value("true");
                                return op3.get_value();
                            } else {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else
                        {

                        }

                    case "!=":
                        if (op1.get_type().equals(op2.get_type())) {
                            if (!op1.get_value().equals(op2.get_value())) {
                                op3.set_value("true");
                                return op3.get_value();
                            } else {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else
                        {

                        }

                    case ">":
                        if (op1.get_type().equals("int") && op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_value()) > Integer.parseInt(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_value()) > Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(_Convert.intToFloat(op1.get_value())) > Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_value()) > Float.parseFloat(_Convert.intToFloat(op2.get_value())))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else
                        {
                            return operation + " is not implemented for "+op1.get_type()+" " + op2.get_type();
                        }

                    case ">=":
                        if (op1.get_type().equals("int") && op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_value()) >= Integer.parseInt(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_value()) >= Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(_Convert.intToFloat(op1.get_value())) >= Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_value()) >= Float.parseFloat(_Convert.intToFloat(op2.get_value())))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else
                        {
                            return operation + " is not implemented for "+op1.get_type()+" " + op2.get_type();
                        }
                    case "<":
                        if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_value()) < Integer.parseInt(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_value()) < Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(_Convert.intToFloat(op1.get_value())) < Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_value()) < Float.parseFloat(_Convert.intToFloat(op2.get_value())))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else
                        {
                            return operation + " is not implemented for "+op1.get_type()+" " + op2.get_type();
                        }
                    case "<=":
                        if (op1.get_type().equals("int")&& op2.get_type().equals("int"))
                        {
                            if(Integer.parseInt(op1.get_value()) <= Integer.parseInt(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("float")&& op2.get_type().equals("float"))
                        {
                            if(Float.parseFloat(op1.get_value()) <= Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("int") && op2.get_type().equals("float"))
                        {
                            if (Float.parseFloat(_Convert.intToFloat(op1.get_value())) <= Float.parseFloat(op2.get_value()))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else if (op1.get_type().equals("float") && op2.get_type().equals("int"))
                        {
                            if (Float.parseFloat(op1.get_value()) <= Float.parseFloat(_Convert.intToFloat(op2.get_value())))
                            {
                                op3.set_value("true");
                                return op3.get_value();
                            }
                            else
                            {
                                op3.set_value("false");
                                return op3.get_value();
                            }
                        }
                        else
                        {
                            return operation + " is not implemented for "+op1.get_type()+" " + op2.get_type();
                        }
                    default:
                        return operation + " is not valid";
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
                            return op3.get_value();
                        }
                        else if(op1.get_type().equals("int"))
                        {
                            op3.set_value(_Convert.intToFloat(op1.get_value()));
                        }
                        else
                            return "can not convert "+op1.get_type()+" to float";
                    case "+":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_value()));
                        else
                            return "can not convert " + op1.get_type() +" to float";
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_value()));
                        else
                            return "can not convet " + op1.get_type() +" to float";
                        op3.set_value(Float.toString(tmp1 + tmp2));
                        return op3.get_value();
                    case "-":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_value()));
                        else
                            return "can not convet " + op1.get_type() +" to float";
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_value()));
                        else
                            return "can not convet " + op1.get_type() +" to float";
                        op3.set_value(Float.toString(tmp1 - tmp2));
                        return op3.get_value();
                    case "*":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_value()));
                        else
                            return "can not convet " + op1.get_type() +" to float";
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_value()));
                        else
                            return "can not convet " + op1.get_type() +" to float";
                        op3.set_value(Float.toString(tmp1 * tmp2));
                        return op3.get_value();
                    case "/":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int"))
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_value()));
                        else
                            return "can not convet " + op1.get_type() +" to float";
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_value()));
                        else
                            return "can not convet " + op1.get_type() +" to float";
                        op3.set_value(Float.toString(tmp1 / tmp2));
                        return op3.get_value();
                    case "%":
                        //initial tmp1
                        if (op1.get_type().equals("float"))
                            tmp1 = Float.parseFloat(op1.get_value());
                        else if(op1.get_type().equals("int") )
                            tmp1 = Float.parseFloat(_Convert.intToFloat(op1.get_value()));
                        else
                            return "can not convet " + op1.get_type() +" to float";
                        //initial tmp2
                        if (op2.get_type().equals("float"))
                            tmp2 = Float.parseFloat(op2.get_value());
                        else if(op2.get_type().equals("int"))
                            tmp2 = Float.parseFloat(_Convert.intToFloat(op2.get_value()));
                        else
                            return "can not convert " + op1.get_type() +" to float";
                        op3.set_value(Float.toString(tmp1 % tmp2));
                        return op3.get_value();
                    default:
                        return operation +" is invalid";
                }
            default:
                return " ";
        }
    }
}

