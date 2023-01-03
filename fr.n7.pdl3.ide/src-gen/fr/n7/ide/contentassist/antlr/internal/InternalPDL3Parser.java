package fr.n7.ide.contentassist.antlr.internal;

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
import fr.n7.services.PDL3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "':'", "'workdefinitions'", "';'", "'worksequences'"
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


        public InternalPDL3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL3.g"; }


    	private PDL3GrammarAccess grammarAccess;

    	public void setGrammarAccess(PDL3GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDL3.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL3.g:54:1: ( ruleProcess EOF )
            // InternalPDL3.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL3.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL3.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL3.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL3.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL3.g:78:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL3.g:79:1: ( ruleWorkDefinition EOF )
            // InternalPDL3.g:80:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL3.g:87:1: ruleWorkDefinition : ( ( rule__WorkDefinition__NameAssignment ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:91:2: ( ( ( rule__WorkDefinition__NameAssignment ) ) )
            // InternalPDL3.g:92:2: ( ( rule__WorkDefinition__NameAssignment ) )
            {
            // InternalPDL3.g:92:2: ( ( rule__WorkDefinition__NameAssignment ) )
            // InternalPDL3.g:93:3: ( rule__WorkDefinition__NameAssignment )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment()); 
            // InternalPDL3.g:94:3: ( rule__WorkDefinition__NameAssignment )
            // InternalPDL3.g:94:4: rule__WorkDefinition__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL3.g:103:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL3.g:104:1: ( ruleWorkSequence EOF )
            // InternalPDL3.g:105:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL3.g:112:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:116:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL3.g:117:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL3.g:117:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL3.g:118:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL3.g:119:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL3.g:119:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL3.g:128:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:132:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL3.g:133:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL3.g:133:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL3.g:134:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL3.g:135:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL3.g:135:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL3.g:143:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:147:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
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
                    // InternalPDL3.g:148:2: ( ( 's2s' ) )
                    {
                    // InternalPDL3.g:148:2: ( ( 's2s' ) )
                    // InternalPDL3.g:149:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                    // InternalPDL3.g:150:3: ( 's2s' )
                    // InternalPDL3.g:150:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL3.g:154:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL3.g:154:2: ( ( 'f2s' ) )
                    // InternalPDL3.g:155:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                    // InternalPDL3.g:156:3: ( 'f2s' )
                    // InternalPDL3.g:156:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL3.g:160:2: ( ( 's2f' ) )
                    {
                    // InternalPDL3.g:160:2: ( ( 's2f' ) )
                    // InternalPDL3.g:161:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                    // InternalPDL3.g:162:3: ( 's2f' )
                    // InternalPDL3.g:162:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL3.g:166:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL3.g:166:2: ( ( 'f2f' ) )
                    // InternalPDL3.g:167:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                    // InternalPDL3.g:168:3: ( 'f2f' )
                    // InternalPDL3.g:168:4: 'f2f'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL3.g:176:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:180:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL3.g:181:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL3.g:188:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:192:1: ( ( 'process' ) )
            // InternalPDL3.g:193:1: ( 'process' )
            {
            // InternalPDL3.g:193:1: ( 'process' )
            // InternalPDL3.g:194:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL3.g:203:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:207:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL3.g:208:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL3.g:215:1: rule__Process__Group__1__Impl : ( ':' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:219:1: ( ( ':' ) )
            // InternalPDL3.g:220:1: ( ':' )
            {
            // InternalPDL3.g:220:1: ( ':' )
            // InternalPDL3.g:221:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL3.g:230:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:234:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL3.g:235:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL3.g:242:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:246:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL3.g:247:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL3.g:247:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL3.g:248:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL3.g:249:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL3.g:249:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL3.g:257:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:261:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL3.g:262:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL3.g:269:1: rule__Process__Group__3__Impl : ( 'workdefinitions' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:273:1: ( ( 'workdefinitions' ) )
            // InternalPDL3.g:274:1: ( 'workdefinitions' )
            {
            // InternalPDL3.g:274:1: ( 'workdefinitions' )
            // InternalPDL3.g:275:2: 'workdefinitions'
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL3.g:284:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:288:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL3.g:289:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL3.g:296:1: rule__Process__Group__4__Impl : ( ':' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:300:1: ( ( ':' ) )
            // InternalPDL3.g:301:1: ( ':' )
            {
            // InternalPDL3.g:301:1: ( ':' )
            // InternalPDL3.g:302:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL3.g:311:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:315:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalPDL3.g:316:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

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
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL3.g:323:1: rule__Process__Group__5__Impl : ( ( rule__Process__ProcessElementsAssignment_5 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:327:1: ( ( ( rule__Process__ProcessElementsAssignment_5 ) ) )
            // InternalPDL3.g:328:1: ( ( rule__Process__ProcessElementsAssignment_5 ) )
            {
            // InternalPDL3.g:328:1: ( ( rule__Process__ProcessElementsAssignment_5 ) )
            // InternalPDL3.g:329:2: ( rule__Process__ProcessElementsAssignment_5 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_5()); 
            // InternalPDL3.g:330:2: ( rule__Process__ProcessElementsAssignment_5 )
            // InternalPDL3.g:330:3: rule__Process__ProcessElementsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_5()); 

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
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalPDL3.g:338:1: rule__Process__Group__6 : rule__Process__Group__6__Impl rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:342:1: ( rule__Process__Group__6__Impl rule__Process__Group__7 )
            // InternalPDL3.g:343:2: rule__Process__Group__6__Impl rule__Process__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__7();

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
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalPDL3.g:350:1: rule__Process__Group__6__Impl : ( ( rule__Process__Group_6__0 )* ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:354:1: ( ( ( rule__Process__Group_6__0 )* ) )
            // InternalPDL3.g:355:1: ( ( rule__Process__Group_6__0 )* )
            {
            // InternalPDL3.g:355:1: ( ( rule__Process__Group_6__0 )* )
            // InternalPDL3.g:356:2: ( rule__Process__Group_6__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_6()); 
            // InternalPDL3.g:357:2: ( rule__Process__Group_6__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalPDL3.g:357:3: rule__Process__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group__7"
    // InternalPDL3.g:365:1: rule__Process__Group__7 : rule__Process__Group__7__Impl rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:369:1: ( rule__Process__Group__7__Impl rule__Process__Group__8 )
            // InternalPDL3.g:370:2: rule__Process__Group__7__Impl rule__Process__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__8();

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
    // $ANTLR end "rule__Process__Group__7"


    // $ANTLR start "rule__Process__Group__7__Impl"
    // InternalPDL3.g:377:1: rule__Process__Group__7__Impl : ( ';' ) ;
    public final void rule__Process__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:381:1: ( ( ';' ) )
            // InternalPDL3.g:382:1: ( ';' )
            {
            // InternalPDL3.g:382:1: ( ';' )
            // InternalPDL3.g:383:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__Process__Group__7__Impl"


    // $ANTLR start "rule__Process__Group__8"
    // InternalPDL3.g:392:1: rule__Process__Group__8 : rule__Process__Group__8__Impl rule__Process__Group__9 ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:396:1: ( rule__Process__Group__8__Impl rule__Process__Group__9 )
            // InternalPDL3.g:397:2: rule__Process__Group__8__Impl rule__Process__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__9();

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
    // $ANTLR end "rule__Process__Group__8"


    // $ANTLR start "rule__Process__Group__8__Impl"
    // InternalPDL3.g:404:1: rule__Process__Group__8__Impl : ( 'worksequences' ) ;
    public final void rule__Process__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:408:1: ( ( 'worksequences' ) )
            // InternalPDL3.g:409:1: ( 'worksequences' )
            {
            // InternalPDL3.g:409:1: ( 'worksequences' )
            // InternalPDL3.g:410:2: 'worksequences'
            {
             before(grammarAccess.getProcessAccess().getWorksequencesKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorksequencesKeyword_8()); 

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
    // $ANTLR end "rule__Process__Group__8__Impl"


    // $ANTLR start "rule__Process__Group__9"
    // InternalPDL3.g:419:1: rule__Process__Group__9 : rule__Process__Group__9__Impl rule__Process__Group__10 ;
    public final void rule__Process__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:423:1: ( rule__Process__Group__9__Impl rule__Process__Group__10 )
            // InternalPDL3.g:424:2: rule__Process__Group__9__Impl rule__Process__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__10();

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
    // $ANTLR end "rule__Process__Group__9"


    // $ANTLR start "rule__Process__Group__9__Impl"
    // InternalPDL3.g:431:1: rule__Process__Group__9__Impl : ( ':' ) ;
    public final void rule__Process__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:435:1: ( ( ':' ) )
            // InternalPDL3.g:436:1: ( ':' )
            {
            // InternalPDL3.g:436:1: ( ':' )
            // InternalPDL3.g:437:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_9()); 

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
    // $ANTLR end "rule__Process__Group__9__Impl"


    // $ANTLR start "rule__Process__Group__10"
    // InternalPDL3.g:446:1: rule__Process__Group__10 : rule__Process__Group__10__Impl rule__Process__Group__11 ;
    public final void rule__Process__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:450:1: ( rule__Process__Group__10__Impl rule__Process__Group__11 )
            // InternalPDL3.g:451:2: rule__Process__Group__10__Impl rule__Process__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__11();

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
    // $ANTLR end "rule__Process__Group__10"


    // $ANTLR start "rule__Process__Group__10__Impl"
    // InternalPDL3.g:458:1: rule__Process__Group__10__Impl : ( ( rule__Process__ProcessElementsAssignment_10 ) ) ;
    public final void rule__Process__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:462:1: ( ( ( rule__Process__ProcessElementsAssignment_10 ) ) )
            // InternalPDL3.g:463:1: ( ( rule__Process__ProcessElementsAssignment_10 ) )
            {
            // InternalPDL3.g:463:1: ( ( rule__Process__ProcessElementsAssignment_10 ) )
            // InternalPDL3.g:464:2: ( rule__Process__ProcessElementsAssignment_10 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_10()); 
            // InternalPDL3.g:465:2: ( rule__Process__ProcessElementsAssignment_10 )
            // InternalPDL3.g:465:3: rule__Process__ProcessElementsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_10()); 

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
    // $ANTLR end "rule__Process__Group__10__Impl"


    // $ANTLR start "rule__Process__Group__11"
    // InternalPDL3.g:473:1: rule__Process__Group__11 : rule__Process__Group__11__Impl rule__Process__Group__12 ;
    public final void rule__Process__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:477:1: ( rule__Process__Group__11__Impl rule__Process__Group__12 )
            // InternalPDL3.g:478:2: rule__Process__Group__11__Impl rule__Process__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__12();

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
    // $ANTLR end "rule__Process__Group__11"


    // $ANTLR start "rule__Process__Group__11__Impl"
    // InternalPDL3.g:485:1: rule__Process__Group__11__Impl : ( ( rule__Process__Group_11__0 )* ) ;
    public final void rule__Process__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:489:1: ( ( ( rule__Process__Group_11__0 )* ) )
            // InternalPDL3.g:490:1: ( ( rule__Process__Group_11__0 )* )
            {
            // InternalPDL3.g:490:1: ( ( rule__Process__Group_11__0 )* )
            // InternalPDL3.g:491:2: ( rule__Process__Group_11__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_11()); 
            // InternalPDL3.g:492:2: ( rule__Process__Group_11__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==RULE_ID) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL3.g:492:3: rule__Process__Group_11__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Process__Group__11__Impl"


    // $ANTLR start "rule__Process__Group__12"
    // InternalPDL3.g:500:1: rule__Process__Group__12 : rule__Process__Group__12__Impl ;
    public final void rule__Process__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:504:1: ( rule__Process__Group__12__Impl )
            // InternalPDL3.g:505:2: rule__Process__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__12__Impl();

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
    // $ANTLR end "rule__Process__Group__12"


    // $ANTLR start "rule__Process__Group__12__Impl"
    // InternalPDL3.g:511:1: rule__Process__Group__12__Impl : ( ';' ) ;
    public final void rule__Process__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:515:1: ( ( ';' ) )
            // InternalPDL3.g:516:1: ( ';' )
            {
            // InternalPDL3.g:516:1: ( ';' )
            // InternalPDL3.g:517:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_12()); 

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
    // $ANTLR end "rule__Process__Group__12__Impl"


    // $ANTLR start "rule__Process__Group_6__0"
    // InternalPDL3.g:527:1: rule__Process__Group_6__0 : rule__Process__Group_6__0__Impl rule__Process__Group_6__1 ;
    public final void rule__Process__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:531:1: ( rule__Process__Group_6__0__Impl rule__Process__Group_6__1 )
            // InternalPDL3.g:532:2: rule__Process__Group_6__0__Impl rule__Process__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1();

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
    // $ANTLR end "rule__Process__Group_6__0"


    // $ANTLR start "rule__Process__Group_6__0__Impl"
    // InternalPDL3.g:539:1: rule__Process__Group_6__0__Impl : ( ';' ) ;
    public final void rule__Process__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:543:1: ( ( ';' ) )
            // InternalPDL3.g:544:1: ( ';' )
            {
            // InternalPDL3.g:544:1: ( ';' )
            // InternalPDL3.g:545:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_6_0()); 

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
    // $ANTLR end "rule__Process__Group_6__0__Impl"


    // $ANTLR start "rule__Process__Group_6__1"
    // InternalPDL3.g:554:1: rule__Process__Group_6__1 : rule__Process__Group_6__1__Impl ;
    public final void rule__Process__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:558:1: ( rule__Process__Group_6__1__Impl )
            // InternalPDL3.g:559:2: rule__Process__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1__Impl();

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
    // $ANTLR end "rule__Process__Group_6__1"


    // $ANTLR start "rule__Process__Group_6__1__Impl"
    // InternalPDL3.g:565:1: rule__Process__Group_6__1__Impl : ( ( rule__Process__ProcessElementsAssignment_6_1 ) ) ;
    public final void rule__Process__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:569:1: ( ( ( rule__Process__ProcessElementsAssignment_6_1 ) ) )
            // InternalPDL3.g:570:1: ( ( rule__Process__ProcessElementsAssignment_6_1 ) )
            {
            // InternalPDL3.g:570:1: ( ( rule__Process__ProcessElementsAssignment_6_1 ) )
            // InternalPDL3.g:571:2: ( rule__Process__ProcessElementsAssignment_6_1 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_6_1()); 
            // InternalPDL3.g:572:2: ( rule__Process__ProcessElementsAssignment_6_1 )
            // InternalPDL3.g:572:3: rule__Process__ProcessElementsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_6_1()); 

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
    // $ANTLR end "rule__Process__Group_6__1__Impl"


    // $ANTLR start "rule__Process__Group_11__0"
    // InternalPDL3.g:581:1: rule__Process__Group_11__0 : rule__Process__Group_11__0__Impl rule__Process__Group_11__1 ;
    public final void rule__Process__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:585:1: ( rule__Process__Group_11__0__Impl rule__Process__Group_11__1 )
            // InternalPDL3.g:586:2: rule__Process__Group_11__0__Impl rule__Process__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_11__1();

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
    // $ANTLR end "rule__Process__Group_11__0"


    // $ANTLR start "rule__Process__Group_11__0__Impl"
    // InternalPDL3.g:593:1: rule__Process__Group_11__0__Impl : ( ';' ) ;
    public final void rule__Process__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:597:1: ( ( ';' ) )
            // InternalPDL3.g:598:1: ( ';' )
            {
            // InternalPDL3.g:598:1: ( ';' )
            // InternalPDL3.g:599:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_11_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_11_0()); 

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
    // $ANTLR end "rule__Process__Group_11__0__Impl"


    // $ANTLR start "rule__Process__Group_11__1"
    // InternalPDL3.g:608:1: rule__Process__Group_11__1 : rule__Process__Group_11__1__Impl ;
    public final void rule__Process__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:612:1: ( rule__Process__Group_11__1__Impl )
            // InternalPDL3.g:613:2: rule__Process__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_11__1__Impl();

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
    // $ANTLR end "rule__Process__Group_11__1"


    // $ANTLR start "rule__Process__Group_11__1__Impl"
    // InternalPDL3.g:619:1: rule__Process__Group_11__1__Impl : ( ( rule__Process__ProcessElementsAssignment_11_1 ) ) ;
    public final void rule__Process__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:623:1: ( ( ( rule__Process__ProcessElementsAssignment_11_1 ) ) )
            // InternalPDL3.g:624:1: ( ( rule__Process__ProcessElementsAssignment_11_1 ) )
            {
            // InternalPDL3.g:624:1: ( ( rule__Process__ProcessElementsAssignment_11_1 ) )
            // InternalPDL3.g:625:2: ( rule__Process__ProcessElementsAssignment_11_1 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_11_1()); 
            // InternalPDL3.g:626:2: ( rule__Process__ProcessElementsAssignment_11_1 )
            // InternalPDL3.g:626:3: rule__Process__ProcessElementsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_11_1()); 

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
    // $ANTLR end "rule__Process__Group_11__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL3.g:635:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:639:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL3.g:640:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

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
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL3.g:647:1: rule__WorkSequence__Group__0__Impl : ( ( rule__WorkSequence__PredecessorAssignment_0 ) ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:651:1: ( ( ( rule__WorkSequence__PredecessorAssignment_0 ) ) )
            // InternalPDL3.g:652:1: ( ( rule__WorkSequence__PredecessorAssignment_0 ) )
            {
            // InternalPDL3.g:652:1: ( ( rule__WorkSequence__PredecessorAssignment_0 ) )
            // InternalPDL3.g:653:2: ( rule__WorkSequence__PredecessorAssignment_0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_0()); 
            // InternalPDL3.g:654:2: ( rule__WorkSequence__PredecessorAssignment_0 )
            // InternalPDL3.g:654:3: rule__WorkSequence__PredecessorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL3.g:662:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:666:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL3.g:667:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

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
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL3.g:674:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:678:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL3.g:679:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL3.g:679:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL3.g:680:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL3.g:681:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL3.g:681:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL3.g:689:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:693:1: ( rule__WorkSequence__Group__2__Impl )
            // InternalPDL3.g:694:2: rule__WorkSequence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL3.g:700:1: rule__WorkSequence__Group__2__Impl : ( ( rule__WorkSequence__SuccessorAssignment_2 ) ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:704:1: ( ( ( rule__WorkSequence__SuccessorAssignment_2 ) ) )
            // InternalPDL3.g:705:1: ( ( rule__WorkSequence__SuccessorAssignment_2 ) )
            {
            // InternalPDL3.g:705:1: ( ( rule__WorkSequence__SuccessorAssignment_2 ) )
            // InternalPDL3.g:706:2: ( rule__WorkSequence__SuccessorAssignment_2 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_2()); 
            // InternalPDL3.g:707:2: ( rule__WorkSequence__SuccessorAssignment_2 )
            // InternalPDL3.g:707:3: rule__WorkSequence__SuccessorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalPDL3.g:716:1: rule__Process__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:720:1: ( ( RULE_ID ) )
            // InternalPDL3.g:721:2: ( RULE_ID )
            {
            // InternalPDL3.g:721:2: ( RULE_ID )
            // InternalPDL3.g:722:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_5"
    // InternalPDL3.g:731:1: rule__Process__ProcessElementsAssignment_5 : ( ruleWorkDefinition ) ;
    public final void rule__Process__ProcessElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:735:1: ( ( ruleWorkDefinition ) )
            // InternalPDL3.g:736:2: ( ruleWorkDefinition )
            {
            // InternalPDL3.g:736:2: ( ruleWorkDefinition )
            // InternalPDL3.g:737:3: ruleWorkDefinition
            {
             before(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_5"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_6_1"
    // InternalPDL3.g:746:1: rule__Process__ProcessElementsAssignment_6_1 : ( ruleWorkDefinition ) ;
    public final void rule__Process__ProcessElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:750:1: ( ( ruleWorkDefinition ) )
            // InternalPDL3.g:751:2: ( ruleWorkDefinition )
            {
            // InternalPDL3.g:751:2: ( ruleWorkDefinition )
            // InternalPDL3.g:752:3: ruleWorkDefinition
            {
             before(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_6_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_10"
    // InternalPDL3.g:761:1: rule__Process__ProcessElementsAssignment_10 : ( ruleWorkSequence ) ;
    public final void rule__Process__ProcessElementsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:765:1: ( ( ruleWorkSequence ) )
            // InternalPDL3.g:766:2: ( ruleWorkSequence )
            {
            // InternalPDL3.g:766:2: ( ruleWorkSequence )
            // InternalPDL3.g:767:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getProcessElementsWorkSequenceParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsWorkSequenceParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_10"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_11_1"
    // InternalPDL3.g:776:1: rule__Process__ProcessElementsAssignment_11_1 : ( ruleWorkSequence ) ;
    public final void rule__Process__ProcessElementsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:780:1: ( ( ruleWorkSequence ) )
            // InternalPDL3.g:781:2: ( ruleWorkSequence )
            {
            // InternalPDL3.g:781:2: ( ruleWorkSequence )
            // InternalPDL3.g:782:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getProcessElementsWorkSequenceParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsWorkSequenceParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_11_1"


    // $ANTLR start "rule__WorkDefinition__NameAssignment"
    // InternalPDL3.g:791:1: rule__WorkDefinition__NameAssignment : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:795:1: ( ( RULE_ID ) )
            // InternalPDL3.g:796:2: ( RULE_ID )
            {
            // InternalPDL3.g:796:2: ( RULE_ID )
            // InternalPDL3.g:797:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_0"
    // InternalPDL3.g:806:1: rule__WorkSequence__PredecessorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:810:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:811:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:811:2: ( ( RULE_ID ) )
            // InternalPDL3.g:812:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 
            // InternalPDL3.g:813:3: ( RULE_ID )
            // InternalPDL3.g:814:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_0"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL3.g:825:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:829:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL3.g:830:2: ( ruleWorkSequenceType )
            {
            // InternalPDL3.g:830:2: ( ruleWorkSequenceType )
            // InternalPDL3.g:831:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_2"
    // InternalPDL3.g:840:1: rule__WorkSequence__SuccessorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:844:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:845:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:845:2: ( ( RULE_ID ) )
            // InternalPDL3.g:846:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0()); 
            // InternalPDL3.g:847:3: ( RULE_ID )
            // InternalPDL3.g:848:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007800L});

}