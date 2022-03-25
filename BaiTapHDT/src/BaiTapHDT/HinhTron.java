package BaiTapHDT;

import java.util.Scanner;

public class HinhTron {
	double bankinh;
	
	public HinhTron(double bankinh) {
		super();
		this.bankinh = bankinh;
	}
	
	public double getBankinh() {
		return bankinh;
	}
	
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	
	public double tinhChuVi() {
		return (2*bankinh*3.15149265);
	}
	
	public double tinhDienTich() {
		return (bankinh*bankinh*3.15149265);
	}
}
