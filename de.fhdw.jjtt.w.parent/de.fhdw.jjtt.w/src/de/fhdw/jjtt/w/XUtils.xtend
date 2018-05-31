package de.fhdw.jjtt.w

import de.fhdw.jjtt.w.w.Assignment
import de.fhdw.jjtt.w.w.Constant
import de.fhdw.jjtt.w.w.Loop
import de.fhdw.jjtt.w.w.Reference
import de.fhdw.jjtt.w.w.Sequence
import de.fhdw.jjtt.w.w.Variable
import java.util.ArrayList
import java.util.List
import static extension de.fhdw.jjtt.w.Utils.*

class XUtils {
	static def dispatch String valueHavingThingToString(Variable v) '''«v.name»'''

	static def dispatch String valueHavingThingToString(Constant c) '''ChangeableBand.create("«c.value»")'''

	static def dispatch List<String> getVariables(Assignment a) {
		val ret = new ArrayList<String>
		ret.add(a.toBeAssigned.name)

		val val1 = a.val1
		if (val1 instanceof Variable)
			ret.add(val1.name)
			
		val val2 = a.val2
		if (val2 instanceof Variable)
			ret.add(val2.name)

		ret
	}

	static def dispatch List<String> getVariables(Sequence s) {
		getVariables(s.p1).concat(getVariables(s.p2))
	}

	static def dispatch List<String> getVariables(Reference r) {
		r.params.filter[it instanceof Variable].map[(it as Variable).name].toList
	}

	static def dispatch List<String> getVariables(Loop l) {
		val ret = getVariables(l.prog)
		ret.add(l.^var.name)
		ret
	}

	static def String trimWhitespaces(String s) {
		var a = s
		a = a.replaceAll("\\s{2,}", " ").trim()
		a = a.replaceAll("\\s", " ").trim()
	}

	static def isInBuild(Reference r) {
		r.name == "copy" && r.params.size == 2
	}
}
