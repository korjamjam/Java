package test.t240711.object3;

public class Book {
	private String title;
	private String genre;
	private String name;
	private int number;	
	
	public Book() {
		super();
	}
	

	public Book(String title, String genre, String name, int number) {
		super();
		this.title = title;
		this.genre = genre;
		this.name = name;
		this.number = number;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return "등록된 책(" + this.title + ", "
			  + this.genre + ", " + this.name + ", " + this.number + ")";
	}
}
