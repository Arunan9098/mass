package org.sam;

public class One {



public static void main(String[] args) {
	String s="6/2*3+4-2";
	char[] c = s.toCharArray();
	int numericValue = Character.getNumericValue(c[0]);
	
	for (int i = 0; i < c.length; i++) {
		char d = c[i];
		switch (d) {
		case '+':
			int numericValue2 = Character.getNumericValue(c[i+1]);
			numericValue=numericValue+numericValue2;
			break;
		case '-':
			int numericValue3 = Character.getNumericValue(c[i+1]);
			numericValue=numericValue-numericValue3;
			break;
		case '*':
			int numericValue4 = Character.getNumericValue(c[i+1]);
			numericValue=numericValue*numericValue4;
			break;
		case '/':
			int numericValue5 = Character.getNumericValue(c[i+1]);
			numericValue=numericValue/numericValue5;
			break;

		default:
			break;
		}
	}
	
	System.out.println(numericValue);
	
}

}
