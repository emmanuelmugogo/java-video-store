
public class VideoStoreApp {

	public static void main(String[] args) {

		RentalStatement statement = new RentalStatement();
		
		
		Movie regular = new RegularMovie("WCCI");
		Movie childrens = new ChildrensMovie("Up");
		Movie newRelease = new NewRelease("Dr Strange");
		
		Rental regualarMovie = new Rental(regular, 5);
		Rental childrensMovie = new Rental(childrens, 5);
		Rental newReleaseMovie = new Rental(newRelease, 5);
		
		statement.add(regualarMovie);
		statement.add(childrensMovie);
		statement.add(newReleaseMovie);

		System.out.println("Movies rented for 5 days");
		statement.print();
		
	}

}
