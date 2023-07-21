package abstract_tt;

public class HinhTron extends Hinh {

	private double r;
	


	public HinhTron(TaoDo taoDo, double r) {
		super(taoDo);
		this.r = r;
	}


	public double getR() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}


	@Override
	public double tinhDienTich() {
		return Math.PI*this.r*this.r;
	}

	
}
