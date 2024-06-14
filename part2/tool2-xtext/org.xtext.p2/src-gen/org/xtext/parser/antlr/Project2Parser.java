/*
 * generated by Xtext 2.25.0
 */
package org.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.parser.antlr.internal.InternalProject2Parser;
import org.xtext.services.Project2GrammarAccess;

public class Project2Parser extends AbstractAntlrParser {

	@Inject
	private Project2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalProject2Parser createParser(XtextTokenStream stream) {
		return new InternalProject2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public Project2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Project2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
