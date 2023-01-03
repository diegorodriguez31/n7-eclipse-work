/*
 * generated by Xtext 2.26.0
 */
package fr.n7.parser.antlr;

import com.google.inject.Inject;
import fr.n7.parser.antlr.internal.InternalPDL3Parser;
import fr.n7.services.PDL3GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PDL3Parser extends AbstractAntlrParser {

	@Inject
	private PDL3GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPDL3Parser createParser(XtextTokenStream stream) {
		return new InternalPDL3Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Process";
	}

	public PDL3GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PDL3GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
