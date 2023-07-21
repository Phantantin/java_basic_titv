package model;

import java.util.ArrayList;
import java.util.Iterator;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThiSinh;
	private String luaChon;
	private String tenFile;
	
	public QLSVModel() {
		this.dsThiSinh = new ArrayList<ThiSinh>();
		this.luaChon = "";
		this.tenFile = "";
	}

	public QLSVModel(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}

	public ArrayList<ThiSinh> getDsThiSinh() {
		return dsThiSinh;
	}

	public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}
	
	
	
	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}
	
	

	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}

	// add thi sinh
	public void insert(ThiSinh thiSinh) {
		this.dsThiSinh.add(thiSinh);
	}

	// delete
//	public void remove(ThiSinh thiSinh) {
//		this.dsThiSinh.remove(thiSinh);
//	}
	
	public void delete(ThiSinh thiSinh) {
		Iterator<ThiSinh> iterator = dsThiSinh.iterator();
		while(iterator.hasNext()) {
			ThiSinh ts = iterator.next();
			if(ts.equals(ts)) {
				iterator.remove();
			}
		}
	}
	
	// update
	public void update(ThiSinh thiSinh) {
		this.dsThiSinh.remove(thiSinh);
		this.dsThiSinh.add(thiSinh);
	}

	public boolean kiemTraTonTai(ThiSinh ts) {
		
		for (ThiSinh thiSinh : dsThiSinh) {
			if(thiSinh.getMaThiSinh() == ts.getMaThiSinh())
				return true;
		}
		return false;
	}
}
