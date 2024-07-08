/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.model;

/**
 *
 * @author lakeh
 */
public abstract class VuKhi implements Cloneable {
	public String tenvk;
	public int soluong;
	
	public String getTenvk() {
		return tenvk;
	}

	public void setTenvk(String tenvk) {
		this.tenvk = tenvk;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public abstract void tanCong();
	public abstract void phongThu();
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "VuKhi [tenvk=" + tenvk + ", soluong=" + soluong + "]";
	}
	
}
