package org.junit;

import java.util.List;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteCount {

	public static void main(String[] args) {
		
		Result r =JUnitCore.runClasses(Class1.class,Class2.class);
		System.out.println("Run count"+ r.getRunCount());
		System.out.println("failure count"+ r.getFailureCount()); 
		System.out.println("ignore count"+ r.getIgnoreCount());
		System.out.println("Run time" + r.getRunTime());
		List <Failure> failures = r.getFailures();
		for(Failure x : failures) {
			System.out.println(x);
		}
		
		
	}


	
}
