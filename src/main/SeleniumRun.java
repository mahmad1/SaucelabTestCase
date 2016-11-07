//package com.Scholastic.selenium;

import java.io.IOException;
import java.util.Date;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.Scholastic.selenium.ASauceLabsBalancePage;
import com.Scholastic.selenium.ASauceLabsCOAPage;
import com.Scholastic.selenium.ASauceLabsCal290_Events_page;
import com.Scholastic.selenium.ASauceLabsChoose365;
import com.Scholastic.selenium.ASauceLabsDash100_landing;
import com.Scholastic.selenium.ASauceLabsHomepageOnline;
import com.Scholastic.selenium.ASauceLabsOther_Functionalities;
import com.Scholastic.selenium.ASauceLabsPlannerCalendar;
import com.Scholastic.selenium.ASauceLabsPreviewOFE400;
import com.Scholastic.selenium.ASauceLabsPreviewOFE500;
import com.Scholastic.selenium.ASauceLabsProgramsAndActivitiesPRO100;
import com.Scholastic.selenium.CPTUtils;
import com.Scholastic.selenium.MailUtils;

public class SeleniumRun {
	@SuppressWarnings("unused")
	public static void main(String args[]) throws IOException {
		CPTUtils.writeLog("Start Time : " + new Date());		
		JUnitCore junit = new JUnitCore();
		//Result result = junit.run(TempASauceLabsCOAPage.class);
		//junit.run(TempASauceLabsCOAPage.class);
		junit.run(ASauceLabsDash100_landing.class);		
//		junit.run(ASauceLabsBalancePage.class);
//		junit.run(ASauceLabsCal290_Events_page.class);
//		junit.run(ASauceLabsChoose365.class);
//		junit.run(ASauceLabsCOAPage.class);
//		junit.run(ASauceLabsHomepageOnline.class);
//		junit.run(ASauceLabsOther_Functionalities.class);
//		junit.run(ASauceLabsPlannerCalendar.class);
//		junit.run(ASauceLabsPreviewOFE400.class);
//		junit.run(ASauceLabsPreviewOFE500.class);
//		junit.run(ASauceLabsProgramsAndActivitiesPRO100.class);
		
		//junit.run(ASauceLabsAdminEVT100.class);
		
		CPTUtils.writeLog("End Time : " + new Date());
		CPTUtils.displayTableReport();
		MailUtils.sendMail();
		
	}
}
