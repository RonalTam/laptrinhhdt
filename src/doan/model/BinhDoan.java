/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.model;

import java.util.List;

public class BinhDoan {
	private DoiQuan doiquan;
	private List<KyBinh> dskb;

	public BinhDoan(DoiQuan doiquan, List<KyBinh> dskb) {
		super();
		this.doiquan = doiquan;
		this.dskb = dskb;
	}

	public DoiQuan getDoiquan() {
		return doiquan;
	}

	public void setDoiquan(DoiQuan doiquan) {
		this.doiquan = doiquan;
	}

	public List<KyBinh> getDskb() {
		return dskb;
	}

	public void setDskb(List<KyBinh> dskb) {
		this.dskb = dskb;
	}
	@Override
	public String toString() {
		return "BinhDoan [doiquan=" + doiquan + ", dskb=" + dskb + "]";
	}
	
	
}
