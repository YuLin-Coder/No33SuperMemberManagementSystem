package wyr.entity;

import java.util.Date;

public class Bill {
	
	private int did;	//账单编号
	private int hid;    //会员编号
	private double sdiscount;	//折扣
	private double sallprice;	//总价
	private Date stime;	//账单时间
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public double getSdiscount() {
		return sdiscount;
	}
	public void setSdiscount(double sdiscount) {
		this.sdiscount = sdiscount;
	}
	public double getSallprice() {
		return sallprice;
	}
	public void setSallprice(double sallprice) {
		this.sallprice = sallprice;
	}
	public Date getStime() {
		return stime;
	}
	public void setStime(Date stime) {
		this.stime = stime;
	}
	
	
}
