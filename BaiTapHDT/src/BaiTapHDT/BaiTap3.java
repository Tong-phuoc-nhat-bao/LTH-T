package BaiTapHDT;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HinhTron a= new HinhTron(12);
		HinhChuNhat b=new HinhChuNhat(12,5);
		System.out.println("chu vi hinh tron: "+ a.tinhChuVi());
		System.out.println("dien tich hinh tron: "+ a.tinhDienTich());
		System.out.println("chu vi hinh chu nhat: "+ b.tinhChuVi());
		System.out.println("dien tich hinh chu nhat: "+ b.tinhDienTich());
	}
}
