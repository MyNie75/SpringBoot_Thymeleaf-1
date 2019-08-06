package Jp.ivs.model;

public class Nguoi {
	private String name;
	private int tuoi;
	private String diachi;

	public Nguoi() {
		super();
	}

	public Nguoi(String name, int tuoi, String diachi) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		this.diachi = diachi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

}
