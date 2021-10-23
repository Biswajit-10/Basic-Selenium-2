package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
		
public class AssertionScript {
	@Test
	public void test1(){
		Assert.assertEquals(12,13,"DropDown count doesn't match ");		
	}	
	
	@Test
	public void test2(){
		Assert.assertEquals("hello","hello");
	}
	
	@Test
	public void test3(){
		Assert.assertEquals('a','a');
	}	
	
}		
		