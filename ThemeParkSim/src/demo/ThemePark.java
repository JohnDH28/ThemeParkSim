package demo;
import java.util.ArrayList;

public class ThemePark {
	private static int numPeople;
	private static int numOfDest;
	private static int priceCoef;	
	ArrayList<Person> people = new ArrayList<Person>();
	//Array list of shops/vendors/rides (activities)
	
	public ThemePark(ArrayList<Person> people){
		this.people = people;
		numPeople = people.size();
		//this.activity = activity;
		//numRides = num of activities in activity with type ride
		//numShops = num of activities in activity with type shop
	}

	public static int getNumPeople() {
		return numPeople;
	}

	public static int getNumOfDest() {
		return numOfDest;
	}

	public static int getPriceCoef() {
		return priceCoef;
	}
}
