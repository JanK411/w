/*
 * generated by Xtext 2.13.0
 */
package de.fhdw.jjtt.w


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class WStandaloneSetup extends WStandaloneSetupGenerated {

	def static void doSetup() {
		new WStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
