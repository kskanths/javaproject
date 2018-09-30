package com.in28minutes.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
	@Test
	public void testApp()
    {
		System.out.println("Executing....");
        assertEquals(0,new App().calculateSomething());
    }
	@Test
	public void testFinal()
	{
		System.out.println("Final");
	}
}
