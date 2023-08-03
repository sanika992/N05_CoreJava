package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		//f.SALARY=99000.44f;   we cannot change the value of final variable
		f.print();
		

		Circle c = new Circle();
		c.printShapeType();
		c.printShapeType(c.area);

	}

}
