package com.opti.mockito.test.service;

import com.opti.mockito.test.repo.AdditionRepository;

public class AdditionService {

	public int getSum(int num1, int num2) {
		
		AdditionRepository repo = new AdditionRepository();
		
		return repo.retrieveSum(num1, num2);
	}

}
