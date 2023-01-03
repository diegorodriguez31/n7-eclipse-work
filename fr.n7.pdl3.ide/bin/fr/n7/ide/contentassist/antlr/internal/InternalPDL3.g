/*
 * generated by Xtext 2.26.0
 */
grammar InternalPDL3;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.n7.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleProcess
entryRuleProcess
:
{ before(grammarAccess.getProcessRule()); }
	 ruleProcess
{ after(grammarAccess.getProcessRule()); } 
	 EOF 
;

// Rule Process
ruleProcess 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProcessAccess().getGroup()); }
		(rule__Process__Group__0)
		{ after(grammarAccess.getProcessAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWorkDefinition
entryRuleWorkDefinition
:
{ before(grammarAccess.getWorkDefinitionRule()); }
	 ruleWorkDefinition
{ after(grammarAccess.getWorkDefinitionRule()); } 
	 EOF 
;

// Rule WorkDefinition
ruleWorkDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWorkDefinitionAccess().getNameAssignment()); }
		(rule__WorkDefinition__NameAssignment)
		{ after(grammarAccess.getWorkDefinitionAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWorkSequence
entryRuleWorkSequence
:
{ before(grammarAccess.getWorkSequenceRule()); }
	 ruleWorkSequence
{ after(grammarAccess.getWorkSequenceRule()); } 
	 EOF 
;

// Rule WorkSequence
ruleWorkSequence 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getGroup()); }
		(rule__WorkSequence__Group__0)
		{ after(grammarAccess.getWorkSequenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule WorkSequenceType
ruleWorkSequenceType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); }
		(rule__WorkSequenceType__Alternatives)
		{ after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequenceType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); }
		('s2s')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); }
		('f2s')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); }
		('s2f')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); }
		('f2f')
		{ after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__0__Impl
	rule__Process__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getProcessKeyword_0()); }
	'process'
	{ after(grammarAccess.getProcessAccess().getProcessKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__1__Impl
	rule__Process__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getProcessAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__2__Impl
	rule__Process__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getNameAssignment_2()); }
	(rule__Process__NameAssignment_2)
	{ after(grammarAccess.getProcessAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__3__Impl
	rule__Process__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3()); }
	'workdefinitions'
	{ after(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__4__Impl
	rule__Process__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getColonKeyword_4()); }
	':'
	{ after(grammarAccess.getProcessAccess().getColonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__5__Impl
	rule__Process__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getProcessElementsAssignment_5()); }
	(rule__Process__ProcessElementsAssignment_5)
	{ after(grammarAccess.getProcessAccess().getProcessElementsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__6__Impl
	rule__Process__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getGroup_6()); }
	(rule__Process__Group_6__0)*
	{ after(grammarAccess.getProcessAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__7__Impl
	rule__Process__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getProcessAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__8__Impl
	rule__Process__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getWorksequencesKeyword_8()); }
	'worksequences'
	{ after(grammarAccess.getProcessAccess().getWorksequencesKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__9__Impl
	rule__Process__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getColonKeyword_9()); }
	':'
	{ after(grammarAccess.getProcessAccess().getColonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__10__Impl
	rule__Process__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getProcessElementsAssignment_10()); }
	(rule__Process__ProcessElementsAssignment_10)
	{ after(grammarAccess.getProcessAccess().getProcessElementsAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__11__Impl
	rule__Process__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getGroup_11()); }
	(rule__Process__Group_11__0)*
	{ after(grammarAccess.getProcessAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getProcessAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Process__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group_6__0__Impl
	rule__Process__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getSemicolonKeyword_6_0()); }
	';'
	{ after(grammarAccess.getProcessAccess().getSemicolonKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getProcessElementsAssignment_6_1()); }
	(rule__Process__ProcessElementsAssignment_6_1)
	{ after(grammarAccess.getProcessAccess().getProcessElementsAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Process__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group_11__0__Impl
	rule__Process__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getSemicolonKeyword_11_0()); }
	';'
	{ after(grammarAccess.getProcessAccess().getSemicolonKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Process__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProcessAccess().getProcessElementsAssignment_11_1()); }
	(rule__Process__ProcessElementsAssignment_11_1)
	{ after(grammarAccess.getProcessAccess().getProcessElementsAssignment_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WorkSequence__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__0__Impl
	rule__WorkSequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_0()); }
	(rule__WorkSequence__PredecessorAssignment_0)
	{ after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__1__Impl
	rule__WorkSequence__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); }
	(rule__WorkSequence__LinkTypeAssignment_1)
	{ after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WorkSequence__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_2()); }
	(rule__WorkSequence__SuccessorAssignment_2)
	{ after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Process__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__ProcessElementsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionParserRuleCall_5_0()); }
		ruleWorkDefinition
		{ after(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__ProcessElementsAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionParserRuleCall_6_1_0()); }
		ruleWorkDefinition
		{ after(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__ProcessElementsAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessAccess().getProcessElementsWorkSequenceParserRuleCall_10_0()); }
		ruleWorkSequence
		{ after(grammarAccess.getProcessAccess().getProcessElementsWorkSequenceParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Process__ProcessElementsAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProcessAccess().getProcessElementsWorkSequenceParserRuleCall_11_1_0()); }
		ruleWorkSequence
		{ after(grammarAccess.getProcessAccess().getProcessElementsWorkSequenceParserRuleCall_11_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkDefinition__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__PredecessorAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0()); }
		(
			{ before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__LinkTypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); }
		ruleWorkSequenceType
		{ after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkSequence__SuccessorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0()); }
		(
			{ before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
