package net.vidageek.yacs;

import net.vidageek.yacs.fake.FakeConstraint;
import net.vidageek.yacs.fake.FakeCollector;

import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class InterfaceDevelopmentTest {

	@Test
	public void testBasicInterface() {

		new ClasspathScanner(new FakeConstraint()).scan(new FakeCollector());

	}

}
