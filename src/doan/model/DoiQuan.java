/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.model;

import java.util.List;

public class DoiQuan {
	private List<BinhDoan> dsbd;


	public DoiQuan(List<BinhDoan> dsbd) {
		super();
		this.dsbd = dsbd;
	}

	public List<BinhDoan> getDsbd() {
		return dsbd;
	}


	public void setDsbd(List<BinhDoan> dsbd) {
		this.dsbd = dsbd;
	}

	@Override
	public String toString() {
		return "DoiQuan [dsbd=" + dsbd + "]";
	}
	
}
