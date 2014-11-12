package org.CoreJava.Basic;

class Animal2{

	   public void move(){
	      System.out.println("Animals can move");
	   }
	}

	class Dog2 extends Animal2{

	   public void move(){
	      super.move(); // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }
	}

	public class TestDog2{

	   public static void main(String args[]){

	      Animal2 b = new Dog2(); // Animal reference but Dog object
	      b.move(); //Runs the method in Dog class

	   }
	}