package MoviesP;

public class RentalSummary implements Rental{
	
	private MoviesManager movie;
	private int rentalTime;
	
	public RentalSummary(MoviesManager movie, int rentalTime ){
	    this.movie = movie;
	    this.rentalTime = rentalTime;
	  }

	@Override
	public int getDaysRented(){
		return this.rentalTime;
	}

	@Override
	public MoviesManager getMovie(){
		return this.movie;
	}

}
