package wyr.entity;

public class Goods {
	private int gid;	//商品编号
	private String gname;	//商品名
	private int gnum;		//商品数量
	private String gkind;	//商品种类
	
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
