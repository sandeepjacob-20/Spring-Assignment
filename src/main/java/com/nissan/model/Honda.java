package com.nissan.model;

import com.nissan.interfaces.Vehicle;

public class Honda implements Vehicle {

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return "Honda Civic";
	}

	@Override
	public String getBrandName() {
		// TODO Auto-generated method stub
		return "Honda";
	}

}
