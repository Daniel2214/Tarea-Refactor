import CustomerP.CustomerID;
import MoviesP.MoviesManager;
import MoviesP.RentalSummary;

public class main {
	
	public static void main( String[] args ) {
	    CustomerID customer = new CustomerID( "John" );

	    MoviesManager movie = new MoviesManager( "Star Wars IV", MoviesManager.REGULAR );
	    MoviesManager movie2 = new MoviesManager( "La La Land", MoviesManager.REGULAR );
	    MoviesManager movie3 = new MoviesManager( "The Incredibles", MoviesManager.CHILDRENS);
	    MoviesManager movie4 = new MoviesManager( "The Big Sick", MoviesManager.NEW_RELEASE);
	    
	    RentalSummary rental = new RentalSummary( movie, 4 );
	    RentalSummary rental2 = new RentalSummary( movie2, 50 );
	    RentalSummary rental3 = new RentalSummary( movie3, 10 );
	    RentalSummary rental4 = new RentalSummary( movie4, 2 );
	    
	    customer.addRental( rental );
	    customer.addRental( rental2 );
	    customer.addRental( rental3 );
	    customer.addRental( rental4 );
	    
	    String results = customer.getResults();
	    System.out.println( results );

	  }
}