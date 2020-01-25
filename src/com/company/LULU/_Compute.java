package com.company.LULU;

public class _Compute {
    public static Variable ReturnVar(Variable a1, String op, Variable a2)
    {
        Variable temp;
        if (a1.get_type() == null || a2.get_type() == null)
        {
            temp = null;
            return temp;
        }

        else
        {
            temp = new Variable(null,_CheckType.getResultType(a1.get_type(),op,a2.get_type()));
            _BinaryOperation x = new _BinaryOperation(temp,a1,op,a2);
            return x._rusult();
        }
    }
    public static Variable ReturnVar(String op, Variable a2)
    {
        Variable temp;
        temp = new Variable(null,_CheckType.getResultType(null,op,a2.get_type()));
        _BinaryOperation x = new _BinaryOperation(temp,a2,op);
        return x._rusult();
    }
}
