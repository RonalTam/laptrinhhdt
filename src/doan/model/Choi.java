/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.model;


public class Choi extends VuKhi {
	private double tamdanh;
	public Choi(double tamdanh, String tenvk, int soluong) {
		this.soluong = soluong;
		this.tenvk = tenvk;
		this.tamdanh = tamdanh;
	}
	
	


	public double getTamdanh() {
		return tamdanh;
	}



	@Override
	public String toString() {
		return "Choi [tamdanh=" + tamdanh + ", getTenvk()=" + getTenvk() + ", getSoluong()=" + getSoluong() + "]";
	}




	public void setTamdanh(double tamdanh) {
		this.tamdanh = tamdanh;
	}



	@Override
	public void tanCong() {
		System.out.println("Vac choi dap");
	}

	@Override
	public void phongThu() {
		System.out.println("Mua choi");
	}

}
