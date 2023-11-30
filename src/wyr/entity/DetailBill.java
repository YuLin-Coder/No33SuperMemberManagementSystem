package wyr.entity;

public class DetailBill {

	private int did;		//账单编号
	private int gid;		//商品编号
	private String dname;	//账单名称
	private String dkind;	//种类
	private double dprice;	//单价
	private double dmoney;	//金额
	private int dcount;		//数量
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDkind() {
		return dkind;
	}
	public void setDkind(String dkind) {
		this.dkind = dkind;
	}
	public double getDprice() {
		return dprice;
	}
	public void setDprice(double dprice) {
		this.dprice = dprice;
	}
	public double getDmoney() {
		return dmoney;
	}
	public void setDmoney(double dmoney) {
		this.dmoney = dmoney;
	}
	public int getDcount() {
		return dcount;
	}
	public void setDcount(int dcount) {
		this.dcount = dcount;
	}
	@Override
	public String toString() {
		return "DetailBill [did=" + did + ", gid=" + gid + ", dname=" + dname
				+ ", dkind=" + dkind + ", dprice=" + dprice + ", dmoney="
				+ dmoney + ", dcount=" + dcount + "]";
	}
	
	
}
