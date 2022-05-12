package com.example.demo1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coustomers {
	int custid;
	String custname;
	String coursecust;
	private Technologies  techdetail;
	
	
	public Technologies getTechdetail() {
		return techdetail;
	}
	public void setTechdetail(Technologies techdetail) {
		//this.techdetail = techdetail;
	}
	@Autowired
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCoursecust() {
		return coursecust;
	}
	public void setCoursecust(String coursecust) {
		this.coursecust = coursecust;
	}
	public void display() {
		System.out.println("coustomers objects return successfully");
		techdetail.tech();
	}

}
