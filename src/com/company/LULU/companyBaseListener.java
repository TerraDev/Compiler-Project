// Generated from F:/Behdad/University/Books/Term 5/Compilers/Proj/Phase 2/newP/src/com/company\company.g4 by ANTLR 4.7.2
package com.company.LULU;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

/**
 * This class provides an empty implementation of {@link companyListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class companyBaseListener implements companyListener {

	Symbol_table st_global = new Symbol_table();
	Stack<Symbol_table> stack = new Stack<Symbol_table>();
	String parse_state = "" ;
	void SetX(String s) {parse_state = s;}

	@Override public void enterProgram(companyParser.ProgramContext ctx) { }

	@Override public void exitProgram(companyParser.ProgramContext ctx) { }

	@Override public void enterTest(companyParser.TestContext ctx) { }

	@Override public void exitTest(companyParser.TestContext ctx) { }

	// ft_dcl: Declare '{' (func_dcl| type_dcl| var_def)+ '}';
	@Override public void enterFt_dcl(companyParser.Ft_dclContext ctx)
	{
		SetX("global");
		stack.push(st_global);
	}

	@Override public void exitFt_dcl(companyParser.Ft_dclContext ctx)
	{
	}

	public static Wrapper<Function_Signature> tmpfunc;

	@Override public void enterFunc_dcl(companyParser.Func_dclContext ctx)
	{
		System.out.println("in " + ctx.getText() + " which is rule number " + ctx.getRuleIndex());
		List<String> tmpreturn =null;
		if(ctx.args(0) != null)
		{
			System.out.println( ctx.args(0).getText() +" is NOT EMPTY" );
			tmpreturn = new ArrayList<String>();
		}
		List<String> tmppara = null;
		if(ctx.args(1)!=null || ctx.args_var() != null)
		{
			tmppara=new ArrayList<String>();
		}

		String tmpname = ctx.ID().getText();
		tmpfunc = new Wrapper<Function_Signature>();

		tmpfunc.tmp = new Function_Signature();
		tmpfunc.tmp.returns=tmpreturn;
		tmpfunc.tmp.para = tmppara;
		tmpfunc.tmp.name = tmpname;

	}

	@Override public void exitFunc_dcl(companyParser.Func_dclContext ctx)
	{
		st_global.add(tmpfunc.tmp.returns,tmpfunc.tmp.name,tmpfunc.tmp.para);	// returns true if added , false if not
		tmpfunc = null;
		return_or_para= null;
	}

	@Override public void enterArgs1(companyParser.Args1Context ctx)
	{
		Check_retpar(ctx.getRuleIndex());
		String tmptype="";
		for (var x: ctx.children)
		{
			tmptype += x.getText();
		}
		if(return_or_para.tmp == "return")
			tmpfunc.tmp.returns.add(tmptype);
		else if(return_or_para.tmp == "para")
			tmpfunc.tmp.para.add(tmptype);
	}


	@Override public void exitArgs1(companyParser.Args1Context ctx)
	{
	}

	Wrapper<String> return_or_para=null;

	public void Check_retpar(int ruleindex)
	{
		if(ruleindex==1)	// in return mode
		{
			return_or_para = new Wrapper<String>();
			return_or_para.tmp = "return";
		}
		else if(ruleindex==6)  // in para mode
		{
			return_or_para = new Wrapper<String>();
			return_or_para.tmp = "para";
		}
		//else it is in the middle -_- ...
	}

	@Override public void enterArgs2(companyParser.Args2Context ctx)
	{
		Check_retpar(ctx.getRuleIndex());
	}


	@Override public void exitArgs2(companyParser.Args2Context ctx)
	{

		if(parse_state == "global")	//function return type
		{
			String tmptype="";
			for (int i = 2; i < ctx.getChildCount(); i++)
			{
			tmptype+=ctx.getChild(i).getText();
			}
			if(return_or_para.tmp=="return")
				tmpfunc.tmp.returns.add(tmptype);
			else if(return_or_para.tmp=="para")
				tmpfunc.tmp.para.add(tmptype);
			System.out.println(tmptype);
		}


	}

	@Override public void enterArgs_var1(companyParser.Args_var1Context ctx)
	{
		return_or_para.tmp="para";
		tmpfunc.tmp.paraNames = new ArrayList<String>();
		String tmptype = "";
		for (int i = 0; i < ctx.getChildCount()-1; i++)
		{
			tmptype+=ctx.getChild(i).getText();
		}
		tmpfunc.tmp.para.add(tmptype);
		tmpfunc.tmp.paraNames.add(ctx.ID().getText());
	}


	@Override public void exitArgs_var1(companyParser.Args_var1Context ctx) { }


	@Override public void enterArgs_var2(companyParser.Args_var2Context ctx) { }


	@Override public void exitArgs_var2(companyParser.Args_var2Context ctx)
	{
		String tmptype="";
		for (int i = 2; i < ctx.getChildCount()-1; i++)
		{
			tmptype+=ctx.getChild(i).getText();
		}
		tmpfunc.tmp.para.add(tmptype);
		tmpfunc.tmp.paraNames.add(ctx.ID().getText());
	}


	@Override public void enterType_dcl(companyParser.Type_dclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType_dcl(companyParser.Type_dclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_def(companyParser.Var_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_def(companyParser.Var_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_val(companyParser.Var_valContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_val(companyParser.Var_valContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFt_def(companyParser.Ft_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFt_def(companyParser.Ft_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType_def(companyParser.Type_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType_def(companyParser.Type_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComponent(companyParser.ComponentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComponent(companyParser.ComponentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAccess_modifier(companyParser.Access_modifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAccess_modifier(companyParser.Access_modifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFun_def(companyParser.Fun_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFun_def(companyParser.Fun_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlock(companyParser.BlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(companyParser.BlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStmt(companyParser.StmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStmt(companyParser.StmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssign(companyParser.AssignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssign(companyParser.AssignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar(companyParser.VarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar(companyParser.VarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRef(companyParser.RefContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRef(companyParser.RefContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(companyParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(companyParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_call(companyParser.Func_callContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_call(companyParser.Func_callContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterList(companyParser.ListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitList(companyParser.ListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterHandle_call(companyParser.Handle_callContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHandle_call(companyParser.Handle_callContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParams(companyParser.ParamsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParams(companyParser.ParamsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCond_stmt(companyParser.Cond_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCond_stmt(companyParser.Cond_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSwitch_body(companyParser.Switch_bodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSwitch_body(companyParser.Switch_bodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoop_stmt(companyParser.Loop_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoop_stmt(companyParser.Loop_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType(companyParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType(companyParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConst_val(companyParser.Const_valContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConst_val(companyParser.Const_valContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnary_op(companyParser.Unary_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnary_op(companyParser.Unary_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOp1(companyParser.Op1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOp1(companyParser.Op1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOp2(companyParser.Op2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOp2(companyParser.Op2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOp3(companyParser.Op3Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOp3(companyParser.Op3Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOp4(companyParser.Op4Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOp4(companyParser.Op4Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBitwise(companyParser.BitwiseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBitwise(companyParser.BitwiseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLogical(companyParser.LogicalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLogical(companyParser.LogicalContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }


	private class Symbol_table
	{
		public List<Function_Signature> functions=new ArrayList<Function_Signature>() ;
		public Map<String,String> Variables = new HashMap<String, String>() ;
		public boolean add(List<String> returnn , String Func_name , List<String> args)
		{
			Function_Signature neww = new Function_Signature();
			neww.name = Func_name;
			neww.para = args;
			neww.returns = returnn;
			boolean exists = false;
			for (Function_Signature fs :functions)
			{
				if(neww.equals(fs))
				{
					exists=true;
					break;
				}
			}
			if(exists) return false;	// error: function signature already exists
			else
			{
				functions.add(neww);
				return true; //function signature doesn't exist and can be added
			}
		}
	}

	private class Function_Signature
	{
		public String name = "";
		public List<String> para ;
		public List<String> returns;
		public List<String> paraNames=null;
		public boolean CheckConflict(Function_Signature other)
		{
			if(other.name == this.name && other.para == this.para && other.returns == this.returns)
				return true;
			else
				return false;
		}
	}

	private static class Wrapper<T>
	{
		public T tmp;
	}
}