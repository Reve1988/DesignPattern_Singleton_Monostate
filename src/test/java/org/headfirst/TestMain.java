package org.headfirst;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.headfirst.monostate.Monostate;
import org.headfirst.singleton.Singleton;
import org.junit.Test;

public class TestMain {
	@Test
	public void testMonostate() {
		// given
		Monostate monostateA = new Monostate();
		Monostate monostateB = new Monostate();

		// when
		monostateA.setString("this is A");
		monostateB.setString("this is B");

		monostateB.setNumber(1);
		monostateA.setNumber(5);

		// then
		assertThat(monostateA.getString(), is("this is B"));
		assertThat(monostateB.getNumber(), is(5));
	}

	@Test
	public void testSingleton() {
		// given
		Singleton singletonA = Singleton.getInstance();
		Singleton singletonB = Singleton.getInstance();

		// when
		singletonA.setStr("this is A");
		singletonB.setStr("this is B");

		// then
		assertThat(singletonA.getStr(), is("this is B"));
	}
}
