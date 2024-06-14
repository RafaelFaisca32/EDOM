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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProject2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'project'", "'}'", "'Project'", "'version'", "'target'", "','", "'tasks'", "'Target'", "'dependencies'", "'('", "')'", "'has'", "'output'", "'input'", "'Task'", "'description'", "'depends'", "'actions'", "'File'", "'Property'", "'value'", "'Action'", "'decisions'", "'Decision'", "'condition'", "'InstructionBlock'", "'Start'", "'next'", "'End'", "'Condition'", "'Instruction'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalProject2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProject2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProject2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalProject2.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalProject2.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalProject2.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalProject2.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalProject2.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_project_4_0= ruleProject ) ) otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_project_4_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:77:2: ( (otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_project_4_0= ruleProject ) ) otherlv_5= '}' ) )
            // InternalProject2.g:78:2: (otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_project_4_0= ruleProject ) ) otherlv_5= '}' )
            {
            // InternalProject2.g:78:2: (otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_project_4_0= ruleProject ) ) otherlv_5= '}' )
            // InternalProject2.g:79:3: otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'project' ( (lv_project_4_0= ruleProject ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalProject2.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProject2.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalProject2.g:84:4: (lv_name_1_0= ruleEString )
            // InternalProject2.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getProjectKeyword_3());
            		
            // InternalProject2.g:110:3: ( (lv_project_4_0= ruleProject ) )
            // InternalProject2.g:111:4: (lv_project_4_0= ruleProject )
            {
            // InternalProject2.g:111:4: (lv_project_4_0= ruleProject )
            // InternalProject2.g:112:5: lv_project_4_0= ruleProject
            {

            					newCompositeNode(grammarAccess.getModelAccess().getProjectProjectParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_project_4_0=ruleProject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"project",
            						lv_project_4_0,
            						"org.xtext.Project2.Project");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAction"
    // InternalProject2.g:137:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalProject2.g:137:47: (iv_ruleAction= ruleAction EOF )
            // InternalProject2.g:138:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalProject2.g:144:1: ruleAction returns [EObject current=null] : (this_Action_Impl_0= ruleAction_Impl | this_InstructionBlock_1= ruleInstructionBlock | this_Start_2= ruleStart | this_End_3= ruleEnd ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Action_Impl_0 = null;

        EObject this_InstructionBlock_1 = null;

        EObject this_Start_2 = null;

        EObject this_End_3 = null;



        	enterRule();

        try {
            // InternalProject2.g:150:2: ( (this_Action_Impl_0= ruleAction_Impl | this_InstructionBlock_1= ruleInstructionBlock | this_Start_2= ruleStart | this_End_3= ruleEnd ) )
            // InternalProject2.g:151:2: (this_Action_Impl_0= ruleAction_Impl | this_InstructionBlock_1= ruleInstructionBlock | this_Start_2= ruleStart | this_End_3= ruleEnd )
            {
            // InternalProject2.g:151:2: (this_Action_Impl_0= ruleAction_Impl | this_InstructionBlock_1= ruleInstructionBlock | this_Start_2= ruleStart | this_End_3= ruleEnd )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt1=1;
                }
                break;
            case 38:
                {
                alt1=2;
                }
                break;
            case 39:
                {
                alt1=3;
                }
                break;
            case 41:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalProject2.g:152:3: this_Action_Impl_0= ruleAction_Impl
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAction_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_Impl_0=ruleAction_Impl();

                    state._fsp--;


                    			current = this_Action_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProject2.g:161:3: this_InstructionBlock_1= ruleInstructionBlock
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getInstructionBlockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstructionBlock_1=ruleInstructionBlock();

                    state._fsp--;


                    			current = this_InstructionBlock_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProject2.g:170:3: this_Start_2= ruleStart
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getStartParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Start_2=ruleStart();

                    state._fsp--;


                    			current = this_Start_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProject2.g:179:3: this_End_3= ruleEnd
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getEndParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_End_3=ruleEnd();

                    state._fsp--;


                    			current = this_End_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleProject"
    // InternalProject2.g:191:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalProject2.g:191:48: (iv_ruleProject= ruleProject EOF )
            // InternalProject2.g:192:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalProject2.g:198:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? otherlv_5= 'target' otherlv_6= '{' ( (lv_target_7_0= ruleTarget ) ) (otherlv_8= ',' ( (lv_target_9_0= ruleTarget ) ) )* otherlv_10= '}' otherlv_11= 'tasks' otherlv_12= '{' ( (lv_tasks_13_0= ruleTask ) ) (otherlv_14= ',' ( (lv_tasks_15_0= ruleTask ) ) )* otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_version_4_0 = null;

        EObject lv_target_7_0 = null;

        EObject lv_target_9_0 = null;

        EObject lv_tasks_13_0 = null;

        EObject lv_tasks_15_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:204:2: ( (otherlv_0= 'Project' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? otherlv_5= 'target' otherlv_6= '{' ( (lv_target_7_0= ruleTarget ) ) (otherlv_8= ',' ( (lv_target_9_0= ruleTarget ) ) )* otherlv_10= '}' otherlv_11= 'tasks' otherlv_12= '{' ( (lv_tasks_13_0= ruleTask ) ) (otherlv_14= ',' ( (lv_tasks_15_0= ruleTask ) ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // InternalProject2.g:205:2: (otherlv_0= 'Project' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? otherlv_5= 'target' otherlv_6= '{' ( (lv_target_7_0= ruleTarget ) ) (otherlv_8= ',' ( (lv_target_9_0= ruleTarget ) ) )* otherlv_10= '}' otherlv_11= 'tasks' otherlv_12= '{' ( (lv_tasks_13_0= ruleTask ) ) (otherlv_14= ',' ( (lv_tasks_15_0= ruleTask ) ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // InternalProject2.g:205:2: (otherlv_0= 'Project' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? otherlv_5= 'target' otherlv_6= '{' ( (lv_target_7_0= ruleTarget ) ) (otherlv_8= ',' ( (lv_target_9_0= ruleTarget ) ) )* otherlv_10= '}' otherlv_11= 'tasks' otherlv_12= '{' ( (lv_tasks_13_0= ruleTask ) ) (otherlv_14= ',' ( (lv_tasks_15_0= ruleTask ) ) )* otherlv_16= '}' otherlv_17= '}' )
            // InternalProject2.g:206:3: otherlv_0= 'Project' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? otherlv_5= 'target' otherlv_6= '{' ( (lv_target_7_0= ruleTarget ) ) (otherlv_8= ',' ( (lv_target_9_0= ruleTarget ) ) )* otherlv_10= '}' otherlv_11= 'tasks' otherlv_12= '{' ( (lv_tasks_13_0= ruleTask ) ) (otherlv_14= ',' ( (lv_tasks_15_0= ruleTask ) ) )* otherlv_16= '}' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalProject2.g:210:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProject2.g:211:4: (lv_name_1_0= ruleEString )
            {
            // InternalProject2.g:211:4: (lv_name_1_0= ruleEString )
            // InternalProject2.g:212:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalProject2.g:233:3: (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProject2.g:234:4: otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getVersionKeyword_3_0());
                    			
                    // InternalProject2.g:238:4: ( (lv_version_4_0= ruleEString ) )
                    // InternalProject2.g:239:5: (lv_version_4_0= ruleEString )
                    {
                    // InternalProject2.g:239:5: (lv_version_4_0= ruleEString )
                    // InternalProject2.g:240:6: lv_version_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProjectAccess().getVersionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_version_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_4_0,
                    							"org.xtext.Project2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getTargetKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalProject2.g:266:3: ( (lv_target_7_0= ruleTarget ) )
            // InternalProject2.g:267:4: (lv_target_7_0= ruleTarget )
            {
            // InternalProject2.g:267:4: (lv_target_7_0= ruleTarget )
            // InternalProject2.g:268:5: lv_target_7_0= ruleTarget
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTargetTargetParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_target_7_0=ruleTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"target",
            						lv_target_7_0,
            						"org.xtext.Project2.Target");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProject2.g:285:3: (otherlv_8= ',' ( (lv_target_9_0= ruleTarget ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalProject2.g:286:4: otherlv_8= ',' ( (lv_target_9_0= ruleTarget ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FOLLOW_10); 

            	    				newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalProject2.g:290:4: ( (lv_target_9_0= ruleTarget ) )
            	    // InternalProject2.g:291:5: (lv_target_9_0= ruleTarget )
            	    {
            	    // InternalProject2.g:291:5: (lv_target_9_0= ruleTarget )
            	    // InternalProject2.g:292:6: lv_target_9_0= ruleTarget
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getTargetTargetParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_target_9_0=ruleTarget();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"target",
            	    							lv_target_9_0,
            	    							"org.xtext.Project2.Target");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getProjectAccess().getTasksKeyword_9());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalProject2.g:322:3: ( (lv_tasks_13_0= ruleTask ) )
            // InternalProject2.g:323:4: (lv_tasks_13_0= ruleTask )
            {
            // InternalProject2.g:323:4: (lv_tasks_13_0= ruleTask )
            // InternalProject2.g:324:5: lv_tasks_13_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_tasks_13_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"tasks",
            						lv_tasks_13_0,
            						"org.xtext.Project2.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProject2.g:341:3: (otherlv_14= ',' ( (lv_tasks_15_0= ruleTask ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProject2.g:342:4: otherlv_14= ',' ( (lv_tasks_15_0= ruleTask ) )
            	    {
            	    otherlv_14=(Token)match(input,18,FOLLOW_13); 

            	    				newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalProject2.g:346:4: ( (lv_tasks_15_0= ruleTask ) )
            	    // InternalProject2.g:347:5: (lv_tasks_15_0= ruleTask )
            	    {
            	    // InternalProject2.g:347:5: (lv_tasks_15_0= ruleTask )
            	    // InternalProject2.g:348:6: lv_tasks_15_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_tasks_15_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_15_0,
            	    							"org.xtext.Project2.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_16=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEString"
    // InternalProject2.g:378:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalProject2.g:378:47: (iv_ruleEString= ruleEString EOF )
            // InternalProject2.g:379:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalProject2.g:385:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalProject2.g:391:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalProject2.g:392:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalProject2.g:392:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalProject2.g:393:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProject2.g:401:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTarget"
    // InternalProject2.g:412:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalProject2.g:412:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalProject2.g:413:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalProject2.g:419:1: ruleTarget returns [EObject current=null] : (otherlv_0= 'Target' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dependencies' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'has' ( (lv_has_10_0= ruleTask ) ) otherlv_11= 'output' ( (lv_output_12_0= ruleFile ) ) otherlv_13= 'input' ( (lv_input_14_0= ruleFile ) ) otherlv_15= '}' ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_has_10_0 = null;

        EObject lv_output_12_0 = null;

        EObject lv_input_14_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:425:2: ( (otherlv_0= 'Target' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dependencies' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'has' ( (lv_has_10_0= ruleTask ) ) otherlv_11= 'output' ( (lv_output_12_0= ruleFile ) ) otherlv_13= 'input' ( (lv_input_14_0= ruleFile ) ) otherlv_15= '}' ) )
            // InternalProject2.g:426:2: (otherlv_0= 'Target' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dependencies' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'has' ( (lv_has_10_0= ruleTask ) ) otherlv_11= 'output' ( (lv_output_12_0= ruleFile ) ) otherlv_13= 'input' ( (lv_input_14_0= ruleFile ) ) otherlv_15= '}' )
            {
            // InternalProject2.g:426:2: (otherlv_0= 'Target' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dependencies' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'has' ( (lv_has_10_0= ruleTask ) ) otherlv_11= 'output' ( (lv_output_12_0= ruleFile ) ) otherlv_13= 'input' ( (lv_input_14_0= ruleFile ) ) otherlv_15= '}' )
            // InternalProject2.g:427:3: otherlv_0= 'Target' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dependencies' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'has' ( (lv_has_10_0= ruleTask ) ) otherlv_11= 'output' ( (lv_output_12_0= ruleFile ) ) otherlv_13= 'input' ( (lv_input_14_0= ruleFile ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getTargetKeyword_0());
            		
            // InternalProject2.g:431:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProject2.g:432:4: (lv_name_1_0= ruleEString )
            {
            // InternalProject2.g:432:4: (lv_name_1_0= ruleEString )
            // InternalProject2.g:433:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTargetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalProject2.g:454:3: (otherlv_3= 'dependencies' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProject2.g:455:4: otherlv_3= 'dependencies' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getTargetAccess().getDependenciesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalProject2.g:463:4: ( ( ruleEString ) )
                    // InternalProject2.g:464:5: ( ruleEString )
                    {
                    // InternalProject2.g:464:5: ( ruleEString )
                    // InternalProject2.g:465:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTargetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTargetAccess().getDependenciesTargetCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProject2.g:479:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalProject2.g:480:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTargetAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalProject2.g:484:5: ( ( ruleEString ) )
                    	    // InternalProject2.g:485:6: ( ruleEString )
                    	    {
                    	    // InternalProject2.g:485:6: ( ruleEString )
                    	    // InternalProject2.g:486:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTargetRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTargetAccess().getDependenciesTargetCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getTargetAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getTargetAccess().getHasKeyword_4());
            		
            // InternalProject2.g:510:3: ( (lv_has_10_0= ruleTask ) )
            // InternalProject2.g:511:4: (lv_has_10_0= ruleTask )
            {
            // InternalProject2.g:511:4: (lv_has_10_0= ruleTask )
            // InternalProject2.g:512:5: lv_has_10_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getTargetAccess().getHasTaskParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_has_10_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetRule());
            					}
            					set(
            						current,
            						"has",
            						lv_has_10_0,
            						"org.xtext.Project2.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getTargetAccess().getOutputKeyword_6());
            		
            // InternalProject2.g:533:3: ( (lv_output_12_0= ruleFile ) )
            // InternalProject2.g:534:4: (lv_output_12_0= ruleFile )
            {
            // InternalProject2.g:534:4: (lv_output_12_0= ruleFile )
            // InternalProject2.g:535:5: lv_output_12_0= ruleFile
            {

            					newCompositeNode(grammarAccess.getTargetAccess().getOutputFileParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_output_12_0=ruleFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_12_0,
            						"org.xtext.Project2.File");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getTargetAccess().getInputKeyword_8());
            		
            // InternalProject2.g:556:3: ( (lv_input_14_0= ruleFile ) )
            // InternalProject2.g:557:4: (lv_input_14_0= ruleFile )
            {
            // InternalProject2.g:557:4: (lv_input_14_0= ruleFile )
            // InternalProject2.g:558:5: lv_input_14_0= ruleFile
            {

            					newCompositeNode(grammarAccess.getTargetAccess().getInputFileParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_input_14_0=ruleFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_14_0,
            						"org.xtext.Project2.File");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTargetAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleTask"
    // InternalProject2.g:583:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalProject2.g:583:45: (iv_ruleTask= ruleTask EOF )
            // InternalProject2.g:584:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalProject2.g:590:1: ruleTask returns [EObject current=null] : ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'depends' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'has' otherlv_13= '{' ( (lv_has_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_has_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_has_14_0 = null;

        EObject lv_has_16_0 = null;

        EObject lv_actions_20_0 = null;

        EObject lv_actions_22_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:596:2: ( ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'depends' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'has' otherlv_13= '{' ( (lv_has_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_has_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalProject2.g:597:2: ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'depends' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'has' otherlv_13= '{' ( (lv_has_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_has_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalProject2.g:597:2: ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'depends' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'has' otherlv_13= '{' ( (lv_has_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_has_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalProject2.g:598:3: () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'depends' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'has' otherlv_13= '{' ( (lv_has_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_has_16_0= ruleProperty ) ) )* otherlv_17= '}' )? (otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalProject2.g:598:3: ()
            // InternalProject2.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getTaskKeyword_1());
            		
            // InternalProject2.g:609:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProject2.g:610:4: (lv_name_2_0= ruleEString )
            {
            // InternalProject2.g:610:4: (lv_name_2_0= ruleEString )
            // InternalProject2.g:611:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalProject2.g:632:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProject2.g:633:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalProject2.g:637:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalProject2.g:638:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalProject2.g:638:5: (lv_description_5_0= ruleEString )
                    // InternalProject2.g:639:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.Project2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProject2.g:657:3: (otherlv_6= 'depends' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProject2.g:658:4: otherlv_6= 'depends' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getDependsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalProject2.g:666:4: ( ( ruleEString ) )
                    // InternalProject2.g:667:5: ( ruleEString )
                    {
                    // InternalProject2.g:667:5: ( ruleEString )
                    // InternalProject2.g:668:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTaskAccess().getDependsTaskCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProject2.g:682:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalProject2.g:683:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProject2.g:687:5: ( ( ruleEString ) )
                    	    // InternalProject2.g:688:6: ( ruleEString )
                    	    {
                    	    // InternalProject2.g:688:6: ( ruleEString )
                    	    // InternalProject2.g:689:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTaskRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTaskAccess().getDependsTaskCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalProject2.g:709:3: (otherlv_12= 'has' otherlv_13= '{' ( (lv_has_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_has_16_0= ruleProperty ) ) )* otherlv_17= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProject2.g:710:4: otherlv_12= 'has' otherlv_13= '{' ( (lv_has_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_has_16_0= ruleProperty ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getHasKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalProject2.g:718:4: ( (lv_has_14_0= ruleProperty ) )
                    // InternalProject2.g:719:5: (lv_has_14_0= ruleProperty )
                    {
                    // InternalProject2.g:719:5: (lv_has_14_0= ruleProperty )
                    // InternalProject2.g:720:6: lv_has_14_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getHasPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_has_14_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"has",
                    							lv_has_14_0,
                    							"org.xtext.Project2.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProject2.g:737:4: (otherlv_15= ',' ( (lv_has_16_0= ruleProperty ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalProject2.g:738:5: otherlv_15= ',' ( (lv_has_16_0= ruleProperty ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_24); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalProject2.g:742:5: ( (lv_has_16_0= ruleProperty ) )
                    	    // InternalProject2.g:743:6: (lv_has_16_0= ruleProperty )
                    	    {
                    	    // InternalProject2.g:743:6: (lv_has_16_0= ruleProperty )
                    	    // InternalProject2.g:744:7: lv_has_16_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskAccess().getHasPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_has_16_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"has",
                    	    								lv_has_16_0,
                    	    								"org.xtext.Project2.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalProject2.g:767:3: (otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProject2.g:768:4: otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getTaskAccess().getActionsKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalProject2.g:776:4: ( (lv_actions_20_0= ruleAction ) )
                    // InternalProject2.g:777:5: (lv_actions_20_0= ruleAction )
                    {
                    // InternalProject2.g:777:5: (lv_actions_20_0= ruleAction )
                    // InternalProject2.g:778:6: lv_actions_20_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getActionsActionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_actions_20_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_20_0,
                    							"org.xtext.Project2.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProject2.g:795:4: (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalProject2.g:796:5: otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) )
                    	    {
                    	    otherlv_21=(Token)match(input,18,FOLLOW_26); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getTaskAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalProject2.g:800:5: ( (lv_actions_22_0= ruleAction ) )
                    	    // InternalProject2.g:801:6: (lv_actions_22_0= ruleAction )
                    	    {
                    	    // InternalProject2.g:801:6: (lv_actions_22_0= ruleAction )
                    	    // InternalProject2.g:802:7: lv_actions_22_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskAccess().getActionsActionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_actions_22_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_22_0,
                    	    								"org.xtext.Project2.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_23, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleFile"
    // InternalProject2.g:833:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalProject2.g:833:45: (iv_ruleFile= ruleFile EOF )
            // InternalProject2.g:834:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalProject2.g:840:1: ruleFile returns [EObject current=null] : ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:846:2: ( ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalProject2.g:847:2: ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalProject2.g:847:2: ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) )
            // InternalProject2.g:848:3: () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalProject2.g:848:3: ()
            // InternalProject2.g:849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFileAccess().getFileKeyword_1());
            		
            // InternalProject2.g:859:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProject2.g:860:4: (lv_name_2_0= ruleEString )
            {
            // InternalProject2.g:860:4: (lv_name_2_0= ruleEString )
            // InternalProject2.g:861:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFileAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleProperty"
    // InternalProject2.g:882:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalProject2.g:882:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalProject2.g:883:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalProject2.g:889:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:895:2: ( ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalProject2.g:896:2: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalProject2.g:896:2: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalProject2.g:897:3: () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalProject2.g:897:3: ()
            // InternalProject2.g:898:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
            		
            // InternalProject2.g:908:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProject2.g:909:4: (lv_name_2_0= ruleEString )
            {
            // InternalProject2.g:909:4: (lv_name_2_0= ruleEString )
            // InternalProject2.g:910:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalProject2.g:931:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProject2.g:932:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getValueKeyword_4_0());
                    			
                    // InternalProject2.g:936:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalProject2.g:937:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalProject2.g:937:5: (lv_value_5_0= ruleEString )
                    // InternalProject2.g:938:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.Project2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAction_Impl"
    // InternalProject2.g:964:1: entryRuleAction_Impl returns [EObject current=null] : iv_ruleAction_Impl= ruleAction_Impl EOF ;
    public final EObject entryRuleAction_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction_Impl = null;


        try {
            // InternalProject2.g:964:52: (iv_ruleAction_Impl= ruleAction_Impl EOF )
            // InternalProject2.g:965:2: iv_ruleAction_Impl= ruleAction_Impl EOF
            {
             newCompositeNode(grammarAccess.getAction_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction_Impl=ruleAction_Impl();

            state._fsp--;

             current =iv_ruleAction_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction_Impl"


    // $ANTLR start "ruleAction_Impl"
    // InternalProject2.g:971:1: ruleAction_Impl returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleAction_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_decisions_6_0 = null;

        EObject lv_decisions_8_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:977:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalProject2.g:978:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalProject2.g:978:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalProject2.g:979:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalProject2.g:979:3: ()
            // InternalProject2.g:980:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAction_ImplAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAction_ImplAccess().getActionKeyword_1());
            		
            // InternalProject2.g:990:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProject2.g:991:4: (lv_name_2_0= ruleEString )
            {
            // InternalProject2.g:991:4: (lv_name_2_0= ruleEString )
            // InternalProject2.g:992:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAction_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAction_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalProject2.g:1013:3: (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProject2.g:1014:4: otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getAction_ImplAccess().getDecisionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalProject2.g:1022:4: ( (lv_decisions_6_0= ruleDecision ) )
                    // InternalProject2.g:1023:5: (lv_decisions_6_0= ruleDecision )
                    {
                    // InternalProject2.g:1023:5: (lv_decisions_6_0= ruleDecision )
                    // InternalProject2.g:1024:6: lv_decisions_6_0= ruleDecision
                    {

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getDecisionsDecisionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_decisions_6_0=ruleDecision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAction_ImplRule());
                    						}
                    						add(
                    							current,
                    							"decisions",
                    							lv_decisions_6_0,
                    							"org.xtext.Project2.Decision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProject2.g:1041:4: (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalProject2.g:1042:5: otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_29); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAction_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalProject2.g:1046:5: ( (lv_decisions_8_0= ruleDecision ) )
                    	    // InternalProject2.g:1047:6: (lv_decisions_8_0= ruleDecision )
                    	    {
                    	    // InternalProject2.g:1047:6: (lv_decisions_8_0= ruleDecision )
                    	    // InternalProject2.g:1048:7: lv_decisions_8_0= ruleDecision
                    	    {

                    	    							newCompositeNode(grammarAccess.getAction_ImplAccess().getDecisionsDecisionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_decisions_8_0=ruleDecision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAction_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"decisions",
                    	    								lv_decisions_8_0,
                    	    								"org.xtext.Project2.Decision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction_Impl"


    // $ANTLR start "entryRuleDecision"
    // InternalProject2.g:1079:1: entryRuleDecision returns [EObject current=null] : iv_ruleDecision= ruleDecision EOF ;
    public final EObject entryRuleDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecision = null;


        try {
            // InternalProject2.g:1079:49: (iv_ruleDecision= ruleDecision EOF )
            // InternalProject2.g:1080:2: iv_ruleDecision= ruleDecision EOF
            {
             newCompositeNode(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecision=ruleDecision();

            state._fsp--;

             current =iv_ruleDecision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecision"


    // $ANTLR start "ruleDecision"
    // InternalProject2.g:1086:1: ruleDecision returns [EObject current=null] : (otherlv_0= 'Decision' otherlv_1= '{' (otherlv_2= 'has' otherlv_3= '{' ( (lv_has_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_has_6_0= ruleProperty ) ) )* otherlv_7= '}' )? otherlv_8= 'condition' otherlv_9= '{' ( (lv_condition_10_0= ruleCondition ) ) (otherlv_11= ',' ( (lv_condition_12_0= ruleCondition ) ) )* otherlv_13= '}' otherlv_14= '}' ) ;
    public final EObject ruleDecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_has_4_0 = null;

        EObject lv_has_6_0 = null;

        EObject lv_condition_10_0 = null;

        EObject lv_condition_12_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:1092:2: ( (otherlv_0= 'Decision' otherlv_1= '{' (otherlv_2= 'has' otherlv_3= '{' ( (lv_has_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_has_6_0= ruleProperty ) ) )* otherlv_7= '}' )? otherlv_8= 'condition' otherlv_9= '{' ( (lv_condition_10_0= ruleCondition ) ) (otherlv_11= ',' ( (lv_condition_12_0= ruleCondition ) ) )* otherlv_13= '}' otherlv_14= '}' ) )
            // InternalProject2.g:1093:2: (otherlv_0= 'Decision' otherlv_1= '{' (otherlv_2= 'has' otherlv_3= '{' ( (lv_has_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_has_6_0= ruleProperty ) ) )* otherlv_7= '}' )? otherlv_8= 'condition' otherlv_9= '{' ( (lv_condition_10_0= ruleCondition ) ) (otherlv_11= ',' ( (lv_condition_12_0= ruleCondition ) ) )* otherlv_13= '}' otherlv_14= '}' )
            {
            // InternalProject2.g:1093:2: (otherlv_0= 'Decision' otherlv_1= '{' (otherlv_2= 'has' otherlv_3= '{' ( (lv_has_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_has_6_0= ruleProperty ) ) )* otherlv_7= '}' )? otherlv_8= 'condition' otherlv_9= '{' ( (lv_condition_10_0= ruleCondition ) ) (otherlv_11= ',' ( (lv_condition_12_0= ruleCondition ) ) )* otherlv_13= '}' otherlv_14= '}' )
            // InternalProject2.g:1094:3: otherlv_0= 'Decision' otherlv_1= '{' (otherlv_2= 'has' otherlv_3= '{' ( (lv_has_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_has_6_0= ruleProperty ) ) )* otherlv_7= '}' )? otherlv_8= 'condition' otherlv_9= '{' ( (lv_condition_10_0= ruleCondition ) ) (otherlv_11= ',' ( (lv_condition_12_0= ruleCondition ) ) )* otherlv_13= '}' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDecisionAccess().getDecisionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDecisionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalProject2.g:1102:3: (otherlv_2= 'has' otherlv_3= '{' ( (lv_has_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_has_6_0= ruleProperty ) ) )* otherlv_7= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProject2.g:1103:4: otherlv_2= 'has' otherlv_3= '{' ( (lv_has_4_0= ruleProperty ) ) (otherlv_5= ',' ( (lv_has_6_0= ruleProperty ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDecisionAccess().getHasKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getDecisionAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalProject2.g:1111:4: ( (lv_has_4_0= ruleProperty ) )
                    // InternalProject2.g:1112:5: (lv_has_4_0= ruleProperty )
                    {
                    // InternalProject2.g:1112:5: (lv_has_4_0= ruleProperty )
                    // InternalProject2.g:1113:6: lv_has_4_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getDecisionAccess().getHasPropertyParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_has_4_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionRule());
                    						}
                    						add(
                    							current,
                    							"has",
                    							lv_has_4_0,
                    							"org.xtext.Project2.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProject2.g:1130:4: (otherlv_5= ',' ( (lv_has_6_0= ruleProperty ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==18) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalProject2.g:1131:5: otherlv_5= ',' ( (lv_has_6_0= ruleProperty ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_24); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDecisionAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalProject2.g:1135:5: ( (lv_has_6_0= ruleProperty ) )
                    	    // InternalProject2.g:1136:6: (lv_has_6_0= ruleProperty )
                    	    {
                    	    // InternalProject2.g:1136:6: (lv_has_6_0= ruleProperty )
                    	    // InternalProject2.g:1137:7: lv_has_6_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getDecisionAccess().getHasPropertyParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_has_6_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDecisionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"has",
                    	    								lv_has_6_0,
                    	    								"org.xtext.Project2.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_31); 

                    				newLeafNode(otherlv_7, grammarAccess.getDecisionAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDecisionAccess().getConditionKeyword_3());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_9, grammarAccess.getDecisionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalProject2.g:1168:3: ( (lv_condition_10_0= ruleCondition ) )
            // InternalProject2.g:1169:4: (lv_condition_10_0= ruleCondition )
            {
            // InternalProject2.g:1169:4: (lv_condition_10_0= ruleCondition )
            // InternalProject2.g:1170:5: lv_condition_10_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getDecisionAccess().getConditionConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_10_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecisionRule());
            					}
            					add(
            						current,
            						"condition",
            						lv_condition_10_0,
            						"org.xtext.Project2.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProject2.g:1187:3: (otherlv_11= ',' ( (lv_condition_12_0= ruleCondition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalProject2.g:1188:4: otherlv_11= ',' ( (lv_condition_12_0= ruleCondition ) )
            	    {
            	    otherlv_11=(Token)match(input,18,FOLLOW_32); 

            	    				newLeafNode(otherlv_11, grammarAccess.getDecisionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalProject2.g:1192:4: ( (lv_condition_12_0= ruleCondition ) )
            	    // InternalProject2.g:1193:5: (lv_condition_12_0= ruleCondition )
            	    {
            	    // InternalProject2.g:1193:5: (lv_condition_12_0= ruleCondition )
            	    // InternalProject2.g:1194:6: lv_condition_12_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getDecisionAccess().getConditionConditionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_condition_12_0=ruleCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDecisionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"condition",
            	    							lv_condition_12_0,
            	    							"org.xtext.Project2.Condition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getDecisionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDecisionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecision"


    // $ANTLR start "entryRuleInstructionBlock"
    // InternalProject2.g:1224:1: entryRuleInstructionBlock returns [EObject current=null] : iv_ruleInstructionBlock= ruleInstructionBlock EOF ;
    public final EObject entryRuleInstructionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionBlock = null;


        try {
            // InternalProject2.g:1224:57: (iv_ruleInstructionBlock= ruleInstructionBlock EOF )
            // InternalProject2.g:1225:2: iv_ruleInstructionBlock= ruleInstructionBlock EOF
            {
             newCompositeNode(grammarAccess.getInstructionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructionBlock=ruleInstructionBlock();

            state._fsp--;

             current =iv_ruleInstructionBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstructionBlock"


    // $ANTLR start "ruleInstructionBlock"
    // InternalProject2.g:1231:1: ruleInstructionBlock returns [EObject current=null] : (otherlv_0= 'InstructionBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'decisions' otherlv_4= '{' ( (lv_decisions_5_0= ruleDecision ) ) (otherlv_6= ',' ( (lv_decisions_7_0= ruleDecision ) ) )* otherlv_8= '}' )? otherlv_9= 'has' otherlv_10= '{' ( (lv_has_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_has_13_0= ruleInstruction ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleInstructionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_decisions_5_0 = null;

        EObject lv_decisions_7_0 = null;

        EObject lv_has_11_0 = null;

        EObject lv_has_13_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:1237:2: ( (otherlv_0= 'InstructionBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'decisions' otherlv_4= '{' ( (lv_decisions_5_0= ruleDecision ) ) (otherlv_6= ',' ( (lv_decisions_7_0= ruleDecision ) ) )* otherlv_8= '}' )? otherlv_9= 'has' otherlv_10= '{' ( (lv_has_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_has_13_0= ruleInstruction ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalProject2.g:1238:2: (otherlv_0= 'InstructionBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'decisions' otherlv_4= '{' ( (lv_decisions_5_0= ruleDecision ) ) (otherlv_6= ',' ( (lv_decisions_7_0= ruleDecision ) ) )* otherlv_8= '}' )? otherlv_9= 'has' otherlv_10= '{' ( (lv_has_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_has_13_0= ruleInstruction ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalProject2.g:1238:2: (otherlv_0= 'InstructionBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'decisions' otherlv_4= '{' ( (lv_decisions_5_0= ruleDecision ) ) (otherlv_6= ',' ( (lv_decisions_7_0= ruleDecision ) ) )* otherlv_8= '}' )? otherlv_9= 'has' otherlv_10= '{' ( (lv_has_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_has_13_0= ruleInstruction ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalProject2.g:1239:3: otherlv_0= 'InstructionBlock' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'decisions' otherlv_4= '{' ( (lv_decisions_5_0= ruleDecision ) ) (otherlv_6= ',' ( (lv_decisions_7_0= ruleDecision ) ) )* otherlv_8= '}' )? otherlv_9= 'has' otherlv_10= '{' ( (lv_has_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_has_13_0= ruleInstruction ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstructionBlockAccess().getInstructionBlockKeyword_0());
            		
            // InternalProject2.g:1243:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProject2.g:1244:4: (lv_name_1_0= ruleEString )
            {
            // InternalProject2.g:1244:4: (lv_name_1_0= ruleEString )
            // InternalProject2.g:1245:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInstructionBlockAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getInstructionBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalProject2.g:1266:3: (otherlv_3= 'decisions' otherlv_4= '{' ( (lv_decisions_5_0= ruleDecision ) ) (otherlv_6= ',' ( (lv_decisions_7_0= ruleDecision ) ) )* otherlv_8= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProject2.g:1267:4: otherlv_3= 'decisions' otherlv_4= '{' ( (lv_decisions_5_0= ruleDecision ) ) (otherlv_6= ',' ( (lv_decisions_7_0= ruleDecision ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getInstructionBlockAccess().getDecisionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getInstructionBlockAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalProject2.g:1275:4: ( (lv_decisions_5_0= ruleDecision ) )
                    // InternalProject2.g:1276:5: (lv_decisions_5_0= ruleDecision )
                    {
                    // InternalProject2.g:1276:5: (lv_decisions_5_0= ruleDecision )
                    // InternalProject2.g:1277:6: lv_decisions_5_0= ruleDecision
                    {

                    						newCompositeNode(grammarAccess.getInstructionBlockAccess().getDecisionsDecisionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_decisions_5_0=ruleDecision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
                    						}
                    						add(
                    							current,
                    							"decisions",
                    							lv_decisions_5_0,
                    							"org.xtext.Project2.Decision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProject2.g:1294:4: (otherlv_6= ',' ( (lv_decisions_7_0= ruleDecision ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalProject2.g:1295:5: otherlv_6= ',' ( (lv_decisions_7_0= ruleDecision ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_29); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getInstructionBlockAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalProject2.g:1299:5: ( (lv_decisions_7_0= ruleDecision ) )
                    	    // InternalProject2.g:1300:6: (lv_decisions_7_0= ruleDecision )
                    	    {
                    	    // InternalProject2.g:1300:6: (lv_decisions_7_0= ruleDecision )
                    	    // InternalProject2.g:1301:7: lv_decisions_7_0= ruleDecision
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstructionBlockAccess().getDecisionsDecisionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_decisions_7_0=ruleDecision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"decisions",
                    	    								lv_decisions_7_0,
                    	    								"org.xtext.Project2.Decision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getInstructionBlockAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getInstructionBlockAccess().getHasKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_10, grammarAccess.getInstructionBlockAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalProject2.g:1332:3: ( (lv_has_11_0= ruleInstruction ) )
            // InternalProject2.g:1333:4: (lv_has_11_0= ruleInstruction )
            {
            // InternalProject2.g:1333:4: (lv_has_11_0= ruleInstruction )
            // InternalProject2.g:1334:5: lv_has_11_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getInstructionBlockAccess().getHasInstructionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_has_11_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
            					}
            					add(
            						current,
            						"has",
            						lv_has_11_0,
            						"org.xtext.Project2.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProject2.g:1351:3: (otherlv_12= ',' ( (lv_has_13_0= ruleInstruction ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalProject2.g:1352:4: otherlv_12= ',' ( (lv_has_13_0= ruleInstruction ) )
            	    {
            	    otherlv_12=(Token)match(input,18,FOLLOW_34); 

            	    				newLeafNode(otherlv_12, grammarAccess.getInstructionBlockAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalProject2.g:1356:4: ( (lv_has_13_0= ruleInstruction ) )
            	    // InternalProject2.g:1357:5: (lv_has_13_0= ruleInstruction )
            	    {
            	    // InternalProject2.g:1357:5: (lv_has_13_0= ruleInstruction )
            	    // InternalProject2.g:1358:6: lv_has_13_0= ruleInstruction
            	    {

            	    						newCompositeNode(grammarAccess.getInstructionBlockAccess().getHasInstructionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_has_13_0=ruleInstruction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInstructionBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"has",
            	    							lv_has_13_0,
            	    							"org.xtext.Project2.Instruction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getInstructionBlockAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getInstructionBlockAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstructionBlock"


    // $ANTLR start "entryRuleStart"
    // InternalProject2.g:1388:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // InternalProject2.g:1388:46: (iv_ruleStart= ruleStart EOF )
            // InternalProject2.g:1389:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalProject2.g:1395:1: ruleStart returns [EObject current=null] : ( () otherlv_1= 'Start' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'next' ( ( ruleEString ) ) )? (otherlv_6= 'decisions' otherlv_7= '{' ( (lv_decisions_8_0= ruleDecision ) ) (otherlv_9= ',' ( (lv_decisions_10_0= ruleDecision ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_decisions_8_0 = null;

        EObject lv_decisions_10_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:1401:2: ( ( () otherlv_1= 'Start' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'next' ( ( ruleEString ) ) )? (otherlv_6= 'decisions' otherlv_7= '{' ( (lv_decisions_8_0= ruleDecision ) ) (otherlv_9= ',' ( (lv_decisions_10_0= ruleDecision ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalProject2.g:1402:2: ( () otherlv_1= 'Start' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'next' ( ( ruleEString ) ) )? (otherlv_6= 'decisions' otherlv_7= '{' ( (lv_decisions_8_0= ruleDecision ) ) (otherlv_9= ',' ( (lv_decisions_10_0= ruleDecision ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalProject2.g:1402:2: ( () otherlv_1= 'Start' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'next' ( ( ruleEString ) ) )? (otherlv_6= 'decisions' otherlv_7= '{' ( (lv_decisions_8_0= ruleDecision ) ) (otherlv_9= ',' ( (lv_decisions_10_0= ruleDecision ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalProject2.g:1403:3: () otherlv_1= 'Start' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'next' ( ( ruleEString ) ) )? (otherlv_6= 'decisions' otherlv_7= '{' ( (lv_decisions_8_0= ruleDecision ) ) (otherlv_9= ',' ( (lv_decisions_10_0= ruleDecision ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalProject2.g:1403:3: ()
            // InternalProject2.g:1404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartAccess().getStartAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStartAccess().getStartKeyword_1());
            		
            // InternalProject2.g:1414:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProject2.g:1415:4: (lv_name_2_0= ruleEString )
            {
            // InternalProject2.g:1415:4: (lv_name_2_0= ruleEString )
            // InternalProject2.g:1416:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStartAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getStartAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalProject2.g:1437:3: (otherlv_4= 'next' ( ( ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProject2.g:1438:4: otherlv_4= 'next' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStartAccess().getNextKeyword_4_0());
                    			
                    // InternalProject2.g:1442:4: ( ( ruleEString ) )
                    // InternalProject2.g:1443:5: ( ruleEString )
                    {
                    // InternalProject2.g:1443:5: ( ruleEString )
                    // InternalProject2.g:1444:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStartAccess().getNextActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProject2.g:1459:3: (otherlv_6= 'decisions' otherlv_7= '{' ( (lv_decisions_8_0= ruleDecision ) ) (otherlv_9= ',' ( (lv_decisions_10_0= ruleDecision ) ) )* otherlv_11= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProject2.g:1460:4: otherlv_6= 'decisions' otherlv_7= '{' ( (lv_decisions_8_0= ruleDecision ) ) (otherlv_9= ',' ( (lv_decisions_10_0= ruleDecision ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getStartAccess().getDecisionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getStartAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProject2.g:1468:4: ( (lv_decisions_8_0= ruleDecision ) )
                    // InternalProject2.g:1469:5: (lv_decisions_8_0= ruleDecision )
                    {
                    // InternalProject2.g:1469:5: (lv_decisions_8_0= ruleDecision )
                    // InternalProject2.g:1470:6: lv_decisions_8_0= ruleDecision
                    {

                    						newCompositeNode(grammarAccess.getStartAccess().getDecisionsDecisionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_decisions_8_0=ruleDecision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStartRule());
                    						}
                    						add(
                    							current,
                    							"decisions",
                    							lv_decisions_8_0,
                    							"org.xtext.Project2.Decision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProject2.g:1487:4: (otherlv_9= ',' ( (lv_decisions_10_0= ruleDecision ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalProject2.g:1488:5: otherlv_9= ',' ( (lv_decisions_10_0= ruleDecision ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FOLLOW_29); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getStartAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProject2.g:1492:5: ( (lv_decisions_10_0= ruleDecision ) )
                    	    // InternalProject2.g:1493:6: (lv_decisions_10_0= ruleDecision )
                    	    {
                    	    // InternalProject2.g:1493:6: (lv_decisions_10_0= ruleDecision )
                    	    // InternalProject2.g:1494:7: lv_decisions_10_0= ruleDecision
                    	    {

                    	    							newCompositeNode(grammarAccess.getStartAccess().getDecisionsDecisionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_decisions_10_0=ruleDecision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStartRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"decisions",
                    	    								lv_decisions_10_0,
                    	    								"org.xtext.Project2.Decision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getStartAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getStartAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleEnd"
    // InternalProject2.g:1525:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalProject2.g:1525:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalProject2.g:1526:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalProject2.g:1532:1: ruleEnd returns [EObject current=null] : ( () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_decisions_6_0 = null;

        EObject lv_decisions_8_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:1538:2: ( ( () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalProject2.g:1539:2: ( () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalProject2.g:1539:2: ( () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalProject2.g:1540:3: () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalProject2.g:1540:3: ()
            // InternalProject2.g:1541:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndAccess().getEndAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEndAccess().getEndKeyword_1());
            		
            // InternalProject2.g:1551:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProject2.g:1552:4: (lv_name_2_0= ruleEString )
            {
            // InternalProject2.g:1552:4: (lv_name_2_0= ruleEString )
            // InternalProject2.g:1553:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getEndAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalProject2.g:1574:3: (otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProject2.g:1575:4: otherlv_4= 'decisions' otherlv_5= '{' ( (lv_decisions_6_0= ruleDecision ) ) (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEndAccess().getDecisionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getEndAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalProject2.g:1583:4: ( (lv_decisions_6_0= ruleDecision ) )
                    // InternalProject2.g:1584:5: (lv_decisions_6_0= ruleDecision )
                    {
                    // InternalProject2.g:1584:5: (lv_decisions_6_0= ruleDecision )
                    // InternalProject2.g:1585:6: lv_decisions_6_0= ruleDecision
                    {

                    						newCompositeNode(grammarAccess.getEndAccess().getDecisionsDecisionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_decisions_6_0=ruleDecision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndRule());
                    						}
                    						add(
                    							current,
                    							"decisions",
                    							lv_decisions_6_0,
                    							"org.xtext.Project2.Decision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProject2.g:1602:4: (otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==18) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalProject2.g:1603:5: otherlv_7= ',' ( (lv_decisions_8_0= ruleDecision ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_29); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEndAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalProject2.g:1607:5: ( (lv_decisions_8_0= ruleDecision ) )
                    	    // InternalProject2.g:1608:6: (lv_decisions_8_0= ruleDecision )
                    	    {
                    	    // InternalProject2.g:1608:6: (lv_decisions_8_0= ruleDecision )
                    	    // InternalProject2.g:1609:7: lv_decisions_8_0= ruleDecision
                    	    {

                    	    							newCompositeNode(grammarAccess.getEndAccess().getDecisionsDecisionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_decisions_8_0=ruleDecision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEndRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"decisions",
                    	    								lv_decisions_8_0,
                    	    								"org.xtext.Project2.Decision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getEndAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEndAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleCondition"
    // InternalProject2.g:1640:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalProject2.g:1640:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalProject2.g:1641:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalProject2.g:1647:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:1653:2: ( ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalProject2.g:1654:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalProject2.g:1654:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalProject2.g:1655:3: () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalProject2.g:1655:3: ()
            // InternalProject2.g:1656:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalProject2.g:1670:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProject2.g:1671:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getValueKeyword_3_0());
                    			
                    // InternalProject2.g:1675:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalProject2.g:1676:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalProject2.g:1676:5: (lv_value_4_0= ruleEString )
                    // InternalProject2.g:1677:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.Project2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleInstruction"
    // InternalProject2.g:1703:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalProject2.g:1703:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalProject2.g:1704:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalProject2.g:1710:1: ruleInstruction returns [EObject current=null] : ( () otherlv_1= 'Instruction' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalProject2.g:1716:2: ( ( () otherlv_1= 'Instruction' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalProject2.g:1717:2: ( () otherlv_1= 'Instruction' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalProject2.g:1717:2: ( () otherlv_1= 'Instruction' ( (lv_name_2_0= ruleEString ) ) )
            // InternalProject2.g:1718:3: () otherlv_1= 'Instruction' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalProject2.g:1718:3: ()
            // InternalProject2.g:1719:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstructionAccess().getInstructionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructionAccess().getInstructionKeyword_1());
            		
            // InternalProject2.g:1729:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProject2.g:1730:4: (lv_name_2_0= ruleEString )
            {
            // InternalProject2.g:1730:4: (lv_name_2_0= ruleEString )
            // InternalProject2.g:1731:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInstructionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Project2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000071004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000061004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000041004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000002C400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010800004000L});

}