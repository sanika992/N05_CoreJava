package org.tnsif.finalkeyword;

public class Circle extends Shape {
	final float area=34.6f;
	//final method
	//we cannot override final method
	/*void printShapeType()
	{
		System.out.println(area);
	}*/

	public void printShapeType(float area) {
		System.out.println(area +"sq.cm");	
	}

}
