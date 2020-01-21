// Generated from F:/Behdad/University/Books/Term 5/Compilers/Proj/Phase 2/newP/src/com/company\company.g4 by ANTLR 4.7.2
package com.company.LULU;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.*;




public class companyBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements companyVisitor<T> {

	Symbol_table st_global = new Symbol_table();
	Stack<Symbol_table> stack = new Stack<Symbol_table>();
	String parse_state = "" ;
	void SetX(String s) {parse_state = s;}

	@Override public T visitProgram(companyParser.ProgramContext ctx)
	{
		return visitChildren(ctx);
	}

	@Override
	public T visitTest(companyParser.TestContext ctx) {
		return null;
	}


	// ft_dcl: Declare '{' (func_dcl| type_dcl| var_def)+ '}';															global
	@Override public T visitFt_dcl(companyParser.Ft_dclContext ctx)
	{
		SetX("global");
		stack.push(st_global);
		return visitChildren(ctx);
	}

	//func_dcl: ('(' args ')' '=')? ID '(' (args | args_var)? ')' ';';
	@Override public T visitFunc_dcl(companyParser.Func_dclContext ctx)
	{
		Function_Signature FS = new Function_Signature();
		FS.name = ctx.ID().toString();
		return visitChildren(ctx);
	}

	@Override
	public T visitArgs1(companyParser.Args1Context ctx) {
		return null;
	}

	@Override
	public T visitArgs2(companyParser.Args2Context ctx) {
		return null;
	}

	@Override
	public T visitArgs_var2(companyParser.Args_var2Context ctx) {
		return null;
	}

	@Override
	public T visitArgs_var1(companyParser.Args_var1Context ctx) {
		return null;
	}


	@Override public T visitType_dcl(companyParser.Type_dclContext ctx) { return visitChildren(ctx); }


	@Override public T visitVar_def(companyParser.Var_defContext ctx) { return visitChildren(ctx); }


	@Override public T visitVar_val(companyParser.Var_valContext ctx) { return visitChildren(ctx); }


	@Override public T visitFt_def(companyParser.Ft_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitType_def(companyParser.Type_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitComponent(companyParser.ComponentContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAccess_modifier(companyParser.Access_modifierContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFun_def(companyParser.Fun_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBlock(companyParser.BlockContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStmt(companyParser.StmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAssign(companyParser.AssignContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVar(companyParser.VarContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRef(companyParser.RefContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(companyParser.ExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFunc_call(companyParser.Func_callContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitList(companyParser.ListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitHandle_call(companyParser.Handle_callContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParams(companyParser.ParamsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCond_stmt(companyParser.Cond_stmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSwitch_body(companyParser.Switch_bodyContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLoop_stmt(companyParser.Loop_stmtContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitType(companyParser.TypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConst_val(companyParser.Const_valContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnary_op(companyParser.Unary_opContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOp1(companyParser.Op1Context ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOp2(companyParser.Op2Context ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOp3(companyParser.Op3Context ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOp4(companyParser.Op4Context ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBitwise(companyParser.BitwiseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLogical(companyParser.LogicalContext ctx) { return visitChildren(ctx); }

	public class Symbol_table
	{
		public List<Function_Signature> functions=new ArrayList<Function_Signature>() ;
		public Map<String,String> Variables = new HashMap<String, String>() ;
	}

	public class Function_Signature
	{
		public String name = "";
		public String[] para ;
		public String[] returns;

		public boolean CheckConflict(Function_Signature other)
		{
			if(other.name == this.name && other.para == this.para && other.returns == this.returns)
				return true;
			else
				return false;
		}
	}
}


