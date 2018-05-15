package VO;

import java.io.Serializable;

public class Passenger implements Serializable{

	private String name;// ½Â°´ÀÌ¸§
	private String jumin;// ½Â°´ ÁÖ¹Î¹øÈ£
	private String passportNum;// ¿©±Ç¹øÈ£
	private String allowedBagWeight;// Çã¿ë Áü¹«°Ô

	public Passenger(String name, String jumin, String passportNum, String allowedBagWeight) {
		super();
		this.name = name;
		this.jumin = jumin;
		this.passportNum = passportNum;
		this.allowedBagWeight = allowedBagWeight;
	}

	public Passenger() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public String getAllowedBagWeight() {
		return allowedBagWeight;
	}

	public void setAllowedBagWeight(String allowedBagWeight) {
		this.allowedBagWeight = allowedBagWeight;
	}

	@Override
	public String toString() {
		return "ÀÌ¸§=" + name + ", ÁÖ¹Î¹øÈ£=" + jumin + ", ¿©±Ç¹øÈ£=" + passportNum + ", °¡¹æ¹«°Ô=" + allowedBagWeight;
	}

}
