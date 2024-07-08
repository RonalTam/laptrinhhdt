/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.model;


public class CungTen extends VuKhi {
	private double tamban;
	
	
	public CungTen(double tamban, String tenvk, int soluong) {
		super();
		this.tamban = tamban;
		this.soluong = soluong;
		this.tenvk = tenvk;
	}

	@Override
	public void tanCong() {
		System.out.println("Ban 1 mui ten ve phia truoc 100m");
	}

	@Override
	public void phongThu() {
		System.out.println("Ban 1 mui ten ve phia truoc 50m");
	}

	public double getTamban() {
		return tamban;
	}


	public void setTamban(double tamban) {
		this.tamban = tamban;
	}

	@Override
	public String toString() {
		return "CungTen [tamban=" + tamban + ", getTenvk()=" + getTenvk() + ", getSoluong()=" + getSoluong() + "]";
	}

	
}
