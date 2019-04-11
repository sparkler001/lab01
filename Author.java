public class Author{
    private String firstname;
    private String lastname;
    private int birth;
    private int numOfpublication;

    public Author(){
	this.firstname = "";
	this.lastname = "";
	this.birth = 0;
	this.numOfpublication = 0;
    }

    public Author(Author a){
	this.firstname = a.getFirstname();
	this.lastname = a.getLastname();
	this.birth = a.getBirth();
	this.numOfpublication = a.getNumOfPublication();
    }
    
    public void setFirstname(String Firstname){
	this.firstname = Firstname;
    }

    public void setLastname(String Lastname){
	this.lastname = Lastname;
    }

    public void setBirth(int Birth){
	this.birth = Birth;
    }

    public void setNumOfPublication(int NumOfPublication){
	this.numOfpublication = NumOfPublication;
    }

}
