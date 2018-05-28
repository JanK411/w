package de.fhdw.jjtt.w

import de.fhdw.jjtt.w.w.Constant
import de.fhdw.jjtt.w.w.Variable

class XUtils {
	static def dispatch valueHavingThingToString(Variable v) '''«v.name»'''

	static def dispatch valueHavingThingToString(Constant c) '''ChangeableBand.create("«c.value»")'''

}
