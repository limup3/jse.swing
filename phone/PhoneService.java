package com.jse.phone;

public class PhoneService {

	private Phone[] phones;
	private CelPhone[] celPhones;
	private Iphone[] iPhones;
	private GalaxyNote[] galaxyNotes;
	private int count;
	
	

	public PhoneService() {

		phones = new Phone[3];
		celPhones = new CelPhone[3];
		iPhones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
		count = 0;
	}

	
	
	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}



	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
	}



	public Iphone[] getiPhones() {
		return iPhones;
	}

	public void setiPhones(Iphone[] iPhones) {
		this.iPhones = iPhones;
	}
	
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	
	public Phone[] getPhones() {
		return phones;
	}
	
	public CelPhone[] getCelPhones() {
		return celPhones;
	}

	public void setCelPhones(CelPhone[] celPhones) {
		this.celPhones = celPhones;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void add(CelPhone celPhone) {
		celPhones[count] = celPhone;
		count++;
	}
	
	public void add(Iphone celPhone) {
		iPhones[count] = celPhone;
		count++;
	}
	
	public void add(GalaxyNote phone) {
		galaxyNotes[count]=phone;
		count++;
	}
	
	public void add(Phone phone) {
		phones[count]=phone;
		count++;
	}

	
	
}
