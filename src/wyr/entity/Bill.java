package wyr.entity;

import java.util.Date;

public class Bill {
	
	private int did;	//�˵����
	private int hid;    //��Ա���
	private double sdiscount;	//�ۿ�
	private double sallprice;	//�ܼ�
	private Date stime;	//�˵�ʱ��
	
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
