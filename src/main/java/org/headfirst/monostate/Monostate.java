package org.headfirst.monostate;

public class Monostate {
	private static String string;
	private static int number;
	private static boolean bool;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		Monostate.string = string;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		Monostate.number = number;
	}

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		Monostate.bool = bool;
	}
}
