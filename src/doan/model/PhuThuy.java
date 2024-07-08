/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.model;

/**
 *
 * @author lakeh
 */
public class PhuThuy extends NhanVat {
	private String phepthuat;


	public PhuThuy(double nangluong, String ten, String phepthuat) {
		super(nangluong, ten);
		this.phepthuat = phepthuat;
	}


	public String getPhepthuat() {
		return phepthuat;
	}


	public void setPhepthuat(String phepthuat) {
		this.phepthuat = phepthuat;
	}

	

	@Override
	public String toString() {
		return "PhuThuy [phepthuat=" + phepthuat + ", getNangluong()=" + getNangluong() + ", getTen()=" + getTen()
				+ ", getDsvk()=" + getDsvk() + "]";
	}

	@Override
	public void sangTrai() {
		System.out.println("Bay sang trai 15m");
	}

	@Override
	public void sangPhai() {
		System.out.println("Bay sang phai 10m");
	}
	
	
}
