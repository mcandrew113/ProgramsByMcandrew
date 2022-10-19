package Book;
/**
 * @class Book
 *@author Mcandrew Okwei
 *@version 2.3 (09-23-2022)
 */


public class Book {
	 String Title = "";
	 String Author = "";
	 int NumPages=0;
	

	public Book() {
		
	
	}
	/**
	 * @return Title
	 * <p>
	 * When called give value of title
	 * </p>
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @return Author
	 * <p>
	 * When called give value of Author
	 * </p>
	 */
	public String getAuthor() {
		return Author;
	}
	/**
	 * @return Numpages
	 * <p>
	 * When called give the number of pages
	 * </p>
	 */
	public int getPages() {
		return NumPages;
	}
	
	/**
	 * @param Author
	 * <p>
	 * When called set value of Author to whatever name is given
	 * </p>
	 */
	public void setAuthor(String Author) {
		this.Author= Author;
	}
	/**
	 * @param NumPages
	 * <p>
	 * When called set value of NumPages to whatever number parameter is given
	 * </p>
	 */
	public void setPages(int NumPages) {
		this.NumPages= NumPages;
	}
	/**
	 * @param Title
	 * <p>
	 * When called set value of Title to whatever Title name is given
	 * </p>
	 */
	public void setTitle(String Title) {
		this.Title= Title;
	}
	public static void main (String[]args) {
		
		
	}
	
}