package org.CoreJava.Basic;

public class TestArray {

	public static void main(String[] args) {

		double [] mylist = {1.9,2.9,3.4,3.5};
		
		// Print all Elements 
		for(int i=0;i<mylist.length; i++)
		{
			System.out.println(mylist[i] + " " );
		}
		
		//Sum of All Elements
		double Total=0;
		for(int j=0; j<mylist.length;j++)
		{
			 Total += mylist[j];
		}
		System.out.println("total is = "+Total);
	
	// Largest
		double Large= mylist[0];
	for(int i=0;i<mylist.length;i++)
	{
		if(mylist[i] > Large)
			Large = mylist[i];
	}
	System.out.println("Large is = " +Large);
	}
}
