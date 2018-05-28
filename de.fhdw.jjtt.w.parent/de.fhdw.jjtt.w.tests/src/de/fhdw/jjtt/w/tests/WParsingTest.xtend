/*
 * generated by Xtext 2.13.0
 */
package de.fhdw.jjtt.w.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import de.fhdw.jjtt.w.w.File
import de.fhdw.jjtt.w.generator.WGenerator

@RunWith(XtextRunner)
@InjectWith(WInjectorProvider)
class WParsingTest {
	@Inject
	ParseHelper<File> parseHelper
	var gen = new WGenerator()

	@Test
	def testAddierer() {
		val input = parseHelper.parse('''
		main() {
			x = 5 + 3
		}''')

		val main = gen.generateNamedProgram(input.programs.findFirst[it.name == "main"])
		println(main)

		val expected = '''
		public static void main(String[] args){
			String x;
			x = TuringMaschinen.createAdd().simuliere("7", "3", "").iterator().next().getLetztesBand().toString();
		}'''

	}

	@Test
	def loadModel() {
		val result = parseHelper.parse('''
		main() {
			x = 5 + 0;
			y = 3 + 0;
			multiply(x, y)
		}
		
		multiply(f1, f2) {
			copy(f1, f11);
			copy(f2, f21);
			while f21 !=0 do
				f1 = f1 + f11;
				f21 = f21 - 1
			endwhile
		}''')

		Assert.assertEquals(2, result.programs)
		Assert.assertNotNull(result.programs.findFirst[it.name == "main"])
		Assert.assertNotNull(result.programs.findFirst[it.name == "multiply"])

//		val main = gen.generateProgram(result.programs.findFirst[it.name == "main"])
		val expectedMain = '''
		public static void main(String[] args) {
			Band x = Band.create();
			Band y = Band.create();
			TouringMachine.createSeq(
				TouringMachine.createAdd(5,0,x),
				TouringMachine.createSeq(
					TouringMachine.createAdd(3,0,y),
					createMultiplyMachine(x, y))
				)
			).run();
		}'''
//		Assert.assertEquals(expectedMain.trim, main.trim)
//		val multiply = gen.generateProgram(result.programs.findFirst[it.name == "multiply"])
		val expectedMultiply = '''
		public TouringMachine createMultiplyMachine(Band f1, Band f2) {
			Band f11 = Band.create();
			Band f21 = Band.create();
			return TouringMachine.createSeq(
				TouringMachine.createCopy(f1, f11),
				TouringMachine.createSeq(
					TouringMachine.createCopy(f2, f21)
					TouringMachine.createWhile(f21, TouringMachine.createSeq(
						TouringMachine.createAdd(f1, f11, f1),
						TouringMachine.createSub(f21, Band.create(1), f21)
					))
				)
			)
		}'''
//		Assert.assertEquals(expectedMultiply.trim, multiply.trim)
	}
}
