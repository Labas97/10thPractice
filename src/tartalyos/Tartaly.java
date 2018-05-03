package tartalyos;

public class Tartaly extends tarolo{

	private double nyomas;
	
	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	}
	
	public boolean isDangerous() {
		
		if ((getTerfogat()*nyomas) > 100) {
			return true;
		}
		
		return false;
	}
	
	

	public double getNyomas() {
		return nyomas;
	}

	public void setNyomas(double nyomas) {
		this.nyomas = nyomas;
	}

	@Override
	public String toString() {
		return "Tartaly [nyomas=" + nyomas + "terfogat= " + terfogat + ", veszelyes-e=" + isDangerous()
				+ "]";
	}

	public boolean isBiggerThan(Tartaly tartaly) {
		
		if (this.nyomas > tartaly.getTerfogat()) {
			return true;
		}
		
		else return true;
		
	}
	
	public static Tartaly getbiggerTartaly(Tartaly tartaly1, Tartaly tartaly2) {
		
		if(tartaly1.getTerfogat() > tartaly2.getTerfogat()) {
			return tartaly1;
		}
		else return tartaly2;
	}
	
}
