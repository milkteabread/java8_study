package com.car;

public class L3 extends Car {

	public L3() {}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	
	
	@Override
	public void go(int distance) {
		int size = getOilSize()-(distance*10);
		setOilSize(size);
	}

	@Override
	public void setOilSize(int oilSize) {
		int size = getOilSize()+oilSize;
		setOilSize(size);
	}

	private int getOilSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getTempGage() {
		return getTempGage()+(getOilSize()/5);
	}

	
	

}
