package com.example.mockito.MockitoExample;

public class SomeBusinessImpl{
	
	private DataService dataService;
	
	
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findGreatestNumber() {
		int[] reteriveAllData = dataService.reteriveAllData();
		
		int greaterNumber = Integer.MIN_VALUE;
		for(int i : reteriveAllData) {
			if(i>greaterNumber) {
				greaterNumber = i;
			}
		}
		return greaterNumber;
	}
}
