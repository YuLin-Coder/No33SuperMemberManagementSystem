package wyr.entity;

public class Goods {
	private int gid;	//��Ʒ���
	private String gname;	//��Ʒ��
	private int gnum;		//��Ʒ����
	private String gkind;	//��Ʒ����
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public String getGkind() {
		return gkind;
	}
	public void setGkind(String gkind) {
		this.gkind = gkind;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gnum=" + gnum
				+ ", gkind=" + gkind + "]";
	}
	
	
}
