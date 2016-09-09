package com.ctrip.xpipe.simple;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

/**
 * @author wenchao.meng
 *
 * Sep 9, 2016
 */
@RunWith(MockitoJUnitRunner.class)
public class MockTest {
	
	@Mock
	private List mockList;
	
	@Test
	public void testMock(){
		
		int anyInt = anyInt();
		System.out.println(anyInt);
		when(mockList.get(anyInt)).thenReturn("nihao");
				
		System.out.println(mockList.get(0));
		System.out.println(mockList.get(1));
		
	}

	@Test
	public void testMock1(){
		
		when(mockList.get(0)).thenReturn("nihao");
		
		System.out.println(mockList.get(0));
		System.out.println(mockList.get(1));
		
	}

}