package com.junit;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class calculateTest {

	String first;
	String second;
	int expected;
	calculate calc;
	public calculateTest(String f,String s,int e)
	{
		first=f;
		second=s;
		expected=e;
	}
	@Before
	public void init()
	{
		calc=new calculate();
		
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{"hi","hello",0},{"hello","hi",1}});
	}
	@Test
	public void comparestrings() {
		assertEquals(expected,calc.compare(first, second));
	}

}
