package MoviesP;

public class MoviesManager implements Movies{
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	
	private String title;
	private int priceCode;
	
	public MoviesManager( String title, int priceCode ) {
	      this.title = title;
	      this.priceCode = priceCode;
	}

	@Override
	public int getPriceCode() {
		return this.priceCode;
	}

	@Override
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	@Override
	public String getTitle() {
		return this.title;
	}
}
