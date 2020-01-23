package com.company.LULU;

public class Amir_operand {
    private String _name;//
    private String _value;
    private String _type;
    private String _error;

    public Amir_operand(String _name, String _value, String _type)
    {
        this._name = new String(_name);
        this._value = new String(_value);
        this._type = new String(_type);
    }
    public Amir_operand(Amir_operand op)
    {
        this._name = op.get_name();
        this._type = op.get_type();
        this._value = op.get_value();
    }

    public void set_name(String _name) {
        this._name = _name;
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

    public String get_name() {
        return _name;
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
