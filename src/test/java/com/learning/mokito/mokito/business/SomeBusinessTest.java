package com.learning.mokito.mokito.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findGratestFromAllData_basicScenatio() {
		DataServiceStub dataServiceStub = new DataServiceStub();
		SomeBuisnessImp businessImpl = new SomeBuisnessImp(dataServiceStub);
		int result = businessImpl.findTheGratestFromAllData();
		assertEquals(25, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {

		return new int[] { 25, 15, 5 };
	}

}
