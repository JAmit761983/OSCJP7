
//Create an Abstract class to get factories for Color and Shape Objects.

package org.amitjava.AbstractFacto;

public abstract class AbstractFactory 
{
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);	
}
