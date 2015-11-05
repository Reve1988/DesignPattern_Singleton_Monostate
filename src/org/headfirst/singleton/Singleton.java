package org.headfirst.singleton;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		// 스레드 이슈 및 if성능 이슈
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
}
