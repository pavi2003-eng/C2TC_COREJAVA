package com.tns.ifet.dayfive.multilevelinheritance;
import java.util.Date;
import com.tns.ifet.dayfive.Employee;
public class LevelOneEmployee extends Employee {
    private int noOfShares;
    private String authority;
    public LevelOneEmployee() {}
    public LevelOneEmployee(String name, long contactNo, Date dateOfBirth,String deptName, double baseSalary, int noOfShares, String authority) {
        this.noOfShares = noOfShares;
        this.authority=authority;
    }
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "LevelOneEmployee ["+super.toString()+"noOfShares=" + noOfShares + ", authority=" + authority + "]";
	}   
}