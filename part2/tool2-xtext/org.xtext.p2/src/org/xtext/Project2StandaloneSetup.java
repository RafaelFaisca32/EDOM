/*
 * generated by Xtext 2.25.0
 */
package org.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Project2StandaloneSetup extends Project2StandaloneSetupGenerated {

	public static void doSetup() {
		new Project2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
