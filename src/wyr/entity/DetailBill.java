package wyr.entity;

public class DetailBill {

	private int did;		//�˵����
	private int gid;		//��Ʒ���
	private String dname;	//�˵�����
	private String dkind;	//����
	private double dprice;	//����
	private double dmoney;	//���
	private int dcount;		//����
	
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
