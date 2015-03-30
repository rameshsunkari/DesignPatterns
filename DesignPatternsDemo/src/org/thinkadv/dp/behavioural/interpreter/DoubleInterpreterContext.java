package org.thinkadv.dp.behavioural.interpreter;

public class DoubleInterpreterContext implements InterpreterContext {

	@Override
	public String getBinaryFormat(Object obj) {
		if (obj instanceof Double)
			return Double.toString((double) obj);
		return null;
	}

	@Override
	public String getHexadecimalFormat(Object obj) {
		if (obj instanceof Double)
			return Double.toHexString((double) obj);
		return null;
	}

}
