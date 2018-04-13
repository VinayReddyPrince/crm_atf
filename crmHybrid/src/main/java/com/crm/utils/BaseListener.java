package com.crm.utils;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;



public class BaseListener extends TestListenerAdapter {
	
	@Override
	public void onTestStart(ITestResult tr){
		log("Test Started......");
	}

	@Override
	public void onTestSuccess(ITestResult tr){
		log("Test '" + tr.getName() + "'Passed");
		log(tr.getTestClass());
		log("Priority f the method is"+tr.getMethod().getPriority());
	}
	
	@Override
	public void onTestFailure(ITestResult tr){
		log("Test '" + tr.getName() +"'Failed");
		log("Priority of the method is "+tr.getMethod().getPriority());
		CommonUtils.takeScreenShot(CommonUtils.wd);
	}
	
	@Override
	
	public void onTestSkipped(ITestResult tr){
		log("Test '" + tr.getName() +"'Skipped");
		System.out.println(".......");
	}
	
	public void log(String methodName){
		System.out.println(methodName);
	}
	
	public void log(IClass testClass){
		System.out.println(testClass);
	}
}
