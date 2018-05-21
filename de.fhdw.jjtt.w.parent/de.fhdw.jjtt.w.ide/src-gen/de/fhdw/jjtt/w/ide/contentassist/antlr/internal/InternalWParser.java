package de.fhdw.jjtt.w.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fhdw.jjtt.w.services.WGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWParser extends AbstractInternalContentAssistParser {
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


    	private WGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("Do", "'do'");
    		tokenNameToValue.put("While", "'while'");
    		tokenNameToValue.put("Endwhile", "'endwhile'");
    	}

    	public void setGrammarAccess(WGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalWParser.g:64:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalWParser.g:65:1: ( ruleProgram EOF )
            // InternalWParser.g:66:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWParser.g:73:1: ruleProgram : ( ( rule__Program__Alternatives ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:77:2: ( ( ( rule__Program__Alternatives ) ) )
            // InternalWParser.g:78:2: ( ( rule__Program__Alternatives ) )
            {
            // InternalWParser.g:78:2: ( ( rule__Program__Alternatives ) )
            // InternalWParser.g:79:3: ( rule__Program__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getAlternatives()); 
            }
            // InternalWParser.g:80:3: ( rule__Program__Alternatives )
            // InternalWParser.g:80:4: rule__Program__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Program__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleAssignment"
    // InternalWParser.g:89:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalWParser.g:90:1: ( ruleAssignment EOF )
            // InternalWParser.g:91:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalWParser.g:98:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:102:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalWParser.g:103:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalWParser.g:103:2: ( ( rule__Assignment__Group__0 ) )
            // InternalWParser.g:104:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalWParser.g:105:3: ( rule__Assignment__Group__0 )
            // InternalWParser.g:105:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleVariable"
    // InternalWParser.g:114:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalWParser.g:115:1: ( ruleVariable EOF )
            // InternalWParser.g:116:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalWParser.g:123:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:127:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalWParser.g:128:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalWParser.g:128:2: ( ( rule__Variable__NameAssignment ) )
            // InternalWParser.g:129:3: ( rule__Variable__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment()); 
            }
            // InternalWParser.g:130:3: ( rule__Variable__NameAssignment )
            // InternalWParser.g:130:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleOperator"
    // InternalWParser.g:139:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalWParser.g:140:1: ( ruleOperator EOF )
            // InternalWParser.g:141:1: ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalWParser.g:148:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:152:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalWParser.g:153:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalWParser.g:153:2: ( ( rule__Operator__Alternatives ) )
            // InternalWParser.g:154:3: ( rule__Operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAlternatives()); 
            }
            // InternalWParser.g:155:3: ( rule__Operator__Alternatives )
            // InternalWParser.g:155:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRulePLUS"
    // InternalWParser.g:164:1: entryRulePLUS : rulePLUS EOF ;
    public final void entryRulePLUS() throws RecognitionException {
        try {
            // InternalWParser.g:165:1: ( rulePLUS EOF )
            // InternalWParser.g:166:1: rulePLUS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPLUSRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePLUS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPLUSRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePLUS"


    // $ANTLR start "rulePLUS"
    // InternalWParser.g:173:1: rulePLUS : ( PlusSign ) ;
    public final void rulePLUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:177:2: ( ( PlusSign ) )
            // InternalWParser.g:178:2: ( PlusSign )
            {
            // InternalWParser.g:178:2: ( PlusSign )
            // InternalWParser.g:179:3: PlusSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPLUSAccess().getPlusSignKeyword()); 
            }
            match(input,PlusSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPLUSAccess().getPlusSignKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePLUS"


    // $ANTLR start "entryRuleMINUS"
    // InternalWParser.g:189:1: entryRuleMINUS : ruleMINUS EOF ;
    public final void entryRuleMINUS() throws RecognitionException {
        try {
            // InternalWParser.g:190:1: ( ruleMINUS EOF )
            // InternalWParser.g:191:1: ruleMINUS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMINUSRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMINUS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMINUSRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMINUS"


    // $ANTLR start "ruleMINUS"
    // InternalWParser.g:198:1: ruleMINUS : ( HyphenMinus ) ;
    public final void ruleMINUS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:202:2: ( ( HyphenMinus ) )
            // InternalWParser.g:203:2: ( HyphenMinus )
            {
            // InternalWParser.g:203:2: ( HyphenMinus )
            // InternalWParser.g:204:3: HyphenMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMINUSAccess().getHyphenMinusKeyword()); 
            }
            match(input,HyphenMinus,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMINUSAccess().getHyphenMinusKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMINUS"


    // $ANTLR start "entryRuleConstant"
    // InternalWParser.g:214:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalWParser.g:215:1: ( ruleConstant EOF )
            // InternalWParser.g:216:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalWParser.g:223:1: ruleConstant : ( ( rule__Constant__ValueAssignment ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:227:2: ( ( ( rule__Constant__ValueAssignment ) ) )
            // InternalWParser.g:228:2: ( ( rule__Constant__ValueAssignment ) )
            {
            // InternalWParser.g:228:2: ( ( rule__Constant__ValueAssignment ) )
            // InternalWParser.g:229:3: ( rule__Constant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueAssignment()); 
            }
            // InternalWParser.g:230:3: ( rule__Constant__ValueAssignment )
            // InternalWParser.g:230:4: rule__Constant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleLoop"
    // InternalWParser.g:239:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalWParser.g:240:1: ( ruleLoop EOF )
            // InternalWParser.g:241:1: ruleLoop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalWParser.g:248:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:252:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalWParser.g:253:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalWParser.g:253:2: ( ( rule__Loop__Group__0 ) )
            // InternalWParser.g:254:3: ( rule__Loop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getGroup()); 
            }
            // InternalWParser.g:255:3: ( rule__Loop__Group__0 )
            // InternalWParser.g:255:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleSequence"
    // InternalWParser.g:264:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // InternalWParser.g:265:1: ( ruleSequence EOF )
            // InternalWParser.g:266:1: ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalWParser.g:273:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:277:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // InternalWParser.g:278:2: ( ( rule__Sequence__Group__0 ) )
            {
            // InternalWParser.g:278:2: ( ( rule__Sequence__Group__0 ) )
            // InternalWParser.g:279:3: ( rule__Sequence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getGroup()); 
            }
            // InternalWParser.g:280:3: ( rule__Sequence__Group__0 )
            // InternalWParser.g:280:4: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "rule__Program__Alternatives"
    // InternalWParser.g:288:1: rule__Program__Alternatives : ( ( ruleAssignment ) | ( ruleSequence ) | ( ruleLoop ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:292:1: ( ( ruleAssignment ) | ( ruleSequence ) | ( ruleLoop ) )
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
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalWParser.g:293:2: ( ruleAssignment )
                    {
                    // InternalWParser.g:293:2: ( ruleAssignment )
                    // InternalWParser.g:294:3: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getAssignmentParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalWParser.g:299:2: ( ruleSequence )
                    {
                    // InternalWParser.g:299:2: ( ruleSequence )
                    // InternalWParser.g:300:3: ruleSequence
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getSequenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSequence();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getSequenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalWParser.g:305:2: ( ruleLoop )
                    {
                    // InternalWParser.g:305:2: ( ruleLoop )
                    // InternalWParser.g:306:3: ruleLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProgramAccess().getLoopParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProgramAccess().getLoopParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalWParser.g:315:1: rule__Operator__Alternatives : ( ( rulePLUS ) | ( ruleMINUS ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:319:1: ( ( rulePLUS ) | ( ruleMINUS ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PlusSign) ) {
                alt2=1;
            }
            else if ( (LA2_0==HyphenMinus) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWParser.g:320:2: ( rulePLUS )
                    {
                    // InternalWParser.g:320:2: ( rulePLUS )
                    // InternalWParser.g:321:3: rulePLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getPLUSParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePLUS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getPLUSParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalWParser.g:326:2: ( ruleMINUS )
                    {
                    // InternalWParser.g:326:2: ( ruleMINUS )
                    // InternalWParser.g:327:3: ruleMINUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getMINUSParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMINUS();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getMINUSParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Sequence__P1Alternatives_0_0"
    // InternalWParser.g:336:1: rule__Sequence__P1Alternatives_0_0 : ( ( ruleAssignment ) | ( ruleLoop ) );
    public final void rule__Sequence__P1Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:340:1: ( ( ruleAssignment ) | ( ruleLoop ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==While) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWParser.g:341:2: ( ruleAssignment )
                    {
                    // InternalWParser.g:341:2: ( ruleAssignment )
                    // InternalWParser.g:342:3: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceAccess().getP1AssignmentParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceAccess().getP1AssignmentParserRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalWParser.g:347:2: ( ruleLoop )
                    {
                    // InternalWParser.g:347:2: ( ruleLoop )
                    // InternalWParser.g:348:3: ruleLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSequenceAccess().getP1LoopParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSequenceAccess().getP1LoopParserRuleCall_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__P1Alternatives_0_0"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalWParser.g:357:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:361:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalWParser.g:362:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalWParser.g:369:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__ToBeAssignedAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:373:1: ( ( ( rule__Assignment__ToBeAssignedAssignment_0 ) ) )
            // InternalWParser.g:374:1: ( ( rule__Assignment__ToBeAssignedAssignment_0 ) )
            {
            // InternalWParser.g:374:1: ( ( rule__Assignment__ToBeAssignedAssignment_0 ) )
            // InternalWParser.g:375:2: ( rule__Assignment__ToBeAssignedAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getToBeAssignedAssignment_0()); 
            }
            // InternalWParser.g:376:2: ( rule__Assignment__ToBeAssignedAssignment_0 )
            // InternalWParser.g:376:3: rule__Assignment__ToBeAssignedAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ToBeAssignedAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getToBeAssignedAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalWParser.g:384:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:388:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalWParser.g:389:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalWParser.g:396:1: rule__Assignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:400:1: ( ( EqualsSign ) )
            // InternalWParser.g:401:1: ( EqualsSign )
            {
            // InternalWParser.g:401:1: ( EqualsSign )
            // InternalWParser.g:402:2: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalWParser.g:411:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:415:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalWParser.g:416:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalWParser.g:423:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__VarAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:427:1: ( ( ( rule__Assignment__VarAssignment_2 ) ) )
            // InternalWParser.g:428:1: ( ( rule__Assignment__VarAssignment_2 ) )
            {
            // InternalWParser.g:428:1: ( ( rule__Assignment__VarAssignment_2 ) )
            // InternalWParser.g:429:2: ( rule__Assignment__VarAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVarAssignment_2()); 
            }
            // InternalWParser.g:430:2: ( rule__Assignment__VarAssignment_2 )
            // InternalWParser.g:430:3: rule__Assignment__VarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VarAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVarAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // InternalWParser.g:438:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:442:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalWParser.g:443:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Assignment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // InternalWParser.g:450:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__OpAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:454:1: ( ( ( rule__Assignment__OpAssignment_3 ) ) )
            // InternalWParser.g:455:1: ( ( rule__Assignment__OpAssignment_3 ) )
            {
            // InternalWParser.g:455:1: ( ( rule__Assignment__OpAssignment_3 ) )
            // InternalWParser.g:456:2: ( rule__Assignment__OpAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpAssignment_3()); 
            }
            // InternalWParser.g:457:2: ( rule__Assignment__OpAssignment_3 )
            // InternalWParser.g:457:3: rule__Assignment__OpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__OpAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__4"
    // InternalWParser.g:465:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:469:1: ( rule__Assignment__Group__4__Impl )
            // InternalWParser.g:470:2: rule__Assignment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4"


    // $ANTLR start "rule__Assignment__Group__4__Impl"
    // InternalWParser.g:476:1: rule__Assignment__Group__4__Impl : ( ( rule__Assignment__ConstAssignment_4 ) ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:480:1: ( ( ( rule__Assignment__ConstAssignment_4 ) ) )
            // InternalWParser.g:481:1: ( ( rule__Assignment__ConstAssignment_4 ) )
            {
            // InternalWParser.g:481:1: ( ( rule__Assignment__ConstAssignment_4 ) )
            // InternalWParser.g:482:2: ( rule__Assignment__ConstAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getConstAssignment_4()); 
            }
            // InternalWParser.g:483:2: ( rule__Assignment__ConstAssignment_4 )
            // InternalWParser.g:483:3: rule__Assignment__ConstAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ConstAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getConstAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalWParser.g:492:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:496:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalWParser.g:497:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Loop__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalWParser.g:504:1: rule__Loop__Group__0__Impl : ( While ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:508:1: ( ( While ) )
            // InternalWParser.g:509:1: ( While )
            {
            // InternalWParser.g:509:1: ( While )
            // InternalWParser.g:510:2: While
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getWhileKeyword_0()); 
            }
            match(input,While,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalWParser.g:519:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:523:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalWParser.g:524:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Loop__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalWParser.g:531:1: rule__Loop__Group__1__Impl : ( ( rule__Loop__VarAssignment_1 ) ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:535:1: ( ( ( rule__Loop__VarAssignment_1 ) ) )
            // InternalWParser.g:536:1: ( ( rule__Loop__VarAssignment_1 ) )
            {
            // InternalWParser.g:536:1: ( ( rule__Loop__VarAssignment_1 ) )
            // InternalWParser.g:537:2: ( rule__Loop__VarAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getVarAssignment_1()); 
            }
            // InternalWParser.g:538:2: ( rule__Loop__VarAssignment_1 )
            // InternalWParser.g:538:3: rule__Loop__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__VarAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getVarAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalWParser.g:546:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:550:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalWParser.g:551:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Loop__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalWParser.g:558:1: rule__Loop__Group__2__Impl : ( ExclamationMarkEqualsSign ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:562:1: ( ( ExclamationMarkEqualsSign ) )
            // InternalWParser.g:563:1: ( ExclamationMarkEqualsSign )
            {
            // InternalWParser.g:563:1: ( ExclamationMarkEqualsSign )
            // InternalWParser.g:564:2: ExclamationMarkEqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getExclamationMarkEqualsSignKeyword_2()); 
            }
            match(input,ExclamationMarkEqualsSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getExclamationMarkEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalWParser.g:573:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:577:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalWParser.g:578:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Loop__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalWParser.g:585:1: rule__Loop__Group__3__Impl : ( ( rule__Loop__ConstAssignment_3 ) ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:589:1: ( ( ( rule__Loop__ConstAssignment_3 ) ) )
            // InternalWParser.g:590:1: ( ( rule__Loop__ConstAssignment_3 ) )
            {
            // InternalWParser.g:590:1: ( ( rule__Loop__ConstAssignment_3 ) )
            // InternalWParser.g:591:2: ( rule__Loop__ConstAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getConstAssignment_3()); 
            }
            // InternalWParser.g:592:2: ( rule__Loop__ConstAssignment_3 )
            // InternalWParser.g:592:3: rule__Loop__ConstAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ConstAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getConstAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalWParser.g:600:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:604:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalWParser.g:605:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Loop__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Loop__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalWParser.g:612:1: rule__Loop__Group__4__Impl : ( Do ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:616:1: ( ( Do ) )
            // InternalWParser.g:617:1: ( Do )
            {
            // InternalWParser.g:617:1: ( Do )
            // InternalWParser.g:618:2: Do
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getDoKeyword_4()); 
            }
            match(input,Do,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getDoKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group__5"
    // InternalWParser.g:627:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:631:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalWParser.g:632:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Loop__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Loop__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__5"


    // $ANTLR start "rule__Loop__Group__5__Impl"
    // InternalWParser.g:639:1: rule__Loop__Group__5__Impl : ( ( rule__Loop__ProgAssignment_5 ) ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:643:1: ( ( ( rule__Loop__ProgAssignment_5 ) ) )
            // InternalWParser.g:644:1: ( ( rule__Loop__ProgAssignment_5 ) )
            {
            // InternalWParser.g:644:1: ( ( rule__Loop__ProgAssignment_5 ) )
            // InternalWParser.g:645:2: ( rule__Loop__ProgAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getProgAssignment_5()); 
            }
            // InternalWParser.g:646:2: ( rule__Loop__ProgAssignment_5 )
            // InternalWParser.g:646:3: rule__Loop__ProgAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ProgAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getProgAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__5__Impl"


    // $ANTLR start "rule__Loop__Group__6"
    // InternalWParser.g:654:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:658:1: ( rule__Loop__Group__6__Impl )
            // InternalWParser.g:659:2: rule__Loop__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__6"


    // $ANTLR start "rule__Loop__Group__6__Impl"
    // InternalWParser.g:665:1: rule__Loop__Group__6__Impl : ( Endwhile ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:669:1: ( ( Endwhile ) )
            // InternalWParser.g:670:1: ( Endwhile )
            {
            // InternalWParser.g:670:1: ( Endwhile )
            // InternalWParser.g:671:2: Endwhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getEndwhileKeyword_6()); 
            }
            match(input,Endwhile,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getEndwhileKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__6__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // InternalWParser.g:681:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:685:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // InternalWParser.g:686:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Sequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sequence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // InternalWParser.g:693:1: rule__Sequence__Group__0__Impl : ( ( rule__Sequence__P1Assignment_0 ) ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:697:1: ( ( ( rule__Sequence__P1Assignment_0 ) ) )
            // InternalWParser.g:698:1: ( ( rule__Sequence__P1Assignment_0 ) )
            {
            // InternalWParser.g:698:1: ( ( rule__Sequence__P1Assignment_0 ) )
            // InternalWParser.g:699:2: ( rule__Sequence__P1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getP1Assignment_0()); 
            }
            // InternalWParser.g:700:2: ( rule__Sequence__P1Assignment_0 )
            // InternalWParser.g:700:3: rule__Sequence__P1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__P1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getP1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // InternalWParser.g:708:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:712:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // InternalWParser.g:713:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Sequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sequence__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // InternalWParser.g:720:1: rule__Sequence__Group__1__Impl : ( Semicolon ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:724:1: ( ( Semicolon ) )
            // InternalWParser.g:725:1: ( Semicolon )
            {
            // InternalWParser.g:725:1: ( Semicolon )
            // InternalWParser.g:726:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getSemicolonKeyword_1()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // InternalWParser.g:735:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:739:1: ( rule__Sequence__Group__2__Impl )
            // InternalWParser.g:740:2: rule__Sequence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // InternalWParser.g:746:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__P2Assignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:750:1: ( ( ( rule__Sequence__P2Assignment_2 ) ) )
            // InternalWParser.g:751:1: ( ( rule__Sequence__P2Assignment_2 ) )
            {
            // InternalWParser.g:751:1: ( ( rule__Sequence__P2Assignment_2 ) )
            // InternalWParser.g:752:2: ( rule__Sequence__P2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getP2Assignment_2()); 
            }
            // InternalWParser.g:753:2: ( rule__Sequence__P2Assignment_2 )
            // InternalWParser.g:753:3: rule__Sequence__P2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__P2Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getP2Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Assignment__ToBeAssignedAssignment_0"
    // InternalWParser.g:762:1: rule__Assignment__ToBeAssignedAssignment_0 : ( ruleVariable ) ;
    public final void rule__Assignment__ToBeAssignedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:766:1: ( ( ruleVariable ) )
            // InternalWParser.g:767:2: ( ruleVariable )
            {
            // InternalWParser.g:767:2: ( ruleVariable )
            // InternalWParser.g:768:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getToBeAssignedVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getToBeAssignedVariableParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ToBeAssignedAssignment_0"


    // $ANTLR start "rule__Assignment__VarAssignment_2"
    // InternalWParser.g:777:1: rule__Assignment__VarAssignment_2 : ( ruleVariable ) ;
    public final void rule__Assignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:781:1: ( ( ruleVariable ) )
            // InternalWParser.g:782:2: ( ruleVariable )
            {
            // InternalWParser.g:782:2: ( ruleVariable )
            // InternalWParser.g:783:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVarVariableParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVarVariableParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VarAssignment_2"


    // $ANTLR start "rule__Assignment__OpAssignment_3"
    // InternalWParser.g:792:1: rule__Assignment__OpAssignment_3 : ( ruleOperator ) ;
    public final void rule__Assignment__OpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:796:1: ( ( ruleOperator ) )
            // InternalWParser.g:797:2: ( ruleOperator )
            {
            // InternalWParser.g:797:2: ( ruleOperator )
            // InternalWParser.g:798:3: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpOperatorParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpOperatorParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__OpAssignment_3"


    // $ANTLR start "rule__Assignment__ConstAssignment_4"
    // InternalWParser.g:807:1: rule__Assignment__ConstAssignment_4 : ( ruleConstant ) ;
    public final void rule__Assignment__ConstAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:811:1: ( ( ruleConstant ) )
            // InternalWParser.g:812:2: ( ruleConstant )
            {
            // InternalWParser.g:812:2: ( ruleConstant )
            // InternalWParser.g:813:3: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getConstConstantParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getConstConstantParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ConstAssignment_4"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalWParser.g:822:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:826:1: ( ( RULE_ID ) )
            // InternalWParser.g:827:2: ( RULE_ID )
            {
            // InternalWParser.g:827:2: ( RULE_ID )
            // InternalWParser.g:828:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__Constant__ValueAssignment"
    // InternalWParser.g:837:1: rule__Constant__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:841:1: ( ( RULE_INT ) )
            // InternalWParser.g:842:2: ( RULE_INT )
            {
            // InternalWParser.g:842:2: ( RULE_INT )
            // InternalWParser.g:843:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ValueAssignment"


    // $ANTLR start "rule__Loop__VarAssignment_1"
    // InternalWParser.g:852:1: rule__Loop__VarAssignment_1 : ( ruleVariable ) ;
    public final void rule__Loop__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:856:1: ( ( ruleVariable ) )
            // InternalWParser.g:857:2: ( ruleVariable )
            {
            // InternalWParser.g:857:2: ( ruleVariable )
            // InternalWParser.g:858:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getVarVariableParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getVarVariableParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__VarAssignment_1"


    // $ANTLR start "rule__Loop__ConstAssignment_3"
    // InternalWParser.g:867:1: rule__Loop__ConstAssignment_3 : ( ruleConstant ) ;
    public final void rule__Loop__ConstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:871:1: ( ( ruleConstant ) )
            // InternalWParser.g:872:2: ( ruleConstant )
            {
            // InternalWParser.g:872:2: ( ruleConstant )
            // InternalWParser.g:873:3: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getConstConstantParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getConstConstantParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__ConstAssignment_3"


    // $ANTLR start "rule__Loop__ProgAssignment_5"
    // InternalWParser.g:882:1: rule__Loop__ProgAssignment_5 : ( ruleProgram ) ;
    public final void rule__Loop__ProgAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:886:1: ( ( ruleProgram ) )
            // InternalWParser.g:887:2: ( ruleProgram )
            {
            // InternalWParser.g:887:2: ( ruleProgram )
            // InternalWParser.g:888:3: ruleProgram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopAccess().getProgProgramParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopAccess().getProgProgramParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__ProgAssignment_5"


    // $ANTLR start "rule__Sequence__P1Assignment_0"
    // InternalWParser.g:897:1: rule__Sequence__P1Assignment_0 : ( ( rule__Sequence__P1Alternatives_0_0 ) ) ;
    public final void rule__Sequence__P1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:901:1: ( ( ( rule__Sequence__P1Alternatives_0_0 ) ) )
            // InternalWParser.g:902:2: ( ( rule__Sequence__P1Alternatives_0_0 ) )
            {
            // InternalWParser.g:902:2: ( ( rule__Sequence__P1Alternatives_0_0 ) )
            // InternalWParser.g:903:3: ( rule__Sequence__P1Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getP1Alternatives_0_0()); 
            }
            // InternalWParser.g:904:3: ( rule__Sequence__P1Alternatives_0_0 )
            // InternalWParser.g:904:4: rule__Sequence__P1Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__P1Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getP1Alternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__P1Assignment_0"


    // $ANTLR start "rule__Sequence__P2Assignment_2"
    // InternalWParser.g:912:1: rule__Sequence__P2Assignment_2 : ( ruleProgram ) ;
    public final void rule__Sequence__P2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWParser.g:916:1: ( ( ruleProgram ) )
            // InternalWParser.g:917:2: ( ruleProgram )
            {
            // InternalWParser.g:917:2: ( ruleProgram )
            // InternalWParser.g:918:3: ruleProgram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getP2ProgramParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getP2ProgramParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__P2Assignment_2"

    // $ANTLR start synpred1_InternalWParser
    public final void synpred1_InternalWParser_fragment() throws RecognitionException {   
        // InternalWParser.g:293:2: ( ( ruleAssignment ) )
        // InternalWParser.g:293:2: ( ruleAssignment )
        {
        // InternalWParser.g:293:2: ( ruleAssignment )
        // InternalWParser.g:294:3: ruleAssignment
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getProgramAccess().getAssignmentParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalWParser

    // $ANTLR start synpred2_InternalWParser
    public final void synpred2_InternalWParser_fragment() throws RecognitionException {   
        // InternalWParser.g:299:2: ( ( ruleSequence ) )
        // InternalWParser.g:299:2: ( ruleSequence )
        {
        // InternalWParser.g:299:2: ( ruleSequence )
        // InternalWParser.g:300:3: ruleSequence
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getProgramAccess().getSequenceParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleSequence();

        state._fsp--;
        if (state.failed) return ;

        }


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