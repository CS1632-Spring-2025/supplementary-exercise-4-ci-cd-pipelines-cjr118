package edu.pitt.cs;

public class CatImpl implements Cat {

	// Filled in with member variables
	private int id;
	private String name;
	private boolean rented;

	public CatImpl(int id, String name) {
		// Filled in/
		this.id=id;
		this.name=name;
		this.rented=false;
		
	}

	public void rentCat() {
		// Filled in
		if(!rented)
		{
			rented=true;
		}
	}

	public void returnCat() {
		// Filled in
		if(rented) 
		{
			rented=false;
		}
	}

	public void renameCat(String name) {
		// Filled in
		if (name!=null && !name.trim().isEmpty())
		{
			this.name=name;
		}
	}

	public String getName() {
		// Filled in
		return name;
	}

	public int getId() {
		// Filled in
		return id;
	}

	public boolean getRented() {
		// Filled in
		return rented;
	}

	public String toString() {
		// Filled in
		return "ID " +id + ". "+ name;
	}

}
