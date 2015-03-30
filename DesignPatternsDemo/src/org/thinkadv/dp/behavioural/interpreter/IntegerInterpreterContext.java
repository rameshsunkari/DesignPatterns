package org.thinkadv.dp.behavioural.interpreter;

public class IntegerInterpreterContext implements InterpreterContext {

	@Override
	public String getBinaryFormat(Object obj) {
		if (obj instanceof Integer)
			return Integer.toBinaryString((int) obj);
		return null;
	}

	@Override
	public String getHexadecimalFormat(Object obj) {
		if (obj instanceof Integer)
			return Integer.toHexString((int) obj);
		return null;
	}

}
