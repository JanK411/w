/*
 * generated by Xtext 2.13.0
 */
package de.fhdw.jjtt.w.formatting2

import com.google.inject.Inject
import de.fhdw.jjtt.w.services.WGrammarAccess
import de.fhdw.jjtt.w.w.Assertion
import de.fhdw.jjtt.w.w.Assignment
import de.fhdw.jjtt.w.w.Loop
import de.fhdw.jjtt.w.w.NamedProgram
import de.fhdw.jjtt.w.w.Print
import de.fhdw.jjtt.w.w.Reference
import de.fhdw.jjtt.w.w.Sequence
import de.fhdw.jjtt.w.w.WPackage
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class WFormatter extends AbstractFormatter2 {

	@Inject extension WGrammarAccess

	def dispatch void format(NamedProgram p, extension IFormattableDocument document) {
		interior(
			p.regionFor.keyword("{").append[setNewLines(1, 1, 2)],
			p.regionFor.keyword("}").prepend[setNewLines(1, 1, 2)],
			[indent]
		)
		p.regionFor.feature(WPackage.Literals.NAMED_PROGRAM__NAME).prepend[setNewLines(1, 2, 2)]
		p.regionFor.keyword("(").prepend[noSpace]
		p.allRegionsFor.keyword(",").prepend[noSpace].append[oneSpace]
		p.regionFor.keyword(")").prepend[noSpace].append[oneSpace]
		p.program.format
		p.outputs.forEach[it.format]
	}

	def dispatch void format(Assertion a, extension IFormattableDocument doc) {
		a.prepend[newLine]
		a.regionFor.keywords('(', ')').forEach[it.surround[noSpace]]
		a.allRegionsFor.keyword(',').append[oneSpace]
	}

	def dispatch void format(Print p, extension IFormattableDocument doc) {
		p.prepend[newLine]
		p.regionFor.keywords('(', ')').forEach[it.surround[noSpace]]
	}

	def dispatch void format(Loop l, extension IFormattableDocument document) {
		interior(
			l.regionFor.keyword("do").append[setNewLines(1, 1, 2)].prepend[oneSpace],
			l.regionFor.keyword("endwhile").prepend[setNewLines(1, 1, 2)],
			[indent]
		)
//		l.regionFor.feature(WPackage.Literals.LOOP__VAR).surround[oneSpace]
		l.regionFor.keyword("while").append[oneSpace]
		l.regionFor.keyword("!=0").prepend[oneSpace]
		l.prog.format
	}

	def dispatch void format(Sequence s, extension IFormattableDocument document) {
		s.regionFor.keyword(";").prepend[noSpace].append[setNewLines(1, 1, 2)]
		s.p1.format
		s.p2.format
	}

	def dispatch void format(Reference r, extension IFormattableDocument document) {
		r.allRegionsFor.keywords(",").forEach[it.prepend[noSpace].append[oneSpace]]
		r.allRegionsFor.keywords("(", ")").forEach[it.surround[noSpace]]
	}

	def dispatch void format(Assignment a, extension IFormattableDocument document) {
		a.regionFor.feature(WPackage.Literals.ASSIGNMENT__OP).surround[oneSpace]
		a.regionFor.keyword("=").surround[oneSpace]
	}
}
