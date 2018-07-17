package be.pxl.demo;

public class Auto {
	private String merk;
	private String eigenaar;
	private double prijs;

	public Auto(String merk, String eigenaar, double prijs) {
		this.merk = merk;
		setEigenaar(eigenaar);
		setPrijs(prijs);
	}

	public Auto(String merk, double prijs) {
		this(merk,"Onbekend",prijs);
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public String getEigenaar() {
		return eigenaar;
	}

	public void setEigenaar(String eigenaar) {
		if (eigenaar.length() == 0) {
			this.eigenaar = "onbekend";
		} else 
		this.eigenaar = eigenaar;
	}

	public void verhoogPrijs(int percent) {
		this.prijs += (this.prijs/100.0) * percent;
	}
}
