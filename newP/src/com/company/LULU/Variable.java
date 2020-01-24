package com.company.LULU;

public class Variable {
    private String _value;
    private String _type;
    private String _error;

    public Variable(String _value, String _type)
    {
        this._value = new String(_value);
        this._type = new String(_type);
    }
    public Variable(Variable op)
    {
        this._type = op.get_type();
        this._value = op.get_value();
    }


    public void set_value(String _value) {
        this._value = _value;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public void set_error(String _error) {
        this._error = _error;
    }

    public String get_value() {
        return _value;
    }

    public String get_type() {
        return _type;
    }

    public String get_error() {
        return _error;
    }
}
