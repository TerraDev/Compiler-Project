package com.company.LULU;

public class Variable {
    public String name;
    public String value;
    public String type;
    public String _error;
    public boolean Const;
    public String Access;
    public int[] ArrayDimensionSizes=null;

//    public String name;
//    public String type;
//    public boolean Const = false;
 //   public String value;
//    public String Access;
//    public int[] ArrayDimensionSizes=null;

    public boolean CheckConflict(Variable other)
    {
        if (other.name.equals(this.name))
            return false;	//also give error
        else
            return true;
    }

    public Variable()
    {
            //TODO: FILL maybe
    }

    public Variable(String value, String type)
    {
        this.value = value;
        this.type = type;
    }
    public Variable(Variable op)
    {
        this.type = op.get_type();
        this.value = op.get_Value();
    }



    public void set_Value(String value) {
        this.value = value;
    }

    public void set_Type(String type) {
        this.type = type;
    }

    public void set_error(String _error) {
        this._error = _error;
    }

    public String get_Value() {
        return value;
    }

    public String get_type() {
        return type;
    }

    public String get_error() {
        return _error;
    }
}
