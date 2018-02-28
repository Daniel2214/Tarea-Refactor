package CustomerP;

public class PrintCustomerInformation implements Print{
	
	private String movies;
	
	public PrintCustomerInformation(){
		this.movies = "Movies rented: \n";
	}
	
	public void addMovie(String nameMovie, double amountMovie){
		this.movies += "\t" + nameMovie + "\t" + amountMovie + "\n";
	}
	
	public String printCustomerInformation(double totalAmountOwned, int frequentPoints){
		this.movies += "Amount owned is " + totalAmountOwned + ".\n" + "You earned " + frequentPoints + " frequent renter points.";
		return this.movies;
	}
	

}
