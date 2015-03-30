package org.thinkadv.dp.behavioural.interpreter;

public class InterpreterDemo {

	public static void main(String[] args) {
		String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";
         
        InterpreterClient intClient = new InterpreterClient(new IntegerInterpreterContext());
        System.out.println(str1+"= "+intClient.interpret(str1, "int"));
        System.out.println(str2+"= "+intClient.interpret(str2, "int"));
        
        InterpreterClient doubleClient = new InterpreterClient(new DoubleInterpreterContext());
        System.out.println(str1+"= "+doubleClient.interpret(str1, "double"));
        System.out.println(str2+"= "+doubleClient.interpret(str2, "double"));

	}

}
