/*
 * generated by Xtext 2.13.0
 */
package de.fhdw.jjtt.w.ui.quickfix

import de.fhdw.jjtt.w.validation.WValidator
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class WQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(WValidator.PARAMS_OUTPUTS_NOT_ALLOWED)
	def removeOutputs(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'remove outputs', 'remove the outputs', 'wololo.png') [ context |
			context.xtextDocument.replace(issue.offset, issue.length, '')
		]
	}

	@Fix(WValidator.PARAMS_PRINT_NOT_ALLOWED)
	def removePrint(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'remove print', 'remove the print', 'wololo.png') [ context |
			context.xtextDocument.replace(issue.offset, issue.length, '')
		]
	}

	@Fix(WValidator.LOWER_CASE_NAME)
	def toLower(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'to Lower', 'to Lower', 'error.png') [ context |
			val character = context.xtextDocument.getChar(issue.offset)
			context.xtextDocument.replace(issue.offset, 1, Character.toLowerCase(character).toString)
		]
	}
}
