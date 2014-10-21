package org.amitjava.DefaultFacto;

public class ShapeFactory {
	
	public Shape getShape(String shapeType)
	{
		if(shapeType == null)
		{
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("RECTABGLE"))
		{
			return new Rectangle();
		}
		if(shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		return null;
	}
	
}
