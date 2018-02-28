package CalculatorP;
import MoviesP.MoviesManager;

public interface RentalCalculator{
	
	public static double calculateRental(int priceCode, int daysRented){
		// TODO Auto-generated method stub
		double amountOwned = 0;
		
		if(priceCode == MoviesManager.REGULAR){
			amountOwned += 2;
			if(daysRented > 2){
				amountOwned += (daysRented - 2) * 1.5;
			}
		}
		else if(priceCode == MoviesManager.NEW_RELEASE){
			amountOwned += daysRented * 3;
		}
		else if(priceCode == MoviesManager.CHILDRENS){
			amountOwned += 1.5;
			if(daysRented > 3){
				amountOwned += ( daysRented - 3) * 1.5;
			}
		}
		
		return amountOwned;
	}

}