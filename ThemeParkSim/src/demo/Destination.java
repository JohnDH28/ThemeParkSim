
public class Destination {

	public Destination() {
		// TODO Auto-generated constructor stub
		private int maxPoints;
		private int cost;
		private boolean isOpen = true;
		private ArrayList<Person> peopleAttending;
		Destination(int maxPoints, int cost){
			this.maxPoints = maxPoints;
			this.cost = cost;
			this.peopleAttending = new ArrayList<Person>();
		}
	}

}
