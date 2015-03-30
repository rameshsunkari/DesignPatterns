package org.thinkadv.dp.behavioural.interpreter;

public class HexaExpression implements Expression {
	 
    private Object i;
     
    public HexaExpression(Object c){
        this.i=c;
    }
    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(this.i);
    }
}
 