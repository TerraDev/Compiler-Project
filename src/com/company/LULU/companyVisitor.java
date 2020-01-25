// Generated from F:/Behdad/University/Books/Term 5/Compilers/Proj/Phase 2/newP/src/com/company\company.g4 by ANTLR 4.7.2
package com.company.LULU;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link companyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface companyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link companyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(companyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(companyParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#ft_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFt_dcl(companyParser.Ft_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#func_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_dcl(companyParser.Func_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#ret1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet1(companyParser.Ret1Context ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(companyParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code args1}
	 * labeled alternative in {@link companyParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs1(companyParser.Args1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code args2}
	 * labeled alternative in {@link companyParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs2(companyParser.Args2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code args_var2}
	 * labeled alternative in {@link companyParser#args_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_var2(companyParser.Args_var2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code args_var1}
	 * labeled alternative in {@link companyParser#args_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_var1(companyParser.Args_var1Context ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#type_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_dcl(companyParser.Type_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(companyParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#var_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_val(companyParser.Var_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#ft_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFt_def(companyParser.Ft_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(companyParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varComponent}
	 * labeled alternative in {@link companyParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarComponent(companyParser.VarComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcComponent}
	 * labeled alternative in {@link companyParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncComponent(companyParser.FuncComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifier(companyParser.Access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#fun_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_def(companyParser.Fun_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(companyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(companyParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(companyParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(companyParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(companyParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis(companyParser.ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oper1}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper1(companyParser.Oper1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(companyParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oper2}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper2(companyParser.Oper2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code consttt}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsttt(companyParser.ConstttContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oper3}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper3(companyParser.Oper3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code just_var}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJust_var(companyParser.Just_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oper4}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper4(companyParser.Oper4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code oper5}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper5(companyParser.Oper5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code oper6}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper6(companyParser.Oper6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code oper7}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper7(companyParser.Oper7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code list_op}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_op(companyParser.List_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functoin_call}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctoin_call(companyParser.Functoin_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alloc}
	 * labeled alternative in {@link companyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlloc(companyParser.AllocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_cl}
	 * labeled alternative in {@link companyParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_cl(companyParser.Func_clContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link companyParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(companyParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write}
	 * labeled alternative in {@link companyParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(companyParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(companyParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#handle_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandle_call(companyParser.Handle_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(companyParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#cond_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_stmt(companyParser.Cond_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#switch_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_body(companyParser.Switch_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link companyParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(companyParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link companyParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(companyParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(companyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#const_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_val(companyParser.Const_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(companyParser.Unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(companyParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(companyParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(companyParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp4(companyParser.Op4Context ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise(companyParser.BitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link companyParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(companyParser.LogicalContext ctx);
}