package o.collection.map;

public class Snack {
	private String flavor;
	private int colory;
	public Snack() {
		super();
	}
	public Snack(String flavor, int colory) {
		super();
		this.flavor = flavor;
		this.colory = colory;
	}
	
	
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getColory() {
		return colory;
	}
	public void setColory(int colory) {
		this.colory = colory;
	}
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", colory=" + colory + "]";
	}

	
	
}
