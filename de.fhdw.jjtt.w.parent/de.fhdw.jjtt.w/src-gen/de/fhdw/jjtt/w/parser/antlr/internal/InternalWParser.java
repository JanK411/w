package de.fhdw.jjtt.w.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fhdw.jjtt.w.services.WGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Endwhile", "While", "ExclamationMarkEqualsSign", "Do", "PlusSign", "HyphenMinus", "Semicolon", "EqualsSign", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=12;
    public static final int RULE_WS=17;
    public static final int RULE_STRING=14;
    public static final int While=5;
    public static final int Do=7;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_SL_COMMENT=16;
    public static final int Semicolon=10;
    public static final int EqualsSign=11;
    public static final int HyphenMinus=9;
    public static final int Endwhile=4;
    public static final int PlusSign=8;
    public static final int RULE_INT=13;
    public static final int RULE_ML_COMMENT=15;
    public static final int ExclamationMarkEqualsSign=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalWParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private WGrammarAccess grammarAccess;

        public InternalWParser(TokenStream input, WGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected WGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalWParser.g:63:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWParser.g:63:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWParser.g:64:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWParser.g:70:1: ruleProgram returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_Sequence_1= ruleSequence | this_Loop_2= ruleLoop ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_Sequence_1 = null;

        EObject this_Loop_2 = null;



        	enterRule();

        try {
            // InternalWParser.g:76:2: ( (this_Assignment_0= ruleAssignment | this_Sequence_1= ruleSequence | this_Loop_2= ruleLoop ) )
            // InternalWParser.g:77:2: (this_Assignment_0= ruleAssignment | this_Sequence_1= ruleSequence | this_Loop_2= ruleLoop )
            {
            // InternalWParser.g:77:2: (this_Assignment_0= ruleAssignment | this_Sequence_1= ruleSequence | this_Loop_2= ruleLoop )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (synpred1_InternalWParser()) ) {
                    alt1=1;
                }
                else if ( (synpred2_InternalWParser()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==While) ) {
                int LA1_2 = input.LA(2);

                if ( (synpred2_InternalWParser()) ) {
                    alt1=2;
                }
                else if ( (true) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalWParser.g:78:3: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProgramAccess().getAssignmentParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Assignment_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalWParser.g:90:3: this_Sequence_1= ruleSequence
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProgramAccess().getSequenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Sequence_1=ruleSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Sequence_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalWParser.g:102:3: this_Loop_2= ruleLoop
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getProgramAccess().getLoopParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Loop_2=ruleLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Loop_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleAssignment"
    // InternalWParser.g:117:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalWParser.g:117:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalWParser.g:118:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalWParser.g:124:1: ruleAssignment returns [EObject current=null] : ( ( (lv_toBeAssigned_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_var_2_0= ruleVariable ) ) ( (lv_op_3_0= ruleOperator ) ) ( (lv_const_4_0= ruleConstant ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_toBeAssigned_0_0 = null;

        EObject lv_var_2_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;

        EObject lv_const_4_0 = null;



        	enterRule();

        try {
            // InternalWParser.g:130:2: ( ( ( (lv_toBeAssigned_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_var_2_0= ruleVariable ) ) ( (lv_op_3_0= ruleOperator ) ) ( (lv_const_4_0= ruleConstant ) ) ) )
            // InternalWParser.g:131:2: ( ( (lv_toBeAssigned_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_var_2_0= ruleVariable ) ) ( (lv_op_3_0= ruleOperator ) ) ( (lv_const_4_0= ruleConstant ) ) )
            {
            // InternalWParser.g:131:2: ( ( (lv_toBeAssigned_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_var_2_0= ruleVariable ) ) ( (lv_op_3_0= ruleOperator ) ) ( (lv_const_4_0= ruleConstant ) ) )
            // InternalWParser.g:132:3: ( (lv_toBeAssigned_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_var_2_0= ruleVariable ) ) ( (lv_op_3_0= ruleOperator ) ) ( (lv_const_4_0= ruleConstant ) )
            {
            // InternalWParser.g:132:3: ( (lv_toBeAssigned_0_0= ruleVariable ) )
            // InternalWParser.g:133:4: (lv_toBeAssigned_0_0= ruleVariable )
            {
            // InternalWParser.g:133:4: (lv_toBeAssigned_0_0= ruleVariable )
            // InternalWParser.g:134:5: lv_toBeAssigned_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getToBeAssignedVariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_toBeAssigned_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"toBeAssigned",
              						lv_toBeAssigned_0_0,
              						"de.fhdw.jjtt.w.W.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalWParser.g:155:3: ( (lv_var_2_0= ruleVariable ) )
            // InternalWParser.g:156:4: (lv_var_2_0= ruleVariable )
            {
            // InternalWParser.g:156:4: (lv_var_2_0= ruleVariable )
            // InternalWParser.g:157:5: lv_var_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getVarVariableParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_var_2_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"var",
              						lv_var_2_0,
              						"de.fhdw.jjtt.w.W.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWParser.g:174:3: ( (lv_op_3_0= ruleOperator ) )
            // InternalWParser.g:175:4: (lv_op_3_0= ruleOperator )
            {
            // InternalWParser.g:175:4: (lv_op_3_0= ruleOperator )
            // InternalWParser.g:176:5: lv_op_3_0= ruleOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getOpOperatorParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_op_3_0=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_3_0,
              						"de.fhdw.jjtt.w.W.Operator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWParser.g:193:3: ( (lv_const_4_0= ruleConstant ) )
            // InternalWParser.g:194:4: (lv_const_4_0= ruleConstant )
            {
            // InternalWParser.g:194:4: (lv_const_4_0= ruleConstant )
            // InternalWParser.g:195:5: lv_const_4_0= ruleConstant
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getConstConstantParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_const_4_0=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"const",
              						lv_const_4_0,
              						"de.fhdw.jjtt.w.W.Constant");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleVariable"
    // InternalWParser.g:216:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalWParser.g:216:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalWParser.g:217:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalWParser.g:223:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalWParser.g:229:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalWParser.g:230:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalWParser.g:230:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalWParser.g:231:3: (lv_name_0_0= RULE_ID )
            {
            // InternalWParser.g:231:3: (lv_name_0_0= RULE_ID )
            // InternalWParser.g:232:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleOperator"
    // InternalWParser.g:251:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalWParser.g:251:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalWParser.g:252:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalWParser.g:258:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= rulePLUS | this_MINUS_1= ruleMINUS ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PLUS_0 = null;

        AntlrDatatypeRuleToken this_MINUS_1 = null;



        	enterRule();

        try {
            // InternalWParser.g:264:2: ( (this_PLUS_0= rulePLUS | this_MINUS_1= ruleMINUS ) )
            // InternalWParser.g:265:2: (this_PLUS_0= rulePLUS | this_MINUS_1= ruleMINUS )
            {
            // InternalWParser.g:265:2: (this_PLUS_0= rulePLUS | this_MINUS_1= ruleMINUS )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PlusSign) ) {
                alt2=1;
            }
            else if ( (LA2_0==HyphenMinus) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWParser.g:266:3: this_PLUS_0= rulePLUS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperatorAccess().getPLUSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PLUS_0=rulePLUS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PLUS_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalWParser.g:277:3: this_MINUS_1= ruleMINUS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperatorAccess().getMINUSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MINUS_1=ruleMINUS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MINUS_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRulePLUS"
    // InternalWParser.g:291:1: entryRulePLUS returns [String current=null] : iv_rulePLUS= rulePLUS EOF ;
    public final String entryRulePLUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLUS = null;


        try {
            // InternalWParser.g:291:44: (iv_rulePLUS= rulePLUS EOF )
            // InternalWParser.g:292:2: iv_rulePLUS= rulePLUS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPLUSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePLUS=rulePLUS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePLUS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePLUS"


    // $ANTLR start "rulePLUS"
    // InternalWParser.g:298:1: rulePLUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= PlusSign ;
    public final AntlrDatatypeRuleToken rulePLUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWParser.g:304:2: (kw= PlusSign )
            // InternalWParser.g:305:2: kw= PlusSign
            {
            kw=(Token)match(input,PlusSign,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPLUSAccess().getPlusSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePLUS"


    // $ANTLR start "entryRuleMINUS"
    // InternalWParser.g:313:1: entryRuleMINUS returns [String current=null] : iv_ruleMINUS= ruleMINUS EOF ;
    public final String entryRuleMINUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMINUS = null;


        try {
            // InternalWParser.g:313:45: (iv_ruleMINUS= ruleMINUS EOF )
            // InternalWParser.g:314:2: iv_ruleMINUS= ruleMINUS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMINUSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMINUS=ruleMINUS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMINUS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMINUS"


    // $ANTLR start "ruleMINUS"
    // InternalWParser.g:320:1: ruleMINUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken ruleMINUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWParser.g:326:2: (kw= HyphenMinus )
            // InternalWParser.g:327:2: kw= HyphenMinus
            {
            kw=(Token)match(input,HyphenMinus,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getMINUSAccess().getHyphenMinusKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMINUS"


    // $ANTLR start "entryRuleConstant"
    // InternalWParser.g:335:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalWParser.g:335:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalWParser.g:336:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalWParser.g:342:1: ruleConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalWParser.g:348:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalWParser.g:349:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalWParser.g:349:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalWParser.g:350:3: (lv_value_0_0= RULE_INT )
            {
            // InternalWParser.g:350:3: (lv_value_0_0= RULE_INT )
            // InternalWParser.g:351:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getConstantRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleLoop"
    // InternalWParser.g:370:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalWParser.g:370:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalWParser.g:371:2: iv_ruleLoop= ruleLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalWParser.g:377:1: ruleLoop returns [EObject current=null] : (otherlv_0= While ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ExclamationMarkEqualsSign ( (lv_const_3_0= ruleConstant ) ) otherlv_4= Do ( (lv_prog_5_0= ruleProgram ) ) otherlv_6= Endwhile ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_var_1_0 = null;

        EObject lv_const_3_0 = null;

        EObject lv_prog_5_0 = null;



        	enterRule();

        try {
            // InternalWParser.g:383:2: ( (otherlv_0= While ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ExclamationMarkEqualsSign ( (lv_const_3_0= ruleConstant ) ) otherlv_4= Do ( (lv_prog_5_0= ruleProgram ) ) otherlv_6= Endwhile ) )
            // InternalWParser.g:384:2: (otherlv_0= While ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ExclamationMarkEqualsSign ( (lv_const_3_0= ruleConstant ) ) otherlv_4= Do ( (lv_prog_5_0= ruleProgram ) ) otherlv_6= Endwhile )
            {
            // InternalWParser.g:384:2: (otherlv_0= While ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ExclamationMarkEqualsSign ( (lv_const_3_0= ruleConstant ) ) otherlv_4= Do ( (lv_prog_5_0= ruleProgram ) ) otherlv_6= Endwhile )
            // InternalWParser.g:385:3: otherlv_0= While ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ExclamationMarkEqualsSign ( (lv_const_3_0= ruleConstant ) ) otherlv_4= Do ( (lv_prog_5_0= ruleProgram ) ) otherlv_6= Endwhile
            {
            otherlv_0=(Token)match(input,While,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getWhileKeyword_0());
              		
            }
            // InternalWParser.g:389:3: ( (lv_var_1_0= ruleVariable ) )
            // InternalWParser.g:390:4: (lv_var_1_0= ruleVariable )
            {
            // InternalWParser.g:390:4: (lv_var_1_0= ruleVariable )
            // InternalWParser.g:391:5: lv_var_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLoopAccess().getVarVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_var_1_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLoopRule());
              					}
              					set(
              						current,
              						"var",
              						lv_var_1_0,
              						"de.fhdw.jjtt.w.W.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getExclamationMarkEqualsSignKeyword_2());
              		
            }
            // InternalWParser.g:412:3: ( (lv_const_3_0= ruleConstant ) )
            // InternalWParser.g:413:4: (lv_const_3_0= ruleConstant )
            {
            // InternalWParser.g:413:4: (lv_const_3_0= ruleConstant )
            // InternalWParser.g:414:5: lv_const_3_0= ruleConstant
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLoopAccess().getConstConstantParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_const_3_0=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLoopRule());
              					}
              					set(
              						current,
              						"const",
              						lv_const_3_0,
              						"de.fhdw.jjtt.w.W.Constant");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,Do,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getDoKeyword_4());
              		
            }
            // InternalWParser.g:435:3: ( (lv_prog_5_0= ruleProgram ) )
            // InternalWParser.g:436:4: (lv_prog_5_0= ruleProgram )
            {
            // InternalWParser.g:436:4: (lv_prog_5_0= ruleProgram )
            // InternalWParser.g:437:5: lv_prog_5_0= ruleProgram
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLoopAccess().getProgProgramParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_prog_5_0=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLoopRule());
              					}
              					set(
              						current,
              						"prog",
              						lv_prog_5_0,
              						"de.fhdw.jjtt.w.W.Program");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,Endwhile,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getEndwhileKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleSequence"
    // InternalWParser.g:462:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalWParser.g:462:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalWParser.g:463:2: iv_ruleSequence= ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalWParser.g:469:1: ruleSequence returns [EObject current=null] : ( ( ( (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop ) ) ) otherlv_1= Semicolon ( (lv_p2_2_0= ruleProgram ) ) ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_p1_0_1 = null;

        EObject lv_p1_0_2 = null;

        EObject lv_p2_2_0 = null;



        	enterRule();

        try {
            // InternalWParser.g:475:2: ( ( ( ( (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop ) ) ) otherlv_1= Semicolon ( (lv_p2_2_0= ruleProgram ) ) ) )
            // InternalWParser.g:476:2: ( ( ( (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop ) ) ) otherlv_1= Semicolon ( (lv_p2_2_0= ruleProgram ) ) )
            {
            // InternalWParser.g:476:2: ( ( ( (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop ) ) ) otherlv_1= Semicolon ( (lv_p2_2_0= ruleProgram ) ) )
            // InternalWParser.g:477:3: ( ( (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop ) ) ) otherlv_1= Semicolon ( (lv_p2_2_0= ruleProgram ) )
            {
            // InternalWParser.g:477:3: ( ( (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop ) ) )
            // InternalWParser.g:478:4: ( (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop ) )
            {
            // InternalWParser.g:478:4: ( (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop ) )
            // InternalWParser.g:479:5: (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop )
            {
            // InternalWParser.g:479:5: (lv_p1_0_1= ruleAssignment | lv_p1_0_2= ruleLoop )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==While) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWParser.g:480:6: lv_p1_0_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSequenceAccess().getP1AssignmentParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_p1_0_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSequenceRule());
                      						}
                      						set(
                      							current,
                      							"p1",
                      							lv_p1_0_1,
                      							"de.fhdw.jjtt.w.W.Assignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalWParser.g:496:6: lv_p1_0_2= ruleLoop
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSequenceAccess().getP1LoopParserRuleCall_0_0_1());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_p1_0_2=ruleLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSequenceRule());
                      						}
                      						set(
                      							current,
                      							"p1",
                      							lv_p1_0_2,
                      							"de.fhdw.jjtt.w.W.Loop");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,Semicolon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getSemicolonKeyword_1());
              		
            }
            // InternalWParser.g:518:3: ( (lv_p2_2_0= ruleProgram ) )
            // InternalWParser.g:519:4: (lv_p2_2_0= ruleProgram )
            {
            // InternalWParser.g:519:4: (lv_p2_2_0= ruleProgram )
            // InternalWParser.g:520:5: lv_p2_2_0= ruleProgram
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSequenceAccess().getP2ProgramParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_p2_2_0=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSequenceRule());
              					}
              					set(
              						current,
              						"p2",
              						lv_p2_2_0,
              						"de.fhdw.jjtt.w.W.Program");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSequence"

    // $ANTLR start synpred1_InternalWParser
    public final void synpred1_InternalWParser_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalWParser.g:78:3: (this_Assignment_0= ruleAssignment )
        // InternalWParser.g:78:3: this_Assignment_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Assignment_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalWParser

    // $ANTLR start synpred2_InternalWParser
    public final void synpred2_InternalWParser_fragment() throws RecognitionException {   
        EObject this_Sequence_1 = null;


        // InternalWParser.g:90:3: (this_Sequence_1= ruleSequence )
        // InternalWParser.g:90:3: this_Sequence_1= ruleSequence
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Sequence_1=ruleSequence();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalWParser

    // Delegated rules

    public final boolean synpred1_InternalWParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalWParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalWParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalWParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});

}