/*
 * generated by Xtext 2.11.0
 */
package dk.deothan.math


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MathStandaloneSetup extends MathStandaloneSetupGenerated {

	def static void doSetup() {
		new MathStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
