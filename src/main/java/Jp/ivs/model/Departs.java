package Jp.ivs.model;


public class Departs {
	private int id;
	private String Name;
	
	
	public Departs() {
		super();
	}
	public Departs(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
