package org.amitjava.BuildingPatternFacto;

public abstract class Burger implements Item {

	
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
