package org.amitjava.BuildingPatternFacto;

public abstract class ColdDrink implements Item {

	

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
