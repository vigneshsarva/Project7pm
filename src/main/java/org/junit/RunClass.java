package org.junit;

import org.junit.runner.*;
import org.junit.runners.Suite;

public class RunClass {
	
	@RunWith(Suite.class)
	@Suite.SuiteClasses({Class1.class,Class2.class})
	
	public class RunnerClass{
		
	}

}
