package tartalyos;

public abstract class tarolo {

	int terfogat;

	public tarolo(int terfogat) {
		super();
		this.terfogat = terfogat;
	}
	
	public abstract boolean isDangerous();

	public int getTerfogat() {
		return terfogat;
	}

	public void setTerfogat(int terfogat) {
		this.terfogat = terfogat;
	}
	
	
	
}
