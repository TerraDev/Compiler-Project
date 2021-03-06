// Generated from F:/Behdad/University/Books/Term 5/Compilers/Proj/Phase 2/newP/src/com/company\company.g4 by ANTLR 4.7.2
package com.company.LULU;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;
import com.company.LULU.TypeChecking.*;
//import



public class companyBaseListener implements companyListener {


	Global_Symbol_table st_global = new Global_Symbol_table();
	Stack<Symbol_table> stack = new Stack<Symbol_table>();
	SearchTree tree = new SearchTree(st_global);

	@Override public void enterProgram(companyParser.ProgramContext ctx)
	{

		st_global.body_type = Symbol_name.global;
		stack.push(st_global);
		SearchTree tree = new SearchTree(st_global);
	}

	@Override public void exitProgram(companyParser.ProgramContext ctx)
	{
		Errcount=ErrorAgent.ErrorCount;
		ErrLines=ErrorAgent.ErrorLines;
		Final_Errs=ErrorAgent.Errors;

		ErrorAgent.GetErrors();

		tree.GetSymbolTables(SearchTree.Root);
		System.out.println(SearchTree.FinalData);
	}

	@Override public void enterTest(companyParser.TestContext ctx) { }

	@Override public void exitTest(companyParser.TestContext ctx) { }

	// ft_dcl: Declare '{' (func_dcl| type_dcl| var_def)+ '}';
	@Override public void enterFt_dcl(companyParser.Ft_dclContext ctx)
	{ }

	@Override public void exitFt_dcl(companyParser.Ft_dclContext ctx) { }


	@Override public void enterFunc_dcl(companyParser.Func_dclContext ctx)
	{
		tmp.FunctionStack.add(new Function_Signature());
		tmp.FunctionStack.peek().name=ctx.ID().getText();

	}

	@Override public void exitFunc_dcl(companyParser.Func_dclContext ctx)
	{
		Function_Signature f=tmp.FunctionStack.pop();
		st_global.addfuncsign(f);	// returns true if added , false if not
	}


	@Override
	public void enterRet1(companyParser.Ret1Context ctx)
	{
		tmp.ParamNUMStack.push(0);
	}

	@Override
	public void exitRet1(companyParser.Ret1Context ctx)
	{
		for(int i=0;i<tmp.ParamNUMStack.peek();i++)
		{
			tmp.FunctionStack.peek().returns.add(tmp.ParamStack.pop().type);
		}
		tmp.ParamNUMStack.pop();
	}

	@Override
	public void enterArguments(companyParser.ArgumentsContext ctx) {
		tmp.ParamNUMStack.push(0);
	}

	@Override
	public void exitArguments(companyParser.ArgumentsContext ctx) {

		for(int i=0;i<tmp.ParamNUMStack.peek();i++)
		{
			tmp.FunctionStack.peek().para.add(tmp.ParamStack.pop().type);
		}
		tmp.ParamNUMStack.pop();
	}

	@Override public void enterArgs1(companyParser.Args1Context ctx)
	{
		//Check_retpar(ctx.getRuleIndex());
		String tmptype=ctx.type().getText();
		tmp.ParamStack.push(new Variable("",tmptype));
		tmp.ParamNUMStack.push(tmp.ParamNUMStack.pop()+1);
	}


	@Override public void exitArgs1(companyParser.Args1Context ctx)
	{
	}


	public void Check_retpar(int ruleindex)
	{
		if(ruleindex==0) return; //it is in the middle -_- ...
		else if(ruleindex==1)	// in return mode
		{
			tmp.return_or_para = "return";
		}
		else  // in para mode
		{
			tmp.return_or_para = "para";
		}
	}

	@Override public void enterArgs2(companyParser.Args2Context ctx)
	{
		String tmptype=ctx.type().getText();
		tmp.ParamStack.push(new Variable("",tmptype));
		tmp.ParamNUMStack.push(tmp.ParamNUMStack.pop()+1);
	}


	@Override public void exitArgs2(companyParser.Args2Context ctx)
	{

	}


	@Override public void enterArgs_var1(companyParser.Args_var1Context ctx)
	{
		String tmptype=ctx.type().getText();
		tmp.ParamStack.push(new Variable("",tmptype));
		tmp.ParamNUMStack.push(tmp.ParamNUMStack.pop()+1);
	}


	@Override public void exitArgs_var1(companyParser.Args_var1Context ctx) { }


	@Override public void enterArgs_var2(companyParser.Args_var2Context ctx)
	{
		String tmptype=ctx.type().getText();
		tmp.ParamStack.push(new Variable("",tmptype));
		tmp.ParamNUMStack.push(tmp.ParamNUMStack.pop()+1);
	}


	@Override public void exitArgs_var2(companyParser.Args_var2Context ctx)
	{

	}

	//type_dcl: ID ';';
	@Override public void enterType_dcl(companyParser.Type_dclContext ctx)
	{
		st_global.addclasshead(ctx.ID().getText());
	}


	@Override public void exitType_dcl(companyParser.Type_dclContext ctx)
	{
	}


	String tempOtype;
	Boolean tempOConst;
	//var_def: Const?  type  var_val (',' var_val)* ';';
	@Override public void enterVar_def(companyParser.Var_defContext ctx)
	{
		tempOtype = ctx.type().getText();
		tempOConst =(ctx.Const()!=null);
	}



	@Override public void exitVar_def(companyParser.Var_defContext ctx)
	{
		tmp.tmpvar=null;
	}


	//var_val: ref ('=' expr)?;
	@Override public void enterVar_val(companyParser.Var_valContext ctx)
	{
		Variable a = new Variable();
		a.name=ctx.ref().ID().getText();
		a.type=tempOtype;
		tmp.VarStack.push(a);
	}


	@Override public void exitVar_val(companyParser.Var_valContext ctx)
	{
		//if(ctx.expr.rule...) --> forgetfunctionfornow
		if(ctx.expr()==null) {
			Variable u= tmp.VarStack.pop();
			u.Const=tempOConst;
			stack.peek().addVar(u);
		}
		else if(ctx.expr()!=null)
		{
			Variable b = tmp.VarStack.pop();
			Variable a = tmp.VarStack.pop();
			a = GetVarResult(a, "=", b);
			stack.peek().addVar(a);
		}
	}


	@Override public void enterFt_def(companyParser.Ft_defContext ctx)
	{

	}


	@Override public void exitFt_def(companyParser.Ft_defContext ctx) { }

	//type_def: Type ID (':' ID)? '{' component+ '}';
	@Override public void enterType_def(companyParser.Type_defContext ctx)
	{
		Symbol_table s = new Symbol_table();
		tmp.tmpclass=new classs();
		tmp.tmpclass.headername=ctx.ID(0).getText();
		if(ctx.ID(1)!=null) tmp.tmpclass.inheritclass=ctx.ID(1).getText();
		tree.Add(s,st_global);
		stack.push(s);
		s.body_type=Symbol_name.classs;
		st_global.addWholeclass(tmp.tmpclass,s);
		ctx.ID(0).getText();
	}


	@Override public void exitType_def(companyParser.Type_defContext ctx) { }

	//component: access_modifier? var_def     #varComponent
	@Override
	public void enterVarComponent(companyParser.VarComponentContext ctx) {
		tmp.tmpvar=null;
		if(ctx.access_modifier()==null)
			tmp.Access_Modifier = "private";
		else tmp.Access_Modifier = ctx.access_modifier().getText();
	}

	@Override
	public void exitVarComponent(companyParser.VarComponentContext ctx) {

	}

	@Override
	public void enterFuncComponent(companyParser.FuncComponentContext ctx)
	{
		if(ctx.access_modifier()==null)
			tmp.Access_Modifier="private";
		else
			tmp.Access_Modifier = ctx.access_modifier().getText();
	}

	@Override
	public void exitFuncComponent(companyParser.FuncComponentContext ctx) {

	}


	@Override public void enterAccess_modifier(companyParser.Access_modifierContext ctx) { }


	@Override public void exitAccess_modifier(companyParser.Access_modifierContext ctx) { }

	//fun_def: ('(' args_var ')' '=')? Function ID '(' args_var? ')' block;
	@Override public void enterFun_def(companyParser.Fun_defContext ctx)
	{
		tmp.blocktypeStack.push(Symbol_name.function);
		tmp.tmpfunc=new Function_Signature();
		tmp.tmpfunc.Access=tmp.Access_Modifier;
		tmp.Access_Modifier=null;
		tmp.tmpfunc.name=ctx.ID().getText();
		tmp.tmpfunc.para=new LinkedList<>();
		tmp.tmpfunc.paraNames = new LinkedList<>();
		tmp.FunctionStack.push(tmp.tmpfunc);
	}


	@Override public void exitFun_def(companyParser.Fun_defContext ctx)
	{
	    tmp.tmpfunc=null;
		tmp.blocktypeStack.pop();
	}


	@Override public void enterBlock(companyParser.BlockContext ctx)
    {
        Symbol_table st = new Symbol_table();
	    if(tmp.blocktypeStack.peek()==Symbol_name.function)
        {
            st.body_type= Symbol_name.function;
            for (int i = 0; i < tmp.FunctionStack.peek().para.size(); i++) {
                st.addVar(tmp.tmpfunc.paraNames.get(i),tmp.tmpfunc.para.get(i),false,null,null);
            }
        }
	    tree.Add(st, stack.peek());
	    stack.add(st);
        tmp.tmpfunc=null;
    }


	@Override public void exitBlock(companyParser.BlockContext ctx) { }


	@Override public void enterStmt(companyParser.StmtContext ctx)
	{
		if(ctx.cond_stmt()!=null)
		{
			tmp.FunctionStack.pop();
		}
		else if(ctx.Break()!=null )
		{
			boolean r = true;
			for (Symbol_table s:stack)
			{
				if(s.body_type==Symbol_name.loop)
				{
					r=false;
					break;
				}
			}
			if(r)
			{
				// TODO: ERROR BREAK NOT ALLOWED OUTSIDE OF LOOPS
			}
		}
		else if(ctx.Continue()!=null)
		{
			boolean q = true;
			for (Symbol_table s:stack)
			{
				if(s.body_type==Symbol_name.loop)
				{
					q=false;
					break;
				}
			}
			if(q)
			{
				// TODO: ERROR BREAK NOT ALLOWED OUTSIDE OF LOOPS
			}
		}
		// TODO: Else for ctx.destruct...
	}


	@Override public void exitStmt(companyParser.StmtContext ctx) { }


	@Override public void enterAssign(companyParser.AssignContext ctx) { }


	@Override public void exitAssign(companyParser.AssignContext ctx)
	{
		if(ctx.getChildCount()==3)
		{
			// TODO : FOR 1 VAL if(ctx.)
			com.company.LULU.Variable a = tmp.VarStack.pop();
			com.company.LULU.Variable b = tmp.VarStack.pop();
			//TODO@@ stack.peek().addVar(DoOperation(b,"=",a)) -> TODO: overload addVar
		}
		else
		{
			 List<com.company.LULU.Variable> returnss = new LinkedList<>();
			for (String typ: tmp.FunctionStack.pop().returns)
			{
				com.company.LULU.Variable a =new com.company.LULU.Variable();
				a.type=typ;
				a.name=null;
				returnss.add(a);
			}
			 Stack<com.company.LULU.Variable> tempo = new Stack<>();
			for (int i = 0; i < ctx.var().size(); i++)
			{
				tempo.push( tmp.VarStack.pop() );
			}
			for (int i = 0; i < tempo.size(); i++)
			{

				//TODO@@ stack.peek().addVar(DoOperation(tempo.pop(),"=",returns[i])) -> TODO: overload addVar
				//TODO: add error function return types don't match
			}
			if (tempo.size()>0)
				ErrorAgent.AddError("extra variables for function return type is invalid. expected less than or equal" + returnss.size()+
						". but there are " + tempo.size()+ ".");
		}
	}

	//var: ((This | Super)'.')? ref ('.' ref)*;
	@Override public void enterVar(companyParser.VarContext ctx)
	{
		com.company.LULU.Variable curr=null;
		if(ctx.This()!=null || ctx.Super()!=null)
		{
			if(stack.elementAt(1)==null || stack.elementAt(1).body_type!=Symbol_name.classs)
			{
				if(ctx.Super()!=null)
				{
					ErrorAgent.AddError("Incorrect use of this");
				}
				else
				{
					ErrorAgent.AddError("incorrect use of super");
				}
			}
		else
			{
				if(ctx.This()!=null)
					curr = st_global.Getvar(st_global.GetClassHeadFromBody(stack.elementAt(1)).headername,ctx.ref(0).ID().getText());
				else
					if(ctx.Super()!=null)
						curr = st_global.Getvar(st_global.GetClassHeadFromBody(stack.elementAt(1)).headername,ctx.ref(0).ID().getText());
				if(curr==null)
					ErrorAgent.AddError("No such property "+ctx.ref(0).ID().getText()+" in head");
			}
		}

		if(curr==null)
			curr = findVal(ctx.ref(0).ID().getText());
		if(curr==null)
			return; // okay?

		//shayad chand taa bood. if ctx.ref().size()==1 , boro daakhele loop
		for (int i = 1; i < ctx.ref().size(); i++) {

				curr = st_global.Getvar(curr.type,ctx.ref(i).ID().getText());
			if(curr==null)
			{
				ErrorAgent.AddError("Variable doesn't exist");
				return;// TODO: (I think) // maybe push null to stack? or push variable with 'null type' to stack
			}
		}
		tmp.VarStack.push(curr);
	}


	@Override public void exitVar(companyParser.VarContext ctx) { }


	@Override public void enterRef(companyParser.RefContext ctx) { }


	@Override public void exitRef(companyParser.RefContext ctx) { }

	@Override
	public void enterParanthesis(companyParser.ParanthesisContext ctx) {

	}

	@Override
	public void exitParanthesis(companyParser.ParanthesisContext ctx) {

	}

	@Override	//unary
	public void enterOper1(companyParser.Oper1Context ctx)
	{

	}

	@Override
	public void exitOper1(companyParser.Oper1Context ctx)
	{

	}

	@Override
	public void enterNull(companyParser.NullContext ctx) {

	}

	@Override
	public void exitNull(companyParser.NullContext ctx) {

	}

	@Override
	public void enterOper2(companyParser.Oper2Context ctx)
	{
		tmp.OperatorStack.push(ctx.op1().getText());
	}

	@Override
	public void exitOper2(companyParser.Oper2Context ctx)
	{
		Variable a = tmp.VarStack.pop();
		Variable b = tmp.VarStack.pop();
		tmp.VarStack.push(GetVarResult(b,tmp.OperatorStack.pop(),a));
	}

	@Override
	public void enterConsttt(companyParser.ConstttContext ctx)
	{
		if(ctx.const_val().Int_val()!=null)
			tmp.VarStack.push(new Variable(ctx.getText(),"int"));
		else if(ctx.const_val().Float_val()!=null)
			tmp.VarStack.push(new Variable(ctx.getText(),"float"));
		else if(ctx.const_val().String_val()!=null)
			tmp.VarStack.push(new Variable(ctx.getText(),"string"));
		else if(ctx.const_val().Bool_val()!=null)
			tmp.VarStack.push(new Variable(ctx.getText(),"bool"));
	}

	@Override
	public void exitConsttt(companyParser.ConstttContext ctx) {

	}

	@Override
	public void enterOper3(companyParser.Oper3Context ctx) {
		tmp.OperatorStack.push(ctx.op2().getText());
	}

	@Override
	public void exitOper3(companyParser.Oper3Context ctx)
	{
		Variable a = tmp.VarStack.pop();
		Variable b = tmp.VarStack.pop();
		tmp.VarStack.push(GetVarResult(b,tmp.OperatorStack.pop(),a));
	}

	@Override
	public void enterJust_var(companyParser.Just_varContext ctx) {

	}

	@Override
	public void exitJust_var(companyParser.Just_varContext ctx) {

	}

	@Override
	public void enterOper4(companyParser.Oper4Context ctx) {
		tmp.OperatorStack.push(ctx.op3().getText());
	}



	@Override
	public void exitOper4(companyParser.Oper4Context ctx)
	{
		Variable a = tmp.VarStack.pop();
		Variable b = tmp.VarStack.pop();
		tmp.VarStack.push(GetVarResult(b,tmp.OperatorStack.pop(),a));
	}

	@Override
	public void enterOper5(companyParser.Oper5Context ctx) {
		tmp.OperatorStack.push(ctx.op4().getText());
	}

	@Override
	public void exitOper5(companyParser.Oper5Context ctx)
	{
		Variable a = tmp.VarStack.pop();
		Variable b = tmp.VarStack.pop();
		tmp.VarStack.push(GetVarResult(b,tmp.OperatorStack.pop(),a));
	}

	@Override
	public void enterOper6(companyParser.Oper6Context ctx)
	{
		tmp.OperatorStack.push(ctx.bitwise().getText());
	}

	@Override
	public void exitOper6(companyParser.Oper6Context ctx)
	{
		Variable a = tmp.VarStack.pop();
		Variable b = tmp.VarStack.pop();
		tmp.VarStack.push(GetVarResult(b,tmp.OperatorStack.pop(),a));
	}

	@Override
	public void enterOper7(companyParser.Oper7Context ctx) {
		tmp.OperatorStack.push(ctx.logical().getText());
	}

	@Override
	public void exitOper7(companyParser.Oper7Context ctx)
	{
		Variable a = tmp.VarStack.pop();
		Variable b = tmp.VarStack.pop();
		tmp.VarStack.push(GetVarResult(b,tmp.OperatorStack.pop(),a));
	}

	@Override
	public void enterList_op(companyParser.List_opContext ctx) {

	}

	@Override
	public void exitList_op(companyParser.List_opContext ctx) {

	}

	@Override
	public void enterFunctoin_call(companyParser.Functoin_callContext ctx) {

	}

	@Override
	public void exitFunctoin_call(companyParser.Functoin_callContext ctx) {

	}

	@Override
	public void enterAlloc(companyParser.AllocContext ctx) {

	}

	@Override
	public void exitAlloc(companyParser.AllocContext ctx) {

	}

	@Override
	public void enterFunc_cl(companyParser.Func_clContext ctx)
	{
	}

	@Override
	public void exitFunc_cl(companyParser.Func_clContext ctx)
	{
		if(ctx.var()!=null)
		{
			tmp.FunctionStack.push(st_global.GetFunction(tmp.VarStack.pop().type,tmp.FunctionStack.pop()));// return type? no?
			//TODO: stack.push null for error handling? -> dunno
		}
		else
			tmp.FunctionStack.push(st_global.GetFunction("",tmp.FunctionStack.pop()));	//TODO: override function
	}

	@Override
	public void enterRead(companyParser.ReadContext ctx) {
	}

	@Override
	public void exitRead(companyParser.ReadContext ctx)
	{
		//TODO: FILL
	}

	@Override
	public void enterWrite(companyParser.WriteContext ctx) {

	}

	@Override
	public void exitWrite(companyParser.WriteContext ctx) {
		//TODO: FILL
	}


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
	@Override public void enterHandle_call(companyParser.Handle_callContext ctx)
	{

	}


	@Override public void exitHandle_call(companyParser.Handle_callContext ctx)
	{
		Function_Signature fs = new Function_Signature();
		fs.name=ctx.ID().getText();
		fs.para = new ArrayList<>();
		int paraSize= tmp.ParamNUMStack.pop();
		for (int i = 0; i < paraSize; i++)
		{
			fs.para.add(tmp.ParamStack.pop().type);
		}
		tmp.FunctionStack.push(fs);
	}

	//TODO : PUT IF-ELSE INSIDE EXITEXPR(OPER1,OPER2,...) FOR VALUE/FUNCTION

	@Override public void enterParams(companyParser.ParamsContext ctx)
	{
	}


	@Override public void exitParams(companyParser.ParamsContext ctx)
	{
		tmp.ParamNUMStack.push( tmp.ParamNUMStack.pop()+1);
		tmp.ParamStack.push(tmp.VarStack.pop());
	}

	@Override public void enterCond_stmt(companyParser.Cond_stmtContext ctx)
	{
		tmp.blocktypeStack.push(Symbol_name.ifelse);
	}

	@Override public void exitCond_stmt(companyParser.Cond_stmtContext ctx)
	{
		tmp.blocktypeStack.pop();
		if(ctx.If()!=null)
		{
			com.company.LULU.Variable boolmod = tmp.VarStack.pop();
			stack.peek().addVar(boolmod);
			if(boolmod.type!="int" || boolmod.type!="bool")
			{
				ErrorAgent.AddError("expected integer for switch condition, not " + boolmod.type);
			}
		}
	}

	@Override public void enterSwitch_body(companyParser.Switch_bodyContext ctx)
	{
		com.company.LULU.Variable boolmod = tmp.VarStack.pop();
		stack.peek().addVar(boolmod);
		if(boolmod.type!="int" || boolmod.type!="bool")
		{
			ErrorAgent.AddError("expected integer for switch condition, not " + boolmod.type);
		}
		tmp.blocktypeStack.push(Symbol_name.loop);
	}

	@Override public void exitSwitch_body(companyParser.Switch_bodyContext ctx)
	{
		tmp.blocktypeStack.pop();
	}

	@Override
	public void enterForLoop(companyParser.ForLoopContext ctx)
	{
		tmp.blocktypeStack.push(Symbol_name.loop);
		/*
		Symbol_table tm = new Symbol_table();
		tm.body_type=Symbol_name.loop;
		tree.Add(tm,stack.peek());
		stack.push(tm);
		//if(ctx.type()!= null)
		//{
		// TODO: ERROR: error i already exists
		// TODO: ADD int i to new symbol_table and push to stack -> maybe put in -> CHECK TODO COMMENT IN G4 FILE
		//}
		*
		 */
	}

	@Override
	public void exitForLoop(companyParser.ForLoopContext ctx)
	{
		tmp.blocktypeStack.pop();
	}

	@Override
	public void enterWhileLoop(companyParser.WhileLoopContext ctx)
	{
		tmp.blocktypeStack.push(Symbol_name.loop);
		Variable boolmod = tmp.VarStack.pop();
		stack.peek().addVar(boolmod);

		if(boolmod.type!="int" || boolmod.type!="bool")
		{
			ErrorAgent.AddError("expected boolean for switch condition, not " + boolmod.type);
		}
	}

	@Override
	public void exitWhileLoop(companyParser.WhileLoopContext ctx)
	{
		stack.pop();
	}


	@Override public void enterType(companyParser.TypeContext ctx) { }


	@Override public void exitType(companyParser.TypeContext ctx) { }


	@Override public void enterConst_val(companyParser.Const_valContext ctx)
    {
    }

	@Override public void exitConst_val(companyParser.Const_valContext ctx) { }

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
	@Override public void enterEveryRule(ParserRuleContext ctx)
	{
		CurrentLine = ctx.start.getLine();
		//System.out.println(ctx.getText());
	}


	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }


	@Override public void visitErrorNode(ErrorNode node) { }


	public class Global_Symbol_table extends Symbol_table
	{

		public Map<classs,Symbol_table> classes = new HashMap<>();
		public Map<Symbol_table,classs> classes2 = new HashMap<>();

		public classs GetClassHeadFromBody(Symbol_table s)
		{
			return classes2.get(s);
		}

		public Function_Signature GetFunction(String clas , Function_Signature func)
		{
			if (clas.equals(""))
			{
				boolean nameFound=false;
				for (var global_function : st_global.functions.keySet()) {

					if (global_function.name.equals(func.name))
					{
						nameFound=true;
						if(global_function.para.equals(func.para));
							return global_function;
					}

				}
				if(nameFound)
					ErrorAgent.AddError("function " +func.name+"is not overloaded with your parameters");
				else
					ErrorAgent.AddError("function"+ func.name +"doesn't exist!");
				return null;
			} else {
				for (var clase : classes.keySet()) {
					if (clase.headername.equals(clas)) {
						{
							boolean nameFound=false;
							for (var global_function : st_global.functions.keySet()) {

								if (global_function.name.equals(func.name))
								{
									nameFound=true;
									if(global_function.para.equals(func.para));
									return global_function;
								}

							}
							if(nameFound)
								ErrorAgent.AddError("function " +clas + "."+ func.name+"is not overloaded with your parameters");
							else
								ErrorAgent.AddError("class "+ clas + "doesn't contain function "+ func.name);
							return null;
						}
					}
				}
				ErrorAgent.AddError("no existing class with name '" + clas + "'.");
				return null;
			}
		}

		public Function_Signature GetFunction(String clas , String func_name)
		{
			if (clas.equals("")) {
				for (var global_function : st_global.functions.keySet()) {
					if (global_function.name.equals(func_name)) {
						return global_function;
					}

				}
				ErrorAgent.AddError("function"+ func_name +"doesn't exist!");
				return null;
			} else {
				for (var clase : classes.keySet()) {
					if (clase.headername.equals(clas)) {
						for (var syt : classes.get(clase).functions.keySet()) {
							if (syt.name.equals(func_name))
								return syt;
						}
						ErrorAgent.AddError("no function with name "+ func_name+" in class "+clas);
						return null;
					}
				}
				ErrorAgent.AddError("no existing class with name '" + clas + "'.");
				return null;
			}
		}

		public String GetInheritClass(String classname)
		{
			if(classname==null)
				return null;

			for (var cl: classes.keySet())
			{
				if(cl.headername==classname)
					return cl.inheritclass;
			}
			ErrorAgent.AddError("class" + classname + "has no inherited classes");
			return null;
		}

		public com.company.LULU.Variable Getvar(String clas , String var_name)
		{
			if (clas.equals("")) {
				for (var global_var : this.Variables) {
					if (global_var.name.equals(var_name)) {
						return global_var;
					}
				}
				// TODO: else error -> variable doesn't exist
				return null;
			} else {
				for (var clase : classes.keySet()) {
					if (clase.headername.equals(clas)) {
						for (var syt : classes.get(clase).Variables) {
							if (syt.name.equals(var_name))
								return syt;
						}
						// TODO: error -> class exists, variable doesn't
						return null;
					}
				}
				// todo: error -> class doesn't exist!
				return null;
			}
		}


		public boolean addclasshead(String classname)
		{
			classs cl = new classs();
			cl.headername=classname;
			for (var tmp:classes.keySet())
			{
				if(tmp.CheckConflict(cl) )
				{
					if(classes.get(tmp)!=null)
						return false; //class already exists
					classes.replace(tmp,null);
					return true;
				}
			}
			classes.put(cl,null);
			return true;	//successfully added class to symbol table :)

		}

		public boolean addWholeclass(classs head,Symbol_table body)
		{
			for (var inher: st_global.classes.keySet()) {
				if(inher.CheckConflict(head))
				{
					return false;
					// add error class is inherited from unknown class
				}
			}

			for (var tmp:classes.keySet())
			{
				if(tmp.CheckConflict(head) )
				{
					if(classes.get(tmp)!=null)
						return false; //class already exists->gives error

					classes.remove(tmp,null);
					classes.put(head,body);
					classes2.put(body,head);
					return true;    //class declared but not defined
				}
			}
			classes.put(head,body);
			classes2.put(body,head);
			return true;    //class defined
		}
	}

	public class Symbol_table
	{
		Symbol_name body_type;
		public Map<Function_Signature, Symbol_table> functions = new HashMap<>() ;
		public List<Variable> Variables = new ArrayList<>() ;
        public List<Symbol_table> Simple_blocks=new ArrayList<>();
//		public List<classs> classes = new ArrayList<classs>();

        public boolean addblock(Symbol_table body)
        {
            Simple_blocks.add(body);
            return true;
        }

		public boolean addWholeFunction(Function_Signature sign, Symbol_table body)
		{
			for (var ret: sign.returns) {
				if(!QEXIST(ret,"class"))
				{
					//add error!-> return type undefined!
				}
			}

			for (var para: sign.para)
			{
				if(!QEXIST(para,"class"))
				{
					//add error!-> parameter type undefined!
				}
			}
			for (var others: functions.keySet())
			{
			if(others.CheckConflict(sign))
				{
					if(functions.get(others)!=null)
					{
						return false ;// --> function signature already exists *_* (Add Error)
					}
					functions.remove(others,null);
					functions.put(sign,body);
					return true;
				}
			}
			functions.put(sign,body);
			return true;    //class defined
		}

		public boolean addfuncsign(Function_Signature fs)
		{
			for (var fss: this.functions.keySet())
			{
				if(fs.name.equals(fss.name))
				{
					if(fs.para.equals(fss.para))
					{
						ErrorAgent.AddError("Function Signature already exists");
						return false;
					}
				}
			}
			functions.put(fs,null);
			return true;
		}
		//worthless
		public boolean addfuncsign(List<String> returnn , String Func_name , List<String> args)
		{
			Function_Signature neww = new Function_Signature();
			neww.name = Func_name;
			neww.para = args;
			neww.returns = returnn;

			for (Function_Signature fs :functions.keySet())
			{
				if(neww.CheckConflict(fs))
				{
					return false; // error: function signature already exists
				}
			}
			//else
			functions.put(neww,null);
			return true; //function signature doesn't exist and can be added
		}

		public boolean addVar(Variable x)
		{
			for (var vars:Variables)
			{
				if(vars.name.equals(x.name))
				{
					ErrorAgent.AddError("Variable with same name as" + x.name + "already exists in scope");
					return false;
				}
			}
			Variables.add(x);
			return true;
		}

		public boolean addVar(String var_name, String var_type, boolean Const, int[] arrdims, String val)
		{
			Variable v = new Variable();
			v.name = var_name;
			v.type = var_type;
			v.Const = Const;
			v.ArrayDimensionSizes = arrdims;
			v.value=val;
			for (com.company.LULU.Variable x : Variables)
			{
				if (x.CheckConflict(v))
				{
					ErrorAgent.AddError("Variable "+val+" Already exists in scope.");
					return false; //variable with same name exists
				}
			}
//			v.Arz=CalcArz(v);
			Variables.add(v);
			return true;
		}

	}


	public class classs extends obj
	{
		public String headername;
		public String inheritclass=null;
		public List<com.company.LULU.Variable> Properties;

		public boolean CheckConflict(classs other)
		{
			if (other.headername==this.headername)
				return false;	//also give error
			else
				return true;
		}
	}



	public class Function_Signature extends obj
	{
		public String name = "";
		public List<String> para = new ArrayList<>();
		public List<String> returns = new ArrayList<>();
		public List<String> paraNames=null;
		public String Access;

		public boolean CheckConflict(Function_Signature other)
		{
			if(other.name == this.name && other.para == this.para && other.returns == this.returns)
				return true;
			else
				return false;
		}
	}

	public static List<String> Final_Errs;
	public static List<Integer> ErrLines;
	public static int Errcount ;

	public static class ErrorAgent extends BaseErrorListener
	{
		public static List<String> Errors =new LinkedList<>();
		public static List<Integer> ErrorLines = new LinkedList<>();
		public static int ErrorCount = 0;
		public static void AddError(String err)
		{
			if(err==null)
				return;
			Errors.add(err);
			ErrorLines.add(CurrentLine);
			ErrorCount++;
		}

		public static void GetErrors()
		{
			System.out.println("Errors:");
			for(int i=0; i<ErrorCount; i++)
			{
				System.out.println(Errors.get(i));
				System.out.println(ErrorLines.get(i));
			}
		}
	}

	//TODO: do something about this
	public class obj
	{
		public long Arz;
		public long RelationalAddress;
		public long RealAddress;
	}


	public boolean QEXIST(String name, String thing)
	{
		switch (thing)
		{
			case "class":
				switch (name)
				{
					case "int":
					case "float":
					case "bool":
					case "string":
					return true;
				}
				for (var x:st_global.classes.keySet())
				{
					if(x.headername==name)
						return true;
				}
				break;
			case "variable_in_current_block":
				for (var vari: stack.peek().Variables) {
					if(vari.name==name)
						return true;
				}
				break;
			case "variable_global":
				if(findVal(name)!=null)
					return true;
				break;
			default: return false;
		}
		return false;
	}

	public com.company.LULU.Variable findVal(String VarName)
	{

		for (int i = stack.size()-1 ; i >=0; i--)
		{
			for (var vari: stack.elementAt(i).Variables) {
				if(vari.name==VarName)
					return vari;
			}
		}
		return null;
	}

	t tmp = new t(); //holds temporary values
	public class t
	{
		Function_Signature tmpfunc;
		com.company.LULU.Variable tmpvar;
		String return_or_para;
		classs tmpclass;
		//Stack<Funny_Constant> Funny_Stack = new Stack<>();
		String Access_Modifier ;
		Stack<Function_Signature> FunctionStack = new Stack<>();
		Stack<Variable> VarStack = new Stack<>();
		Stack<Integer> ParamNUMStack = new Stack<>();
		Stack<Variable> ParamStack = new Stack<>();
		Stack<Symbol_name> blocktypeStack = new Stack<>();
		Stack<String> OperatorStack = new Stack<>();
	}

	static int CurrentLine;

	public enum Symbol_name
	{
		global,
		classs,
		function,
        loop,
        ifelse
	}

	public static int CalcArz(com.company.LULU.Variable v)
	{
		switch (v.type)
		{
			case "bool":
				return 1;
			case "int":
				return 4;
			case "float":
				return 8;
			case "string":
				return 2;	//for now
			default:
				return 4;
		}
	}

	public static boolean CheckForEquals(com.company.LULU.Variable a1, com.company.LULU.Variable a2)
	{
		if(a1.get_type()==a2.get_type() || ((a1.get_type()=="bool" || a1.get_type()=="string"|| a1.get_type()=="float") && a2.get_type()=="int") || (a1.get_type()=="int" && a2.get_type()=="bool") )
			return true;
		else return false;
	}

	public static Variable GetVarResult(Variable a1,String Operator ,Variable a2)
	{
			Variable tm = new Variable();

		if (Operator=="=")
		{
			tm=_Compute.ReturnVar(a1,"=",a2);
			tm.name=a1.name;
			tm.type=a1.type;
			tm.Const=a1.Const;
			tm.Access=a1.Access;
			tm._error=a1._error;
			ErrorAgent.AddError(a1._error);
			if(tm.Const)
			{
				ErrorAgent.AddError("Cannot change value of Constant variable " + a1.name);
				return a1;
			}
			// TODO: private? protected?
			return tm;
		}

			if (a1 == null)
				tm = _Compute.ReturnVar(Operator, a2);
			else
				tm = _Compute.ReturnVar(a1, Operator, a2);
		ErrorAgent.AddError(tm._error);
		return tm;
	}

}


//ctx.start.getline()