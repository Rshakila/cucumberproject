package com.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class CuReport {
	public static void generateReport(String json) {
		File f=new File("C:\\Users\\User\\eclipse-workspace\\cucumberMay\\src\\test\\resources\\Report");
		Configuration con=new Configuration(f, "cucumberMay");
		con.addClassifications("Browser","Chrome");
		con.addClassifications("platform","windows" );
		con.addClassifications("version","1.8.0");
		
		
		List<String> l=new LinkedList<String>();
		l.add(json);
		ReportBuilder rb=new ReportBuilder(l, con);
		rb.generateReports();
	}

}
