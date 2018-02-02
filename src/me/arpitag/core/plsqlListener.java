package me.arpitag.core;
// Generated from plsql.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link plsqlParser}.
 */
public interface plsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(@NotNull plsqlParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(@NotNull plsqlParser.Exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_function_spec(@NotNull plsqlParser.Type_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_function_spec(@NotNull plsqlParser.Type_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_returning_clause(@NotNull plsqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_returning_clause(@NotNull plsqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void enterTableview_name(@NotNull plsqlParser.Tableview_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void exitTableview_name(@NotNull plsqlParser.Tableview_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void enterReference_model_name(@NotNull plsqlParser.Reference_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void exitReference_model_name(@NotNull plsqlParser.Reference_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(@NotNull plsqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(@NotNull plsqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull plsqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull plsqlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void enterJava_spec(@NotNull plsqlParser.Java_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void exitJava_spec(@NotNull plsqlParser.Java_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void enterModel_column(@NotNull plsqlParser.Model_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void exitModel_column(@NotNull plsqlParser.Model_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_clause(@NotNull plsqlParser.Routine_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_clause(@NotNull plsqlParser.Routine_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(@NotNull plsqlParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(@NotNull plsqlParser.Cursor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(@NotNull plsqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(@NotNull plsqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(@NotNull plsqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(@NotNull plsqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(@NotNull plsqlParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(@NotNull plsqlParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_name(@NotNull plsqlParser.Table_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_name(@NotNull plsqlParser.Table_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(@NotNull plsqlParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(@NotNull plsqlParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTable_declaration(@NotNull plsqlParser.Table_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTable_declaration(@NotNull plsqlParser.Table_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(@NotNull plsqlParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(@NotNull plsqlParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterAlter_procedure(@NotNull plsqlParser.Alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitAlter_procedure(@NotNull plsqlParser.Alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(@NotNull plsqlParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(@NotNull plsqlParser.Searched_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(@NotNull plsqlParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(@NotNull plsqlParser.Query_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collection_clauses(@NotNull plsqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collection_clauses(@NotNull plsqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_options(@NotNull plsqlParser.For_update_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_options(@NotNull plsqlParser.For_update_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompile_type_clause(@NotNull plsqlParser.Compile_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompile_type_clause(@NotNull plsqlParser.Compile_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterProc_decl_in_type(@NotNull plsqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitProc_decl_in_type(@NotNull plsqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(@NotNull plsqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(@NotNull plsqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull plsqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull plsqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_else_part(@NotNull plsqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_else_part(@NotNull plsqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_elements_parameter(@NotNull plsqlParser.Type_elements_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_elements_parameter(@NotNull plsqlParser.Type_elements_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_elements(@NotNull plsqlParser.Windowing_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_elements(@NotNull plsqlParser.Windowing_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_block(@NotNull plsqlParser.Trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_block(@NotNull plsqlParser.Trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type(@NotNull plsqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type(@NotNull plsqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_like_part(@NotNull plsqlParser.For_like_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_like_part(@NotNull plsqlParser.For_like_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterSimple_dml_trigger(@NotNull plsqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitSimple_dml_trigger(@NotNull plsqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_into_part(@NotNull plsqlParser.Error_logging_into_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_into_part(@NotNull plsqlParser.Error_logging_into_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_ident_part(@NotNull plsqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_ident_part(@NotNull plsqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_delete_part(@NotNull plsqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_delete_part(@NotNull plsqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(@NotNull plsqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(@NotNull plsqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_element(@NotNull plsqlParser.Lock_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_element(@NotNull plsqlParser.Lock_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void enterSql_plus_command(@NotNull plsqlParser.Sql_plus_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void exitSql_plus_command(@NotNull plsqlParser.Sql_plus_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(@NotNull plsqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(@NotNull plsqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_type_def(@NotNull plsqlParser.Nested_table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_type_def(@NotNull plsqlParser.Nested_table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void enterElsif_part(@NotNull plsqlParser.Elsif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void exitElsif_part(@NotNull plsqlParser.Elsif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_func_declaration(@NotNull plsqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_func_declaration(@NotNull plsqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(@NotNull plsqlParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(@NotNull plsqlParser.Sample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type(@NotNull plsqlParser.Alter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type(@NotNull plsqlParser.Alter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(@NotNull plsqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(@NotNull plsqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(@NotNull plsqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(@NotNull plsqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(@NotNull plsqlParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(@NotNull plsqlParser.Error_logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void enterPrompt_command(@NotNull plsqlParser.Prompt_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void exitPrompt_command(@NotNull plsqlParser.Prompt_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(@NotNull plsqlParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(@NotNull plsqlParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void enterResult_cache_clause(@NotNull plsqlParser.Result_cache_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void exitResult_cache_clause(@NotNull plsqlParser.Result_cache_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#query_name}.
	 * @param ctx the parse tree
	 */
	void enterQuery_name(@NotNull plsqlParser.Query_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#query_name}.
	 * @param ctx the parse tree
	 */
	void exitQuery_name(@NotNull plsqlParser.Query_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(@NotNull plsqlParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(@NotNull plsqlParser.Cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(@NotNull plsqlParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(@NotNull plsqlParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes_clause(@NotNull plsqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes_clause(@NotNull plsqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(@NotNull plsqlParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(@NotNull plsqlParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void enterStreaming_clause(@NotNull plsqlParser.Streaming_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void exitStreaming_clause(@NotNull plsqlParser.Streaming_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(@NotNull plsqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(@NotNull plsqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_agent_in_clause(@NotNull plsqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_agent_in_clause(@NotNull plsqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_spec(@NotNull plsqlParser.Procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_spec(@NotNull plsqlParser.Procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(@NotNull plsqlParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(@NotNull plsqlParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void enterPragma_elements(@NotNull plsqlParser.Pragma_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void exitPragma_elements(@NotNull plsqlParser.Pragma_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(@NotNull plsqlParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(@NotNull plsqlParser.Windowing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(@NotNull plsqlParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(@NotNull plsqlParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull plsqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull plsqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterReplace_type_clause(@NotNull plsqlParser.Replace_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitReplace_type_clause(@NotNull plsqlParser.Replace_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterLess_than_or_equals_op(@NotNull plsqlParser.Less_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitLess_than_or_equals_op(@NotNull plsqlParser.Less_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_spec(@NotNull plsqlParser.Alter_method_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_spec(@NotNull plsqlParser.Alter_method_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void enterCursor_manipulation_statements(@NotNull plsqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void exitCursor_manipulation_statements(@NotNull plsqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal_op(@NotNull plsqlParser.Not_equal_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal_op(@NotNull plsqlParser.Not_equal_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element_part(@NotNull plsqlParser.General_element_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element_part(@NotNull plsqlParser.General_element_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_partition_part(@NotNull plsqlParser.Model_column_partition_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_partition_part(@NotNull plsqlParser.Model_column_partition_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void enterSequence_spec(@NotNull plsqlParser.Sequence_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void exitSequence_spec(@NotNull plsqlParser.Sequence_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void enterModifier_clause(@NotNull plsqlParser.Modifier_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void exitModifier_clause(@NotNull plsqlParser.Modifier_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_sign(@NotNull plsqlParser.Outer_join_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_sign(@NotNull plsqlParser.Outer_join_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(@NotNull plsqlParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(@NotNull plsqlParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_procedure_spec(@NotNull plsqlParser.Type_procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_procedure_spec(@NotNull plsqlParser.Type_procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void enterC_spec(@NotNull plsqlParser.C_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void exitC_spec(@NotNull plsqlParser.C_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#expression_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterExpression_wrapper(@NotNull plsqlParser.Expression_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#expression_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitExpression_wrapper(@NotNull plsqlParser.Expression_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(@NotNull plsqlParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(@NotNull plsqlParser.Single_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(@NotNull plsqlParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(@NotNull plsqlParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_dec(@NotNull plsqlParser.Table_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_dec(@NotNull plsqlParser.Table_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void enterSeed_part(@NotNull plsqlParser.Seed_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void exitSeed_part(@NotNull plsqlParser.Seed_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_parameters_clause(@NotNull plsqlParser.C_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_parameters_clause(@NotNull plsqlParser.C_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void enterFactoring_element(@NotNull plsqlParser.Factoring_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void exitFactoring_element(@NotNull plsqlParser.Factoring_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull plsqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull plsqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause_keyword(@NotNull plsqlParser.Over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause_keyword(@NotNull plsqlParser.Over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void enterWhenever_command(@NotNull plsqlParser.Whenever_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void exitWhenever_command(@NotNull plsqlParser.Whenever_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type_def(@NotNull plsqlParser.Varray_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type_def(@NotNull plsqlParser.Varray_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterAlias_quoted_string(@NotNull plsqlParser.Alias_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitAlias_quoted_string(@NotNull plsqlParser.Alias_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(@NotNull plsqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(@NotNull plsqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void enterStandard_function(@NotNull plsqlParser.Standard_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void exitStandard_function(@NotNull plsqlParser.Standard_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec_options(@NotNull plsqlParser.Element_spec_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec_options(@NotNull plsqlParser.Element_spec_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void enterExpression_or_vector(@NotNull plsqlParser.Expression_or_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void exitExpression_or_vector(@NotNull plsqlParser.Expression_or_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#show_errors_command}.
	 * @param ctx the parse tree
	 */
	void enterShow_errors_command(@NotNull plsqlParser.Show_errors_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#show_errors_command}.
	 * @param ctx the parse tree
	 */
	void exitShow_errors_command(@NotNull plsqlParser.Show_errors_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void enterObject_member_spec(@NotNull plsqlParser.Object_member_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void exitObject_member_spec(@NotNull plsqlParser.Object_member_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void enterSelected_element(@NotNull plsqlParser.Selected_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void exitSelected_element(@NotNull plsqlParser.Selected_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void enterIn_elements(@NotNull plsqlParser.In_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void exitIn_elements(@NotNull plsqlParser.In_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_type_name(@NotNull plsqlParser.Implementation_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_type_name(@NotNull plsqlParser.Implementation_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function(@NotNull plsqlParser.Alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function(@NotNull plsqlParser.Alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(@NotNull plsqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(@NotNull plsqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull plsqlParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull plsqlParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_spec(@NotNull plsqlParser.Package_obj_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_spec(@NotNull plsqlParser.Package_obj_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void enterType_body_elements(@NotNull plsqlParser.Type_body_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void exitType_body_elements(@NotNull plsqlParser.Type_body_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(@NotNull plsqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(@NotNull plsqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_iterate_clause(@NotNull plsqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_iterate_clause(@NotNull plsqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#link_name}.
	 * @param ctx the parse tree
	 */
	void enterLink_name(@NotNull plsqlParser.Link_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#link_name}.
	 * @param ctx the parse tree
	 */
	void exitLink_name(@NotNull plsqlParser.Link_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(@NotNull plsqlParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(@NotNull plsqlParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#condition_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterCondition_wrapper(@NotNull plsqlParser.Condition_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#condition_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitCondition_wrapper(@NotNull plsqlParser.Condition_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void enterCollect_order_by_part(@NotNull plsqlParser.Collect_order_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void exitCollect_order_by_part(@NotNull plsqlParser.Collect_order_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(@NotNull plsqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(@NotNull plsqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_row(@NotNull plsqlParser.For_each_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_row(@NotNull plsqlParser.For_each_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_dec(@NotNull plsqlParser.Table_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_dec(@NotNull plsqlParser.Table_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restriction_clause(@NotNull plsqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restriction_clause(@NotNull plsqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(@NotNull plsqlParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(@NotNull plsqlParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(@NotNull plsqlParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(@NotNull plsqlParser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(@NotNull plsqlParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(@NotNull plsqlParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(@NotNull plsqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(@NotNull plsqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull plsqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull plsqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode(@NotNull plsqlParser.Lock_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode(@NotNull plsqlParser.Lock_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void enterRespect_or_ignore_nulls(@NotNull plsqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void exitRespect_or_ignore_nulls(@NotNull plsqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(@NotNull plsqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(@NotNull plsqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(@NotNull plsqlParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(@NotNull plsqlParser.Query_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void enterCollection_name(@NotNull plsqlParser.Collection_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void exitCollection_name(@NotNull plsqlParser.Collection_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(@NotNull plsqlParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(@NotNull plsqlParser.Id_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void enterRelies_on_part(@NotNull plsqlParser.Relies_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void exitRelies_on_part(@NotNull plsqlParser.Relies_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(@NotNull plsqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(@NotNull plsqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_clause(@NotNull plsqlParser.Referencing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_clause(@NotNull plsqlParser.Referencing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_function_spec(@NotNull plsqlParser.Map_order_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_function_spec(@NotNull plsqlParser.Map_order_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void enterRegular_id(@NotNull plsqlParser.Regular_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void exitRegular_id(@NotNull plsqlParser.Regular_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(@NotNull plsqlParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(@NotNull plsqlParser.Single_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_elements(@NotNull plsqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_elements(@NotNull plsqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_enable_clause(@NotNull plsqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_enable_clause(@NotNull plsqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec(@NotNull plsqlParser.Element_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec(@NotNull plsqlParser.Element_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_name(@NotNull plsqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_name(@NotNull plsqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(@NotNull plsqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(@NotNull plsqlParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull plsqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull plsqlParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(@NotNull plsqlParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(@NotNull plsqlParser.Insert_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterColumn_based_update_set_clause(@NotNull plsqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitColumn_based_update_set_clause(@NotNull plsqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuantified_expression(@NotNull plsqlParser.Quantified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuantified_expression(@NotNull plsqlParser.Quantified_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull plsqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull plsqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(@NotNull plsqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(@NotNull plsqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(@NotNull plsqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(@NotNull plsqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#like_type}.
	 * @param ctx the parse tree
	 */
	void enterLike_type(@NotNull plsqlParser.Like_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#like_type}.
	 * @param ctx the parse tree
	 */
	void exitLike_type(@NotNull plsqlParser.Like_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_element(@NotNull plsqlParser.Model_rules_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_element(@NotNull plsqlParser.Model_rules_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_op(@NotNull plsqlParser.Concatenation_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_op(@NotNull plsqlParser.Concatenation_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_constraint_command(@NotNull plsqlParser.Set_constraint_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_constraint_command(@NotNull plsqlParser.Set_constraint_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void enterChar_set_name(@NotNull plsqlParser.Char_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void exitChar_set_name(@NotNull plsqlParser.Char_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_list(@NotNull plsqlParser.Model_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_list(@NotNull plsqlParser.Model_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_part(@NotNull plsqlParser.Within_or_over_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_part(@NotNull plsqlParser.Within_or_over_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing_clause(@NotNull plsqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing_clause(@NotNull plsqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPragma_declaration(@NotNull plsqlParser.Pragma_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPragma_declaration(@NotNull plsqlParser.Pragma_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(@NotNull plsqlParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(@NotNull plsqlParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(@NotNull plsqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(@NotNull plsqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(@NotNull plsqlParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(@NotNull plsqlParser.Main_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(@NotNull plsqlParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(@NotNull plsqlParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void enterStandard_prediction_function_keyword(@NotNull plsqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void exitStandard_prediction_function_keyword(@NotNull plsqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void enterNative_datatype_element(@NotNull plsqlParser.Native_datatype_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void exitNative_datatype_element(@NotNull plsqlParser.Native_datatype_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_modeling(@NotNull plsqlParser.Function_argument_modelingContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_modeling(@NotNull plsqlParser.Function_argument_modelingContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(@NotNull plsqlParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(@NotNull plsqlParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(@NotNull plsqlParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(@NotNull plsqlParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_when_clause(@NotNull plsqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_when_clause(@NotNull plsqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_spec(@NotNull plsqlParser.Declare_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_spec(@NotNull plsqlParser.Declare_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull plsqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull plsqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(@NotNull plsqlParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(@NotNull plsqlParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(@NotNull plsqlParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(@NotNull plsqlParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void enterTiming_point_section(@NotNull plsqlParser.Timing_point_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void exitTiming_point_section(@NotNull plsqlParser.Timing_point_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void enterBetween_bound(@NotNull plsqlParser.Between_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void exitBetween_bound(@NotNull plsqlParser.Between_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_for_statement(@NotNull plsqlParser.Open_for_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_for_statement(@NotNull plsqlParser.Open_for_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_body(@NotNull plsqlParser.Package_obj_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_body(@NotNull plsqlParser.Package_obj_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(@NotNull plsqlParser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(@NotNull plsqlParser.Subtype_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_attribute_definition(@NotNull plsqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_attribute_definition(@NotNull plsqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(@NotNull plsqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(@NotNull plsqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_spec(@NotNull plsqlParser.Constructor_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_spec(@NotNull plsqlParser.Constructor_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_operation_part(@NotNull plsqlParser.Subquery_operation_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_operation_part(@NotNull plsqlParser.Subquery_operation_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(@NotNull plsqlParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(@NotNull plsqlParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(@NotNull plsqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(@NotNull plsqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void enterCase_else_part(@NotNull plsqlParser.Case_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void exitCase_else_part(@NotNull plsqlParser.Case_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_part(@NotNull plsqlParser.Precision_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_part(@NotNull plsqlParser.Precision_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_event(@NotNull plsqlParser.Non_dml_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_event(@NotNull plsqlParser.Non_dml_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_handling_clause(@NotNull plsqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_handling_clause(@NotNull plsqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void enterLike_escape_part(@NotNull plsqlParser.Like_escape_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void exitLike_escape_part(@NotNull plsqlParser.Like_escape_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_in_type(@NotNull plsqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_in_type(@NotNull plsqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLabel_declaration(@NotNull plsqlParser.Label_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLabel_declaration(@NotNull plsqlParser.Label_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_of_part(@NotNull plsqlParser.For_update_of_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_of_part(@NotNull plsqlParser.For_update_of_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_element(@NotNull plsqlParser.Pivot_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_element(@NotNull plsqlParser.Pivot_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(@NotNull plsqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(@NotNull plsqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull plsqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull plsqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_when_part(@NotNull plsqlParser.Searched_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_when_part(@NotNull plsqlParser.Searched_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void enterXml_column_name(@NotNull plsqlParser.Xml_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void exitXml_column_name(@NotNull plsqlParser.Xml_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull plsqlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull plsqlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_as_part(@NotNull plsqlParser.Object_as_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_as_part(@NotNull plsqlParser.Object_as_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void enterParameter_spec(@NotNull plsqlParser.Parameter_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void exitParameter_spec(@NotNull plsqlParser.Parameter_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exception_clause}.
	 * @param ctx the parse tree
	 */
	void enterException_clause(@NotNull plsqlParser.Exception_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exception_clause}.
	 * @param ctx the parse tree
	 */
	void exitException_clause(@NotNull plsqlParser.Exception_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_statement(@NotNull plsqlParser.Savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_statement(@NotNull plsqlParser.Savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void enterUntil_part(@NotNull plsqlParser.Until_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void exitUntil_part(@NotNull plsqlParser.Until_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_body(@NotNull plsqlParser.Create_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_body(@NotNull plsqlParser.Create_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_type(@NotNull plsqlParser.Multiset_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_type(@NotNull plsqlParser.Multiset_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#record_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_dec(@NotNull plsqlParser.Record_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#record_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_dec(@NotNull plsqlParser.Record_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(@NotNull plsqlParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(@NotNull plsqlParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(@NotNull plsqlParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(@NotNull plsqlParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(@NotNull plsqlParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(@NotNull plsqlParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(@NotNull plsqlParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(@NotNull plsqlParser.Interval_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_command(@NotNull plsqlParser.Set_transaction_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_command(@NotNull plsqlParser.Set_transaction_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(@NotNull plsqlParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(@NotNull plsqlParser.Update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_elements(@NotNull plsqlParser.Group_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_elements(@NotNull plsqlParser.Group_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterStatic_returning_clause(@NotNull plsqlParser.Static_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitStatic_returning_clause(@NotNull plsqlParser.Static_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_spec(@NotNull plsqlParser.Subprogram_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_spec(@NotNull plsqlParser.Subprogram_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void enterWrite_clause(@NotNull plsqlParser.Write_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void exitWrite_clause(@NotNull plsqlParser.Write_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(@NotNull plsqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(@NotNull plsqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterXml_multiuse_expression_element(@NotNull plsqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitXml_multiuse_expression_element(@NotNull plsqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(@NotNull plsqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(@NotNull plsqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_elements(@NotNull plsqlParser.Order_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_elements(@NotNull plsqlParser.Order_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_element(@NotNull plsqlParser.Referencing_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_element(@NotNull plsqlParser.Referencing_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression(@NotNull plsqlParser.Model_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression(@NotNull plsqlParser.Model_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_of_clause(@NotNull plsqlParser.Current_of_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_of_clause(@NotNull plsqlParser.Current_of_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_nested_clause(@NotNull plsqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_nested_clause(@NotNull plsqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(@NotNull plsqlParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(@NotNull plsqlParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_enconding_part(@NotNull plsqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_enconding_part(@NotNull plsqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void enterException_name(@NotNull plsqlParser.Exception_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void exitException_name(@NotNull plsqlParser.Exception_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_clause(@NotNull plsqlParser.Partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_clause(@NotNull plsqlParser.Partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void enterForall_statement(@NotNull plsqlParser.Forall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void exitForall_statement(@NotNull plsqlParser.Forall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_basic_elements(@NotNull plsqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_basic_elements(@NotNull plsqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull plsqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull plsqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void enterRecord_name(@NotNull plsqlParser.Record_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void exitRecord_name(@NotNull plsqlParser.Record_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(@NotNull plsqlParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(@NotNull plsqlParser.Model_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void enterAlter_package(@NotNull plsqlParser.Alter_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void exitAlter_package(@NotNull plsqlParser.Alter_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_element(@NotNull plsqlParser.Dml_event_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_element(@NotNull plsqlParser.Dml_event_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(@NotNull plsqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(@NotNull plsqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_analytic(@NotNull plsqlParser.Function_argument_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_analytic(@NotNull plsqlParser.Function_argument_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_parameters_clause(@NotNull plsqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_parameters_clause(@NotNull plsqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void enterMerge_element(@NotNull plsqlParser.Merge_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void exitMerge_element(@NotNull plsqlParser.Merge_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void enterPragma_clause(@NotNull plsqlParser.Pragma_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void exitPragma_clause(@NotNull plsqlParser.Pragma_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCompound_dml_trigger(@NotNull plsqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCompound_dml_trigger(@NotNull plsqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void enterUsing_element(@NotNull plsqlParser.Using_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void exitUsing_element(@NotNull plsqlParser.Using_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void enterCost_class_name(@NotNull plsqlParser.Cost_class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void exitCost_class_name(@NotNull plsqlParser.Cost_class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(@NotNull plsqlParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(@NotNull plsqlParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(@NotNull plsqlParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(@NotNull plsqlParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_name(@NotNull plsqlParser.Sequence_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_name(@NotNull plsqlParser.Sequence_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void enterCursor_loop_param(@NotNull plsqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void exitCursor_loop_param(@NotNull plsqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void enterWait_nowait_part(@NotNull plsqlParser.Wait_nowait_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void exitWait_nowait_part(@NotNull plsqlParser.Wait_nowait_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(@NotNull plsqlParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(@NotNull plsqlParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(@NotNull plsqlParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(@NotNull plsqlParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(@NotNull plsqlParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(@NotNull plsqlParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_elements(@NotNull plsqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_elements(@NotNull plsqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(@NotNull plsqlParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(@NotNull plsqlParser.Cell_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_body(@NotNull plsqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_body(@NotNull plsqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void enterCall_spec(@NotNull plsqlParser.Call_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void exitCall_spec(@NotNull plsqlParser.Call_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(@NotNull plsqlParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(@NotNull plsqlParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(@NotNull plsqlParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(@NotNull plsqlParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(@NotNull plsqlParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(@NotNull plsqlParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull plsqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull plsqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_statement(@NotNull plsqlParser.Lock_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_statement(@NotNull plsqlParser.Lock_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_element(@NotNull plsqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_element(@NotNull plsqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(@NotNull plsqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(@NotNull plsqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void enterCost_matrix_clause(@NotNull plsqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void exitCost_matrix_clause(@NotNull plsqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_under_part(@NotNull plsqlParser.Object_under_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_under_part(@NotNull plsqlParser.Object_under_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(@NotNull plsqlParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(@NotNull plsqlParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(@NotNull plsqlParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(@NotNull plsqlParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(@NotNull plsqlParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(@NotNull plsqlParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnit_statement(@NotNull plsqlParser.Unit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnit_statement(@NotNull plsqlParser.Unit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void enterType_body(@NotNull plsqlParser.Type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void exitType_body(@NotNull plsqlParser.Type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void enterFor_increment_decrement_type(@NotNull plsqlParser.For_increment_decrement_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void exitFor_increment_decrement_type(@NotNull plsqlParser.For_increment_decrement_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_clause(@NotNull plsqlParser.Dml_event_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_clause(@NotNull plsqlParser.Dml_event_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_follows_clause(@NotNull plsqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_follows_clause(@NotNull plsqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(@NotNull plsqlParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(@NotNull plsqlParser.Return_rows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(@NotNull plsqlParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(@NotNull plsqlParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(@NotNull plsqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(@NotNull plsqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_reject_part(@NotNull plsqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_reject_part(@NotNull plsqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull plsqlParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull plsqlParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull plsqlParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull plsqlParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger(@NotNull plsqlParser.Alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger(@NotNull plsqlParser.Alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void enterField_spec(@NotNull plsqlParser.Field_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void exitField_spec(@NotNull plsqlParser.Field_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_trigger(@NotNull plsqlParser.Non_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_trigger(@NotNull plsqlParser.Non_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(@NotNull plsqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(@NotNull plsqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(@NotNull plsqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(@NotNull plsqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull plsqlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull plsqlParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_command(@NotNull plsqlParser.Set_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_command(@NotNull plsqlParser.Set_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull plsqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull plsqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_definition(@NotNull plsqlParser.Attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_definition(@NotNull plsqlParser.Attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(@NotNull plsqlParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(@NotNull plsqlParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void enterStart_part(@NotNull plsqlParser.Start_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void exitStart_part(@NotNull plsqlParser.Start_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_when_part(@NotNull plsqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_when_part(@NotNull plsqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_expression(@NotNull plsqlParser.Multiply_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_expression(@NotNull plsqlParser.Multiply_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression_element(@NotNull plsqlParser.Model_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression_element(@NotNull plsqlParser.Model_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_clause_keyword(@NotNull plsqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_clause_keyword(@NotNull plsqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void enterExit_command(@NotNull plsqlParser.Exit_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void exitExit_command(@NotNull plsqlParser.Exit_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull plsqlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull plsqlParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_list(@NotNull plsqlParser.Table_ref_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_list(@NotNull plsqlParser.Table_ref_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#concatenation_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_wrapper(@NotNull plsqlParser.Concatenation_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#concatenation_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_wrapper(@NotNull plsqlParser.Concatenation_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull plsqlParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull plsqlParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element(@NotNull plsqlParser.General_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element(@NotNull plsqlParser.General_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_control_statements(@NotNull plsqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_control_statements(@NotNull plsqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void enterDrop_package(@NotNull plsqlParser.Drop_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void exitDrop_package(@NotNull plsqlParser.Drop_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(@NotNull plsqlParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(@NotNull plsqlParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package(@NotNull plsqlParser.Create_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package(@NotNull plsqlParser.Create_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(@NotNull plsqlParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(@NotNull plsqlParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#record_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterRecord_var_dec(@NotNull plsqlParser.Record_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#record_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitRecord_var_dec(@NotNull plsqlParser.Record_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_negative(@NotNull plsqlParser.Numeric_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_negative(@NotNull plsqlParser.Numeric_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_body(@NotNull plsqlParser.Trigger_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_body(@NotNull plsqlParser.Trigger_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_elements(@NotNull plsqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_elements(@NotNull plsqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void enterRollback_segment_name(@NotNull plsqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void exitRollback_segment_name(@NotNull plsqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_table_ref(@NotNull plsqlParser.General_table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_table_ref(@NotNull plsqlParser.General_table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void enterBounds_clause(@NotNull plsqlParser.Bounds_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void exitBounds_clause(@NotNull plsqlParser.Bounds_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_version_part(@NotNull plsqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_version_part(@NotNull plsqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(@NotNull plsqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(@NotNull plsqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(@NotNull plsqlParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(@NotNull plsqlParser.For_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void enterNegated_expression(@NotNull plsqlParser.Negated_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void exitNegated_expression(@NotNull plsqlParser.Negated_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(@NotNull plsqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(@NotNull plsqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(@NotNull plsqlParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(@NotNull plsqlParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_element(@NotNull plsqlParser.Alter_method_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_element(@NotNull plsqlParser.Alter_method_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(@NotNull plsqlParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(@NotNull plsqlParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_manipulation_language_statements(@NotNull plsqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_manipulation_language_statements(@NotNull plsqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_expression(@NotNull plsqlParser.Multiset_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_expression(@NotNull plsqlParser.Multiset_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(@NotNull plsqlParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(@NotNull plsqlParser.Xml_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(@NotNull plsqlParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(@NotNull plsqlParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(@NotNull plsqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(@NotNull plsqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull plsqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull plsqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(@NotNull plsqlParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(@NotNull plsqlParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_def(@NotNull plsqlParser.Object_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_def(@NotNull plsqlParser.Object_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_part(@NotNull plsqlParser.Default_value_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_part(@NotNull plsqlParser.Default_value_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(@NotNull plsqlParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(@NotNull plsqlParser.Multi_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_version_part(@NotNull plsqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_version_part(@NotNull plsqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(@NotNull plsqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(@NotNull plsqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_when_part(@NotNull plsqlParser.Simple_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_when_part(@NotNull plsqlParser.Simple_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(@NotNull plsqlParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(@NotNull plsqlParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_in_type(@NotNull plsqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_in_type(@NotNull plsqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void enterTable_indexed_by_part(@NotNull plsqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void exitTable_indexed_by_part(@NotNull plsqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_using_part(@NotNull plsqlParser.Join_using_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_using_part(@NotNull plsqlParser.Join_using_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(@NotNull plsqlParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(@NotNull plsqlParser.Model_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull plsqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull plsqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull plsqlParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull plsqlParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_type(@NotNull plsqlParser.Windowing_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_type(@NotNull plsqlParser.Windowing_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void enterXml_general_default_part(@NotNull plsqlParser.Xml_general_default_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void exitXml_general_default_part(@NotNull plsqlParser.Xml_general_default_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(@NotNull plsqlParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(@NotNull plsqlParser.Reference_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(@NotNull plsqlParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(@NotNull plsqlParser.Model_rules_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(@NotNull plsqlParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(@NotNull plsqlParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void enterSequence_start_clause(@NotNull plsqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void exitSequence_start_clause(@NotNull plsqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_statements(@NotNull plsqlParser.Seq_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_statements(@NotNull plsqlParser.Seq_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterCompound_trigger_block(@NotNull plsqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitCompound_trigger_block(@NotNull plsqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void enterSelected_tableview(@NotNull plsqlParser.Selected_tableviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void exitSelected_tableview(@NotNull plsqlParser.Selected_tableviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_name(@NotNull plsqlParser.Routine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_name(@NotNull plsqlParser.Routine_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_part(@NotNull plsqlParser.Model_rules_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_part(@NotNull plsqlParser.Model_rules_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(@NotNull plsqlParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(@NotNull plsqlParser.Simple_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(@NotNull plsqlParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(@NotNull plsqlParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_expression(@NotNull plsqlParser.Table_collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_expression(@NotNull plsqlParser.Table_collection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull plsqlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull plsqlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux(@NotNull plsqlParser.Table_ref_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux(@NotNull plsqlParser.Table_ref_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull plsqlParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull plsqlParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVector_expr(@NotNull plsqlParser.Vector_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVector_expr(@NotNull plsqlParser.Vector_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void enterBetween_elements(@NotNull plsqlParser.Between_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void exitBetween_elements(@NotNull plsqlParser.Between_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void enterBind_variable(@NotNull plsqlParser.Bind_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void exitBind_variable(@NotNull plsqlParser.Bind_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(@NotNull plsqlParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(@NotNull plsqlParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(@NotNull plsqlParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(@NotNull plsqlParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(@NotNull plsqlParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(@NotNull plsqlParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_standalone_part(@NotNull plsqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_standalone_part(@NotNull plsqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void enterDependent_exceptions_part(@NotNull plsqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void exitDependent_exceptions_part(@NotNull plsqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elements(@NotNull plsqlParser.Select_list_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elements(@NotNull plsqlParser.Select_list_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterGreater_than_or_equals_op(@NotNull plsqlParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitGreater_than_or_equals_op(@NotNull plsqlParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type_attr(@NotNull plsqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type_attr(@NotNull plsqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull plsqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull plsqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_element(@NotNull plsqlParser.Multi_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_element(@NotNull plsqlParser.Multi_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(@NotNull plsqlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(@NotNull plsqlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(@NotNull plsqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(@NotNull plsqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(@NotNull plsqlParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(@NotNull plsqlParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger(@NotNull plsqlParser.Create_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger(@NotNull plsqlParser.Create_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#record_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRecord_declaration(@NotNull plsqlParser.Record_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#record_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRecord_declaration(@NotNull plsqlParser.Record_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(@NotNull plsqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(@NotNull plsqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(@NotNull plsqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(@NotNull plsqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void enterSwallow_to_semi(@NotNull plsqlParser.Swallow_to_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void exitSwallow_to_semi(@NotNull plsqlParser.Swallow_to_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull plsqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull plsqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on_part(@NotNull plsqlParser.Join_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on_part(@NotNull plsqlParser.Join_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(@NotNull plsqlParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(@NotNull plsqlParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(@NotNull plsqlParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(@NotNull plsqlParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(@NotNull plsqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(@NotNull plsqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespaces_clause(@NotNull plsqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespaces_clause(@NotNull plsqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void enterKeep_clause(@NotNull plsqlParser.Keep_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void exitKeep_clause(@NotNull plsqlParser.Keep_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_model_name(@NotNull plsqlParser.Main_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_model_name(@NotNull plsqlParser.Main_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link plsqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate(@NotNull plsqlParser.Execute_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link plsqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate(@NotNull plsqlParser.Execute_immediateContext ctx);
}