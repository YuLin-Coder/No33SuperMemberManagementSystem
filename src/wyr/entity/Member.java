package wyr.entity;

public class Member {
	private	int hid;		//��Ա���
	private	String hpassword;	//��Ա����
	private	int rgrade;		//��Ա�ȼ�
	private	String hname;	//��Ա��
	private	String hsex;	//��Ա�Ա�
	private	int hage;		//��Ա����
	private	String htel;	//��Ա�绰
	private	String hjob;	//��Ա��������
	private	int hintegral;	//����
	
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
