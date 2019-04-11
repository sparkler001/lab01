public class Book{
    private int page;
    private int year;
    private double price;
    private string title;
    private string author;

    public void setNumOfPages(int NumOfPage){
	this.page = NumOfPage;
    }

    public void setYearPublished(int YearPublished){
	this.year = YearPublished;
    }

    public void setPrice(int Price){
	this.price = Price;
    }

    public void setTitle(int Title){
	this.title = Title;
    }

    public void setAuthor(String firstName, String lastName, int birthYear, int numOfPublications){

	
    }

    public String toString(){
	String a = "";
	a += "Title: " + title + "/n";
	a += "Published in: " + Integer.toString(this.year) + "/n";
	a += "Number of Pages: " + Integer.toString(this.page) + "/n";
	a += "Price: $ " + Integer.toString(this.price) + "/n";
	a += "Written by " + this.author;
    }
}
