package Book;



public class Book {
	 String Title = "";
	 String Author = "";
	 int NumPages=0;
	

	public Book() {
		
	
	}
	
	public String getTitle() {
		return Title;
	}
	public String getAuthor() {
		return Author;
	}
	public int getPages() {
		return NumPages;
	}
	
	
	public void setAuthor(String Author) {
		this.Author= Author;
	}
	public void setPages(int NumPages) {
		this.NumPages= NumPages;
	}
	
	public void setTitle(String Title) {
		this.Title= Title;
	}
	public static void main (String[]args) {
		
		
	}
	
}