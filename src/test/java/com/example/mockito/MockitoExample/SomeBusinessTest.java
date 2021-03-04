package com.example.mockito.MockitoExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void test() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = someBusinessImpl.findGreatestNumber();
		assertEquals(24 ,50);
	}
}

class DataServiceStub implements DataService{
	
	public int[] reteriveAllData() {
		return new int[] {24,6,8};
	}
}
