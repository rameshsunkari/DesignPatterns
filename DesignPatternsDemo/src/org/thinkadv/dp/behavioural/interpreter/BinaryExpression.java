package org.thinkadv.dp.behavioural.interpreter;

public class BinaryExpression implements Expression {
	 
    private Object i;
     
    public BinaryExpression(Object c){
        this.i=c;
    }
    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
 