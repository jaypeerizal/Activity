package com.accenture.tcf.exercises.inheritance;

public class Manager extends Employee{
	private int numberOfReportees;

	public void printDetails(){
		super.printDetails();
		System.out.println("Number of Reportees : " + this.numberOfReportees);

	}

	public int getNumberOfReportees() {
		return numberOfReportees;
	}

	public void setNumberOfReportees(int numberOfReportees) {
		this.numberOfReportees = numberOfReportees;
	}
}
