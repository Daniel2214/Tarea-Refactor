package CustomerP;
import MoviesP.RentalSummary;

public interface Customer {
	
	public void addRental(RentalSummary rent);
	public String getName();
	public String getResults();

}