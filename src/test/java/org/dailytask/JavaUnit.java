package org.dailytask;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.opentelemetry.sdk.metrics.data.Data;

public class JavaUnit {
	@BeforeClass

	public static void Beforeclass() {
	 System.out.println("Browser configurations and launch");

	}
   @AfterClass
	
public static void Afterclass() {
System.out.println("close browser");
}	

@Before
public void BeforeEachMethod() {
	Date d=new Date(0);
			
	System.out.println("StartTime:"+d);
}
@After
public void AfterEachMethod() {
	Date d=new Date(0);
	System.out.println("EndTime:"+d);	
}
	@Test
public void Tc1() {
    System.out.println("Tc1");
}
@Test
public void Tc2() {
    System.out.println("Tc2");
}
@Test
public void Tc3() {
    System.out.println("Tc3");
}
  @AfterClass
     public static void Afterclass1() {
     System.out.println("close");
	}
}

