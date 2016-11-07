package com.miracle.selenium;

import java.io.IOException;
import java.util.Date;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

//import com.Scholastic.selenium.CPTUtils;
//import com.Scholastic.selenium.MailUtils;

public class SeleniumRun {
	@SuppressWarnings("unused")
	public static void main(String args[]) throws IOException {
		 System.out.println("Entered");
//		CPTUtils.writeLog("Start Time : " + new Date());		
		JUnitCore junit = new JUnitCore();
		junit.run(DemoMiracle.class);
//		CPTUtils.writeLog("End Time : " + new Date());
//		String retval=CPTUtils.displayTableReport();
//		System.out.println("Return value DisplayTable Report================>"+retval);
		//CPTUtils.signOut(driver);
		//MailUtils.sendMail();
		
	}
}
