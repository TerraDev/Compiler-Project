// Generated from F:/Behdad/University/Books/Term 5/Compilers/Proj/Phase 2/newP/src/com/company\company.g4 by ANTLR 4.7.2
package com.company.LULU;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link companyParser}.
 */
public interface companyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link companyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(companyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(companyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(companyParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(companyParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#ft_dcl}.
	 * @param ctx the parse tree
	 */
	void enterFt_dcl(companyParser.Ft_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#ft_dcl}.
	 * @param ctx the parse tree
	 */
	void exitFt_dcl(companyParser.Ft_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#func_dcl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_dcl(companyParser.Func_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#func_dcl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_dcl(companyParser.Func_dclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code args1}
	 * labeled alternative in {@link companyParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs1(companyParser.Args1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code args1}
	 * labeled alternative in {@link companyParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs1(companyParser.Args1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code args2}
	 * labeled alternative in {@link companyParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs2(companyParser.Args2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code args2}
	 * labeled alternative in {@link companyParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs2(companyParser.Args2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code args_var2}
	 * labeled alternative in {@link companyParser#args_var}.
	 * @param ctx the parse tree
	 */
	void enterArgs_var2(companyParser.Args_var2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code args_var2}
	 * labeled alternative in {@link companyParser#args_var}.
	 * @param ctx the parse tree
	 */
	void exitArgs_var2(companyParser.Args_var2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code args_var1}
	 * labeled alternative in {@link companyParser#args_var}.
	 * @param ctx the parse tree
	 */
	void enterArgs_var1(companyParser.Args_var1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code args_var1}
	 * labeled alternative in {@link companyParser#args_var}.
	 * @param ctx the parse tree
	 */
	void exitArgs_var1(companyParser.Args_var1Context ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#type_dcl}.
	 * @param ctx the parse tree
	 */
	void enterType_dcl(companyParser.Type_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#type_dcl}.
	 * @param ctx the parse tree
	 */
	void exitType_dcl(companyParser.Type_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(companyParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(companyParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#var_val}.
	 * @param ctx the parse tree
	 */
	void enterVar_val(companyParser.Var_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#var_val}.
	 * @param ctx the parse tree
	 */
	void exitVar_val(companyParser.Var_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#ft_def}.
	 * @param ctx the parse tree
	 */
	void enterFt_def(companyParser.Ft_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#ft_def}.
	 * @param ctx the parse tree
	 */
	void exitFt_def(companyParser.Ft_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(companyParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(companyParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varComponent}
	 * labeled alternative in {@link companyParser#component}.
	 * @param ctx the parse tree
	 */
	void enterVarComponent(companyParser.VarComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varComponent}
	 * labeled alternative in {@link companyParser#component}.
	 * @param ctx the parse tree
	 */
	void exitVarComponent(companyParser.VarComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcComponent}
	 * labeled alternative in {@link companyParser#component}.
	 * @param ctx the parse tree
	 */
	void enterFuncComponent(companyParser.FuncComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcComponent}
	 * labeled alternative in {@link companyParser#component}.
	 * @param ctx the parse tree
	 */
	void exitFuncComponent(companyParser.FuncComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(companyParser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(companyParser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void enterFun_def(companyParser.Fun_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void exitFun_def(companyParser.Fun_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(companyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(companyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(companyParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(companyParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(companyParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(companyParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(companyParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(companyParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(companyParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(companyParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(companyParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(companyParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oper1}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOper1(companyParser.Oper1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code oper1}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOper1(companyParser.Oper1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNull(companyParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNull(companyParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oper2}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOper2(companyParser.Oper2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code oper2}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOper2(companyParser.Oper2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code consttt}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConsttt(companyParser.ConstttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code consttt}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConsttt(companyParser.ConstttContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oper3}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOper3(companyParser.Oper3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code oper3}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOper3(companyParser.Oper3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code just_var}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJust_var(companyParser.Just_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code just_var}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJust_var(companyParser.Just_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oper4}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOper4(companyParser.Oper4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code oper4}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOper4(companyParser.Oper4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code oper5}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOper5(companyParser.Oper5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code oper5}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOper5(companyParser.Oper5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code oper6}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOper6(companyParser.Oper6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code oper6}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOper6(companyParser.Oper6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code oper7}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOper7(companyParser.Oper7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code oper7}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOper7(companyParser.Oper7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code list_op}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterList_op(companyParser.List_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list_op}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitList_op(companyParser.List_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functoin_call}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctoin_call(companyParser.Functoin_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functoin_call}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctoin_call(companyParser.Functoin_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alloc}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAlloc(companyParser.AllocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alloc}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAlloc(companyParser.AllocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_cl}
	 * labeled alternative in {@link companyParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_cl(companyParser.Func_clContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_cl}
	 * labeled alternative in {@link companyParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_cl(companyParser.Func_clContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link companyParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterRead(companyParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link companyParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitRead(companyParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link companyParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterWrite(companyParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link companyParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitWrite(companyParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(companyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(companyParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#handle_call}.
	 * @param ctx the parse tree
	 */
	void enterHandle_call(companyParser.Handle_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#handle_call}.
	 * @param ctx the parse tree
	 */
	void exitHandle_call(companyParser.Handle_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(companyParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(companyParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCond_stmt(companyParser.Cond_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCond_stmt(companyParser.Cond_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(companyParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(companyParser.Switch_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link companyParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(companyParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link companyParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(companyParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link companyParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(companyParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link companyParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(companyParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(companyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(companyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#const_val}.
	 * @param ctx the parse tree
	 */
	void enterConst_val(companyParser.Const_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#const_val}.
	 * @param ctx the parse tree
	 */
	void exitConst_val(companyParser.Const_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(companyParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(companyParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(companyParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(companyParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(companyParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(companyParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(companyParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(companyParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#op4}.
	 * @param ctx the parse tree
	 */
	void enterOp4(companyParser.Op4Context ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#op4}.
	 * @param ctx the parse tree
	 */
	void exitOp4(companyParser.Op4Context ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(companyParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(companyParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link companyParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(companyParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link companyParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(companyParser.LogicalContext ctx);
}