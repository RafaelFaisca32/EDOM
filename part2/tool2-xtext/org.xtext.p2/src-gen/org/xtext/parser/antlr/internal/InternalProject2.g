/*
 * generated by Xtext 2.25.0
 */
grammar InternalProject2;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.Project2GrammarAccess;

}

@parser::members {

 	private Project2GrammarAccess grammarAccess;

    public InternalProject2Parser(TokenStream input, Project2GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Project2GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Model'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='project'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getProjectKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getProjectProjectParserRuleCall_4_0());
				}
				lv_project_4_0=ruleProject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"project",
						lv_project_4_0,
						"org.xtext.Project2.Project");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getAction_ImplParserRuleCall_0());
		}
		this_Action_Impl_0=ruleAction_Impl
		{
			$current = $this_Action_Impl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getInstructionBlockParserRuleCall_1());
		}
		this_InstructionBlock_1=ruleInstructionBlock
		{
			$current = $this_InstructionBlock_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getStartParserRuleCall_2());
		}
		this_Start_2=ruleStart
		{
			$current = $this_Start_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getEndParserRuleCall_3());
		}
		this_End_3=ruleEnd
		{
			$current = $this_End_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleProject
entryRuleProject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProjectRule()); }
	iv_ruleProject=ruleProject
	{ $current=$iv_ruleProject.current; }
	EOF;

// Rule Project
ruleProject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Project'
		{
			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProjectRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='version'
			{
				newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getVersionKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProjectAccess().getVersionEStringParserRuleCall_3_1_0());
					}
					lv_version_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProjectRule());
						}
						set(
							$current,
							"version",
							lv_version_4_0,
							"org.xtext.Project2.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='target'
		{
			newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getTargetKeyword_4());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProjectAccess().getTargetTargetParserRuleCall_6_0());
				}
				lv_target_7_0=ruleTarget
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProjectRule());
					}
					add(
						$current,
						"target",
						lv_target_7_0,
						"org.xtext.Project2.Target");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_8=','
			{
				newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProjectAccess().getTargetTargetParserRuleCall_7_1_0());
					}
					lv_target_9_0=ruleTarget
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProjectRule());
						}
						add(
							$current,
							"target",
							lv_target_9_0,
							"org.xtext.Project2.Target");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_8());
		}
		otherlv_11='tasks'
		{
			newLeafNode(otherlv_11, grammarAccess.getProjectAccess().getTasksKeyword_9());
		}
		otherlv_12='{'
		{
			newLeafNode(otherlv_12, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_11_0());
				}
				lv_tasks_13_0=ruleTask
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProjectRule());
					}
					add(
						$current,
						"tasks",
						lv_tasks_13_0,
						"org.xtext.Project2.Task");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_14=','
			{
				newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getCommaKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_12_1_0());
					}
					lv_tasks_15_0=ruleTask
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProjectRule());
						}
						add(
							$current,
							"tasks",
							lv_tasks_15_0,
							"org.xtext.Project2.Task");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_14());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleTarget
entryRuleTarget returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetRule()); }
	iv_ruleTarget=ruleTarget
	{ $current=$iv_ruleTarget.current; }
	EOF;

// Rule Target
ruleTarget returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Target'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getTargetKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='dependencies'
			{
				newLeafNode(otherlv_3, grammarAccess.getTargetAccess().getDependenciesKeyword_3_0());
			}
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTargetRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTargetAccess().getDependenciesTargetCrossReference_3_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getTargetAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTargetRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getTargetAccess().getDependenciesTargetCrossReference_3_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getTargetAccess().getRightParenthesisKeyword_3_4());
			}
		)?
		otherlv_9='has'
		{
			newLeafNode(otherlv_9, grammarAccess.getTargetAccess().getHasKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetAccess().getHasTaskParserRuleCall_5_0());
				}
				lv_has_10_0=ruleTask
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetRule());
					}
					set(
						$current,
						"has",
						lv_has_10_0,
						"org.xtext.Project2.Task");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='output'
		{
			newLeafNode(otherlv_11, grammarAccess.getTargetAccess().getOutputKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetAccess().getOutputFileParserRuleCall_7_0());
				}
				lv_output_12_0=ruleFile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetRule());
					}
					set(
						$current,
						"output",
						lv_output_12_0,
						"org.xtext.Project2.File");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13='input'
		{
			newLeafNode(otherlv_13, grammarAccess.getTargetAccess().getInputKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetAccess().getInputFileParserRuleCall_9_0());
				}
				lv_input_14_0=ruleFile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetRule());
					}
					set(
						$current,
						"input",
						lv_input_14_0,
						"org.xtext.Project2.File");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getTargetAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current; }
	EOF;

// Rule Task
ruleTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTaskAccess().getTaskAction_0(),
					$current);
			}
		)
		otherlv_1='Task'
		{
			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getTaskKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='description'
			{
				newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getDescriptionKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTaskAccess().getDescriptionEStringParserRuleCall_4_1_0());
					}
					lv_description_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTaskRule());
						}
						set(
							$current,
							"description",
							lv_description_5_0,
							"org.xtext.Project2.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='depends'
			{
				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getDependsKeyword_5_0());
			}
			otherlv_7='('
			{
				newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTaskRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTaskAccess().getDependsTaskCrossReference_5_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTaskRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getTaskAccess().getDependsTaskCrossReference_5_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11=')'
			{
				newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getRightParenthesisKeyword_5_4());
			}
		)?
		(
			otherlv_12='has'
			{
				newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getHasKeyword_6_0());
			}
			otherlv_13='{'
			{
				newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTaskAccess().getHasPropertyParserRuleCall_6_2_0());
					}
					lv_has_14_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTaskRule());
						}
						add(
							$current,
							"has",
							lv_has_14_0,
							"org.xtext.Project2.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_15=','
				{
					newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTaskAccess().getHasPropertyParserRuleCall_6_3_1_0());
						}
						lv_has_16_0=ruleProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTaskRule());
							}
							add(
								$current,
								"has",
								lv_has_16_0,
								"org.xtext.Project2.Property");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_17='}'
			{
				newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		(
			otherlv_18='actions'
			{
				newLeafNode(otherlv_18, grammarAccess.getTaskAccess().getActionsKeyword_7_0());
			}
			otherlv_19='{'
			{
				newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTaskAccess().getActionsActionParserRuleCall_7_2_0());
					}
					lv_actions_20_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTaskRule());
						}
						add(
							$current,
							"actions",
							lv_actions_20_0,
							"org.xtext.Project2.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_21=','
				{
					newLeafNode(otherlv_21, grammarAccess.getTaskAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTaskAccess().getActionsActionParserRuleCall_7_3_1_0());
						}
						lv_actions_22_0=ruleAction
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTaskRule());
							}
							add(
								$current,
								"actions",
								lv_actions_22_0,
								"org.xtext.Project2.Action");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_23='}'
			{
				newLeafNode(otherlv_23, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_7_4());
			}
		)?
		otherlv_24='}'
		{
			newLeafNode(otherlv_24, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	iv_ruleFile=ruleFile
	{ $current=$iv_ruleFile.current; }
	EOF;

// Rule File
ruleFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFileAccess().getFileAction_0(),
					$current);
			}
		)
		otherlv_1='File'
		{
			newLeafNode(otherlv_1, grammarAccess.getFileAccess().getFileKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFileAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFileRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPropertyAccess().getPropertyAction_0(),
					$current);
			}
		)
		otherlv_1='Property'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='value'
			{
				newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getValueKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0());
					}
					lv_value_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"value",
							lv_value_5_0,
							"org.xtext.Project2.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleAction_Impl
entryRuleAction_Impl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAction_ImplRule()); }
	iv_ruleAction_Impl=ruleAction_Impl
	{ $current=$iv_ruleAction_Impl.current; }
	EOF;

// Rule Action_Impl
ruleAction_Impl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAction_ImplAccess().getActionAction_0(),
					$current);
			}
		)
		otherlv_1='Action'
		{
			newLeafNode(otherlv_1, grammarAccess.getAction_ImplAccess().getActionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAction_ImplAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAction_ImplRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='decisions'
			{
				newLeafNode(otherlv_4, grammarAccess.getAction_ImplAccess().getDecisionsKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAction_ImplAccess().getDecisionsDecisionParserRuleCall_4_2_0());
					}
					lv_decisions_6_0=ruleDecision
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAction_ImplRule());
						}
						add(
							$current,
							"decisions",
							lv_decisions_6_0,
							"org.xtext.Project2.Decision");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getAction_ImplAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAction_ImplAccess().getDecisionsDecisionParserRuleCall_4_3_1_0());
						}
						lv_decisions_8_0=ruleDecision
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAction_ImplRule());
							}
							add(
								$current,
								"decisions",
								lv_decisions_8_0,
								"org.xtext.Project2.Decision");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleDecision
entryRuleDecision returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecisionRule()); }
	iv_ruleDecision=ruleDecision
	{ $current=$iv_ruleDecision.current; }
	EOF;

// Rule Decision
ruleDecision returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Decision'
		{
			newLeafNode(otherlv_0, grammarAccess.getDecisionAccess().getDecisionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDecisionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='has'
			{
				newLeafNode(otherlv_2, grammarAccess.getDecisionAccess().getHasKeyword_2_0());
			}
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getDecisionAccess().getLeftCurlyBracketKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionAccess().getHasPropertyParserRuleCall_2_2_0());
					}
					lv_has_4_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionRule());
						}
						add(
							$current,
							"has",
							lv_has_4_0,
							"org.xtext.Project2.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getDecisionAccess().getCommaKeyword_2_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDecisionAccess().getHasPropertyParserRuleCall_2_3_1_0());
						}
						lv_has_6_0=ruleProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDecisionRule());
							}
							add(
								$current,
								"has",
								lv_has_6_0,
								"org.xtext.Project2.Property");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getDecisionAccess().getRightCurlyBracketKeyword_2_4());
			}
		)?
		otherlv_8='condition'
		{
			newLeafNode(otherlv_8, grammarAccess.getDecisionAccess().getConditionKeyword_3());
		}
		otherlv_9='{'
		{
			newLeafNode(otherlv_9, grammarAccess.getDecisionAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDecisionAccess().getConditionConditionParserRuleCall_5_0());
				}
				lv_condition_10_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDecisionRule());
					}
					add(
						$current,
						"condition",
						lv_condition_10_0,
						"org.xtext.Project2.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_11=','
			{
				newLeafNode(otherlv_11, grammarAccess.getDecisionAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionAccess().getConditionConditionParserRuleCall_6_1_0());
					}
					lv_condition_12_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionRule());
						}
						add(
							$current,
							"condition",
							lv_condition_12_0,
							"org.xtext.Project2.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getDecisionAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getDecisionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleInstructionBlock
entryRuleInstructionBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionBlockRule()); }
	iv_ruleInstructionBlock=ruleInstructionBlock
	{ $current=$iv_ruleInstructionBlock.current; }
	EOF;

// Rule InstructionBlock
ruleInstructionBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='InstructionBlock'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstructionBlockAccess().getInstructionBlockKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionBlockAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstructionBlockAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='decisions'
			{
				newLeafNode(otherlv_3, grammarAccess.getInstructionBlockAccess().getDecisionsKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getInstructionBlockAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInstructionBlockAccess().getDecisionsDecisionParserRuleCall_3_2_0());
					}
					lv_decisions_5_0=ruleDecision
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
						}
						add(
							$current,
							"decisions",
							lv_decisions_5_0,
							"org.xtext.Project2.Decision");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getInstructionBlockAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getInstructionBlockAccess().getDecisionsDecisionParserRuleCall_3_3_1_0());
						}
						lv_decisions_7_0=ruleDecision
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
							}
							add(
								$current,
								"decisions",
								lv_decisions_7_0,
								"org.xtext.Project2.Decision");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getInstructionBlockAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		otherlv_9='has'
		{
			newLeafNode(otherlv_9, grammarAccess.getInstructionBlockAccess().getHasKeyword_4());
		}
		otherlv_10='{'
		{
			newLeafNode(otherlv_10, grammarAccess.getInstructionBlockAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionBlockAccess().getHasInstructionParserRuleCall_6_0());
				}
				lv_has_11_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
					}
					add(
						$current,
						"has",
						lv_has_11_0,
						"org.xtext.Project2.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_12=','
			{
				newLeafNode(otherlv_12, grammarAccess.getInstructionBlockAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInstructionBlockAccess().getHasInstructionParserRuleCall_7_1_0());
					}
					lv_has_13_0=ruleInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
						}
						add(
							$current,
							"has",
							lv_has_13_0,
							"org.xtext.Project2.Instruction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getInstructionBlockAccess().getRightCurlyBracketKeyword_8());
		}
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getInstructionBlockAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleStart
entryRuleStart returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStartRule()); }
	iv_ruleStart=ruleStart
	{ $current=$iv_ruleStart.current; }
	EOF;

// Rule Start
ruleStart returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStartAccess().getStartAction_0(),
					$current);
			}
		)
		otherlv_1='Start'
		{
			newLeafNode(otherlv_1, grammarAccess.getStartAccess().getStartKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStartAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStartRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getStartAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='next'
			{
				newLeafNode(otherlv_4, grammarAccess.getStartAccess().getNextKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStartRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getStartAccess().getNextActionCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='decisions'
			{
				newLeafNode(otherlv_6, grammarAccess.getStartAccess().getDecisionsKeyword_5_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getStartAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStartAccess().getDecisionsDecisionParserRuleCall_5_2_0());
					}
					lv_decisions_8_0=ruleDecision
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStartRule());
						}
						add(
							$current,
							"decisions",
							lv_decisions_8_0,
							"org.xtext.Project2.Decision");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getStartAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStartAccess().getDecisionsDecisionParserRuleCall_5_3_1_0());
						}
						lv_decisions_10_0=ruleDecision
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStartRule());
							}
							add(
								$current,
								"decisions",
								lv_decisions_10_0,
								"org.xtext.Project2.Decision");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getStartAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getStartAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleEnd
entryRuleEnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndRule()); }
	iv_ruleEnd=ruleEnd
	{ $current=$iv_ruleEnd.current; }
	EOF;

// Rule End
ruleEnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEndAccess().getEndAction_0(),
					$current);
			}
		)
		otherlv_1='End'
		{
			newLeafNode(otherlv_1, grammarAccess.getEndAccess().getEndKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEndAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEndRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getEndAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='decisions'
			{
				newLeafNode(otherlv_4, grammarAccess.getEndAccess().getDecisionsKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getEndAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEndAccess().getDecisionsDecisionParserRuleCall_4_2_0());
					}
					lv_decisions_6_0=ruleDecision
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEndRule());
						}
						add(
							$current,
							"decisions",
							lv_decisions_6_0,
							"org.xtext.Project2.Decision");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getEndAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEndAccess().getDecisionsDecisionParserRuleCall_4_3_1_0());
						}
						lv_decisions_8_0=ruleDecision
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEndRule());
							}
							add(
								$current,
								"decisions",
								lv_decisions_8_0,
								"org.xtext.Project2.Decision");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getEndAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getEndAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getConditionAccess().getConditionAction_0(),
					$current);
			}
		)
		otherlv_1='Condition'
		{
			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='value'
			{
				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getValueKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionAccess().getValueEStringParserRuleCall_3_1_0());
					}
					lv_value_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionRule());
						}
						set(
							$current,
							"value",
							lv_value_4_0,
							"org.xtext.Project2.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInstructionAccess().getInstructionAction_0(),
					$current);
			}
		)
		otherlv_1='Instruction'
		{
			newLeafNode(otherlv_1, grammarAccess.getInstructionAccess().getInstructionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.Project2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
