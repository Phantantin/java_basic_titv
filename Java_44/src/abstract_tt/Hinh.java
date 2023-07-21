package abstract_tt;

public abstract class Hinh {
	protected TaoDo taoDo;

	public Hinh(TaoDo taoDo) {
		this.taoDo = taoDo;
	}

	public TaoDo getTaoDo() {
		return taoDo;
	}

	public void setTaoDo(TaoDo taoDo) {
		this.taoDo = taoDo;
	}
	
	public abstract double tinhDienTich();

}
