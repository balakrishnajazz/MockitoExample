package com.example.mockito.MockitoExample;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SomeBusinessMockTest {

	@Test
	void mockTest() {
		DataService dataService = Mockito.mock(DataService.class);
		
		Mockito.when(dataService.reteriveAllData()).thenReturn(new int[] {5,7,9,10});
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataService);
		int result = someBusinessImpl.findGreatestNumber();
		assertEquals(9 ,9);
	}
}


