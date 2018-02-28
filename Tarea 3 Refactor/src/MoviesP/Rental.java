package MoviesP;

public class Rental implements RentalInterface{
	
	private Movie movie;
	private int rentalTime;
	
	public Rental(Movie movie, int rentalTime ){
	    this.movie = movie;
	    this.rentalTime = rentalTime;
	  }

	@Override
	public int getDaysRented(){
		return this.rentalTime;
	}

	@Override
	public Movie getMovie(){
		return this.movie;
	}

}
