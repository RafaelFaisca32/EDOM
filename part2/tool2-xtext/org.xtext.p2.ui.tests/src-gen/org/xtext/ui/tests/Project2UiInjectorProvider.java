/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.p2.ui.internal.P2Activator;

public class Project2UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return P2Activator.getInstance().getInjector("org.xtext.Project2");
	}

}
