package PlaneIdentification;

public class PlaneDB {
	private String name;
	private int Ejet;
	private int Enum;
	private int Estat;
	public int getEjet() {
		return Ejet;
	}
	public void setEjet(int ejet) {
		Ejet = ejet;
	}
	public int getEnum() {
		return Enum;
	}
	public void setEnum(int enum1) {
		Enum = enum1;
	}
	public int getEstat() {
		return Estat;
	}
	public void setEstat(int estat) {
		Estat = estat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
