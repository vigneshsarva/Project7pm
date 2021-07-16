package TestNgClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class AnnotationTransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConsructor, Method testMethod) {
		
		IRetryAnalyzer retry = testAnnotation.getRetryAnalyzer();
		if(retry == null) {
			testAnnotation.setRetryAnalyzer(RetryFailedTestCases.class);
		}
		
	}

}
