package abstract_tt;

public class HinhChuNhat extends Hinh {
	
	private double chieuRong, chieuCao;

	public HinhChuNhat(TaoDo taoDo, double chieuRong, double chieuCao) {
		super(taoDo);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich() {
		return this.chieuCao*this.chieuRong;
	}


	
	
}
