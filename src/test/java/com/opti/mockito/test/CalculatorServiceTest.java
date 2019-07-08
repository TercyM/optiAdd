package com.opti.mockito.test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;


import com.opti.mockito.test.repo.AdditionRepository;
import com.opti.mockito.test.service.AdditionService;

import junit.framework.TestCase;


public class CalculatorServiceTest extends TestCase {

	@Mock
	AdditionRepository addRepo;
	
	@InjectMocks
	private AdditionService addService;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void clear() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testGetSum() {
		
		try {
			//IF
			int num1 = 10;
			int num2 = 10;
			int mockSum = 20;
			when(addRepo.retrieveSum(num1,num2)).thenReturn(mockSum);
			
			//WHEN
			int sum = addService.getSum(num1,num2);		
			
			//THEN
			//verify(addRepo, times(1)).retrieveSum(num1,num2);
			assertEquals(mockSum, sum);	
		} catch (Exception e) {
			fail();
		}
	}
	

}