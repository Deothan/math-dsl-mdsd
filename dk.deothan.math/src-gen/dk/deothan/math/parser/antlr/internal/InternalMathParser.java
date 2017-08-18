package dk.deothan.math.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.deothan.math.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Expression'", "':'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'.'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
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

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMath.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMath.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMath.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMath.g:71:1: ruleModel returns [EObject current=null] : ( (lv_exps_0_0= ruleNamedExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_exps_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( (lv_exps_0_0= ruleNamedExpression ) )* )
            // InternalMath.g:78:2: ( (lv_exps_0_0= ruleNamedExpression ) )*
            {
            // InternalMath.g:78:2: ( (lv_exps_0_0= ruleNamedExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:79:3: (lv_exps_0_0= ruleNamedExpression )
            	    {
            	    // InternalMath.g:79:3: (lv_exps_0_0= ruleNamedExpression )
            	    // InternalMath.g:80:4: lv_exps_0_0= ruleNamedExpression
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getExpsNamedExpressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_exps_0_0=ruleNamedExpression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"exps",
            	    					lv_exps_0_0,
            	    					"dk.deothan.math.Math.NamedExpression");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleNamedExpression"
    // InternalMath.g:100:1: entryRuleNamedExpression returns [EObject current=null] : iv_ruleNamedExpression= ruleNamedExpression EOF ;
    public final EObject entryRuleNamedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedExpression = null;


        try {
            // InternalMath.g:100:56: (iv_ruleNamedExpression= ruleNamedExpression EOF )
            // InternalMath.g:101:2: iv_ruleNamedExpression= ruleNamedExpression EOF
            {
             newCompositeNode(grammarAccess.getNamedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedExpression=ruleNamedExpression();

            state._fsp--;

             current =iv_ruleNamedExpression; 
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
    // $ANTLR end "entryRuleNamedExpression"


    // $ANTLR start "ruleNamedExpression"
    // InternalMath.g:107:1: ruleNamedExpression returns [EObject current=null] : (otherlv_0= 'Expression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExpression ) ) ) ;
    public final EObject ruleNamedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:113:2: ( (otherlv_0= 'Expression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExpression ) ) ) )
            // InternalMath.g:114:2: (otherlv_0= 'Expression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExpression ) ) )
            {
            // InternalMath.g:114:2: (otherlv_0= 'Expression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExpression ) ) )
            // InternalMath.g:115:3: otherlv_0= 'Expression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNamedExpressionAccess().getExpressionKeyword_0());
            		
            // InternalMath.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNamedExpressionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedExpressionAccess().getColonKeyword_2());
            		
            // InternalMath.g:141:3: ( (lv_exp_3_0= ruleExpression ) )
            // InternalMath.g:142:4: (lv_exp_3_0= ruleExpression )
            {
            // InternalMath.g:142:4: (lv_exp_3_0= ruleExpression )
            // InternalMath.g:143:5: lv_exp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNamedExpressionAccess().getExpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedExpressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.deothan.math.Math.Expression");
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
    // $ANTLR end "ruleNamedExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalMath.g:164:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMath.g:164:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMath.g:165:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMath.g:171:1: ruleExpression returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:177:2: ( (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) )
            // InternalMath.g:178:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:178:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            // InternalMath.g:179:3: this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:187:3: ( () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:188:4: () ( (lv_operator_2_0= rulePartOperator ) ) ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:188:4: ()
            	    // InternalMath.g:189:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getPartLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMath.g:195:4: ( (lv_operator_2_0= rulePartOperator ) )
            	    // InternalMath.g:196:5: (lv_operator_2_0= rulePartOperator )
            	    {
            	    // InternalMath.g:196:5: (lv_operator_2_0= rulePartOperator )
            	    // InternalMath.g:197:6: lv_operator_2_0= rulePartOperator
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getOperatorPartOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operator_2_0=rulePartOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.deothan.math.Math.PartOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMath.g:214:4: ( (lv_right_3_0= ruleFactor ) )
            	    // InternalMath.g:215:5: (lv_right_3_0= ruleFactor )
            	    {
            	    // InternalMath.g:215:5: (lv_right_3_0= ruleFactor )
            	    // InternalMath.g:216:6: lv_right_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.deothan.math.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:238:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:238:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:239:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:245:1: ruleFactor returns [EObject current=null] : (this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:251:2: ( (this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )* ) )
            // InternalMath.g:252:2: (this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )* )
            {
            // InternalMath.g:252:2: (this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )* )
            // InternalMath.g:253:3: this_Primitive_0= rulePrimitive ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primitive_0=rulePrimitive();

            state._fsp--;


            			current = this_Primitive_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:261:3: ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimitive ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMath.g:262:4: () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_right_3_0= rulePrimitive ) )
            	    {
            	    // InternalMath.g:262:4: ()
            	    // InternalMath.g:263:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getFactorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMath.g:269:4: ( (lv_operator_2_0= ruleFactorOperator ) )
            	    // InternalMath.g:270:5: (lv_operator_2_0= ruleFactorOperator )
            	    {
            	    // InternalMath.g:270:5: (lv_operator_2_0= ruleFactorOperator )
            	    // InternalMath.g:271:6: lv_operator_2_0= ruleFactorOperator
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getOperatorFactorOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operator_2_0=ruleFactorOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.deothan.math.Math.FactorOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMath.g:288:4: ( (lv_right_3_0= rulePrimitive ) )
            	    // InternalMath.g:289:5: (lv_right_3_0= rulePrimitive )
            	    {
            	    // InternalMath.g:289:5: (lv_right_3_0= rulePrimitive )
            	    // InternalMath.g:290:6: lv_right_3_0= rulePrimitive
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimitiveParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=rulePrimitive();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.deothan.math.Math.Primitive");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimitive"
    // InternalMath.g:312:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalMath.g:312:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalMath.g:313:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalMath.g:319:1: rulePrimitive returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_NumberLiteral_0 = null;

        EObject this_Letter_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalMath.g:325:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalMath.g:326:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalMath.g:326:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Letter_1= ruleLetter | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_INT) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_ID) ) {
                    alt4=2;
                }
                else if ( (LA4_2==RULE_INT) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMath.g:327:3: this_NumberLiteral_0= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getNumberLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:336:3: this_Letter_1= ruleLetter
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getLetterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Letter_1=ruleLetter();

                    state._fsp--;


                    			current = this_Letter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:345:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalMath.g:345:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalMath.g:346:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRulePartOperator"
    // InternalMath.g:367:1: entryRulePartOperator returns [String current=null] : iv_rulePartOperator= rulePartOperator EOF ;
    public final String entryRulePartOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePartOperator = null;


        try {
            // InternalMath.g:367:52: (iv_rulePartOperator= rulePartOperator EOF )
            // InternalMath.g:368:2: iv_rulePartOperator= rulePartOperator EOF
            {
             newCompositeNode(grammarAccess.getPartOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartOperator=rulePartOperator();

            state._fsp--;

             current =iv_rulePartOperator.getText(); 
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
    // $ANTLR end "entryRulePartOperator"


    // $ANTLR start "rulePartOperator"
    // InternalMath.g:374:1: rulePartOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulePartOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMath.g:380:2: ( (kw= '+' | kw= '-' ) )
            // InternalMath.g:381:2: (kw= '+' | kw= '-' )
            {
            // InternalMath.g:381:2: (kw= '+' | kw= '-' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMath.g:382:3: kw= '+'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPartOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:388:3: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPartOperatorAccess().getHyphenMinusKeyword_1());
                    		

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
    // $ANTLR end "rulePartOperator"


    // $ANTLR start "entryRuleFactorOperator"
    // InternalMath.g:397:1: entryRuleFactorOperator returns [String current=null] : iv_ruleFactorOperator= ruleFactorOperator EOF ;
    public final String entryRuleFactorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFactorOperator = null;


        try {
            // InternalMath.g:397:54: (iv_ruleFactorOperator= ruleFactorOperator EOF )
            // InternalMath.g:398:2: iv_ruleFactorOperator= ruleFactorOperator EOF
            {
             newCompositeNode(grammarAccess.getFactorOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactorOperator=ruleFactorOperator();

            state._fsp--;

             current =iv_ruleFactorOperator.getText(); 
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
    // $ANTLR end "entryRuleFactorOperator"


    // $ANTLR start "ruleFactorOperator"
    // InternalMath.g:404:1: ruleFactorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleFactorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMath.g:410:2: ( (kw= '*' | kw= '/' ) )
            // InternalMath.g:411:2: (kw= '*' | kw= '/' )
            {
            // InternalMath.g:411:2: (kw= '*' | kw= '/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMath.g:412:3: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFactorOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:418:3: kw= '/'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFactorOperatorAccess().getSolidusKeyword_1());
                    		

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
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMath.g:427:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMath.g:427:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMath.g:428:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMath.g:434:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:440:2: ( ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) ) )
            // InternalMath.g:441:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) )
            {
            // InternalMath.g:441:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) ) )
            // InternalMath.g:442:3: ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= ruleNumberTypes ) )
            {
            // InternalMath.g:442:3: ( (lv_operator_0_0= rulePartOperator ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=15 && LA7_0<=16)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMath.g:443:4: (lv_operator_0_0= rulePartOperator )
                    {
                    // InternalMath.g:443:4: (lv_operator_0_0= rulePartOperator )
                    // InternalMath.g:444:5: lv_operator_0_0= rulePartOperator
                    {

                    					newCompositeNode(grammarAccess.getNumberLiteralAccess().getOperatorPartOperatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_operator_0_0=rulePartOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
                    					}
                    					set(
                    						current,
                    						"operator",
                    						lv_operator_0_0,
                    						"dk.deothan.math.Math.PartOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:461:3: ( (lv_value_1_0= ruleNumberTypes ) )
            // InternalMath.g:462:4: (lv_value_1_0= ruleNumberTypes )
            {
            // InternalMath.g:462:4: (lv_value_1_0= ruleNumberTypes )
            // InternalMath.g:463:5: lv_value_1_0= ruleNumberTypes
            {

            					newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberTypesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleNumberTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.deothan.math.Math.NumberTypes");
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalMath.g:484:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalMath.g:484:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalMath.g:485:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalMath.g:491:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMath.g:497:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMath.g:498:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMath.g:498:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMath.g:499:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,19,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleNumberTypes"
    // InternalMath.g:522:1: entryRuleNumberTypes returns [String current=null] : iv_ruleNumberTypes= ruleNumberTypes EOF ;
    public final String entryRuleNumberTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberTypes = null;


        try {
            // InternalMath.g:522:51: (iv_ruleNumberTypes= ruleNumberTypes EOF )
            // InternalMath.g:523:2: iv_ruleNumberTypes= ruleNumberTypes EOF
            {
             newCompositeNode(grammarAccess.getNumberTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberTypes=ruleNumberTypes();

            state._fsp--;

             current =iv_ruleNumberTypes.getText(); 
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
    // $ANTLR end "entryRuleNumberTypes"


    // $ANTLR start "ruleNumberTypes"
    // InternalMath.g:529:1: ruleNumberTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumberTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_DECIMAL_0 = null;



        	enterRule();

        try {
            // InternalMath.g:535:2: ( (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT ) )
            // InternalMath.g:536:2: (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT )
            {
            // InternalMath.g:536:2: (this_DECIMAL_0= ruleDECIMAL | this_INT_1= RULE_INT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==11||(LA8_1>=14 && LA8_1<=18)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==19) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMath.g:537:3: this_DECIMAL_0= ruleDECIMAL
                    {

                    			newCompositeNode(grammarAccess.getNumberTypesAccess().getDECIMALParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DECIMAL_0=ruleDECIMAL();

                    state._fsp--;


                    			current.merge(this_DECIMAL_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:548:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getNumberTypesAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleNumberTypes"


    // $ANTLR start "entryRuleLetter"
    // InternalMath.g:559:1: entryRuleLetter returns [EObject current=null] : iv_ruleLetter= ruleLetter EOF ;
    public final EObject entryRuleLetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetter = null;


        try {
            // InternalMath.g:559:47: (iv_ruleLetter= ruleLetter EOF )
            // InternalMath.g:560:2: iv_ruleLetter= ruleLetter EOF
            {
             newCompositeNode(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetter=ruleLetter();

            state._fsp--;

             current =iv_ruleLetter; 
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
    // $ANTLR end "entryRuleLetter"


    // $ANTLR start "ruleLetter"
    // InternalMath.g:566:1: ruleLetter returns [EObject current=null] : ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLetter() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:572:2: ( ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) ) ) )
            // InternalMath.g:573:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) ) )
            {
            // InternalMath.g:573:2: ( ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) ) )
            // InternalMath.g:574:3: ( (lv_operator_0_0= rulePartOperator ) )? ( (lv_value_1_0= RULE_ID ) )
            {
            // InternalMath.g:574:3: ( (lv_operator_0_0= rulePartOperator ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=15 && LA9_0<=16)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMath.g:575:4: (lv_operator_0_0= rulePartOperator )
                    {
                    // InternalMath.g:575:4: (lv_operator_0_0= rulePartOperator )
                    // InternalMath.g:576:5: lv_operator_0_0= rulePartOperator
                    {

                    					newCompositeNode(grammarAccess.getLetterAccess().getOperatorPartOperatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_operator_0_0=rulePartOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLetterRule());
                    					}
                    					set(
                    						current,
                    						"operator",
                    						lv_operator_0_0,
                    						"dk.deothan.math.Math.PartOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:593:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalMath.g:594:4: (lv_value_1_0= RULE_ID )
            {
            // InternalMath.g:594:4: (lv_value_1_0= RULE_ID )
            // InternalMath.g:595:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getLetterAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleLetter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001A030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});

}