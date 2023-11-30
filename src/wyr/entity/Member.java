package wyr.entity;

public class Member {
	private	int hid;		//会员编号
	private	String hpassword;	//会员密码
	private	int rgrade;		//会员等级
	private	String hname;	//会员名
	private	String hsex;	//会员性别
	private	int hage;		//会员年龄
	private	String htel;	//会员电话
	private	String hjob;	//会员工作部门
	private	int hintegral;	//积分
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHpassword() {
		return hpassword;
	}
	public void setHpassword(String hpassword) {
		this.hpassword = hpassword;
	}
	public int getRgrade() {
		return rgrade;
	}
	public void setRgrade(int rgrade) {
		this.rgrade = rgrade;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHsex() {
		return hsex;
	}
	public void setHsex(String hsex) {
		this.hsex = hsex;
	}
	public int getHage() {
		return hage;
	}
	public void setHage(int hage) {
		this.hage = hage;
	}
	public String getHtel() {
		return htel;
	}
	public void setHtel(String htel) {
		this.htel = htel;
	}
	public String getHjob() {
		return hjob;
	}
	public void setHjob(String hjob) {
		this.hjob = hjob;
	}
	public int getHintegral() {
		return hintegral;
	}
	public void setHintegral(int hintegral) {
		this.hintegral = hintegral;
	}
	@Override
	public String toString() {
		return "Member [hid=" + hid + ", hpassword=" + hpassword + ", rgrade="
				+ rgrade + ", hname=" + hname + ", hsex=" + hsex + ", hage="
				+ hage + ", htel=" + htel + ", hjob=" + hjob + ", hintegral="
				+ hintegral + "]";
	}
 
	
}
