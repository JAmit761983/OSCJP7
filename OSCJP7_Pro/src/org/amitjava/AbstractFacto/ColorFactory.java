

//Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.



package org.amitjava.AbstractFacto;

public class ColorFactory extends AbstractFactory {

	@Override
 Color getColor(String color) {
		if(color==null)
						{
			return null;
						}
		if(color.equalsIgnoreCase("RED"))
						{
						return new Red();
						}
		else if(color.equalsIgnoreCase("GREEN"))
						{
						return new Green();
						}
		else if(color.equalsIgnoreCase("BLUE"))
						{
						return new Blue();
						}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
