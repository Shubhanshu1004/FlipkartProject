package com.Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer{

	// Overridden method from IAnnotationTransformer interface
	public void transform(ITestAnnotation annotation, Class testClass, Constructor constructor, Method method) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);	
	}
	
}
