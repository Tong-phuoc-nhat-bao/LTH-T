package BaiTapHDT;

public class HinhChuNhat {
	double chieudai,chieurong;

	public HinhChuNhat(double chieudai, double chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	public double getChieudai() {
		return chieudai;
	}

	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	
	public double tinhChuVi() {
		return (2*(chieudai+chieurong));
	}
	
	public double tinhDienTich() {
		return (chieudai*chieurong);
	}
}
