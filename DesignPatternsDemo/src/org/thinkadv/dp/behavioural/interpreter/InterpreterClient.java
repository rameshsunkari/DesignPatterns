package org.thinkadv.dp.behavioural.interpreter;

public class InterpreterClient {
	public InterpreterContext ic;
    
    public InterpreterClient(InterpreterContext i){
        this.ic=i;
    }
     
    public String interpret(String str, String type){
    	Object obj = str.substring(0,str.indexOf(" "));
    	if ("int".equals(type)) {
    		obj = Integer.parseInt((String) obj);
    	} else if ("double".equals(type)) {
    		obj = Double.parseDouble((String) obj);
    	}
        Expression exp=null;
        //create rules for expressions
        if(str.contains("Hexadecimal")){
            exp=new HexaExpression(obj);
        }else if(str.contains("Binary")){
            exp=new BinaryExpression(obj);
        }else return str;
         
        return exp.interpret(ic);
    }
}
