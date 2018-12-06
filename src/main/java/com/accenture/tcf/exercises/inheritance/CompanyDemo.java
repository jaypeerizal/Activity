package com.accenture.tcf.exercises.inheritance;

public class CompanyDemo {

	public static void main(String[] args) {

		Manager mng = new Manager();
		mng.setId(101234);
		mng.setEname("John Peter");
		mng.setEmail("John.peter@Accenture.com");
		mng.setVacationDays(20);
		mng.setNumberOfReportees(10);
		mng.printDetails();
	}


}
