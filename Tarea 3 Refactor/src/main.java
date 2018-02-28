import CustomerP.Customer;
import MoviesP.Movie;
import MoviesP.Rental;

public class main {
	
	public static void main( String[] args ) {
	    Customer customer = new Customer( "John" );

	    Movie movie = new Movie( "Star Wars", Movie.REGULAR );
	    Rental rental = new Rental( movie, 4 );
	    customer.addRental( rental );
	    String statement = customer.statement();

	    System.out.println( statement );

	  }
}
