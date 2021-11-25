package com.entity;

public class Bill {
int billid=100;
int billamount;
double gst;
double fintotal;
public Bill(int billid, int billamount, int gst, int fintotal) {
	super();
	this.billid = billid;
	this.billamount = billamount;
	this.gst = gst;
	this.fintotal = fintotal;
}
public int getBillid() {
	return billid;
}
public void setBillid(int billid) {
	this.billid = billid;
}
public int getBillamount() {
	return billamount;
}
public void setBillamount(int billamount) {
	this.billamount = billamount;
}
public double getGst() {
	return gst;
}
public void setGst(double d) {
	this.gst = d;
}
public double getFintotal() {
	return fintotal;
}
public void setFintotal(double d) {
	this.fintotal = d;
}

public Bill() {
	// TODO Auto-generated constructor stub
}

}
