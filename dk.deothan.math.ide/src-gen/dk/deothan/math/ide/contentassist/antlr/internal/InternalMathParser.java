package dk.deothan.math.ide.contentassist.antlr.internal;

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
import dk.deothan.math.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'Expression'", "':'", "'('", "')'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }


    	private MathGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMath.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleModel EOF )
            // InternalMath.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMath.g:62:1: ruleModel : ( ( rule__Model__ExpsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__Model__ExpsAssignment )* ) )
            // InternalMath.g:67:2: ( ( rule__Model__ExpsAssignment )* )
            {
            // InternalMath.g:67:2: ( ( rule__Model__ExpsAssignment )* )
            // InternalMath.g:68:3: ( rule__Model__ExpsAssignment )*
            {
             before(grammarAccess.getModelAccess().getExpsAssignment()); 
            // InternalMath.g:69:3: ( rule__Model__ExpsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:69:4: rule__Model__ExpsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ExpsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getExpsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNamedExpression"
    // InternalMath.g:78:1: entryRuleNamedExpression : ruleNamedExpression EOF ;
    public final void entryRuleNamedExpression() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleNamedExpression EOF )
            // InternalMath.g:80:1: ruleNamedExpression EOF
            {
             before(grammarAccess.getNamedExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedExpression();

            state._fsp--;

             after(grammarAccess.getNamedExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamedExpression"


    // $ANTLR start "ruleNamedExpression"
    // InternalMath.g:87:1: ruleNamedExpression : ( ( rule__NamedExpression__Group__0 ) ) ;
    public final void ruleNamedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ( rule__NamedExpression__Group__0 ) ) )
            // InternalMath.g:92:2: ( ( rule__NamedExpression__Group__0 ) )
            {
            // InternalMath.g:92:2: ( ( rule__NamedExpression__Group__0 ) )
            // InternalMath.g:93:3: ( rule__NamedExpression__Group__0 )
            {
             before(grammarAccess.getNamedExpressionAccess().getGroup()); 
            // InternalMath.g:94:3: ( rule__NamedExpression__Group__0 )
            // InternalMath.g:94:4: rule__NamedExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleNamedExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalMath.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleExpression EOF )
            // InternalMath.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMath.g:112:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMath.g:117:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMath.g:117:2: ( ( rule__Expression__Group__0 ) )
            // InternalMath.g:118:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMath.g:119:3: ( rule__Expression__Group__0 )
            // InternalMath.g:119:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:128:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( ruleFactor EOF )
            // InternalMath.g:130:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:137:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__Factor__Group__0 ) )
            // InternalMath.g:143:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__Factor__Group__0 )
            // InternalMath.g:144:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimitive"
    // InternalMath.g:153:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( rulePrimitive EOF )
            // InternalMath.g:155:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalMath.g:162:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalMath.g:167:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalMath.g:167:2: ( ( rule__Primitive__Alternatives ) )
            // InternalMath.g:168:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalMath.g:169:3: ( rule__Primitive__Alternatives )
            // InternalMath.g:169:4: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRulePartOperator"
    // InternalMath.g:178:1: entryRulePartOperator : rulePartOperator EOF ;
    public final void entryRulePartOperator() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( rulePartOperator EOF )
            // InternalMath.g:180:1: rulePartOperator EOF
            {
             before(grammarAccess.getPartOperatorRule()); 
            pushFollow(FOLLOW_1);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getPartOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePartOperator"


    // $ANTLR start "rulePartOperator"
    // InternalMath.g:187:1: rulePartOperator : ( ( rule__PartOperator__Alternatives ) ) ;
    public final void rulePartOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__PartOperator__Alternatives ) ) )
            // InternalMath.g:192:2: ( ( rule__PartOperator__Alternatives ) )
            {
            // InternalMath.g:192:2: ( ( rule__PartOperator__Alternatives ) )
            // InternalMath.g:193:3: ( rule__PartOperator__Alternatives )
            {
             before(grammarAccess.getPartOperatorAccess().getAlternatives()); 
            // InternalMath.g:194:3: ( rule__PartOperator__Alternatives )
            // InternalMath.g:194:4: rule__PartOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PartOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPartOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "rulePartOperator"


    // $ANTLR start "entryRuleFactorOperator"
    // InternalMath.g:203:1: entryRuleFactorOperator : ruleFactorOperator EOF ;
    public final void entryRuleFactorOperator() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( ruleFactorOperator EOF )
            // InternalMath.g:205:1: ruleFactorOperator EOF
            {
             before(grammarAccess.getFactorOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactorOperator();

            state._fsp--;

             after(grammarAccess.getFactorOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactorOperator"


    // $ANTLR start "ruleFactorOperator"
    // InternalMath.g:212:1: ruleFactorOperator : ( ( rule__FactorOperator__Alternatives ) ) ;
    public final void ruleFactorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__FactorOperator__Alternatives ) ) )
            // InternalMath.g:217:2: ( ( rule__FactorOperator__Alternatives ) )
            {
            // InternalMath.g:217:2: ( ( rule__FactorOperator__Alternatives ) )
            // InternalMath.g:218:3: ( rule__FactorOperator__Alternatives )
            {
             before(grammarAccess.getFactorOperatorAccess().getAlternatives()); 
            // InternalMath.g:219:3: ( rule__FactorOperator__Alternatives )
            // InternalMath.g:219:4: rule__FactorOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FactorOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMath.g:228:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMath.g:229:1: ( ruleNumberLiteral EOF )
            // InternalMath.g:230:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMath.g:237:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:241:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // InternalMath.g:242:2: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // InternalMath.g:242:2: ( ( rule__NumberLiteral__Group__0 ) )
            // InternalMath.g:243:3: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // InternalMath.g:244:3: ( rule__NumberLiteral__Group__0 )
            // InternalMath.g:244:4: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalMath.g:253:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalMath.g:254:1: ( ruleDECIMAL EOF )
            // InternalMath.g:255:1: ruleDECIMAL EOF
            {
             before(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getDECIMALRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalMath.g:262:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:266:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalMath.g:267:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalMath.g:267:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalMath.g:268:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalMath.g:269:3: ( rule__DECIMAL__Group__0 )
            // InternalMath.g:269:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECIMALAccess().getGroup()); 

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
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleNumberTypes"
    // InternalMath.g:278:1: entryRuleNumberTypes : ruleNumberTypes EOF ;
    public final void entryRuleNumberTypes() throws RecognitionException {
        try {
            // InternalMath.g:279:1: ( ruleNumberTypes EOF )
            // InternalMath.g:280:1: ruleNumberTypes EOF
            {
             before(grammarAccess.getNumberTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberTypes();

            state._fsp--;

             after(grammarAccess.getNumberTypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberTypes"


    // $ANTLR start "ruleNumberTypes"
    // InternalMath.g:287:1: ruleNumberTypes : ( ( rule__NumberTypes__Alternatives ) ) ;
    public final void ruleNumberTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:291:2: ( ( ( rule__NumberTypes__Alternatives ) ) )
            // InternalMath.g:292:2: ( ( rule__NumberTypes__Alternatives ) )
            {
            // InternalMath.g:292:2: ( ( rule__NumberTypes__Alternatives ) )
            // InternalMath.g:293:3: ( rule__NumberTypes__Alternatives )
            {
             before(grammarAccess.getNumberTypesAccess().getAlternatives()); 
            // InternalMath.g:294:3: ( rule__NumberTypes__Alternatives )
            // InternalMath.g:294:4: rule__NumberTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumberTypes"


    // $ANTLR start "entryRuleLetter"
    // InternalMath.g:303:1: entryRuleLetter : ruleLetter EOF ;
    public final void entryRuleLetter() throws RecognitionException {
        try {
            // InternalMath.g:304:1: ( ruleLetter EOF )
            // InternalMath.g:305:1: ruleLetter EOF
            {
             before(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_1);
            ruleLetter();

            state._fsp--;

             after(grammarAccess.getLetterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLetter"


    // $ANTLR start "ruleLetter"
    // InternalMath.g:312:1: ruleLetter : ( ( rule__Letter__Group__0 ) ) ;
    public final void ruleLetter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:316:2: ( ( ( rule__Letter__Group__0 ) ) )
            // InternalMath.g:317:2: ( ( rule__Letter__Group__0 ) )
            {
            // InternalMath.g:317:2: ( ( rule__Letter__Group__0 ) )
            // InternalMath.g:318:3: ( rule__Letter__Group__0 )
            {
             before(grammarAccess.getLetterAccess().getGroup()); 
            // InternalMath.g:319:3: ( rule__Letter__Group__0 )
            // InternalMath.g:319:4: rule__Letter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Letter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetterAccess().getGroup()); 

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
    // $ANTLR end "ruleLetter"


    // $ANTLR start "rule__Primitive__Alternatives"
    // InternalMath.g:327:1: rule__Primitive__Alternatives : ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primitive__Group_2__0 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:331:1: ( ( ruleNumberLiteral ) | ( ruleLetter ) | ( ( rule__Primitive__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_INT) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_INT) ) {
                    alt2=1;
                }
                else if ( (LA2_2==RULE_ID) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMath.g:332:2: ( ruleNumberLiteral )
                    {
                    // InternalMath.g:332:2: ( ruleNumberLiteral )
                    // InternalMath.g:333:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:338:2: ( ruleLetter )
                    {
                    // InternalMath.g:338:2: ( ruleLetter )
                    // InternalMath.g:339:3: ruleLetter
                    {
                     before(grammarAccess.getPrimitiveAccess().getLetterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLetter();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getLetterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:344:2: ( ( rule__Primitive__Group_2__0 ) )
                    {
                    // InternalMath.g:344:2: ( ( rule__Primitive__Group_2__0 ) )
                    // InternalMath.g:345:3: ( rule__Primitive__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_2()); 
                    // InternalMath.g:346:3: ( rule__Primitive__Group_2__0 )
                    // InternalMath.g:346:4: rule__Primitive__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Primitive__Alternatives"


    // $ANTLR start "rule__PartOperator__Alternatives"
    // InternalMath.g:354:1: rule__PartOperator__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__PartOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:358:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:359:2: ( '+' )
                    {
                    // InternalMath.g:359:2: ( '+' )
                    // InternalMath.g:360:3: '+'
                    {
                     before(grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:365:2: ( '-' )
                    {
                    // InternalMath.g:365:2: ( '-' )
                    // InternalMath.g:366:3: '-'
                    {
                     before(grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__PartOperator__Alternatives"


    // $ANTLR start "rule__FactorOperator__Alternatives"
    // InternalMath.g:375:1: rule__FactorOperator__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__FactorOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:379:1: ( ( '*' ) | ( '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:380:2: ( '*' )
                    {
                    // InternalMath.g:380:2: ( '*' )
                    // InternalMath.g:381:3: '*'
                    {
                     before(grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:386:2: ( '/' )
                    {
                    // InternalMath.g:386:2: ( '/' )
                    // InternalMath.g:387:3: '/'
                    {
                     before(grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__FactorOperator__Alternatives"


    // $ANTLR start "rule__NumberTypes__Alternatives"
    // InternalMath.g:396:1: rule__NumberTypes__Alternatives : ( ( ruleDECIMAL ) | ( RULE_INT ) );
    public final void rule__NumberTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:400:1: ( ( ruleDECIMAL ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==19) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||(LA5_1>=11 && LA5_1<=15)||LA5_1==18) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMath.g:401:2: ( ruleDECIMAL )
                    {
                    // InternalMath.g:401:2: ( ruleDECIMAL )
                    // InternalMath.g:402:3: ruleDECIMAL
                    {
                     before(grammarAccess.getNumberTypesAccess().getDECIMALParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDECIMAL();

                    state._fsp--;

                     after(grammarAccess.getNumberTypesAccess().getDECIMALParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:407:2: ( RULE_INT )
                    {
                    // InternalMath.g:407:2: ( RULE_INT )
                    // InternalMath.g:408:3: RULE_INT
                    {
                     before(grammarAccess.getNumberTypesAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNumberTypesAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__NumberTypes__Alternatives"


    // $ANTLR start "rule__NamedExpression__Group__0"
    // InternalMath.g:417:1: rule__NamedExpression__Group__0 : rule__NamedExpression__Group__0__Impl rule__NamedExpression__Group__1 ;
    public final void rule__NamedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:421:1: ( rule__NamedExpression__Group__0__Impl rule__NamedExpression__Group__1 )
            // InternalMath.g:422:2: rule__NamedExpression__Group__0__Impl rule__NamedExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NamedExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedExpression__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__NamedExpression__Group__0"


    // $ANTLR start "rule__NamedExpression__Group__0__Impl"
    // InternalMath.g:429:1: rule__NamedExpression__Group__0__Impl : ( 'Expression' ) ;
    public final void rule__NamedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:433:1: ( ( 'Expression' ) )
            // InternalMath.g:434:1: ( 'Expression' )
            {
            // InternalMath.g:434:1: ( 'Expression' )
            // InternalMath.g:435:2: 'Expression'
            {
             before(grammarAccess.getNamedExpressionAccess().getExpressionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNamedExpressionAccess().getExpressionKeyword_0()); 

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
    // $ANTLR end "rule__NamedExpression__Group__0__Impl"


    // $ANTLR start "rule__NamedExpression__Group__1"
    // InternalMath.g:444:1: rule__NamedExpression__Group__1 : rule__NamedExpression__Group__1__Impl rule__NamedExpression__Group__2 ;
    public final void rule__NamedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:448:1: ( rule__NamedExpression__Group__1__Impl rule__NamedExpression__Group__2 )
            // InternalMath.g:449:2: rule__NamedExpression__Group__1__Impl rule__NamedExpression__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NamedExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedExpression__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__NamedExpression__Group__1"


    // $ANTLR start "rule__NamedExpression__Group__1__Impl"
    // InternalMath.g:456:1: rule__NamedExpression__Group__1__Impl : ( ( rule__NamedExpression__NameAssignment_1 ) ) ;
    public final void rule__NamedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:460:1: ( ( ( rule__NamedExpression__NameAssignment_1 ) ) )
            // InternalMath.g:461:1: ( ( rule__NamedExpression__NameAssignment_1 ) )
            {
            // InternalMath.g:461:1: ( ( rule__NamedExpression__NameAssignment_1 ) )
            // InternalMath.g:462:2: ( rule__NamedExpression__NameAssignment_1 )
            {
             before(grammarAccess.getNamedExpressionAccess().getNameAssignment_1()); 
            // InternalMath.g:463:2: ( rule__NamedExpression__NameAssignment_1 )
            // InternalMath.g:463:3: rule__NamedExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpression__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedExpressionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NamedExpression__Group__1__Impl"


    // $ANTLR start "rule__NamedExpression__Group__2"
    // InternalMath.g:471:1: rule__NamedExpression__Group__2 : rule__NamedExpression__Group__2__Impl rule__NamedExpression__Group__3 ;
    public final void rule__NamedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:475:1: ( rule__NamedExpression__Group__2__Impl rule__NamedExpression__Group__3 )
            // InternalMath.g:476:2: rule__NamedExpression__Group__2__Impl rule__NamedExpression__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__NamedExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedExpression__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__NamedExpression__Group__2"


    // $ANTLR start "rule__NamedExpression__Group__2__Impl"
    // InternalMath.g:483:1: rule__NamedExpression__Group__2__Impl : ( ':' ) ;
    public final void rule__NamedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:487:1: ( ( ':' ) )
            // InternalMath.g:488:1: ( ':' )
            {
            // InternalMath.g:488:1: ( ':' )
            // InternalMath.g:489:2: ':'
            {
             before(grammarAccess.getNamedExpressionAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNamedExpressionAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__NamedExpression__Group__2__Impl"


    // $ANTLR start "rule__NamedExpression__Group__3"
    // InternalMath.g:498:1: rule__NamedExpression__Group__3 : rule__NamedExpression__Group__3__Impl ;
    public final void rule__NamedExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:502:1: ( rule__NamedExpression__Group__3__Impl )
            // InternalMath.g:503:2: rule__NamedExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpression__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__NamedExpression__Group__3"


    // $ANTLR start "rule__NamedExpression__Group__3__Impl"
    // InternalMath.g:509:1: rule__NamedExpression__Group__3__Impl : ( ( rule__NamedExpression__ExpAssignment_3 ) ) ;
    public final void rule__NamedExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:513:1: ( ( ( rule__NamedExpression__ExpAssignment_3 ) ) )
            // InternalMath.g:514:1: ( ( rule__NamedExpression__ExpAssignment_3 ) )
            {
            // InternalMath.g:514:1: ( ( rule__NamedExpression__ExpAssignment_3 ) )
            // InternalMath.g:515:2: ( rule__NamedExpression__ExpAssignment_3 )
            {
             before(grammarAccess.getNamedExpressionAccess().getExpAssignment_3()); 
            // InternalMath.g:516:2: ( rule__NamedExpression__ExpAssignment_3 )
            // InternalMath.g:516:3: rule__NamedExpression__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NamedExpression__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedExpressionAccess().getExpAssignment_3()); 

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
    // $ANTLR end "rule__NamedExpression__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMath.g:525:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:529:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMath.g:530:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMath.g:537:1: rule__Expression__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:541:1: ( ( ruleFactor ) )
            // InternalMath.g:542:1: ( ruleFactor )
            {
            // InternalMath.g:542:1: ( ruleFactor )
            // InternalMath.g:543:2: ruleFactor
            {
             before(grammarAccess.getExpressionAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getFactorParserRuleCall_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMath.g:552:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:556:1: ( rule__Expression__Group__1__Impl )
            // InternalMath.g:557:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMath.g:563:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:567:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalMath.g:568:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalMath.g:568:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalMath.g:569:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalMath.g:570:2: ( rule__Expression__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:570:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMath.g:579:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:583:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMath.g:584:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalMath.g:591:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:595:1: ( ( () ) )
            // InternalMath.g:596:1: ( () )
            {
            // InternalMath.g:596:1: ( () )
            // InternalMath.g:597:2: ()
            {
             before(grammarAccess.getExpressionAccess().getPartLeftAction_1_0()); 
            // InternalMath.g:598:2: ()
            // InternalMath.g:598:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getPartLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalMath.g:606:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:610:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalMath.g:611:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalMath.g:618:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OperatorAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:622:1: ( ( ( rule__Expression__OperatorAssignment_1_1 ) ) )
            // InternalMath.g:623:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            {
            // InternalMath.g:623:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            // InternalMath.g:624:2: ( rule__Expression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMath.g:625:2: ( rule__Expression__OperatorAssignment_1_1 )
            // InternalMath.g:625:3: rule__Expression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalMath.g:633:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:637:1: ( rule__Expression__Group_1__2__Impl )
            // InternalMath.g:638:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalMath.g:644:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:648:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalMath.g:649:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalMath.g:649:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalMath.g:650:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalMath.g:651:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalMath.g:651:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalMath.g:660:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:664:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalMath.g:665:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalMath.g:672:1: rule__Factor__Group__0__Impl : ( rulePrimitive ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:676:1: ( ( rulePrimitive ) )
            // InternalMath.g:677:1: ( rulePrimitive )
            {
            // InternalMath.g:677:1: ( rulePrimitive )
            // InternalMath.g:678:2: rulePrimitive
            {
             before(grammarAccess.getFactorAccess().getPrimitiveParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPrimitiveParserRuleCall_0()); 

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
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalMath.g:687:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:691:1: ( rule__Factor__Group__1__Impl )
            // InternalMath.g:692:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalMath.g:698:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:702:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalMath.g:703:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalMath.g:703:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalMath.g:704:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalMath.g:705:2: ( rule__Factor__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=13 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMath.g:705:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalMath.g:714:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:718:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalMath.g:719:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalMath.g:726:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:730:1: ( ( () ) )
            // InternalMath.g:731:1: ( () )
            {
            // InternalMath.g:731:1: ( () )
            // InternalMath.g:732:2: ()
            {
             before(grammarAccess.getFactorAccess().getFactorLeftAction_1_0()); 
            // InternalMath.g:733:2: ()
            // InternalMath.g:733:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getFactorLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalMath.g:741:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:745:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalMath.g:746:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalMath.g:753:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__OperatorAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:757:1: ( ( ( rule__Factor__OperatorAssignment_1_1 ) ) )
            // InternalMath.g:758:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            {
            // InternalMath.g:758:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            // InternalMath.g:759:2: ( rule__Factor__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
            // InternalMath.g:760:2: ( rule__Factor__OperatorAssignment_1_1 )
            // InternalMath.g:760:3: rule__Factor__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__2"
    // InternalMath.g:768:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:772:1: ( rule__Factor__Group_1__2__Impl )
            // InternalMath.g:773:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Factor__Group_1__2"


    // $ANTLR start "rule__Factor__Group_1__2__Impl"
    // InternalMath.g:779:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__RightAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:783:1: ( ( ( rule__Factor__RightAssignment_1_2 ) ) )
            // InternalMath.g:784:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            {
            // InternalMath.g:784:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            // InternalMath.g:785:2: ( rule__Factor__RightAssignment_1_2 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 
            // InternalMath.g:786:2: ( rule__Factor__RightAssignment_1_2 )
            // InternalMath.g:786:3: rule__Factor__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Factor__Group_1__2__Impl"


    // $ANTLR start "rule__Primitive__Group_2__0"
    // InternalMath.g:795:1: rule__Primitive__Group_2__0 : rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 ;
    public final void rule__Primitive__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:799:1: ( rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 )
            // InternalMath.g:800:2: rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Primitive__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Primitive__Group_2__0"


    // $ANTLR start "rule__Primitive__Group_2__0__Impl"
    // InternalMath.g:807:1: rule__Primitive__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:811:1: ( ( '(' ) )
            // InternalMath.g:812:1: ( '(' )
            {
            // InternalMath.g:812:1: ( '(' )
            // InternalMath.g:813:2: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Primitive__Group_2__0__Impl"


    // $ANTLR start "rule__Primitive__Group_2__1"
    // InternalMath.g:822:1: rule__Primitive__Group_2__1 : rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 ;
    public final void rule__Primitive__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:826:1: ( rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 )
            // InternalMath.g:827:2: rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__Primitive__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_2__2();

            state._fsp--;


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
    // $ANTLR end "rule__Primitive__Group_2__1"


    // $ANTLR start "rule__Primitive__Group_2__1__Impl"
    // InternalMath.g:834:1: rule__Primitive__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primitive__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:838:1: ( ( ruleExpression ) )
            // InternalMath.g:839:1: ( ruleExpression )
            {
            // InternalMath.g:839:1: ( ruleExpression )
            // InternalMath.g:840:2: ruleExpression
            {
             before(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Primitive__Group_2__1__Impl"


    // $ANTLR start "rule__Primitive__Group_2__2"
    // InternalMath.g:849:1: rule__Primitive__Group_2__2 : rule__Primitive__Group_2__2__Impl ;
    public final void rule__Primitive__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:853:1: ( rule__Primitive__Group_2__2__Impl )
            // InternalMath.g:854:2: rule__Primitive__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_2__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Primitive__Group_2__2"


    // $ANTLR start "rule__Primitive__Group_2__2__Impl"
    // InternalMath.g:860:1: rule__Primitive__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:864:1: ( ( ')' ) )
            // InternalMath.g:865:1: ( ')' )
            {
            // InternalMath.g:865:1: ( ')' )
            // InternalMath.g:866:2: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Primitive__Group_2__2__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // InternalMath.g:876:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:880:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // InternalMath.g:881:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // InternalMath.g:888:1: rule__NumberLiteral__Group__0__Impl : ( ( rule__NumberLiteral__OperatorAssignment_0 )? ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:892:1: ( ( ( rule__NumberLiteral__OperatorAssignment_0 )? ) )
            // InternalMath.g:893:1: ( ( rule__NumberLiteral__OperatorAssignment_0 )? )
            {
            // InternalMath.g:893:1: ( ( rule__NumberLiteral__OperatorAssignment_0 )? )
            // InternalMath.g:894:2: ( rule__NumberLiteral__OperatorAssignment_0 )?
            {
             before(grammarAccess.getNumberLiteralAccess().getOperatorAssignment_0()); 
            // InternalMath.g:895:2: ( rule__NumberLiteral__OperatorAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMath.g:895:3: rule__NumberLiteral__OperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__OperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberLiteralAccess().getOperatorAssignment_0()); 

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
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // InternalMath.g:903:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:907:1: ( rule__NumberLiteral__Group__1__Impl )
            // InternalMath.g:908:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // InternalMath.g:914:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:918:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // InternalMath.g:919:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // InternalMath.g:919:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // InternalMath.g:920:2: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // InternalMath.g:921:2: ( rule__NumberLiteral__ValueAssignment_1 )
            // InternalMath.g:921:3: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalMath.g:930:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:934:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalMath.g:935:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalMath.g:942:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:946:1: ( ( RULE_INT ) )
            // InternalMath.g:947:1: ( RULE_INT )
            {
            // InternalMath.g:947:1: ( RULE_INT )
            // InternalMath.g:948:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalMath.g:957:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:961:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalMath.g:962:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalMath.g:969:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:973:1: ( ( '.' ) )
            // InternalMath.g:974:1: ( '.' )
            {
            // InternalMath.g:974:1: ( '.' )
            // InternalMath.g:975:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__2"
    // InternalMath.g:984:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:988:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalMath.g:989:2: rule__DECIMAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__DECIMAL__Group__2"


    // $ANTLR start "rule__DECIMAL__Group__2__Impl"
    // InternalMath.g:995:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:999:1: ( ( RULE_INT ) )
            // InternalMath.g:1000:1: ( RULE_INT )
            {
            // InternalMath.g:1000:1: ( RULE_INT )
            // InternalMath.g:1001:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DECIMAL__Group__2__Impl"


    // $ANTLR start "rule__Letter__Group__0"
    // InternalMath.g:1011:1: rule__Letter__Group__0 : rule__Letter__Group__0__Impl rule__Letter__Group__1 ;
    public final void rule__Letter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1015:1: ( rule__Letter__Group__0__Impl rule__Letter__Group__1 )
            // InternalMath.g:1016:2: rule__Letter__Group__0__Impl rule__Letter__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Letter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Letter__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Letter__Group__0"


    // $ANTLR start "rule__Letter__Group__0__Impl"
    // InternalMath.g:1023:1: rule__Letter__Group__0__Impl : ( ( rule__Letter__OperatorAssignment_0 )? ) ;
    public final void rule__Letter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1027:1: ( ( ( rule__Letter__OperatorAssignment_0 )? ) )
            // InternalMath.g:1028:1: ( ( rule__Letter__OperatorAssignment_0 )? )
            {
            // InternalMath.g:1028:1: ( ( rule__Letter__OperatorAssignment_0 )? )
            // InternalMath.g:1029:2: ( rule__Letter__OperatorAssignment_0 )?
            {
             before(grammarAccess.getLetterAccess().getOperatorAssignment_0()); 
            // InternalMath.g:1030:2: ( rule__Letter__OperatorAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMath.g:1030:3: rule__Letter__OperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Letter__OperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetterAccess().getOperatorAssignment_0()); 

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
    // $ANTLR end "rule__Letter__Group__0__Impl"


    // $ANTLR start "rule__Letter__Group__1"
    // InternalMath.g:1038:1: rule__Letter__Group__1 : rule__Letter__Group__1__Impl ;
    public final void rule__Letter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1042:1: ( rule__Letter__Group__1__Impl )
            // InternalMath.g:1043:2: rule__Letter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Letter__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Letter__Group__1"


    // $ANTLR start "rule__Letter__Group__1__Impl"
    // InternalMath.g:1049:1: rule__Letter__Group__1__Impl : ( ( rule__Letter__ValueAssignment_1 ) ) ;
    public final void rule__Letter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1053:1: ( ( ( rule__Letter__ValueAssignment_1 ) ) )
            // InternalMath.g:1054:1: ( ( rule__Letter__ValueAssignment_1 ) )
            {
            // InternalMath.g:1054:1: ( ( rule__Letter__ValueAssignment_1 ) )
            // InternalMath.g:1055:2: ( rule__Letter__ValueAssignment_1 )
            {
             before(grammarAccess.getLetterAccess().getValueAssignment_1()); 
            // InternalMath.g:1056:2: ( rule__Letter__ValueAssignment_1 )
            // InternalMath.g:1056:3: rule__Letter__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Letter__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetterAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Letter__Group__1__Impl"


    // $ANTLR start "rule__Model__ExpsAssignment"
    // InternalMath.g:1065:1: rule__Model__ExpsAssignment : ( ruleNamedExpression ) ;
    public final void rule__Model__ExpsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1069:1: ( ( ruleNamedExpression ) )
            // InternalMath.g:1070:2: ( ruleNamedExpression )
            {
            // InternalMath.g:1070:2: ( ruleNamedExpression )
            // InternalMath.g:1071:3: ruleNamedExpression
            {
             before(grammarAccess.getModelAccess().getExpsNamedExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExpsNamedExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ExpsAssignment"


    // $ANTLR start "rule__NamedExpression__NameAssignment_1"
    // InternalMath.g:1080:1: rule__NamedExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1084:1: ( ( RULE_ID ) )
            // InternalMath.g:1085:2: ( RULE_ID )
            {
            // InternalMath.g:1085:2: ( RULE_ID )
            // InternalMath.g:1086:3: RULE_ID
            {
             before(grammarAccess.getNamedExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedExpressionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NamedExpression__NameAssignment_1"


    // $ANTLR start "rule__NamedExpression__ExpAssignment_3"
    // InternalMath.g:1095:1: rule__NamedExpression__ExpAssignment_3 : ( ruleExpression ) ;
    public final void rule__NamedExpression__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1099:1: ( ( ruleExpression ) )
            // InternalMath.g:1100:2: ( ruleExpression )
            {
            // InternalMath.g:1100:2: ( ruleExpression )
            // InternalMath.g:1101:3: ruleExpression
            {
             before(grammarAccess.getNamedExpressionAccess().getExpExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getNamedExpressionAccess().getExpExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__NamedExpression__ExpAssignment_3"


    // $ANTLR start "rule__Expression__OperatorAssignment_1_1"
    // InternalMath.g:1110:1: rule__Expression__OperatorAssignment_1_1 : ( rulePartOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1114:1: ( ( rulePartOperator ) )
            // InternalMath.g:1115:2: ( rulePartOperator )
            {
            // InternalMath.g:1115:2: ( rulePartOperator )
            // InternalMath.g:1116:3: rulePartOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression__OperatorAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalMath.g:1125:1: rule__Expression__RightAssignment_1_2 : ( ruleFactor ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1129:1: ( ( ruleFactor ) )
            // InternalMath.g:1130:2: ( ruleFactor )
            {
            // InternalMath.g:1130:2: ( ruleFactor )
            // InternalMath.g:1131:3: ruleFactor
            {
             before(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__Factor__OperatorAssignment_1_1"
    // InternalMath.g:1140:1: rule__Factor__OperatorAssignment_1_1 : ( ruleFactorOperator ) ;
    public final void rule__Factor__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1144:1: ( ( ruleFactorOperator ) )
            // InternalMath.g:1145:2: ( ruleFactorOperator )
            {
            // InternalMath.g:1145:2: ( ruleFactorOperator )
            // InternalMath.g:1146:3: ruleFactorOperator
            {
             before(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactorOperator();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Factor__OperatorAssignment_1_1"


    // $ANTLR start "rule__Factor__RightAssignment_1_2"
    // InternalMath.g:1155:1: rule__Factor__RightAssignment_1_2 : ( rulePrimitive ) ;
    public final void rule__Factor__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1159:1: ( ( rulePrimitive ) )
            // InternalMath.g:1160:2: ( rulePrimitive )
            {
            // InternalMath.g:1160:2: ( rulePrimitive )
            // InternalMath.g:1161:3: rulePrimitive
            {
             before(grammarAccess.getFactorAccess().getRightPrimitiveParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightPrimitiveParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Factor__RightAssignment_1_2"


    // $ANTLR start "rule__NumberLiteral__OperatorAssignment_0"
    // InternalMath.g:1170:1: rule__NumberLiteral__OperatorAssignment_0 : ( rulePartOperator ) ;
    public final void rule__NumberLiteral__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1174:1: ( ( rulePartOperator ) )
            // InternalMath.g:1175:2: ( rulePartOperator )
            {
            // InternalMath.g:1175:2: ( rulePartOperator )
            // InternalMath.g:1176:3: rulePartOperator
            {
             before(grammarAccess.getNumberLiteralAccess().getOperatorPartOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getOperatorPartOperatorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NumberLiteral__OperatorAssignment_0"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_1"
    // InternalMath.g:1185:1: rule__NumberLiteral__ValueAssignment_1 : ( ruleNumberTypes ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1189:1: ( ( ruleNumberTypes ) )
            // InternalMath.g:1190:2: ( ruleNumberTypes )
            {
            // InternalMath.g:1190:2: ( ruleNumberTypes )
            // InternalMath.g:1191:3: ruleNumberTypes
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNumberTypesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberTypes();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueNumberTypesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_1"


    // $ANTLR start "rule__Letter__OperatorAssignment_0"
    // InternalMath.g:1200:1: rule__Letter__OperatorAssignment_0 : ( rulePartOperator ) ;
    public final void rule__Letter__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1204:1: ( ( rulePartOperator ) )
            // InternalMath.g:1205:2: ( rulePartOperator )
            {
            // InternalMath.g:1205:2: ( rulePartOperator )
            // InternalMath.g:1206:3: rulePartOperator
            {
             before(grammarAccess.getLetterAccess().getOperatorPartOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePartOperator();

            state._fsp--;

             after(grammarAccess.getLetterAccess().getOperatorPartOperatorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Letter__OperatorAssignment_0"


    // $ANTLR start "rule__Letter__ValueAssignment_1"
    // InternalMath.g:1215:1: rule__Letter__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__Letter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1219:1: ( ( RULE_ID ) )
            // InternalMath.g:1220:2: ( RULE_ID )
            {
            // InternalMath.g:1220:2: ( RULE_ID )
            // InternalMath.g:1221:3: RULE_ID
            {
             before(grammarAccess.getLetterAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetterAccess().getValueIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Letter__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000021830L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001820L});

}