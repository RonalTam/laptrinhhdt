/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.model;

/**
 *
 * @author lakeh
 */
public class KyBinh extends NhanVat implements Cloneable {
	private int kinhnghiem;


	public KyBinh(double nangluong, String ten, int kinhnghiem) {
		super(nangluong, ten);
		this.kinhnghiem = kinhnghiem;
	}


	public int getKinhnghiem() {
		return kinhnghiem;
	}


	public void setKinhnghiem(int kinhnghiem) {
		this.kinhnghiem = kinhnghiem;
	}

	@Override
	public void sangTrai() {
		System.out.println("Phi ngua sang trai 15 buoc");
	}

	@Override
	public void sangPhai() {
		System.out.println("Phi ngua sang phai 15 buoc");
	}

	@Override
	public String toString() {
		return "KyBinh [kinhnghiem=" + kinhnghiem + ", getNangluong()=" + getNangluong() + ", getTen()=" + getTen()
				+ ", getDsvk()=" + getDsvk() + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
